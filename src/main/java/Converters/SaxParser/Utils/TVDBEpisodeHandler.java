package Converters.SaxParser.Utils;

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
        switch (qName){
            case TVDBEpisodeConstants.ELEMENT:
                break;
            case TVDBEpisodeConstants.ID:
                tvdbEpisode.setId(content);
                break;
            case TVDBEpisodeConstants.SEASON_ID:
                tvdbEpisode.setSeasonid(content);
                break;
            case TVDBEpisodeConstants.EPISODE_NUMBER:
                tvdbEpisode.setEpisodeNumber(content);
                break;
            case TVDBEpisodeConstants.EPISODE_NAME:
                tvdbEpisode.setEpisodeName(content);
                break;
            case TVDBEpisodeConstants.FIRST_AIRED:
                tvdbEpisode.setFirstAired(content);
                break;
            case TVDBEpisodeConstants.GUEST_STARS:
                tvdbEpisode.setGuestStars(content);
                break;
            case TVDBEpisodeConstants.DIRECTOR:
                tvdbEpisode.setDirector(content);
                break;
            case TVDBEpisodeConstants.WRITER:
                tvdbEpisode.setWriter(content);
                break;
            case TVDBEpisodeConstants.OVERVIEW:
                tvdbEpisode.setOverview(content);
                break;
            case TVDBEpisodeConstants.PRODUCTION_CODE:
                tvdbEpisode.setProductionCode(content);
                break;
            case TVDBEpisodeConstants.LAST_UPDATED:
                tvdbEpisode.setLastUpdated(content);
                break;
            case TVDBEpisodeConstants.FLAGGED:
                tvdbEpisode.setFlagged(content);
                break;
            case TVDBEpisodeConstants.DVD_DISCID:
                tvdbEpisode.setDvdDiscId(content);
                break;
            case TVDBEpisodeConstants.DVD_SEASON:
                tvdbEpisode.setDvdSeason(content);
                break;
            case TVDBEpisodeConstants.DVD_EPISODENUMBER:
                tvdbEpisode.setDvdEpisodeNumber(content);
                break;
            case TVDBEpisodeConstants.DVD_CHAPTER:
                tvdbEpisode.setDvdChapter(content);
                break;
            case TVDBEpisodeConstants.ABSOLUTE_NUMBER:
                tvdbEpisode.setAbsoluteNumber(content);
                break;
            case TVDBEpisodeConstants.FILENAME:
                tvdbEpisode.setFilename(content);
                break;
            case TVDBEpisodeConstants.SERIESID:
                tvdbEpisode.setSeriesId(content);
                break;
            case TVDBEpisodeConstants.THUMB_ADDED:
                tvdbEpisode.setThumbAdded(content);
                break;
            case TVDBEpisodeConstants.THUMB_WIDTH:
                tvdbEpisode.setThumbWidth(content);
                break;
            case TVDBEpisodeConstants.THUMB_HEIGHT:
                tvdbEpisode.setThumbHeight(content);
                break;
            case TVDBEpisodeConstants.TMS_EXPORT:
                tvdbEpisode.setTmsExport(content);
                break;
            case TVDBEpisodeConstants.MIRROR_UPDATE:
                tvdbEpisode.setMirrorUpdate(content);
                break;
            case TVDBEpisodeConstants.IMDB_ID:
                tvdbEpisode.setImdbId(content);
                break;
            case TVDBEpisodeConstants.EPIMGFLAG:
                tvdbEpisode.setEpImgFlag(content);
                break;
            case TVDBEpisodeConstants.RATING:
                tvdbEpisode.setRating(content);
                break;
            case TVDBEpisodeConstants.SEASON_NUMBER:
                tvdbEpisode.setSeasonNumber(content);
                break;
            case TVDBEpisodeConstants.LANGUAGE:
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
