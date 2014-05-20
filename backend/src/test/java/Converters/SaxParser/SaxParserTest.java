package Converters.SaxParser;

import Converters.ParserTests;
import Converters.XmlParser;
import org.junit.Before;
import org.junit.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.*;

public class SaxParserTest {
    private XmlParser saxParser;
    private ParserTests parserTests;

    @Before
    public void setup(){
        saxParser = new SaxParser();
        parserTests = new ParserTests();
    }

    @Test
    public void testParseOMDBFromXml(){
        parserTests.testParseOMDBFromXml(saxParser);
    }

    @Test
    public void testParseTVDBUpdateFromXml() throws IOException, ParserConfigurationException, SAXException {
        parserTests.testParseTVDBUpdateFromXml(saxParser);
    }

    @Test
    public void testParseTVDBIMDBFromXml() {
        parserTests.testParseTVDBIMDBFromXml(saxParser);
    }

    @Test
    public void testParseTVDBSeriesFromXml(){
        parserTests.testParseTVDBSeriesFromXml(saxParser);
    }

    @Test
    public void testParseTVDBEpisodeFromXml(){
        parserTests.testParseTVDBEpisodeFromXml(saxParser);
    }

    @Test
    public void testParseTVDBSeriesAllFromXML(){
        parserTests.testParseTVDBSeriesAllFromXml(saxParser);
    }
}
