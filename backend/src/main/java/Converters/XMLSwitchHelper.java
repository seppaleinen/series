package converters;

import objects.*;
import objects.constants.*;

public class XMLSwitchHelper {
    private XMLSwitchHelper(){}

    public static void switchTVDBUpdate(TVDBUpdate tvdbUpdate, String switchName, String content) {
        switch (switchName) {
            case TVDBUpdateConstants.TIME:
                tvdbUpdate.setTime(content);
                break;
            case TVDBUpdateConstants.SERIES:
                tvdbUpdate.getSeriesList().add(content);
                break;
            case TVDBUpdateConstants.EPISODE:
                tvdbUpdate.getEpisodeList().add(content);
                break;
            default:
                break;
        }
    }

    public static void switchTVDBEpisode(TVDBEpisode tvdbEpisode, String switchName, String content) {
        switch (switchName){
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
            default:
                break;
        }
    }

    public static void switchTVDBSeries(TVDBSeries tvdbSeries, String switchName, String content) {
        switch (switchName){
            case TVDBSeriesConstants.SERIES_ELEMENT:
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
            case TVDBSeriesConstants.LANGUAGE_BY_NAME:
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
                tvdbSeries.setRating(content);
                break;
            case TVDBSeriesConstants.RATING_COUNT:
                tvdbSeries.setRatingCount(content);
                break;
            case TVDBSeriesConstants.RUNTIME:
                tvdbSeries.setRuntime(content);
                break;
            case TVDBSeriesConstants.SERIES_ID_BY_NAME:
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
            case TVDBSeriesConstants.ID:
                tvdbSeries.setId(content);
                break;
            default:
                break;
        }
    }
}
