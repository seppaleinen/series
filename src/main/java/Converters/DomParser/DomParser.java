package Converters.DomParser;

import Converters.DomParser.Utils.DocumentHandler;
import Converters.DomParser.Utils.TVDBUpdateNodeHandler;
import Converters.XmlParser;
import Objects.*;
import org.w3c.dom.Document;

import java.io.InputStream;

public class DomParser implements XmlParser {
    @Override
    public TVDBEpisode parseTVDBEpisodeFromXML(InputStream xml) {
        Document document = DocumentHandler.getDocumentFromInputStream(xml);
        return null;
    }

    @Override
    public TVDBIMDB parseTVDBIMDBFromXml(InputStream xml) {
        Document document = DocumentHandler.getDocumentFromInputStream(xml);
        return null;
    }

    @Override
    public TVDBSeries parseTVDBSeriesFromXml(InputStream xml) {
        Document document = DocumentHandler.getDocumentFromInputStream(xml);
        return null;
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
        return null;
    }}
