package Converters.StAXParser.Utils;

import Converters.XMLSwitchHelper;
import Objects.Constants.TVDBEpisodeConstants;
import Objects.TVDBEpisode;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;

public class TVDBEpisodeReaderHandler {
    private static TVDBEpisode tvdbEpisode;
    private static String content;

    public static TVDBEpisode parse(XMLStreamReader xmlStreamReader) {
        while (XmlStreamReaderHelper.readerHasNext(xmlStreamReader)) {
            int event = XmlStreamReaderHelper.getNextEvent(xmlStreamReader);
            switchEvent(event, xmlStreamReader);
        }
        return tvdbEpisode;
    }

    private static void switchEvent(int event, XMLStreamReader xmlStreamReader) {
        switch (event) {
            case XMLStreamConstants.START_ELEMENT:
                if(TVDBEpisodeConstants.ELEMENT.equals(xmlStreamReader.getLocalName())) {
                    tvdbEpisode = new TVDBEpisode();
                }
                break;
            case XMLStreamConstants.CHARACTERS:
                content = xmlStreamReader.getText().trim();
                break;
            case XMLStreamConstants.END_ELEMENT:
                XMLSwitchHelper.switchTVDBEpisode(tvdbEpisode, xmlStreamReader.getLocalName(), content);
                break;
        }
    }
}
