package Integrations.URLImpl;

import Integrations.OMDBInterface;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.assertNotNull;

public class OMDBImplTest {
    private OMDBInterface OMDBImpl;

    @Before
    public void setup(){
        OMDBImpl = new OMDBImpl();
    }

    @Test
    public void testGetInfoFromOmdb(){
        String title = "neon genesis evangelion";
        InputStream omdbInfo = OMDBImpl.getOmdbInfo(title);
        assertNotNull(omdbInfo);
    }
}
