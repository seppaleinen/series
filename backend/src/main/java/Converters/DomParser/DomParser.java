package converters.domparser;

import converters.domparser.utils.*;
import converters.XmlParser;
import objects.*;
import org.w3c.dom.Document;

import java.io.InputStream;
import java.util.List;

public class DomParser implements XmlParser {
    private DocumentHandler documentHandler;
    private Document document;

    public DomParser(){
        documentHandler = new DocumentHandler();
    }
    @Override
    public TVDBUpdate parseTVDBUpdateFromXml(InputStream xml) {
        document = documentHandler.getDocumentFromInputStream(xml);
        TVDBUpdateNodeHandler updateNodeHandler = new TVDBUpdateNodeHandler();
        return updateNodeHandler.parse(document);
    }

    @Override
    public List<TVDBSeries> parseTVDBSeriesFromXml(InputStream xml) {
        document = documentHandler.getDocumentFromInputStream(xml);
        TVDBSeriesNodeHandler seriesNodeHandler = new TVDBSeriesNodeHandler();
        return seriesNodeHandler.parse(document);
    }
}
