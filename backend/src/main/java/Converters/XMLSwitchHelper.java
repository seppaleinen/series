package Converters;

import Objects.*;
import Objects.Constants.*;

public class XMLSwitchHelper {
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
        }
    }

    public static void switchTVDBIMDB(TVDBIMDB tvdbimdb, String switchName, String content) {
        switch (switchName){
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

    public static void switchTVDBSeries(TVDBSeries tvdbSeries, String switchName, String content) {
        switch (switchName){
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

    public static void switchOMDB(OMDB omdb, String switchName, String content) {
        switch(switchName) {
            case OMDBConstants.TITLE:
                omdb.setTitle(content);
                break;
            case OMDBConstants.YEAR:
                omdb.setYear(content);
                break;
            case OMDBConstants.RATED:
                omdb.setRated(content);
                break;
            case OMDBConstants.RELEASED:
                omdb.setReleased(content);
                break;
            case OMDBConstants.RUNTIME:
                omdb.setRuntime(content);
                break;
            case OMDBConstants.GENRE:
                omdb.setGenre(content);
                break;
            case OMDBConstants.DIRECTOR:
                omdb.setDirector(content);
                break;
            case OMDBConstants.WRITER:
                omdb.setWriter(content);
                break;
            case OMDBConstants.ACTORS:
                omdb.setActors(content);
                break;
            case OMDBConstants.PLOT:
                omdb.setPlot(content);
                break;
            case OMDBConstants.LANGUAGE:
                omdb.setLanguage(content);
                break;
            case OMDBConstants.COUNTRY:
                omdb.setCountry(content);
                break;
            case OMDBConstants.AWARDS:
                omdb.setAwards(content);
                break;
            case OMDBConstants.POSTER:
                omdb.setPoster(content);
                break;
            case OMDBConstants.METASCORE:
                omdb.setMetascore(content);
                break;
            case OMDBConstants.IMDB_RATING:
                omdb.setImdbRating(content);
                break;
            case OMDBConstants.IMDB_VOTES:
                omdb.setImdbVotes(content);
                break;
            case OMDBConstants.IMDB_ID:
                omdb.setImdbID(content);
                break;
            case OMDBConstants.TYPE:
                omdb.setType(content);
                break;
        }
    }
}
