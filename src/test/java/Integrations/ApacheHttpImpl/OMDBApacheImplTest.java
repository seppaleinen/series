package Integrations.ApacheHttpImpl;

import Integrations.OMDBInterface;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.assertNotNull;

public class OMDBApacheImplTest {
    private OMDBInterface omdbInterface;

    @Before
    public void setup(){
        omdbInterface = new OMDBApacheImpl();
    }

    @Test
    public void testGetInfoFromOmdb(){
        String title = "Pompeii";
        InputStream omdbInfo = omdbInterface.getOmdbInfo(title);
        assertNotNull(omdbInfo);
    }
}
