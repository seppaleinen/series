import org.apache.wicket.PageParameters;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.Before;
import org.junit.Test;

import java.util.Locale;

public class StartPageTest {

    private WicketTester tester;

    @Before
    public void setUp() throws Exception {
        tester = new WicketTester();
        tester.getWicketSession().setLocale(Locale.ENGLISH);
    }

    @Test
    public void testRenderPage() {
        StartPage startPage = new StartPage(new PageParameters());
        tester.startPage(startPage);
        tester.assertNoErrorMessage();
        tester.assertRenderedPage(StartPage.class);
    }

    @Test
    public void testPressButton(){
    }
}
