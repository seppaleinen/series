package Converters.SaxParser.Utils;

import Objects.Constants.TVDBUpdateConstants;
import Objects.TVDBUpdate;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class TVDBUpdateHandler extends DefaultHandler {
    private TVDBUpdate tvdbUpdate;
    private String content;

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case TVDBUpdateConstants.ELEMENTNAME:
                tvdbUpdate = new TVDBUpdate();
                break;
        }
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName){
            case TVDBUpdateConstants.ELEMENTNAME:
                break;
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
    }
    public void characters(char[] ch, int start, int length) throws SAXException {
        content = String.copyValueOf(ch, start, length).trim();
    }

    public TVDBUpdate getTvdbUpdate(){
        return tvdbUpdate;
    }
}
