import Converters.SaxParser.SaxParser;
import Converters.XmlParser;
import Integrations.OMDBInterface;
import Integrations.TVDBInterface;
import Integrations.URLImpl.OMDBImpl;
import Integrations.URLImpl.TVDBImpl;
import MediaFinder.ApacheFileUtils.ApacheFileFinder;
import MediaFinder.FileFinder.FileFinder;
import MediaFinder.Finder;
import Objects.FinderSeries;
import Objects.OMDB;
import Objects.TVDBIMDB;
import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.PropertyModel;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class StartPage extends WebPage {
    private static final long serialVersionUID = 1L;

    public static final String FORM_ID = "form";
    public static final String DIRECTORY_ID = "directory";
    public static final String LISTVIEW_ID = "listView";
    public static final String LISTVIEWCONTAINER_ID = "listViewContainer";
    public static final String NAME_ID = "name";
    public static final String SEARCH_BUTTON_ID = "searchButton";
    public static final String SEARCH_OMDB = "searchOMDB";
    public static final String SEARCH_OMDB_BUTTON = "searchOMDBButton";
    public static final String SEARCH_OMDB_LABEL = "OMDBTitle";

    public static final String TVDB_IMDB_TEXT_ID = "tvdbIMDBText";
    public static final String TVDB_IMDB_BUTTON_ID = "tvdbIMDBButton";
    public static final String TVDB_IMDB_LABEL_ID = "tvdbIMDBLabel";

    private OMDB omdb;

    private Form form;
    private TextField<String> directory;
    private Button searchMediaButton;
    private ListView<String> listView;
    private WebMarkupContainer listViewContainer;

    private TextField<String> searchOmdbTextfield;
    private TextField<String> tvdbIMDBtext;

    private Button searchOmdbButton;
    private Button tvdbIMDBButton;

    private Label omdbLabel;
    private Label tvdbIMDBLabel;

    private List<String> results = new ArrayList<>();
    private ModelObject modelObject = new ModelObject();

    public StartPage(PageParameters pageParameters) {
        setCompountPropertyModel();
        instantiateComponents();
        addComponents();
    }

    private void setCompountPropertyModel(){
        setDefaultModel(new CompoundPropertyModel<ModelObject>(modelObject));
    }

    private void instantiateComponents(){
        form = new Form(FORM_ID);
        directory = new TextField<>(DIRECTORY_ID);
        listViewContainer = new WebMarkupContainer(LISTVIEWCONTAINER_ID);
        listView = createListView();
        searchMediaButton = createSearchMediaButton();

        searchOmdbTextfield = new TextField<>(SEARCH_OMDB);
        tvdbIMDBtext = new TextField<>(TVDB_IMDB_TEXT_ID);

        searchOmdbButton = createSearchOMDBButton();
        tvdbIMDBButton = createTVDBIMDBButton();

        omdbLabel = new Label(SEARCH_OMDB_LABEL);
        tvdbIMDBLabel = new Label(TVDB_IMDB_LABEL_ID);
    }

    private void addComponents(){
        listViewContainer.add(listView);
        form.add(listViewContainer);
        form.add(searchMediaButton);
        form.add(directory);
        form.add(searchOmdbTextfield);
        form.add(searchOmdbButton);
        form.add(omdbLabel);

        form.add(tvdbIMDBtext);
        form.add(tvdbIMDBButton);
        form.add(tvdbIMDBLabel);
        add(form);
    }

    private ListView<String> createListView(){
        return new ListView<String>(LISTVIEW_ID, results) {
            @Override
            protected void populateItem(ListItem<String> resultItem) {
                String result = resultItem.getModelObject();
                resultItem.add(new Label(NAME_ID, result));
            }
        };
    }

    private Button createSearchOMDBButton(){
        return new Button(SEARCH_OMDB_BUTTON){
            @Override
            public void onSubmit(){
                OMDBInterface omdbInterface = new OMDBImpl();
                InputStream inputStream = omdbInterface.getOmdbInfo(modelObject.getSearchOMDB());
                XmlParser xmlParser = new SaxParser();
                omdb = xmlParser.parseOmdbFromXml(inputStream);
                if(omdb!= null){
                    modelObject.setOMDBTitle(omdb.getTitle() + " : " + omdb.getImdbID());
                }
            }
        };
    }

    private Button createTVDBIMDBButton(){
        return new Button(TVDB_IMDB_BUTTON_ID){
            @Override
            public void onSubmit(){
                TVDBInterface tvdbInterface = new TVDBImpl();
                InputStream inputStream = tvdbInterface.getIMDB(modelObject.getTvdbIMDBText());
                XmlParser xmlParser = new SaxParser();
                TVDBIMDB tvdbimdb = xmlParser.parseTVDBIMDBFromXml(inputStream);
                if(omdb!= null){
                    modelObject.setTvdbIMDBLabel(tvdbimdb.getSeriesName() + " : " + tvdbimdb.getSeriesId());
                }
            }
        };
    }

    private Button createSearchMediaButton(){
        return new Button(SEARCH_BUTTON_ID){
            @Override
            public void onSubmit(){
                Finder mediaFinder = new ApacheFileFinder();
                if(modelObject.getDirectory()!= null && !modelObject.getDirectory().isEmpty()){
                    List<FinderSeries> mediaFinderResults = mediaFinder.searchDirectory(modelObject.getDirectory());
                    results.clear();
                    for(FinderSeries finderSeries : mediaFinderResults){
                        results.add(finderSeries.getEpisodeTitle());
                    }
                }
            }
        };
    }
}
