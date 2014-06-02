package database.mongodb.utils;

import database.mongodb.entities.*;
import objects.*;

public class MongoToObject {
    private MongoToObject(){}

    public static TVDBEpisode convertMongoTVDBEpisode_To_TVDBEpisode(MongoTVDBEpisode mongoTVDBEpisode){
        TVDBEpisode tvdbEpisode = null;

        if(mongoTVDBEpisode != null){
            tvdbEpisode = new TVDBEpisode();

            tvdbEpisode.setId(mongoTVDBEpisode.getId());
            tvdbEpisode.setSeasonid(mongoTVDBEpisode.getSeasonid());
            tvdbEpisode.setEpisodeNumber(mongoTVDBEpisode.getEpisodeNumber());
            tvdbEpisode.setEpisodeName(mongoTVDBEpisode.getEpisodeName());
            tvdbEpisode.setFirstAired(mongoTVDBEpisode.getFirstAired());
            tvdbEpisode.setGuestStars(mongoTVDBEpisode.getGuestStars());
            tvdbEpisode.setDirector(mongoTVDBEpisode.getDirector());
            tvdbEpisode.setWriter(mongoTVDBEpisode.getWriter());
            tvdbEpisode.setOverview(mongoTVDBEpisode.getOverview());
            tvdbEpisode.setProductionCode(mongoTVDBEpisode.getProductionCode());
            tvdbEpisode.setLastUpdated(mongoTVDBEpisode.getLastUpdated());
            tvdbEpisode.setFlagged(mongoTVDBEpisode.getFlagged());
            tvdbEpisode.setDvdDiscId(mongoTVDBEpisode.getDvdDiscId());
            tvdbEpisode.setDvdSeason(mongoTVDBEpisode.getDvdSeason());
            tvdbEpisode.setDvdEpisodeNumber(mongoTVDBEpisode.getDvdEpisodeNumber());
            tvdbEpisode.setDvdChapter(mongoTVDBEpisode.getDvdChapter());
            tvdbEpisode.setAbsoluteNumber(mongoTVDBEpisode.getAbsoluteNumber());
            tvdbEpisode.setFilename(mongoTVDBEpisode.getFilename());
            tvdbEpisode.setSeriesId(mongoTVDBEpisode.getSeriesId());
            tvdbEpisode.setThumbAdded(mongoTVDBEpisode.getThumbAdded());
            tvdbEpisode.setThumbWidth(mongoTVDBEpisode.getThumbWidth());
            tvdbEpisode.setThumbHeight(mongoTVDBEpisode.getThumbHeight());
            tvdbEpisode.setTmsExport(mongoTVDBEpisode.getTmsExport());
            tvdbEpisode.setMirrorUpdate(mongoTVDBEpisode.getMirrorUpdate());
            tvdbEpisode.setImdbId(mongoTVDBEpisode.getImdbId());
            tvdbEpisode.setEpImgFlag(mongoTVDBEpisode.getEpImgFlag());
            tvdbEpisode.setRating(mongoTVDBEpisode.getRating());
            tvdbEpisode.setSeasonNumber(mongoTVDBEpisode.getSeasonNumber());
            tvdbEpisode.setLanguage(mongoTVDBEpisode.getLanguage());
        }

        return tvdbEpisode;
    }

    public static TVDBSeries convertMongoTVDBSeries_To_TVDBSeries(MongoTVDBSeries mongoTVDBSeries){
        TVDBSeries tvdbSeries = null;

        if(mongoTVDBSeries != null){
            tvdbSeries = new TVDBSeries();

            tvdbSeries.setActors(mongoTVDBSeries.getActors());
            tvdbSeries.setAirsDayOfWeek(mongoTVDBSeries.getAirsDayOfWeek());
            tvdbSeries.setAirsTime(mongoTVDBSeries.getAirsTime());
            tvdbSeries.setContentRating(mongoTVDBSeries.getContentRating());
            tvdbSeries.setFirstAired(mongoTVDBSeries.getFirstAired());
            tvdbSeries.setGenre(mongoTVDBSeries.getGenre());
            tvdbSeries.setImdbId(mongoTVDBSeries.getImdbId());
            tvdbSeries.setLanguage(mongoTVDBSeries.getLanguage());
            tvdbSeries.setNetwork(mongoTVDBSeries.getNetwork());
            tvdbSeries.setNetworkId(mongoTVDBSeries.getNetworkId());
            tvdbSeries.setOverview(mongoTVDBSeries.getOverview());
            tvdbSeries.setRating(mongoTVDBSeries.getRating());
            tvdbSeries.setRatingCount(mongoTVDBSeries.getRatingCount());
            tvdbSeries.setRuntime(mongoTVDBSeries.getRuntime());
            tvdbSeries.setSeriesId(mongoTVDBSeries.getSeriesId());
            tvdbSeries.setSeriesName(mongoTVDBSeries.getSeriesName());
            tvdbSeries.setStatus(mongoTVDBSeries.getStatus());
            tvdbSeries.setAdded(mongoTVDBSeries.getAdded());
            tvdbSeries.setAddedBy(mongoTVDBSeries.getAddedBy());
            tvdbSeries.setBanner(mongoTVDBSeries.getBanner());
            tvdbSeries.setFanart(mongoTVDBSeries.getFanart());
            tvdbSeries.setLastUpdated(mongoTVDBSeries.getLastUpdated());
            tvdbSeries.setPoster(mongoTVDBSeries.getPoster());
            tvdbSeries.setZap2itId(mongoTVDBSeries.getZap2itId());
        }

        return tvdbSeries;
    }

    public static TVDBUpdate convertMongoTVDBUpdate_To_TVDBUpdate(MongoTVDBUpdate mongoTVDBUpdate){
        TVDBUpdate tvdbUpdate = null;

        if(mongoTVDBUpdate != null){
            tvdbUpdate = new TVDBUpdate();

            tvdbUpdate.setTime(mongoTVDBUpdate.getTime());
            tvdbUpdate.setEpisodeList(mongoTVDBUpdate.getEpisodeList());
            tvdbUpdate.setSeriesList(mongoTVDBUpdate.getSeriesList());
        }

        return tvdbUpdate;
    }
}
