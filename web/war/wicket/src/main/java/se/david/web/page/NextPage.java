package se.david.web.page;

import converters.XmlParser;
import converters.saxparser.SaxParser;
import integrations.TVDBInterface;
import integrations.urlimpl.TVDBImpl;
import objects.FinderSeries;
import objects.TVDBSeries;
import objects.TVDBUpdate;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.Model;
import se.david.web.model.ModelObject;

import java.io.InputStream;
import java.util.List;

public class NextPage extends WebPage {
    private static final long serialVersionUID = 1L;

    public static final String FORM_ID = "form";
    public static final String LISTVIEW_ID = "listView";
    public static final String LISTVIEWCONTAINER_ID = "listViewContainer";
    public static final String NAME_ID = "name";

    public static final String TVDB_UPDATE_TEXT_ID = "tvdbUpdateText";
    public static final String TVDB_UPDATE_BUTTON_ID = "tvdbUpdateButton";
    public static final String TVDB_UPDATE_LABEL_ID = "tvdbUpdateLabel";

    public static final String TVDB_SERIES_ALL_TEXT_ID = "tvdbSeriesAllText";
    public static final String TVDB_SERIES_ALL_BUTTON_ID = "tvdbSeriesAllButton";
    public static final String TVDB_SERIES_ALL_LABEL_ID = "tvdbSeriesAllLabel";

    public static final String TVDB_SERIES_BY_NAME_TEXT_ID = "tvdbSeriesByNameText";
    public static final String TVDB_SERIES_BY_NAME_BUTTON_ID = "tvdbSeriesByNameButton";
    public static final String TVDB_SERIES_BY_NAME_LABEL_ID = "tvdbSeriesByNameLabel";

    private Form form;
    private ListView<FinderSeries> listView;
    private WebMarkupContainer listViewContainer;

    private TextField<String> tvdbUpdateText;
    private TextField<String> tvdbSeriesAllText;
    private TextField<String> tvdbSeriesByNameText;

    private Button tvdbUpdateButton;
    private Button tvdbSeriesAllButton;
    private Button tvdbSeriesByNameButton;

    private Label tvdbUpdateLabel;
    private Label tvdbSeriesAllLabel;
    private Label tvdbSeriesByNameLabel;
    private ModelObject modelObject;

    public NextPage(Model<ModelObject> modelObject){
        setCompoundPropertyModel(modelObject);

        instantiateComponents();

        addComponents();
    }

    private void instantiateComponents(){
        form = new Form(FORM_ID);
        listViewContainer = new WebMarkupContainer(LISTVIEWCONTAINER_ID);
        listView = createListView();

        tvdbUpdateText = new TextField<>(TVDB_UPDATE_TEXT_ID);
        tvdbSeriesAllText = new TextField<>(TVDB_SERIES_ALL_TEXT_ID);
        tvdbSeriesByNameText = new TextField<>(TVDB_SERIES_BY_NAME_TEXT_ID);

        tvdbUpdateButton = createTVDBUpdateButton();
        tvdbSeriesAllButton = createTVDBSeriesAllButton();
        tvdbSeriesByNameButton = createTVDBSeriesByNameButton();

        tvdbUpdateLabel = new Label(TVDB_UPDATE_LABEL_ID);
        tvdbSeriesAllLabel = new Label(TVDB_SERIES_ALL_LABEL_ID);
        tvdbSeriesByNameLabel = new Label(TVDB_SERIES_BY_NAME_LABEL_ID);
    }

    private void addComponents(){
        listViewContainer.add(listView);
        form.add(listViewContainer);

        form.add(tvdbUpdateText);
        form.add(tvdbUpdateButton);
        form.add(tvdbUpdateLabel);

        form.add(tvdbSeriesAllText);
        form.add(tvdbSeriesAllButton);
        form.add(tvdbSeriesAllLabel);

        form.add(tvdbSeriesByNameText);
        form.add(tvdbSeriesByNameButton);
        form.add(tvdbSeriesByNameLabel);

        add(form);
    }

    private ListView<FinderSeries> createListView(){
        return new ListView<FinderSeries>(LISTVIEW_ID, modelObject.getFinderList()) {
            @Override
            protected void populateItem(ListItem<FinderSeries> resultItem) {
                FinderSeries result = resultItem.getModelObject();
                resultItem.add(new Label(NAME_ID, result.getEpisodeTitle()));
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

    private Button createTVDBSeriesAllButton(){
        return new Button(TVDB_SERIES_ALL_BUTTON_ID){
            @Override
            public void onSubmit(){
                TVDBInterface tvdbInterface = new TVDBImpl();
                InputStream inputStream = tvdbInterface.getSeriesInfo(modelObject.getTvdbSeriesAllText());
                XmlParser xmlParser = new SaxParser();
                List<TVDBSeries> tvdbSeries = xmlParser.parseTVDBSeriesFromXml(inputStream);
                if(tvdbSeries != null && !tvdbSeries.isEmpty()){
                    modelObject.setTvdbSeriesAllLabel(tvdbSeries.get(0).getSeriesName());
                }
            }
        };
    }

    private Button createTVDBSeriesByNameButton(){
        return new Button(TVDB_SERIES_BY_NAME_BUTTON_ID){
            @Override
            public void onSubmit(){
                TVDBInterface tvdbInterface = new TVDBImpl();
                InputStream inputStream = tvdbInterface.getSeriesByName(modelObject.getTvdbSeriesByNameText());
                XmlParser xmlParser = new SaxParser();
                List<TVDBSeries> tvdbSeries = xmlParser.parseTVDBSeriesFromXml(inputStream);
                if(tvdbSeries != null && !tvdbSeries.isEmpty()){
                    modelObject.setTvdbSeriesByNameLabel(tvdbSeries.get(0).getSeriesId());
                }
            }
        };
    }

    private void setCompoundPropertyModel(Model<ModelObject> modelObject){
        this.modelObject = modelObject.getObject();
        setDefaultModel(new CompoundPropertyModel<ModelObject>(modelObject));
    }
}
