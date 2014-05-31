package integrations.urlimpl;

import integrations.TVDBInterface;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.assertNotNull;

public class TvDBImplTest {
    private TVDBInterface tvDB;

    @Before
    public void setup(){
        tvDB = new TVDBImpl();
    }

    @Test
    public void testGetSeriesByName(){
        String searchString = "Rick and morty";
        InputStream inputStream = tvDB.getSeriesByName(searchString);
        assertNotNull("InputStream should not be null", inputStream);
    }

    @Test
    public void testGetUpdatesSince(){
        String searchString = "1398082571";
        InputStream inputStream = tvDB.getUpdatesSince(searchString);
        assertNotNull("InputStream should not be null", inputStream);
    }

    @Test
    public void testGetSeriesInfo(){
        String searchString = "275274";
        InputStream inputStream = tvDB.getSeriesInfo(searchString);
        assertNotNull("InputStream should not be null", inputStream);
    }
}
