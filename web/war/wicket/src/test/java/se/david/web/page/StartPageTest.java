package se.david.web.page;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.util.tester.FormTester;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import se.david.web.page.StartPage;

import java.net.URL;
import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class StartPageTest {
    private static final String SEPARATOR = System.getProperty("\\" + "file.separator");
    private static final String MEDIA = SEPARATOR + "Media";
    private WicketTester tester;
    private StartPage startPage;

    @Before
    public void setUp() throws Exception {
        tester = new WicketTester();
        startPage = new StartPage(new PageParameters());
        tester.getWicketSession().setLocale(Locale.ENGLISH);
    }

    @Test
    public void testRenderPage() {
        tester.startPage(startPage);
        tester.assertNoErrorMessage();
        tester.assertRenderedPage(StartPage.class);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testPressButton(){
        String path = "/Media";
        System.out.println("PATH: " + path);

        tester.startPage(startPage);
        FormTester formTester = tester.newFormTester(StartPage.FORM_ID);
        formTester.setValue(StartPage.DIRECTORY_ID, getFile(path));
        formTester.setValue(StartPage.SEARCH_BUTTON_ID, "");
        formTester.submit();
        tester.assertNoErrorMessage();
    }

    private String getFile(String directory){

        return this.getClass().getClassLoader().getResource("." + directory).getPath();
//        return this.getClass().getResource(directory).getFile().replace("%20", " ");
    }
}
