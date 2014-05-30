package converters;

import objects.*;

import java.io.InputStream;

public interface XmlParser {
    public TVDBUpdate parseTVDBUpdateFromXml(InputStream xml);
    public TVDBSeries parseTVDBSeriesFromXml(InputStream xml);
}
