package Converters.SaxParser.Utils;

import Converters.XMLSwitchHelper;
import Objects.Constants.TVDBEpisodeConstants;
import Objects.TVDBEpisode;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class TVDBEpisodeHandler extends DefaultHandler {
    private TVDBEpisode tvdbEpisode;
    private String content;

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case TVDBEpisodeConstants.ELEMENT:
                tvdbEpisode = new TVDBEpisode();
                break;
        }
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        XMLSwitchHelper.switchTVDBEpisode(tvdbEpisode, qName, content);
    }
    public void characters(char[] ch, int start, int length) throws SAXException {
        content = String.copyValueOf(ch, start, length).trim();
    }

    public TVDBEpisode getTVDBEpisode(){
        return tvdbEpisode;
    }
}
