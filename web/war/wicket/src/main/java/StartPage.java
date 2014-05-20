import Converters.SaxParser.SaxParser;
import Converters.XmlParser;
import Integrations.OMDBInterface;
import Integrations.TVDBInterface;
import Integrations.URLImpl.OMDBImpl;
import Integrations.URLImpl.TVDBImpl;
import MediaFinder.ApacheFileUtils.ApacheFileFinder;
import MediaFinder.Finder;
import Objects.*;
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


    public static final String SEARCH_OMDB = "omdbText";
    public static final String SEARCH_OMDB_BUTTON = "omdbButton";
    public static final String SEARCH_OMDB_LABEL = "omdbLabel";

    public static final String TVDB_IMDB_TEXT_ID = "tvdbIMDBText";
    public static final String TVDB_IMDB_BUTTON_ID = "tvdbIMDBButton";
    public static final String TVDB_IMDB_LABEL_ID = "tvdbIMDBLabel";

    public static final String TVDB_SERIES_TEXT_ID = "tvdbSeriesText";
    public static final String TVDB_SERIES_BUTTON_ID = "tvdbSeriesButton";
    public static final String TVDB_SERIES_LABEL_ID = "tvdbSeriesLabel";

    public static final String TVDB_EPISODE_TEXT_ID = "tvdbEpisodeText";
    public static final String TVDB_EPISODE_BUTTON_ID = "tvdbEpisodeButton";
    public static final String TVDB_EPISODE_LABEL_ID = "tvdbEpisodeLabel";

    public static final String TVDB_UPDATE_TEXT_ID = "tvdbUpdateText";
    public static final String TVDB_UPDATE_BUTTON_ID = "tvdbUpdateButton";
    public static final String TVDB_UPDATE_LABEL_ID = "tvdbUpdateLabel";

    private OMDB omdb;

    private Form form;
    private TextField<String> directory;
    private Button searchMediaButton;
    private ListView<String> listView;
    private WebMarkupContainer listViewContainer;

    private TextField<String> omdbText;
    private TextField<String> tvdbIMDBtext;
    private TextField<String> tvdbSeriesText;
    private TextField<String> tvdbEpisodeText;
    private TextField<String> tvdbUpdateText;

    private Button omdbButton;
    private Button tvdbIMDBButton;
    private Button tvdbSeriesButton;
    private Button tvdbEpisodeButton;
    private Button tvdbUpdateButton;

    private Label omdbLabel;
    private Label tvdbIMDBLabel;
    private Label tvdbSeriesLabel;
    private Label tvdbEpisodeLabel;
    private Label tvdbUpdateLabel;

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

        omdbText = new TextField<>(SEARCH_OMDB);
        tvdbIMDBtext = new TextField<>(TVDB_IMDB_TEXT_ID);
        tvdbSeriesText = new TextField<>(TVDB_SERIES_TEXT_ID);
        tvdbEpisodeText = new TextField<>(TVDB_EPISODE_TEXT_ID);
        tvdbUpdateText = new TextField<>(TVDB_UPDATE_TEXT_ID);

        omdbButton = createSearchOMDBButton();
        tvdbIMDBButton = createTVDBIMDBButton();
        tvdbSeriesButton = createTVDBSeriesButton();
        tvdbEpisodeButton = createTVDBEpisodeButton();
        tvdbUpdateButton = createTVDBUpdateButton();

        omdbLabel = new Label(SEARCH_OMDB_LABEL);
        tvdbIMDBLabel = new Label(TVDB_IMDB_LABEL_ID);
        tvdbSeriesLabel = new Label(TVDB_SERIES_LABEL_ID);
        tvdbEpisodeLabel = new Label(TVDB_EPISODE_LABEL_ID);
        tvdbUpdateLabel = new Label(TVDB_UPDATE_LABEL_ID);
    }

    private void addComponents(){
        listViewContainer.add(listView);
        form.add(listViewContainer);
        form.add(searchMediaButton);
        form.add(directory);

        form.add(omdbText);
        form.add(omdbButton);
        form.add(omdbLabel);

        form.add(tvdbIMDBtext);
        form.add(tvdbIMDBButton);
        form.add(tvdbIMDBLabel);

        form.add(tvdbSeriesText);
        form.add(tvdbSeriesButton);
        form.add(tvdbSeriesLabel);

        form.add(tvdbEpisodeText);
        form.add(tvdbEpisodeButton);
        form.add(tvdbEpisodeLabel);

        form.add(tvdbUpdateText);
        form.add(tvdbUpdateButton);
        form.add(tvdbUpdateLabel);
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
                InputStream inputStream = omdbInterface.getOmdbInfo(modelObject.getOmdbText());
                XmlParser xmlParser = new SaxParser();
                omdb = xmlParser.parseOmdbFromXml(inputStream);
                if(omdb!= null){
                    modelObject.setOmdbLabel(omdb.getTitle() + " : " + omdb.getImdbID());
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
                if(tvdbimdb!= null){
                    modelObject.setTvdbIMDBLabel(tvdbimdb.getSeriesName() + " : " + tvdbimdb.getSeriesId());
                }
            }
        };
    }

    private Button createTVDBSeriesButton(){
        return new Button(TVDB_SERIES_BUTTON_ID){
            @Override
            public void onSubmit(){
                TVDBInterface tvdbInterface = new TVDBImpl();
                InputStream inputStream = tvdbInterface.getSeries(modelObject.getTvdbSeriesText());
                XmlParser xmlParser = new SaxParser();
                TVDBSeries tvdbSeries = xmlParser.parseTVDBSeriesFromXml(inputStream);
                if(tvdbSeries != null){
                    modelObject.setTvdbSeriesLabel(tvdbSeries.getSeriesName() + " : " + tvdbSeries.getSeriesId());
                }
            }
        };
    }

    private Button createTVDBEpisodeButton(){
        return new Button(TVDB_EPISODE_BUTTON_ID){
            @Override
            public void onSubmit(){
                TVDBInterface tvdbInterface = new TVDBImpl();
                InputStream inputStream = tvdbInterface.getEpisode(modelObject.getTvdbEpisodeText());
                XmlParser xmlParser = new SaxParser();
                TVDBEpisode tvdbEpisode = xmlParser.parseTVDBEpisodeFromXML(inputStream);
                if(tvdbEpisode != null){
                    modelObject.setTvdbEpisodeLabel(tvdbEpisode.getEpisodeName() + " : " + tvdbEpisode.getImdbId());
                }
            }
        };
    }

    private Button createTVDBUpdateButton(){
        return new Button(TVDB_UPDATE_BUTTON_ID){
            @Override
            public void onSubmit(){
                TVDBInterface tvdbInterface = new TVDBImpl();
                InputStream inputStream = tvdbInterface.getUpdatesSince(modelObject.getTvdbUpdateText());
                XmlParser xmlParser = new SaxParser();
                TVDBUpdate tvdbUpdate = xmlParser.parseTVDBUpdateFromXml(inputStream);
                if(tvdbUpdate != null){
                    modelObject.setTvdbUpdateLabel(tvdbUpdate.getTime());
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
