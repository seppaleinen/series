package Converters.Utils;

import Objects.TVDBSeries;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class TVDBSeriesHandler extends DefaultHandler {
    private static final String ELEMENT = "Series";
    private static final String ACTORS = "Actors";
    private static final String AIRS_DAY_OF_WEEK = "Airs_DayOfWeek";
    private static final String AIRS_TIME = "Airs_Time";
    private static final String CONTENT_RATING = "ContentRating";
    private static final String FIRST_AIRED = "FirstAired";
    private static final String GENRE = "Genre";
    private static final String IMDB_ID = "IMDB_ID";
    private static final String LANGUAGE = "Language";
    private static final String NETWORK = "Network";
    private static final String NETWORK_ID = "NetworkID";
    private static final String OVERVIEW = "Overview";
    private static final String RATING = "Rating";
    private static final String RATING_COUNT = "RatingCount";
    private static final String RUNTIME = "Runtime";
    private static final String SERIES_ID = "SeriesID";
    private static final String SERIES_NAME = "SeriesName";
    private static final String STATUS = "Status";
    private static final String ADDED = "added";
    private static final String ADDED_BY = "addedBy";
    private static final String BANNER = "banner";
    private static final String FANART = "fanart";
    private static final String LAST_UPDATED = "lastupdated";
    private static final String POSTER = "poster";
    private static final String ZAP2IT_ID = "zap2it_id";

    //private List<TVDBIMDB> tvdbimdbList = new ArrayList<>();
    private TVDBSeries tvdbSeries;
    private String content;

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case ELEMENT:
                tvdbSeries = new TVDBSeries();
                break;
        }
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName){
            case ELEMENT:
                //tvdbimdbList.add(tvdbimdb);
                break;
            case ACTORS:
                tvdbSeries.setActors(content);
                break;
            case AIRS_DAY_OF_WEEK:
                tvdbSeries.setAirsDayOfWeek(content);
                break;
            case AIRS_TIME:
                tvdbSeries.setAirsTime(content);
                //tvdbimdb.setSeriesName(content);
                break;
            case CONTENT_RATING:
                tvdbSeries.setContentRating(content);
                break;
            case FIRST_AIRED:
                tvdbSeries.setFirstAired(content);
                break;
            case GENRE:
                tvdbSeries.setGenre(content);
                //tvdbimdb.setBanner(content);
                break;
            case IMDB_ID:
                tvdbSeries.setImdbId(content);
                //tvdbimdb.setOverview(content);
                break;
            case LANGUAGE:
                tvdbSeries.setLanguage(content);
                //tvdbimdb.setFirstAired(content);
                break;
            case NETWORK:
                tvdbSeries.setNetwork(content);
                //tvdbimdb.setImdbId(content);
                break;
            case NETWORK_ID:
                tvdbSeries.setNetworkId(content);
                //tvdbimdb.setId(content);
                break;
            case OVERVIEW:
                tvdbSeries.setOverview(content);
                break;
            case RATING:
                tvdbSeries.setRatingCount(content);
                break;
            case RATING_COUNT:
                tvdbSeries.setRatingCount(content);
                break;
            case RUNTIME:
                tvdbSeries.setRuntime(content);
                break;
            case SERIES_ID:
                tvdbSeries.setSeriesId(content);
                break;
            case SERIES_NAME:
                tvdbSeries.setSeriesName(content);
                break;
            case STATUS:
                tvdbSeries.setStatus(content);
                break;
            case ADDED:
                tvdbSeries.setAdded(content);
                break;
            case ADDED_BY:
                tvdbSeries.setAddedBy(content);
                break;
            case BANNER:
                tvdbSeries.setBanner(content);
                break;
            case FANART:
                tvdbSeries.setFanart(content);
                break;
            case LAST_UPDATED:
                tvdbSeries.setLastUpdated(content);
                break;
            case POSTER:
                tvdbSeries.setPoster(content);
                break;
            case ZAP2IT_ID:
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