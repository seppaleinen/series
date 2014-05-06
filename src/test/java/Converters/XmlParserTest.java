package Converters;

import Objects.*;
import org.junit.Before;
import org.junit.Test;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;

import static org.junit.Assert.*;

public class XmlParserTest {
    private XmlParser xmlParser;
    private static final String XMLDIR = "/XML";
    private static final String TVDBUPDATES = "TVDBUPDATES.xml";
    private static final String TVDBIMDB = "TVDBIMDB.xml";
    private static final String TVDBEPISODE = "TVDBEPISODE.xml";
    private static final String TVDBSERIES = "TVDBSERIES.xml";
    private static final String OMDB = "OMDB.xml";

    @Before
    public void setup(){
        xmlParser = new XmlParser();
    }

    @Test
    public void testParseOMDBFromXml(){
        InputStream inputStream = getFile(OMDB);
        OMDB omdb = xmlParser.parseOmdbFromXml(inputStream);
        assertNotNull(omdb);
        assertEquals("Title should be as expected", "Pompeii", omdb.getTitle());
    }

    @Test
    public void testParseTVDBUpdateFromXml() throws IOException, ParserConfigurationException, SAXException {
        InputStream inputStream = getFile(TVDBUPDATES);
        TVDBUpdate tvdbUpdate = xmlParser.parseTVDBUpdateFromXml(inputStream);
        assertNotNull(tvdbUpdate);
        assertEquals("Time should be as expected", "1399397095", tvdbUpdate.getTime());
    }

    @Test
    public void testParseTVDBIMDBFromXml() {
        InputStream inputStream = getFile(TVDBIMDB);
        TVDBIMDB tvdbImdb = xmlParser.parseTVDBIMDBFromXml(inputStream);
        assertNotNull(tvdbImdb);
        assertEquals("SeriesId should be as expected", "78107", tvdbImdb.getSeriesId());
    }

    @Test
    public void testParseTVDBSeriesFromXml(){
        InputStream inputStream = getFile(TVDBSERIES);
        TVDBSeries tvdbSeries = xmlParser.parseTVDBSeriesFromXml(inputStream);
        assertNotNull(tvdbSeries);
        assertEquals("IMDBID should be as expected", "tt0118276", tvdbSeries.getImdbId());
    }

    @Test
    public void testParseTVDBEpisodeFromXml(){
        InputStream inputStream = getFile(TVDBEPISODE);
        TVDBEpisode tvdbEpisode = xmlParser.parseTVDBEpisodeFromXML(inputStream);
        assertNotNull(tvdbEpisode);
        assertEquals("FirstAired should be as expected", "1997-03-10", tvdbEpisode.getFirstAired());
    }

    private InputStream getFile(String filename){
        return this.getClass().getResourceAsStream(XMLDIR + "/" + filename);
    }

}
