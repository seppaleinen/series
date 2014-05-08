import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

public class WicketBasePage extends WebApplication {
    @Override
    public Class<? extends Page> getHomePage() {
        return StartPage.class;
    }
}
