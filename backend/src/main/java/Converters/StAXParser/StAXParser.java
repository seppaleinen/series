package converters.staxparser;

import converters.staxparser.utils.*;
import converters.XmlParser;
import objects.*;

import javax.xml.stream.XMLStreamReader;
import java.io.InputStream;

public class StAXParser implements XmlParser {
    @Override
    public TVDBUpdate parseTVDBUpdateFromXml(InputStream xml) {
        XMLStreamReader xmlStreamReader = XmlStreamReaderHelper.getXMLStreamReader(xml);
        return TVDBUpdateReaderHandler.parse(xmlStreamReader);
    }

    @Override
    public TVDBSeries parseTVDBSeriesFromXml(InputStream xml) {
        XMLStreamReader xmlStreamReader = XmlStreamReaderHelper.getXMLStreamReader(xml);
        return TVDBSeriesReaderHandler.parse(xmlStreamReader);
    }
}
