package Converters.StAXParser.Utils;

import Converters.XMLSwitchHelper;
import Objects.Constants.TVDBUpdateConstants;
import Objects.TVDBUpdate;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;

public class TVDBUpdateReaderHandler {
    private static TVDBUpdate tvdbUpdate;
    private static String content;

    public static TVDBUpdate parse(XMLStreamReader xmlStreamReader) {
        while (XmlStreamReaderHelper.readerHasNext(xmlStreamReader)) {
            int event = XmlStreamReaderHelper.getNextEvent(xmlStreamReader);
            switchEvent(event, xmlStreamReader);
        }
        return tvdbUpdate;
    }

    private static void switchEvent(int event, XMLStreamReader xmlStreamReader) {
        switch (event) {
            case XMLStreamConstants.START_ELEMENT:
                if(TVDBUpdateConstants.ELEMENTNAME.equals(xmlStreamReader.getLocalName())) {
                    tvdbUpdate = new TVDBUpdate();
                }
                break;
            case XMLStreamConstants.CHARACTERS:
                content = xmlStreamReader.getText().trim();
                break;
            case XMLStreamConstants.END_ELEMENT:
                XMLSwitchHelper.switchTVDBUpdate(tvdbUpdate, xmlStreamReader.getLocalName(), content);
                break;
        }
    }
}
