package integrations.urlimpl;

import integrations.PirateBayInterface;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.assertNotNull;

public class PirateBayImplTest {
    private PirateBayInterface pirateBay;

    @Before
    public void setup(){
        pirateBay = new PirateBayImpl();
    }

    @Test
    public void test(){
        String searchString = "Rick and morty";
        InputStream inputStream = pirateBay.getTorrentInfo(searchString);
        assertNotNull("InputStream should not be null", inputStream);
    }
}
