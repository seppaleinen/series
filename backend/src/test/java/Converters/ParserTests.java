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

    public void testParseOMDBFromXml(XmlParser xmlParser){
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

    public void testParseTVDBSeriesFromXml(XmlParser xmlParser){
        InputStream inputStream = getFile(TVDBSERIES);
        TVDBSeries tvdbSeries = xmlParser.parseTVDBSeriesFromXml(inputStream);
        assertNotNull(tvdbSeries);
        assertEquals("IMDBID should be as expected", "tt0118276", tvdbSeries.getImdbId());
    }

    public void testParseTVDBEpisodeFromXml(XmlParser xmlParser){
        InputStream inputStream = getFile(TVDBEPISODE);
        TVDBEpisode tvdbEpisode = xmlParser.parseTVDBEpisodeFromXML(inputStream);
        assertNotNull(tvdbEpisode);
        assertEquals("FirstAired should be as expected", "1997-03-10", tvdbEpisode.getFirstAired());
    }

    public void testParseTVDBSeriesAllFromXml(XmlParser xmlParser){
        InputStream inputStream = getFile(TVDBSERIESALL);
        TVDBSeries tvdbSeries = xmlParser.parseTVDBSeriesFromXml(inputStream);
        assertNotNull(tvdbSeries);
        assertEquals("Seriesname should be as expected", "Rick and Morty", tvdbSeries.getSeriesName());
        assertFalse("EpisodeList should not be empty", tvdbSeries.getTvdbEpisodeList().isEmpty());
    }


    private InputStream getFile(String filename){
        return this.getClass().getResourceAsStream(XMLDIR + "/" + filename);
    }

}
