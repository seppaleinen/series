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
        return TVDBEpisodeNodeHandler.parse(document);
    }

    @Override
    public TVDBIMDB parseTVDBIMDBFromXml(InputStream xml) {
        Document document = DocumentHandler.getDocumentFromInputStream(xml);
        return TVDBIMDBNodeHandler.parse(document);
    }

    @Override
    public TVDBSeries parseTVDBSeriesFromXml(InputStream xml) {
        Document document = DocumentHandler.getDocumentFromInputStream(xml);
        return TVDBSeriesNodeHandler.parse(document);
    }

    @Override
    public TVDBUpdate parseTVDBUpdateFromXml(InputStream xml) {
        Document document = DocumentHandler.getDocumentFromInputStream(xml);
        return TVDBUpdateNodeHandler.parse(document);
    }

    @Override
    public OMDB parseOmdbFromXml(InputStream xml) {
        Document document = DocumentHandler.getDocumentFromInputStream(xml);
        return OMDBNodeHandler.parse(document);
    }}
