package converters.jsonparser;

import objects.PirateBay;
import objects.constants.PirateBayConstants;
import objects.constants.TVDBEpisodeConstants;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

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
        Long id = 9963315L;
        assertEquals(id, pirateBayFirst.getId());
        assertEquals(117, pirateBayFirst.getLeechers());
        assertEquals("magnet:?xt=urn:btih:827e404e8dc1e32542b23a41036b6e64b6bc2d66&dn=Rick+and+Morty+Season+1+%281280x720%29+%5BPhr0stY&tr=udp%3A%2F%2Ftracker.openbittorrent.com%3A80&tr=udp%3A%2F%2Ftracker.publicbt.com%3A80&tr=udp%3A%2F%2Ftracker.istole.it%3A6969&tr=udp%3A%2F%2Fopen.demonii.com%3A1337", pirateBayFirst.getMagnet());
        assertEquals("Rick and Morty Season 1 (1280x720) [Phr0stY", pirateBayFirst.getName());
        assertEquals(330, pirateBayFirst.getSeeders());
        assertEquals("5.78 GiB", pirateBayFirst.getSize());
        assertTrue(pirateBayFirst.isTrusted());
        assertEquals("04-15 06:14", pirateBayFirst.getUploaded());
        assertEquals("frostyon420", pirateBayFirst.getUploader());
    }

    @Test
    public void testPirateBaySetters() {
        PirateBay pirateBay = new PirateBay();
        pirateBay.setCategory("category");
        pirateBay.setId(1L);
        pirateBay.setLeechers(1);
        pirateBay.setMagnet("magnet");
        pirateBay.setName("name");
        pirateBay.setSeeders(1);
        pirateBay.setSize("asd");
        pirateBay.setTrusted(false);
        pirateBay.setUploaded("asd");
        pirateBay.setUploader("das");

        assertEquals(pirateBay.getCategory(), "category");
        assertEquals(pirateBay.getId(), new Long(1L));
        assertEquals(pirateBay.getLeechers(), 1);
        assertEquals(pirateBay.getMagnet(), "magnet");
        assertEquals(pirateBay.getName(), "name");
        assertEquals(pirateBay.getSeeders(), 1);
        assertEquals(pirateBay.getSize(), "asd");
        assertEquals(pirateBay.isTrusted(), false);
        assertEquals(pirateBay.getUploaded(), "asd");
        assertEquals(pirateBay.getUploader(), "das");
    }

    @Test
    public void testPirateBayConstants() {
        assertEquals(PirateBayConstants.ID, "id");
        assertEquals(PirateBayConstants.NAME, "name");
        assertEquals(PirateBayConstants.CATEGORY, "category");
        assertEquals(PirateBayConstants.MAGNET, "magnet");
        assertEquals(PirateBayConstants.UPLOADED, "uploaded");
        assertEquals(PirateBayConstants.UPLOADER, "uploader");
        assertEquals(PirateBayConstants.SIZE, "size");
        assertEquals(PirateBayConstants.SEEDERS, "seeders");
        assertEquals(PirateBayConstants.LEECHERS, "leechers");
        assertEquals(PirateBayConstants.TRUSTED, "trusted");
    }

    @Test
    public void testTVDBEpisodeConstants() {
        assertEquals(TVDBEpisodeConstants.ELEMENT, "Episode");
        assertEquals(TVDBEpisodeConstants.ID, "id");
        assertEquals(TVDBEpisodeConstants.SEASON_ID, "seasonid");
        assertEquals(TVDBEpisodeConstants.EPISODE_NUMBER, "EpisodeNumber");
        assertEquals(TVDBEpisodeConstants.EPISODE_NAME, "EpisodeName");
        assertEquals(TVDBEpisodeConstants.FIRST_AIRED, "FirstAired");
        assertEquals(TVDBEpisodeConstants.GUEST_STARS, "GuestStars");
        assertEquals(TVDBEpisodeConstants.DIRECTOR, "Director");
        assertEquals(TVDBEpisodeConstants.WRITER, "Writer");
        assertEquals(TVDBEpisodeConstants.OVERVIEW, "Overview");
        assertEquals(TVDBEpisodeConstants.PRODUCTION_CODE, "ProductionCode");
        assertEquals(TVDBEpisodeConstants.LAST_UPDATED, "lastupdated");
        assertEquals(TVDBEpisodeConstants.FLAGGED, "flagged");
        assertEquals(TVDBEpisodeConstants.DVD_DISCID, "DVD_discid");
        assertEquals(TVDBEpisodeConstants.DVD_SEASON, "DVD_season");
        assertEquals(TVDBEpisodeConstants.DVD_EPISODENUMBER, "DVD_episodenumber");
        assertEquals(TVDBEpisodeConstants.DVD_CHAPTER, "DVD_chapter");
        assertEquals(TVDBEpisodeConstants.ABSOLUTE_NUMBER, "absolute_number");
        assertEquals(TVDBEpisodeConstants.FILENAME, "filename");
        assertEquals(TVDBEpisodeConstants.SERIESID, "seriesid");
        assertEquals(TVDBEpisodeConstants.THUMB_ADDED, "thumb_added");
        assertEquals(TVDBEpisodeConstants.THUMB_WIDTH, "thumb_width");
        assertEquals(TVDBEpisodeConstants.THUMB_HEIGHT, "thumb_height");
        assertEquals(TVDBEpisodeConstants.TMS_EXPORT, "tms_export");
        assertEquals(TVDBEpisodeConstants.MIRROR_UPDATE, "mirrorupdate");
        assertEquals(TVDBEpisodeConstants.IMDB_ID, "IMDB_ID");
        assertEquals(TVDBEpisodeConstants.EPIMGFLAG, "EpImgFlag");
        assertEquals(TVDBEpisodeConstants.RATING, "Rating");
        assertEquals(TVDBEpisodeConstants.SEASON_NUMBER, "SeasonNumber");
        assertEquals(TVDBEpisodeConstants.LANGUAGE, "Language");

    }

    private InputStream getFile(String filename) {
        return this.getClass().getResourceAsStream(JSONDIR + "/" + filename);
    }
}
