package Converters.StAXParser.Utils;

import Converters.XMLSwitchHelper;
import Objects.Constants.TVDBIMDBConstants;
import Objects.TVDBIMDB;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;

public class TVDBIMDBReaderHandler {
    private static TVDBIMDB tvdbimdb;
    private static String content;

    public static TVDBIMDB parse(XMLStreamReader xmlStreamReader) {
        while (XmlStreamReaderHelper.readerHasNext(xmlStreamReader)) {
            int event = XmlStreamReaderHelper.getNextEvent(xmlStreamReader);
            switchEvent(event, xmlStreamReader);
        }
        return tvdbimdb;
    }

    private static void switchEvent(int event, XMLStreamReader xmlStreamReader) {
        switch (event) {
            case XMLStreamConstants.START_ELEMENT:
                if(TVDBIMDBConstants.ELEMENT.equals(xmlStreamReader.getLocalName())) {
                    tvdbimdb = new TVDBIMDB();
                }
                break;
            case XMLStreamConstants.CHARACTERS:
                content = xmlStreamReader.getText().trim();
                break;
            case XMLStreamConstants.END_ELEMENT:
                XMLSwitchHelper.switchTVDBIMDB(tvdbimdb, xmlStreamReader.getLocalName(), content);
                break;
        }
    }
}
