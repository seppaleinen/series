package converters.domparser;

import converters.ParserTests;
import converters.XmlParser;
import org.junit.Before;
import org.junit.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class DomParserTest {
    private XmlParser domParser;
    private ParserTests parserTests;

    @Before
    public void setup(){
        domParser = new DomParser();
        parserTests = new ParserTests();
    }

    @Test
    public void testParseTVDBUpdateFromXml() throws IOException, ParserConfigurationException, SAXException {
        parserTests.testParseTVDBUpdateFromXml(domParser);
    }

    @Test
    public void testParseTVDBSeriesAllFromXml(){
        parserTests.testParseTVDBSeriesAll(domParser);
    }
}