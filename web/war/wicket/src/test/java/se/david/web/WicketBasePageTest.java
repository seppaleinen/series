package se.david.web;

import org.apache.wicket.Page;
import org.junit.Before;
import org.junit.Test;
import se.david.web.page.StartPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class WicketBasePageTest {
    private WicketBasePage wicketBasePage;

    @Before
    public void setup(){
        wicketBasePage = new WicketBasePage();
    }

    @Test
    public void testGetHomePage(){
        Class<? extends Page> homePage = wicketBasePage.getHomePage();
        assertNotNull("HomePage should not be null", homePage);
        assertEquals("HomePage should be StartPage", StartPage.class.getSimpleName(), homePage.getSimpleName());
    }
}
