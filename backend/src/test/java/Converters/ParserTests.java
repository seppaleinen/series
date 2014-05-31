package converters;

import objects.TVDBSeries;
import objects.TVDBUpdate;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class ParserTests {
    private static final String XMLDIR = "/XML";
    private static final String TVDBUPDATES = "TVDBUPDATES.xml";
    private static final String TVDBSERIESALL = "TVDBSERIESALL.xml";
    private static final String TVDBSERIESBYNAME = "TVDBSERIESBYNAME.xml";

    public void testParseTVDBUpdateFromXml(XmlParser xmlParser) throws IOException, ParserConfigurationException, SAXException {
        InputStream inputStream = getFile(TVDBUPDATES);
        TVDBUpdate tvdbUpdate = xmlParser.parseTVDBUpdateFromXml(inputStream);
        assertNotNull(tvdbUpdate);
        assertEquals("Time should be as expected", "1399397095", tvdbUpdate.getTime());
        assertNotNull("EpisodeList should not be null", tvdbUpdate.getEpisodeList());
        assertEquals("EpisodeList should be equals", 1000, tvdbUpdate.getEpisodeList().size());
        assertNotNull("SeriesList should not be null", tvdbUpdate.getSeriesList());
        assertEquals("SeriesList should be equals", 1000, tvdbUpdate.getSeriesList().size());
    }

    public void testParseTVDBSeriesAll(XmlParser xmlParser){
        InputStream inputStream = getFile(TVDBSERIESALL);
        TVDBSeries tvdbSeries = xmlParser.parseTVDBSeriesFromXml(inputStream);
        ParserTestHelper.assertSeries(tvdbSeries);
        ParserTestHelper.assertEpisodes(tvdbSeries.getTvdbEpisodeList());
    }

    private InputStream getFile(String filename) {
        return this.getClass().getResourceAsStream(XMLDIR + "/" + filename);
    }
}
