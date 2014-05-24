package Converters;

import Objects.TVDBEpisode;
import Objects.TVDBSeries;
import Objects.TVDBUpdate;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class ParserTests {
    private static final String XMLDIR = "/XML";
    private static final String TVDBUPDATES = "TVDBUPDATES.xml";
    private static final String TVDBIMDB = "TVDBIMDB.xml";
    private static final String TVDBEPISODE = "TVDBEPISODE.xml";
    private static final String TVDBSERIES = "TVDBSERIES.xml";
    private static final String TVDBSERIESALL = "TVDBSERIESALL.xml";
    private static final String TVDBSERIESBYNAME = "TVDBSERIESBYNAME.xml";
    private static final String OMDB = "OMDB.xml";

    public void testParseOMDBFromXml(XmlParser xmlParser) {
        InputStream inputStream = getFile(OMDB);
        Objects.OMDB omdb = xmlParser.parseOmdbFromXml(inputStream);
        assertNotNull(omdb);
        assertEquals("Title should be as expected", "Pompeii", omdb.getTitle());
    }

    public void testParseTVDBUpdateFromXml(XmlParser xmlParser) throws IOException, ParserConfigurationException, SAXException {
        InputStream inputStream = getFile(TVDBUPDATES);
        TVDBUpdate tvdbUpdate = xmlParser.parseTVDBUpdateFromXml(inputStream);
        assertNotNull(tvdbUpdate);
        assertEquals("Time should be as expected", "1399397095", tvdbUpdate.getTime());
    }

    public void testParseTVDBIMDBFromXml(XmlParser xmlParser) {
        InputStream inputStream = getFile(TVDBIMDB);
        Objects.TVDBIMDB tvdbImdb = xmlParser.parseTVDBIMDBFromXml(inputStream);
        assertNotNull(tvdbImdb);
        assertEquals("SeriesId should be as expected", "78107", tvdbImdb.getSeriesId());
    }

    public void testParseTVDBSeriesFromXml(XmlParser xmlParser) {
        InputStream inputStream = getFile(TVDBSERIES);
        TVDBSeries tvdbSeries = xmlParser.parseTVDBSeriesFromXml(inputStream);
        assertNotNull(tvdbSeries);
        assertEquals("IMDBID should be as expected", "tt0118276", tvdbSeries.getImdbId());
    }

    public void testParseTVDBEpisodeFromXml(XmlParser xmlParser) {
        InputStream inputStream = getFile(TVDBEPISODE);
        TVDBEpisode tvdbEpisode = xmlParser.parseTVDBEpisodeFromXML(inputStream);
        assertNotNull(tvdbEpisode);
        assertEquals("FirstAired should be as expected", "1997-03-10", tvdbEpisode.getFirstAired());
    }

    public void testParseTVDBSeriesAllFromXml(XmlParser xmlParser) {
        InputStream inputStream = getFile(TVDBSERIESALL);
        TVDBSeries tvdbSeries = xmlParser.parseTVDBSeriesFromXml(inputStream);
        assertNotNull(tvdbSeries);
        assertEquals("Seriesname should be as expected", "Rick and Morty", tvdbSeries.getSeriesName());
        assertFalse("EpisodeList should not be empty", tvdbSeries.getTvdbEpisodeList().isEmpty());
    }


    private InputStream getFile(String filename) {
        return this.getClass().getResourceAsStream(XMLDIR + "/" + filename);
    }

    private TVDBSeries makeTVDBSeriesCopy() {
        TVDBSeries tvdbSeries = new TVDBSeries();

        tvdbSeries.setId("275274");
        tvdbSeries.setActors("|Justin Roiland |Chris Parnell|Spencer Grammer|Sarah Chalke|");
        tvdbSeries.setAirsDayOfWeek("10:30 PM");
        tvdbSeries.setContentRating("TV-14");
        tvdbSeries.setFirstAired("2013-12-02");
        tvdbSeries.setGenre("|Animation|Comedy|Science-Fiction|");
        tvdbSeries.setImdbId("tt2861424");
        tvdbSeries.setLanguage("en");
        tvdbSeries.setNetwork("Adult Swim");
        tvdbSeries.setNetworkId("");
        tvdbSeries.setOverview("A sociopathic scientist drags his unintelligent grandson on insanely dangerous adventures across the universe.");
        tvdbSeries.setRating("9.5");
        tvdbSeries.setRatingCount("13");
        tvdbSeries.setRuntime("25");
        tvdbSeries.setSeriesId("");
        tvdbSeries.setSeriesName("Rick and Morty");
        tvdbSeries.setStatus("Continuing");
        tvdbSeries.setAdded("2013-11-13 09:41:13");
        tvdbSeries.setAddedBy("346515");
        tvdbSeries.setBanner("graphical/275274-g5.jpg");
        tvdbSeries.setFanart("fanart/original/275274-2.jpg");
        tvdbSeries.setLastUpdated("1399365383");
        tvdbSeries.setPoster("posters/275274-2.jpg");
        tvdbSeries.setZap2itId("");

        return tvdbSeries;
    }

    private TVDBEpisode makeTVDBEpisodeCopy(){
        TVDBEpisode tvdbEpisode = new TVDBEpisode();

        tvdbEpisode.setId("4721616");
        tvdbEpisode.setDvdChapter("");
        tvdbEpisode.setDvdDiscId("");
        tvdbEpisode.setDvdEpisodeNumber("");
        tvdbEpisode.setDvdSeason("");
        tvdbEpisode.setDirector("Justin Roiland");
        tvdbEpisode.setEpImgFlag("2");
        tvdbEpisode.setEpisodeName("The Real Animated Adventures of Doc and Mharti");
        tvdbEpisode.setEpisodeNumber("1");
        tvdbEpisode.setFirstAired("2006-10-01");
        tvdbEpisode.setGuestStars("");
        tvdbEpisode.setImdbId("tt2930486");
        tvdbEpisode.setLanguage("en");
        tvdbEpisode.setOverview("Justin actually made this as a way to poke fun at the idea of getting cease and desist letters.\n" +
                "At the time (October 2006) he had nothing to lose and his original intention was to call this &quot;back to the future: the new official universal studios cartoon featuring the new Doc Brown and Marty McFly&quot; and then just sit back and wait for a letter from their lawyers to arrive. That's actually why it's so filthy. He was just looking to &quot;troll&quot; a big studio.\n" +
                "7 years later, hit new animated TV show on adult swim. ");
        tvdbEpisode.setProductionCode("");
        tvdbEpisode.setRating("10.0");
        tvdbEpisode.setSeasonNumber("0");
        tvdbEpisode.setWriter("Justin Roiland");
        tvdbEpisode.setAbsoluteNumber("");
        tvdbEpisode.setFilename("episodes/275274/4721616.jpg");
        tvdbEpisode.setLastUpdated("1385450053");
        tvdbEpisode.setSeasonid("567214");
        tvdbEpisode.setSeriesId("275274");
        tvdbEpisode.setThumbAdded("2013-11-25 23:14:13");
        tvdbEpisode.setThumbHeight("225");
        tvdbEpisode.setThumbWidth("400");

        return tvdbEpisode;
    }

}
