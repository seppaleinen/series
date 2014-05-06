package Converters.SaxParser.Utils;

import Objects.Constants.TVDBSeriesConstants;
import Objects.TVDBSeries;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class TVDBSeriesHandler extends DefaultHandler {
    private TVDBSeries tvdbSeries;
    private String content;

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case TVDBSeriesConstants.ELEMENT:
                tvdbSeries = new TVDBSeries();
                break;
        }
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName){
            case TVDBSeriesConstants.ELEMENT:
                break;
            case TVDBSeriesConstants.ACTORS:
                tvdbSeries.setActors(content);
                break;
            case TVDBSeriesConstants.AIRS_DAY_OF_WEEK:
                tvdbSeries.setAirsDayOfWeek(content);
                break;
            case TVDBSeriesConstants.AIRS_TIME:
                tvdbSeries.setAirsTime(content);
                break;
            case TVDBSeriesConstants.CONTENT_RATING:
                tvdbSeries.setContentRating(content);
                break;
            case TVDBSeriesConstants.FIRST_AIRED:
                tvdbSeries.setFirstAired(content);
                break;
            case TVDBSeriesConstants.GENRE:
                tvdbSeries.setGenre(content);
                break;
            case TVDBSeriesConstants.IMDB_ID:
                tvdbSeries.setImdbId(content);
                break;
            case TVDBSeriesConstants.LANGUAGE:
                tvdbSeries.setLanguage(content);
                break;
            case TVDBSeriesConstants.NETWORK:
                tvdbSeries.setNetwork(content);
                break;
            case TVDBSeriesConstants.NETWORK_ID:
                tvdbSeries.setNetworkId(content);
                break;
            case TVDBSeriesConstants.OVERVIEW:
                tvdbSeries.setOverview(content);
                break;
            case TVDBSeriesConstants.RATING:
                tvdbSeries.setRatingCount(content);
                break;
            case TVDBSeriesConstants.RATING_COUNT:
                tvdbSeries.setRatingCount(content);
                break;
            case TVDBSeriesConstants.RUNTIME:
                tvdbSeries.setRuntime(content);
                break;
            case TVDBSeriesConstants.SERIES_ID:
                tvdbSeries.setSeriesId(content);
                break;
            case TVDBSeriesConstants.SERIES_NAME:
                tvdbSeries.setSeriesName(content);
                break;
            case TVDBSeriesConstants.STATUS:
                tvdbSeries.setStatus(content);
                break;
            case TVDBSeriesConstants.ADDED:
                tvdbSeries.setAdded(content);
                break;
            case TVDBSeriesConstants.ADDED_BY:
                tvdbSeries.setAddedBy(content);
                break;
            case TVDBSeriesConstants.BANNER:
                tvdbSeries.setBanner(content);
                break;
            case TVDBSeriesConstants.FANART:
                tvdbSeries.setFanart(content);
                break;
            case TVDBSeriesConstants.LAST_UPDATED:
                tvdbSeries.setLastUpdated(content);
                break;
            case TVDBSeriesConstants.POSTER:
                tvdbSeries.setPoster(content);
                break;
            case TVDBSeriesConstants.ZAP2IT_ID:
                tvdbSeries.setZap2itId(content);
                break;
        }
    }
    public void characters(char[] ch, int start, int length) throws SAXException {
        content = String.copyValueOf(ch, start, length).trim();
    }

    public TVDBSeries getTVDBSeries(){
        return tvdbSeries;
    }
}