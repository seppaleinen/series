package Converters.Utils;

import Objects.TVDBUpdate;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class TVDBUpdateHandler extends DefaultHandler {
    private static final String ELEMENTNAME = "Items";
    private static final String TIME = "Time";
    private static final String SERIES = "Series";
    private static final String EPISODE = "Episode";

    private TVDBUpdate tvdbUpdate;
    private String content;

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case ELEMENTNAME:
                tvdbUpdate = new TVDBUpdate();
                break;
        }
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName){
            case ELEMENTNAME:
                break;
            case TIME:
                tvdbUpdate.setTime(content);
                break;
            case SERIES:
                tvdbUpdate.getSeriesList().add(content);
                break;
            case EPISODE:
                tvdbUpdate.getEpisodeList().add(content);
                break;
        }
    }
    public void characters(char[] ch, int start, int length) throws SAXException {
        content = String.copyValueOf(ch, start, length).trim();
    }

    public TVDBUpdate getTvdbUpdate(){
        return tvdbUpdate;
    }
}
