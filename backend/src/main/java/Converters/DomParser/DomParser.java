package converters.domparser;

import converters.domparser.utils.*;
import converters.XmlParser;
import objects.*;
import org.w3c.dom.Document;

import java.io.InputStream;

public class DomParser implements XmlParser {
    @Override
    public TVDBUpdate parseTVDBUpdateFromXml(InputStream xml) {
        Document document = DocumentHandler.getDocumentFromInputStream(xml);
        return TVDBUpdateNodeHandler.parse(document);
    }

    @Override
    public TVDBSeries parseTVDBSeriesFromXml(InputStream xml) {
        Document document = DocumentHandler.getDocumentFromInputStream(xml);
        return TVDBSeriesNodeHandler.parse(document);
    }
}
