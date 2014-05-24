package Converters.JsonParser;

import Objects.PirateBay;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class GsonParserTest {
    private static final String JSONDIR = "/JSON";
    private static final String PIRATEBAY = "PIRATEBAY.json";

    private GsonParser gsonParser;

    @Before
    public void setup(){
        gsonParser = new GsonParser();
    }

    @Test
    public void testParsePirateBay(){
        InputStream inputStream = getFile(PIRATEBAY);
        List<PirateBay> pirateBayList = gsonParser.getPirateBayObjectFromJSON(inputStream);
        assertNotNull(pirateBayList);
        assertFalse(pirateBayList.isEmpty());
    }

    private InputStream getFile(String filename) {
        return this.getClass().getResourceAsStream(JSONDIR + "/" + filename);
    }
}
