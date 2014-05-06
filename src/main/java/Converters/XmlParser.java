package Converters;

import Objects.*;

import java.io.InputStream;

public interface XmlParser {
    public TVDBEpisode parseTVDBEpisodeFromXML(InputStream xml);
    public TVDBIMDB parseTVDBIMDBFromXml(InputStream xml);
    public TVDBSeries parseTVDBSeriesFromXml(InputStream xml);
    public TVDBUpdate parseTVDBUpdateFromXml(InputStream xml);
    public OMDB parseOmdbFromXml(InputStream xml);
}
