package converters.staxparser;

import converters.ParserTests;
import converters.XmlParser;
import org.junit.Before;
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

    @Test
    public void testParseTVDBUpdateFromXml() throws IOException, ParserConfigurationException, SAXException {
        parserTests.testParseTVDBUpdateFromXml(saxParser);
    }
}