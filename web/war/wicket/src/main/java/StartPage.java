import MediaFinder.FileFinder.FileFinder;
import MediaFinder.Finder;
import org.apache.wicket.PageParameters;
import org.apache.wicket.ajax.AjaxEventBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.PropertyModel;

import java.util.ArrayList;
import java.util.List;

public class StartPage extends WebPage {
    private static final long serialVersionUID = 1L;

    private static final String FORM_ID = "form";
    private static final String DIRECTORY_ID = "directory";
    private static final String LISTVIEW_ID = "listView";
    private static final String LISTVIEWCONTAINER_ID = "listViewContainer";
    private static final String NAME_ID = "name";
    private static final String SEARCH_BUTTON_ID = "searchButton";


    private Form form;
    private TextField<String> directory;
    private Button searchMediaButton;
    private ListView<String> listView;
    private WebMarkupContainer listViewContainer;
    private List<String> results = new ArrayList<>();
    private ModelObject modelObject = new ModelObject();

    public StartPage(PageParameters pageParameters) {
        instantiateComponents();
        addComponents();
    }

    private void instantiateComponents(){

        form = new Form(FORM_ID);
        directory = new TextField<>(DIRECTORY_ID, new PropertyModel<String>(modelObject, "directory"));
        listViewContainer = new WebMarkupContainer(LISTVIEWCONTAINER_ID);
        listViewContainer.setMarkupId(LISTVIEWCONTAINER_ID);
        listViewContainer.setOutputMarkupId(true);
        listView = new ListView<String>(LISTVIEW_ID, results) {
            @Override
            protected void populateItem(ListItem<String> resultItem) {
                String result = resultItem.getModelObject();
                resultItem.add(new Label(NAME_ID, result));
            }
        };
        listViewContainer.add(listView);
        searchMediaButton = new Button(SEARCH_BUTTON_ID){
            @Override
            public void onSubmit(){
                Finder mediaFinder = new FileFinder();
                System.out.println("DIRECTORYTEXT: " + modelObject.getDirectory());
                if(modelObject.getDirectory()!= null && !modelObject.getDirectory().isEmpty()){
                    List<String> mediaFinderResults = mediaFinder.searchDirectory(modelObject.getDirectory());
                    results.clear();
                    for(String resultString : mediaFinderResults){
                        results.add(resultString);
                    }
                    //ajaxRequestTarget.addComponent(listViewContainer, LISTVIEWCONTAINER_ID);
                }
            }
        };
        //searchMediaButton.add(getClickEvent());
    }

    private AjaxEventBehavior getClickEvent(){
        return new AjaxEventBehavior("onclick") {
            @Override
            protected void onEvent(AjaxRequestTarget ajaxRequestTarget) {
                Finder mediaFinder = new FileFinder();
                System.out.println("DIRECTORYTEXT: " + modelObject.getDirectory());
                if(modelObject.getDirectory()!= null && !modelObject.getDirectory().isEmpty()){
                    List<String> mediaFinderResults = mediaFinder.searchDirectory("/Users/shaman_king_2000/Downloads/Serier");
                    for(String resultString : mediaFinderResults){
                        results.add(resultString);
                    }
                    ajaxRequestTarget.addComponent(listViewContainer, LISTVIEWCONTAINER_ID);
                }
            }
        };
    }

    private void addComponents(){
        form.add(listViewContainer);
        form.add(searchMediaButton);
        form.add(directory);
        add(form);
    }
}
