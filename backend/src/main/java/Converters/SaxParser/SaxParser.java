package converters.saxparser;

import converters.saxparser.utils.*;
import converters.XmlParser;
import objects.*;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.io.InputStream;

public class SaxParser implements XmlParser {
    @Override
    public TVDBUpdate parseTVDBUpdateFromXml(InputStream xml){
        TVDBUpdate tvdbUpdate;

        TVDBUpdateHandler saxHandler = new TVDBUpdateHandler();
        parse(saxHandler, xml);
        tvdbUpdate = saxHandler.getTvdbUpdate();

        return tvdbUpdate;
    }

    @Override
    public TVDBSeries parseTVDBSeriesFromXml(InputStream xml) {
        TVDBSeries tvdbSeries;

        TVDBSeriesHandler saxHandler = new TVDBSeriesHandler();
        parse(saxHandler, xml);
        tvdbSeries = saxHandler.getTVDBSeries();

        return tvdbSeries;
    }

    private void parse(DefaultHandler defaultHandler, InputStream xml){
        SAXParserFactory parserFactor = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = parserFactor.newSAXParser();
            saxParser.parse(xml, defaultHandler);
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
    }
}