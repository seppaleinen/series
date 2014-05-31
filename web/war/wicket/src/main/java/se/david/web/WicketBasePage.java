package se.david.web;

import org.apache.wicket.Page;
import org.apache.wicket.Request;
import org.apache.wicket.Response;
import org.apache.wicket.Session;
import org.apache.wicket.protocol.http.WebApplication;
import se.david.web.page.StartPage;

public class WicketBasePage extends WebApplication {
    @Override
    public Class<? extends Page> getHomePage() {
        return StartPage.class;
    }

    @Override
    public Session newSession(Request request, Response response){
        return super.newSession(request,response);
    }
}
