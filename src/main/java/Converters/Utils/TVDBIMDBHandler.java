package Converters.Utils;

import Objects.TVDBIMDB;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class TVDBIMDBHandler extends DefaultHandler {
    private static final String ELEMENT = "Series";
    private static final String SERIES_ID = "seriesid";
    private static final String LANGUAGE = "language";
    private static final String SERIES_NAME = "SeriesName";
    private static final String BANNER = "banner";
    private static final String OVERVIEW = "Overview";
    private static final String FIRST_AIRED = "FirstAired";
    private static final String IMDB_ID = "IMDB_ID";
    private static final String ID = "id";

    //private List<TVDBIMDB> tvdbimdbList = new ArrayList<>();
    private TVDBIMDB tvdbimdb;
    private String content;

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case ELEMENT:
                tvdbimdb = new TVDBIMDB();
                break;
        }
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName){
            case ELEMENT:
                //tvdbimdbList.add(tvdbimdb);
                break;
            case SERIES_ID:
                tvdbimdb.setSeriesId(content);
                break;
            case LANGUAGE:
                tvdbimdb.setLanguage(content);
                break;
            case SERIES_NAME:
                tvdbimdb.setSeriesName(content);
                break;
            case BANNER:
                tvdbimdb.setBanner(content);
                break;
            case OVERVIEW:
                tvdbimdb.setOverview(content);
                break;
            case FIRST_AIRED:
                tvdbimdb.setFirstAired(content);
                break;
            case IMDB_ID:
                tvdbimdb.setImdbId(content);
                break;
            case ID:
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
