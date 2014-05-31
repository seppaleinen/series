package se.david.web.page;

import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.util.tester.FormTester;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;
import se.david.web.page.StartPage;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class StartPageTest {
    private static final String MEDIA = "/Media";
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
        tester.startPage(startPage);
        FormTester formTester = tester.newFormTester("form");
        formTester.setValue(StartPage.DIRECTORY_ID, getFile(MEDIA));
        formTester.setValue(StartPage.SEARCH_BUTTON_ID, "");
        formTester.submit();
        tester.assertNoErrorMessage();
        String listViewId = StartPage.FORM_ID + ":" + StartPage.LISTVIEWCONTAINER_ID + ":" + StartPage.LISTVIEW_ID;
        ListView<String> listView = (ListView<String>) tester.getComponentFromLastRenderedPage(listViewId);
        assertEquals("ListView size should be as expected", listView.size(), 6);
    }

    private String getFile(String directory){
        return this.getClass().getResource(directory).getFile().replace("%20", " ");
    }
}
