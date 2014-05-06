package Converters.Utils;

import Objects.TVDBEpisode;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class TVDBEpisodeHandler extends DefaultHandler {
    private static final String ELEMENT = "Episode";
    private static final String ID = "id";
    private static final String SEASON_ID = "seasonid";
    private static final String EPISODE_NUMBER = "EpisodeNumber";
    private static final String EPISODE_NAME = "EpisodeName";
    private static final String FIRST_AIRED = "FirstAired";
    private static final String GUEST_STARS = "GuestStars";
    private static final String DIRECTOR = "Director";
    private static final String WRITER = "Writer";
    private static final String OVERVIEW = "Overview";
    private static final String PRODUCTION_CODE = "ProductionCode";
    private static final String LAST_UPDATED = "lastupdated";
    private static final String FLAGGED = "flagged";
    private static final String DVD_DISCID = "DVD_discid";
    private static final String DVD_SEASON = "DVD_season";
    private static final String DVD_EPISODENUMBER = "DVD_episodenumber";
    private static final String DVD_CHAPTER = "DVD_chapter";
    private static final String ABSOLUTE_NUMBER = "absolute_number";
    private static final String FILENAME = "filename";
    private static final String SERIESID = "seriesid";
    private static final String THUMB_ADDED = "thumb_added";
    private static final String THUMB_WIDTH = "thumb_width";
    private static final String THUMB_HEIGHT = "thumb_height";
    private static final String TMS_EXPORT = "tms_export";
    private static final String MIRROR_UPDATE = "mirrorupdate";
    private static final String IMDB_ID = "IMDB_ID";
    private static final String EPIMGFLAG = "EpImgFlag";
    private static final String RATING = "Rating";
    private static final String SEASON_NUMBER = "SeasonNumber";
    private static final String LANGUAGE = "Language";

    private TVDBEpisode tvdbEpisode;
    private String content;

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case ELEMENT:
                tvdbEpisode = new TVDBEpisode();
                break;
        }
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName){
            case ELEMENT:
                break;
            case ID:
                tvdbEpisode.setId(content);
                break;
            case SEASON_ID:
                tvdbEpisode.setSeasonid(content);
                break;
            case EPISODE_NUMBER:
                tvdbEpisode.setEpisodeNumber(content);
                break;
            case EPISODE_NAME:
                tvdbEpisode.setEpisodeName(content);
                break;
            case FIRST_AIRED:
                tvdbEpisode.setFirstAired(content);
                break;
            case GUEST_STARS:
                tvdbEpisode.setGuestStars(content);
                break;
            case DIRECTOR:
                tvdbEpisode.setDirector(content);
                break;
            case WRITER:
                tvdbEpisode.setWriter(content);
                break;
            case OVERVIEW:
                tvdbEpisode.setOverview(content);
                break;
            case PRODUCTION_CODE:
                tvdbEpisode.setProductionCode(content);
                break;
            case LAST_UPDATED:
                tvdbEpisode.setLastUpdated(content);
                break;
            case FLAGGED:
                tvdbEpisode.setFlagged(content);
                break;
            case DVD_DISCID:
                tvdbEpisode.setDvdDiscId(content);
                break;
            case DVD_SEASON:
                tvdbEpisode.setDvdSeason(content);
                break;
            case DVD_EPISODENUMBER:
                tvdbEpisode.setDvdEpisodeNumber(content);
                break;
            case DVD_CHAPTER:
                tvdbEpisode.setDvdChapter(content);
                break;
            case ABSOLUTE_NUMBER:
                tvdbEpisode.setAbsoluteNumber(content);
                break;
            case FILENAME:
                tvdbEpisode.setFilename(content);
                break;
            case SERIESID:
                tvdbEpisode.setSeriesId(content);
                break;
            case THUMB_ADDED:
                tvdbEpisode.setThumbAdded(content);
                break;
            case THUMB_WIDTH:
                tvdbEpisode.setThumbWidth(content);
                break;
            case THUMB_HEIGHT:
                tvdbEpisode.setThumbHeight(content);
                break;
            case TMS_EXPORT:
                tvdbEpisode.setTmsExport(content);
                break;
            case MIRROR_UPDATE:
                tvdbEpisode.setMirrorUpdate(content);
                break;
            case IMDB_ID:
                tvdbEpisode.setImdbId(content);
                break;
            case EPIMGFLAG:
                tvdbEpisode.setEpImgFlag(content);
                break;
            case RATING:
                tvdbEpisode.setRating(content);
                break;
            case SEASON_NUMBER:
                tvdbEpisode.setSeasonNumber(content);
                break;
            case LANGUAGE:
                tvdbEpisode.setLanguage(content);
                break;
        }
    }
    public void characters(char[] ch, int start, int length) throws SAXException {
        content = String.copyValueOf(ch, start, length).trim();
    }

    public TVDBEpisode getTVDBEpisode(){
        return tvdbEpisode;
    }
}
