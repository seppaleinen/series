package Converters.SaxParser.Utils;

import Converters.XMLSwitchHelper;
import Objects.Constants.TVDBIMDBConstants;
import Objects.TVDBIMDB;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class TVDBIMDBHandler extends DefaultHandler {
    private TVDBIMDB tvdbimdb;
    private String content;

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case TVDBIMDBConstants.ELEMENT:
                tvdbimdb = new TVDBIMDB();
                break;
        }
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        XMLSwitchHelper.switchTVDBIMDB(tvdbimdb, qName, content);
    }
    public void characters(char[] ch, int start, int length) throws SAXException {
        content = String.copyValueOf(ch, start, length).trim();
    }

    public TVDBIMDB getTVDBIMDB(){
        return tvdbimdb;
    }
}
