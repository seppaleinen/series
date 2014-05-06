package Converters.DomParser;

import Converters.DomParser.Utils.*;
import Converters.XmlParser;
import Objects.*;
import org.w3c.dom.Document;

import java.io.InputStream;

public class DomParser implements XmlParser {
    @Override
    public TVDBEpisode parseTVDBEpisodeFromXML(InputStream xml) {
        Document document = DocumentHandler.getDocumentFromInputStream(xml);
        TVDBEpisode tvdbEpisode = TVDBEpisodeNodeHandler.parse(document);
        return tvdbEpisode;
    }

    @Override
    public TVDBIMDB parseTVDBIMDBFromXml(InputStream xml) {
        Document document = DocumentHandler.getDocumentFromInputStream(xml);
        TVDBIMDB tvdbimdb = TVDBIMDBNodeHandler.parse(document);
        return tvdbimdb;
    }

    @Override
    public TVDBSeries parseTVDBSeriesFromXml(InputStream xml) {
        Document document = DocumentHandler.getDocumentFromInputStream(xml);
        TVDBSeries tvdbSeries = TVDBSeriesNodeHandler.parse(document);
        return tvdbSeries;
    }

    @Override
    public TVDBUpdate parseTVDBUpdateFromXml(InputStream xml) {
        Document document = DocumentHandler.getDocumentFromInputStream(xml);
        TVDBUpdate tvdbUpdate = TVDBUpdateNodeHandler.parse(document);
        return tvdbUpdate;
    }

    @Override
    public OMDB parseOmdbFromXml(InputStream xml) {
        Document document = DocumentHandler.getDocumentFromInputStream(xml);
        OMDB omdb = OMDBNodeHandler.parse(document);
        return omdb;
    }}
