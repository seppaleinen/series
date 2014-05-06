package Converters.StAXParser;

import Converters.StAXParser.Utils.*;
import Converters.XmlParser;
import Objects.*;

import javax.xml.stream.XMLStreamReader;
import java.io.InputStream;

public class StAXParser implements XmlParser {
    @Override
    public TVDBEpisode parseTVDBEpisodeFromXML(InputStream xml) {
        XMLStreamReader xmlStreamReader = XmlStreamReaderHelper.getXMLStreamReader(xml);
        return TVDBEpisodeReaderHandler.parse(xmlStreamReader);
    }

    @Override
    public TVDBIMDB parseTVDBIMDBFromXml(InputStream xml) {
        XMLStreamReader xmlStreamReader = XmlStreamReaderHelper.getXMLStreamReader(xml);
        return TVDBIMDBReaderHandler.parse(xmlStreamReader);
    }

    @Override
    public TVDBSeries parseTVDBSeriesFromXml(InputStream xml) {
        XMLStreamReader xmlStreamReader = XmlStreamReaderHelper.getXMLStreamReader(xml);
        return TVDBSeriesReaderHandler.parse(xmlStreamReader);
    }

    @Override
    public TVDBUpdate parseTVDBUpdateFromXml(InputStream xml) {
        XMLStreamReader xmlStreamReader = XmlStreamReaderHelper.getXMLStreamReader(xml);
        return TVDBUpdateReaderHandler.parse(xmlStreamReader);
    }

    @Override
    public OMDB parseOmdbFromXml(InputStream xml) {
        XMLStreamReader xmlStreamReader = XmlStreamReaderHelper.getXMLStreamReader(xml);
        return OMDBReaderHandler.parse(xmlStreamReader);
    }
}
