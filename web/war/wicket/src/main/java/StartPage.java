import converters.saxparser.SaxParser;
import converters.XmlParser;
import integrations.TVDBInterface;
import integrations.urlimpl.TVDBImpl;
import mediafinder.apachefileutils.ApacheFileFinder;
import mediafinder.Finder;
import objects.*;
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

    public static final String TVDB_UPDATE_TEXT_ID = "tvdbUpdateText";
    public static final String TVDB_UPDATE_BUTTON_ID = "tvdbUpdateButton";
    public static final String TVDB_UPDATE_LABEL_ID = "tvdbUpdateLabel";

    private Form form;
    private TextField<String> directory;
    private Button searchMediaButton;
    private ListView<String> listView;
    private WebMarkupContainer listViewContainer;

    private TextField<String> tvdbUpdateText;

    private Button tvdbUpdateButton;

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

        tvdbUpdateText = new TextField<>(TVDB_UPDATE_TEXT_ID);

        tvdbUpdateButton = createTVDBUpdateButton();

        tvdbUpdateLabel = new Label(TVDB_UPDATE_LABEL_ID);
    }

    private void addComponents(){
        listViewContainer.add(listView);
        form.add(listViewContainer);
        form.add(searchMediaButton);
        form.add(directory);

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
