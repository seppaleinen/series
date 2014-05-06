package Converters.DomParser;

import Converters.XmlParser;
import Objects.*;

import java.io.InputStream;

public class DomParser implements XmlParser {
    @Override
    public TVDBEpisode parseTVDBEpisodeFromXML(InputStream xml) {
        return null;
    }

    @Override
    public TVDBIMDB parseTVDBIMDBFromXml(InputStream xml) {
        return null;
    }

    @Override
    public TVDBSeries parseTVDBSeriesFromXml(InputStream xml) {
        return null;
    }

    @Override
    public TVDBUpdate parseTVDBUpdateFromXml(InputStream xml) {
        return null;
    }

    @Override
    public OMDB parseOmdbFromXml(InputStream xml) {
        return null;
    }}
