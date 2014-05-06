package Converters.SaxParser;

import Converters.SaxParser.Utils.*;
import Converters.XmlParser;
import Objects.*;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.io.InputStream;

public class SaxParser implements XmlParser {
    public TVDBEpisode parseTVDBEpisodeFromXML(InputStream xml){
        TVDBEpisode tvdbEpisode;

        TVDBEpisodeHandler saxHandler = new TVDBEpisodeHandler();
        parse(saxHandler, xml);
        tvdbEpisode = saxHandler.getTVDBEpisode();

        return tvdbEpisode;
    }
    public TVDBIMDB parseTVDBIMDBFromXml(InputStream xml){
        TVDBIMDB tvdbimdb;

        TVDBIMDBHandler saxHandler = new TVDBIMDBHandler();
        parse(saxHandler, xml);
        tvdbimdb = saxHandler.getTVDBIMDB();

        return tvdbimdb;
    }
    public TVDBSeries parseTVDBSeriesFromXml(InputStream xml){
        TVDBSeries tvdbSeries;

        TVDBSeriesHandler saxHandler = new TVDBSeriesHandler();
        parse(saxHandler, xml);
        tvdbSeries = saxHandler.getTVDBSeries();

        return tvdbSeries;
    }

    public TVDBUpdate parseTVDBUpdateFromXml(InputStream xml){
        TVDBUpdate tvdbUpdate;

        TVDBUpdateHandler saxHandler = new TVDBUpdateHandler();
        parse(saxHandler, xml);
        tvdbUpdate = saxHandler.getTvdbUpdate();

        return tvdbUpdate;
    }


    public OMDB parseOmdbFromXml(InputStream xml){
        OMDB omdb;

        OMDBHandler saxHandler = new OMDBHandler();
        parse(saxHandler, xml);
        omdb = saxHandler.getOMDB();

        return omdb;
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