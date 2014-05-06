package Converters.SaxParser.Utils;

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
        switch (qName){
            case TVDBIMDBConstants.ELEMENT:
                break;
            case TVDBIMDBConstants.SERIES_ID:
                tvdbimdb.setSeriesId(content);
                break;
            case TVDBIMDBConstants.LANGUAGE:
                tvdbimdb.setLanguage(content);
                break;
            case TVDBIMDBConstants.SERIES_NAME:
                tvdbimdb.setSeriesName(content);
                break;
            case TVDBIMDBConstants.BANNER:
                tvdbimdb.setBanner(content);
                break;
            case TVDBIMDBConstants.OVERVIEW:
                tvdbimdb.setOverview(content);
                break;
            case TVDBIMDBConstants.FIRST_AIRED:
                tvdbimdb.setFirstAired(content);
                break;
            case TVDBIMDBConstants.IMDB_ID:
                tvdbimdb.setImdbId(content);
                break;
            case TVDBIMDBConstants.ID:
                tvdbimdb.setId(content);
                break;
        }
    }
    public void characters(char[] ch, int start, int length) throws SAXException {
        content = String.copyValueOf(ch, start, length).trim();
    }

    public TVDBIMDB getTVDBIMDB(){
        return tvdbimdb;
    }
}
