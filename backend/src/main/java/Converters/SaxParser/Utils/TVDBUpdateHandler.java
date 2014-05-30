package converters.saxparser.utils;

import converters.XMLSwitchHelper;
import objects.constants.TVDBUpdateConstants;
import objects.TVDBUpdate;
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
        XMLSwitchHelper.switchTVDBUpdate(tvdbUpdate, qName, content);
    }
    public void characters(char[] ch, int start, int length) throws SAXException {
        content = String.copyValueOf(ch, start, length).trim();
    }

    public TVDBUpdate getTvdbUpdate(){
        return tvdbUpdate;
    }
}
