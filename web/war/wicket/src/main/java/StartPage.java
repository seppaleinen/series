import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class StartPage extends WebPage {
    private static final long serialVersionUID = 1L;

    public StartPage(PageParameters pageParameters) {
        add(new Label("message", "Hello"));
    }
}
