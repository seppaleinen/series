package Converters.StAXParser;

import Converters.ParserTests;
import Converters.XmlParser;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class StAXParserTest {
    private XmlParser saxParser;
    private ParserTests parserTests;

    @Before
    public void setup(){
        saxParser = new StAXParser();
        parserTests = new ParserTests();
    }

    @Ignore
    @Test
    public void testParseOMDBFromXml(){
        parserTests.testParseOMDBFromXml(saxParser);
    }

    @Test
    public void testParseTVDBUpdateFromXml() throws IOException, ParserConfigurationException, SAXException {
        parserTests.testParseTVDBUpdateFromXml(saxParser);
    }

    @Ignore
    @Test
    public void testParseTVDBIMDBFromXml() {
        parserTests.testParseTVDBIMDBFromXml(saxParser);
    }

    @Ignore
    @Test
    public void testParseTVDBSeriesFromXml(){
        parserTests.testParseTVDBSeriesFromXml(saxParser);
    }

    @Ignore
    @Test
    public void testParseTVDBEpisodeFromXml(){
        parserTests.testParseTVDBEpisodeFromXml(saxParser);
    }
}