package database.mongodb.utils;

import database.mongodb.entities.*;
import objects.*;

public class ObjectToMongo {
    private ObjectToMongo(){}

    public static MongoTVDBEpisode convertTVDBEpisode_To_MongoTVDBEpisode(TVDBEpisode tvdbEpisode) {
        MongoTVDBEpisode mongoTVDBEpisode = new MongoTVDBEpisode();

        mongoTVDBEpisode.setId(tvdbEpisode.getId());
        mongoTVDBEpisode.setSeasonid(tvdbEpisode.getSeasonid());
        mongoTVDBEpisode.setEpisodeNumber(tvdbEpisode.getEpisodeNumber());
        mongoTVDBEpisode.setEpisodeName(tvdbEpisode.getEpisodeName());
        mongoTVDBEpisode.setFirstAired(tvdbEpisode.getFirstAired());
        mongoTVDBEpisode.setGuestStars(tvdbEpisode.getGuestStars());
        mongoTVDBEpisode.setDirector(tvdbEpisode.getDirector());
        mongoTVDBEpisode.setWriter(tvdbEpisode.getWriter());
        mongoTVDBEpisode.setOverview(tvdbEpisode.getOverview());
        mongoTVDBEpisode.setProductionCode(tvdbEpisode.getProductionCode());
        mongoTVDBEpisode.setLastUpdated(tvdbEpisode.getLastUpdated());
        mongoTVDBEpisode.setFlagged(tvdbEpisode.getFlagged());
        mongoTVDBEpisode.setDvdDiscId(tvdbEpisode.getDvdDiscId());
        mongoTVDBEpisode.setDvdSeason(tvdbEpisode.getDvdSeason());
        mongoTVDBEpisode.setDvdEpisodeNumber(tvdbEpisode.getDvdEpisodeNumber());
        mongoTVDBEpisode.setDvdChapter(tvdbEpisode.getDvdChapter());
        mongoTVDBEpisode.setAbsoluteNumber(tvdbEpisode.getAbsoluteNumber());
        mongoTVDBEpisode.setFilename(tvdbEpisode.getFilename());
        mongoTVDBEpisode.setSeriesId(tvdbEpisode.getSeriesId());
        mongoTVDBEpisode.setThumbAdded(tvdbEpisode.getThumbAdded());
        mongoTVDBEpisode.setThumbWidth(tvdbEpisode.getThumbWidth());
        mongoTVDBEpisode.setThumbHeight(tvdbEpisode.getThumbHeight());
        mongoTVDBEpisode.setTmsExport(tvdbEpisode.getTmsExport());
        mongoTVDBEpisode.setMirrorUpdate(tvdbEpisode.getMirrorUpdate());
        mongoTVDBEpisode.setImdbId(tvdbEpisode.getImdbId());
        mongoTVDBEpisode.setEpImgFlag(tvdbEpisode.getEpImgFlag());
        mongoTVDBEpisode.setRating(tvdbEpisode.getRating());
        mongoTVDBEpisode.setSeasonNumber(tvdbEpisode.getSeasonNumber());
        mongoTVDBEpisode.setLanguage(tvdbEpisode.getLanguage());

        return mongoTVDBEpisode;
    }

    public static MongoTVDBSeries convertTVDBSeries_To_MongoTVDBSeries(TVDBSeries tvdbSeries){
        MongoTVDBSeries mongoTVDBSeries = new MongoTVDBSeries();

        mongoTVDBSeries.setActors(tvdbSeries.getActors());
        mongoTVDBSeries.setAirsDayOfWeek(tvdbSeries.getAirsDayOfWeek());
        mongoTVDBSeries.setAirsTime(tvdbSeries.getAirsTime());
        mongoTVDBSeries.setContentRating(tvdbSeries.getContentRating());
        mongoTVDBSeries.setFirstAired(tvdbSeries.getFirstAired());
        mongoTVDBSeries.setGenre(tvdbSeries.getGenre());
        mongoTVDBSeries.setImdbId(tvdbSeries.getImdbId());
        mongoTVDBSeries.setLanguage(tvdbSeries.getLanguage());
        mongoTVDBSeries.setNetwork(tvdbSeries.getNetwork());
        mongoTVDBSeries.setNetworkId(tvdbSeries.getNetworkId());
        mongoTVDBSeries.setOverview(tvdbSeries.getOverview());
        mongoTVDBSeries.setRating(tvdbSeries.getRating());
        mongoTVDBSeries.setRatingCount(tvdbSeries.getRatingCount());
        mongoTVDBSeries.setRuntime(tvdbSeries.getRuntime());
        mongoTVDBSeries.setSeriesId(tvdbSeries.getSeriesId());
        mongoTVDBSeries.setSeriesName(tvdbSeries.getSeriesName());
        mongoTVDBSeries.setStatus(tvdbSeries.getStatus());
        mongoTVDBSeries.setAdded(tvdbSeries.getAdded());
        mongoTVDBSeries.setAddedBy(tvdbSeries.getAddedBy());
        mongoTVDBSeries.setBanner(tvdbSeries.getBanner());
        mongoTVDBSeries.setFanart(tvdbSeries.getFanart());
        mongoTVDBSeries.setLastUpdated(tvdbSeries.getLastUpdated());
        mongoTVDBSeries.setPoster(tvdbSeries.getPoster());
        mongoTVDBSeries.setZap2itId(tvdbSeries.getZap2itId());

        return mongoTVDBSeries;
    }

    public static MongoTVDBUpdate convertTVDBUpdate_To_MongoTVDBUpdate(TVDBUpdate tvdbUpdate){
        MongoTVDBUpdate mongoTVDBUpdate = new MongoTVDBUpdate();

        mongoTVDBUpdate.setTime(tvdbUpdate.getTime());
        mongoTVDBUpdate.setEpisodeList(tvdbUpdate.getEpisodeList());
        mongoTVDBUpdate.setSeriesList(tvdbUpdate.getSeriesList());

        return mongoTVDBUpdate;
    }
}