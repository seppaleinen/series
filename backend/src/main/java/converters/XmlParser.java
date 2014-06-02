package converters;

import objects.*;

import java.io.InputStream;
import java.util.List;

public interface XmlParser {
    public TVDBUpdate parseTVDBUpdateFromXml(InputStream xml);
    public List<TVDBSeries> parseTVDBSeriesFromXml(InputStream xml);
}
