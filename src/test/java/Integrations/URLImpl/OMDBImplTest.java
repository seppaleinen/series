package Integrations.URLImpl;

import Integrations.OMDBInterface;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class OMDBImplTest {
    private OMDBInterface OMDBImpl;

    @Before
    public void setup(){
        OMDBImpl = new Integrations.URLImpl.OMDBImpl();
    }

    @Test
    public void testGetInfoFromOmdb(){
        String title = "Pompeii";
        InputStream omdbInfo = OMDBImpl.getOmdbInfo(title);
        assertNotNull(omdbInfo);
    }

    @Test
    public void testGetOMDBUrl(){
        String title = "Rick and Morty";
        String expectedURL = "http://www.omdbapi.com/?t=" + title + "&r=XML";
        String url = OMDBImpl.getOmdbUrl(title);
        assertNotNull(url);
        assertEquals("expectedURL and url should be the same", expectedURL, url);
    }

}
