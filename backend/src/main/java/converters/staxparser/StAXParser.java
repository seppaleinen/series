package converters.staxparser;

import converters.staxparser.utils.*;
import converters.XmlParser;
import objects.*;

import javax.xml.stream.XMLStreamReader;
import java.io.InputStream;
import java.util.List;

public class StAXParser implements XmlParser {
    @Override
    public TVDBUpdate parseTVDBUpdateFromXml(InputStream xml) {
        XMLStreamReader xmlStreamReader = XmlStreamReaderHelper.getXMLStreamReader(xml);
        TVDBUpdateReaderHandler updateReaderHandler = new TVDBUpdateReaderHandler();
        return updateReaderHandler.parse(xmlStreamReader);
    }

    @Override
    public List<TVDBSeries> parseTVDBSeriesFromXml(InputStream xml) {
        XMLStreamReader xmlStreamReader = XmlStreamReaderHelper.getXMLStreamReader(xml);
        TVDBSeriesReaderHandler seriesReaderHandler = new TVDBSeriesReaderHandler();
        return seriesReaderHandler.parse(xmlStreamReader);
    }
}
