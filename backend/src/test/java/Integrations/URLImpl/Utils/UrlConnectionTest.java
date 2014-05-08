package Integrations.URLImpl.Utils;

import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class UrlConnectionTest {
    private UrlConnection urlConnection;

    @Before
    public void setup(){
        urlConnection = new UrlConnection();
    }

    @Test
    public void testCreateUrlCorrectURL() throws Exception {
        String address = "http://www.google.se/";
        InputStream inputStream = urlConnection.getInputStream(address);
        assertNotNull(inputStream);
    }
}
