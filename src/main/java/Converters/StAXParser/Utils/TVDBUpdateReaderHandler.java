package Converters.StAXParser.Utils;

import Objects.Constants.TVDBUpdateConstants;
import Objects.TVDBUpdate;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class TVDBUpdateReaderHandler {
    private static TVDBUpdate tvdbUpdate;
    private static String content;

    public static TVDBUpdate parse(XMLStreamReader xmlStreamReader) {
        while (readerHasNext(xmlStreamReader)) {
            int event = getNextEvent(xmlStreamReader);
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
                switch (xmlStreamReader.getLocalName()) {
                    case TVDBUpdateConstants.TIME:
                        tvdbUpdate.setTime(content);
                        break;
                    case TVDBUpdateConstants.SERIES:
                        tvdbUpdate.getSeriesList().add(content);
                        break;
                    case TVDBUpdateConstants.EPISODE:
                        tvdbUpdate.getEpisodeList().add(content);
                        break;
                }
                break;
        }
    }

    private static boolean readerHasNext(XMLStreamReader xmlStreamReader) {
        boolean hasNext = false;
        try {
            hasNext = xmlStreamReader.hasNext();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
        return hasNext;
    }

    private static int getNextEvent(XMLStreamReader xmlStreamReader) {
        Integer event = null;
        try {
            event = xmlStreamReader.next();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
        return event;
    }

}
