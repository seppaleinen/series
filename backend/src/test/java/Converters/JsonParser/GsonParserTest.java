package converters.jsonparser;

import objects.PirateBay;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.assertEquals;
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

        PirateBay pirateBayFirst = pirateBayList.get(0);
        assertEquals("HD - TV shows", pirateBayFirst.getCategory());
        assertEquals("9963315", pirateBayFirst.getId());
        assertEquals("117", pirateBayFirst.getLeechers());
        assertEquals("magnet:?xt=urn:btih:827e404e8dc1e32542b23a41036b6e64b6bc2d66&dn=Rick+and+Morty+Season+1+%281280x720%29+%5BPhr0stY&tr=udp%3A%2F%2Ftracker.openbittorrent.com%3A80&tr=udp%3A%2F%2Ftracker.publicbt.com%3A80&tr=udp%3A%2F%2Ftracker.istole.it%3A6969&tr=udp%3A%2F%2Fopen.demonii.com%3A1337", pirateBayFirst.getMagnet());
        assertEquals("Rick and Morty Season 1 (1280x720) [Phr0stY", pirateBayFirst.getName());
        assertEquals("330", pirateBayFirst.getSeeders());
        assertEquals("5.78 GiB", pirateBayFirst.getSize());
        assertEquals("true", pirateBayFirst.getTrusted());
        assertEquals("04-15 06:14", pirateBayFirst.getUploaded());
        assertEquals("frostyon420", pirateBayFirst.getUploader());
    }

    private InputStream getFile(String filename) {
        return this.getClass().getResourceAsStream(JSONDIR + "/" + filename);
    }
}
