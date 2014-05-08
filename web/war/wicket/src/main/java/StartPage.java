import MediaFinder.FileFinder.FileFinder;
import MediaFinder.Finder;
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

    private Form form;
    private TextField<String> directory;
    private Button searchMediaButton;
    private ListView<String> listView;
    private WebMarkupContainer listViewContainer;

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
    }

    private void addComponents(){
        listViewContainer.add(listView);
        form.add(listViewContainer);
        form.add(searchMediaButton);
        form.add(directory);
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

    private Button createSearchMediaButton(){
        return new Button(SEARCH_BUTTON_ID){
            @Override
            public void onSubmit(){
                Finder mediaFinder = new FileFinder();
                if(modelObject.getDirectory()!= null && !modelObject.getDirectory().isEmpty()){
                    List<String> mediaFinderResults = mediaFinder.searchDirectory(modelObject.getDirectory());
                    results.clear();
                    for(String resultString : mediaFinderResults){
                        results.add(resultString);
                    }
                }
            }
        };
    }
}
