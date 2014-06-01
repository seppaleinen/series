package se.david.web.page;

import mediafinder.apachefileutils.ApacheFileFinder;
import mediafinder.Finder;
import objects.*;
import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.Model;
import se.david.web.model.ModelObject;

import java.util.ArrayList;
import java.util.List;

public class StartPage extends WebPage {
    private static final long serialVersionUID = 1L;

    public static final String FORM_ID = "form";
    public static final String DIRECTORY_ID = "directory";
    public static final String SEARCH_BUTTON_ID = "searchButton";

    private Form form;
    private TextField<String> directory;
    private Button searchMediaButton;

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
        searchMediaButton = createSearchMediaButton();
    }

    private void addComponents(){
        form.add(searchMediaButton);
        form.add(directory);

        add(form);
    }

    private Button createSearchMediaButton(){
        return new Button(SEARCH_BUTTON_ID){
            @Override
            public void onSubmit(){
                Finder mediaFinder = new ApacheFileFinder();
                if(modelObject.getDirectory()!= null && !modelObject.getDirectory().isEmpty()){
                    List<FinderSeries> mediaFinderResults = mediaFinder.searchDirectory(modelObject.getDirectory());
                    modelObject.setFinderList(mediaFinderResults);
                    NextPage nextPage = new NextPage(new Model<>(modelObject));
                    setResponsePage(nextPage);
                }
            }
        };
    }
}
