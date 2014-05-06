package Converters.StAXParser.Utils;

import Converters.XMLSwitchHelper;
import Objects.Constants.TVDBSeriesConstants;
import Objects.TVDBSeries;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;

public class TVDBSeriesReaderHandler {
    private static TVDBSeries tvdbSeries;
    private static String content;

    public static TVDBSeries parse(XMLStreamReader xmlStreamReader) {
        while (XmlStreamReaderHelper.readerHasNext(xmlStreamReader)) {
            int event = XmlStreamReaderHelper.getNextEvent(xmlStreamReader);
            switchEvent(event, xmlStreamReader);
        }
        return tvdbSeries;
    }

    private static void switchEvent(int event, XMLStreamReader xmlStreamReader) {
        switch (event) {
            case XMLStreamConstants.START_ELEMENT:
                if(TVDBSeriesConstants.ELEMENT.equals(xmlStreamReader.getLocalName())) {
                    tvdbSeries = new TVDBSeries();
                }
                break;
            case XMLStreamConstants.CHARACTERS:
                content = xmlStreamReader.getText().trim();
                break;
            case XMLStreamConstants.END_ELEMENT:
                XMLSwitchHelper.switchTVDBSeries(tvdbSeries, xmlStreamReader.getLocalName(), content);
                break;
        }
    }
}
