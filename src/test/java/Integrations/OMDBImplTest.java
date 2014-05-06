package Integrations;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class OMDBImplTest {
    private OmdbImpl omdbImpl;

    @Before
    public void setup(){
        omdbImpl = new OmdbImpl();
    }

    @Test
    public void testGetInfoFromOmdb(){
        String title = "Pompeii";
        String omdbInfo = omdbImpl.getOmdbInfo(title);
        assertNotNull(omdbInfo);
        assertTrue(omdbInfo.contains("Pompeii"));
    }

}
