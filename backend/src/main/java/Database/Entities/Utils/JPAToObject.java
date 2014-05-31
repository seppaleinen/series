package database.entities.utils;

import database.entities.*;
import objects.*;

import java.util.ArrayList;
import java.util.List;

public class JPAToObject {
    private JPAToObject(){}

    public static TVDBEpisode convertMySQLTVDBEpisode_To_TVDBEpisode(TVDBEpisodeEntity tvdbEpisodeEntity){
        TVDBEpisode tvdbEpisode = null;
        
        if(tvdbEpisodeEntity != null){
            tvdbEpisode = new TVDBEpisode();

            tvdbEpisode.setId(tvdbEpisodeEntity.getId());
            tvdbEpisode.setSeasonid(tvdbEpisodeEntity.getSeasonid());
            tvdbEpisode.setEpisodeNumber(tvdbEpisodeEntity.getEpisodeNumber());
            tvdbEpisode.setEpisodeName(tvdbEpisodeEntity.getEpisodeName());
            tvdbEpisode.setFirstAired(tvdbEpisodeEntity.getFirstAired());
            tvdbEpisode.setGuestStars(tvdbEpisodeEntity.getGuestStars());
            tvdbEpisode.setDirector(tvdbEpisodeEntity.getDirector());
            tvdbEpisode.setWriter(tvdbEpisodeEntity.getWriter());
            tvdbEpisode.setOverview(tvdbEpisodeEntity.getOverview());
            tvdbEpisode.setProductionCode(tvdbEpisodeEntity.getProductionCode());
            tvdbEpisode.setLastUpdated(tvdbEpisodeEntity.getLastUpdated());
            tvdbEpisode.setFlagged(tvdbEpisodeEntity.getFlagged());
            tvdbEpisode.setDvdDiscId(tvdbEpisodeEntity.getDvdDiscId());
            tvdbEpisode.setDvdSeason(tvdbEpisodeEntity.getDvdSeason());
            tvdbEpisode.setDvdEpisodeNumber(tvdbEpisodeEntity.getDvdEpisodeNumber());
            tvdbEpisode.setDvdChapter(tvdbEpisodeEntity.getDvdChapter());
            tvdbEpisode.setAbsoluteNumber(tvdbEpisodeEntity.getAbsoluteNumber());
            tvdbEpisode.setFilename(tvdbEpisodeEntity.getFilename());
            tvdbEpisode.setSeriesId(tvdbEpisodeEntity.getSeriesId());
            tvdbEpisode.setThumbAdded(tvdbEpisodeEntity.getThumbAdded());
            tvdbEpisode.setThumbWidth(tvdbEpisodeEntity.getThumbWidth());
            tvdbEpisode.setThumbHeight(tvdbEpisodeEntity.getThumbHeight());
            tvdbEpisode.setTmsExport(tvdbEpisodeEntity.getTmsExport());
            tvdbEpisode.setMirrorUpdate(tvdbEpisodeEntity.getMirrorUpdate());
            tvdbEpisode.setImdbId(tvdbEpisodeEntity.getImdbId());
            tvdbEpisode.setEpImgFlag(tvdbEpisodeEntity.getEpImgFlag());
            tvdbEpisode.setRating(tvdbEpisodeEntity.getRating());
            tvdbEpisode.setSeasonNumber(tvdbEpisodeEntity.getSeasonNumber());
            tvdbEpisode.setLanguage(tvdbEpisodeEntity.getLanguage());
        }
        
        return tvdbEpisode;
    }

    public static TVDBUpdate convertMySQLTVDBUpdate_To_TVDBUpdate(TVDBUpdateEntity tvdbUpdateEntity){
        TVDBUpdate tvdbUpdate = null;

        if(tvdbUpdateEntity != null){
            tvdbUpdate = new TVDBUpdate();

            tvdbUpdate.setTime(tvdbUpdateEntity.getTime());
            List<String> episodeList = convertMySQLUpdateEpisode_To_StringList(tvdbUpdateEntity.getEpisodeList());
            tvdbUpdate.setEpisodeList(episodeList);
            List<String> seriesList = convertMySQLUpdateSeries_To_StringList(tvdbUpdateEntity.getSeriesList());
            tvdbUpdate.setSeriesList(seriesList);
        }

        return tvdbUpdate;
    }

    private static List<String> convertMySQLUpdateEpisode_To_StringList(List<UpdateEpisodeEntity> updateEpisodeEntityList) {
        List<String> episodeList = new ArrayList<>();

        for(UpdateEpisodeEntity updateEpisodeEntity : updateEpisodeEntityList) {
            episodeList.add(updateEpisodeEntity.getEpisodeId());
        }

        return episodeList;
    }

    private static List<String> convertMySQLUpdateSeries_To_StringList(List<UpdateSeriesEntity> updateSeriesEntityList) {
        List<String> seriesList = new ArrayList<>();

        for(UpdateSeriesEntity updateSeriesEntity : updateSeriesEntityList) {
            seriesList.add(updateSeriesEntity.getSeriesId());
        }

        return seriesList;
    }

    public static TVDBSeries convertMySQLTVDBSeries_To_TVDBSeries(TVDBSeriesEntity tvdbSeriesEntity){
        TVDBSeries tvdbSeries = null;
        
        if(tvdbSeriesEntity != null){
            tvdbSeries = new TVDBSeries();

            tvdbSeries.setActors(tvdbSeriesEntity.getActors());
            tvdbSeries.setAirsDayOfWeek(tvdbSeriesEntity.getAirsDayOfWeek());
            tvdbSeries.setAirsTime(tvdbSeriesEntity.getAirsTime());
            tvdbSeries.setContentRating(tvdbSeriesEntity.getContentRating());
            tvdbSeries.setFirstAired(tvdbSeriesEntity.getFirstAired());
            tvdbSeries.setGenre(tvdbSeriesEntity.getGenre());
            tvdbSeries.setImdbId(tvdbSeriesEntity.getImdbId());
            tvdbSeries.setLanguage(tvdbSeriesEntity.getLanguage());
            tvdbSeries.setNetwork(tvdbSeriesEntity.getNetwork());
            tvdbSeries.setNetworkId(tvdbSeriesEntity.getNetworkId());
            tvdbSeries.setOverview(tvdbSeriesEntity.getOverview());
            tvdbSeries.setRating(tvdbSeriesEntity.getRating());
            tvdbSeries.setRatingCount(tvdbSeriesEntity.getRatingCount());
            tvdbSeries.setRuntime(tvdbSeriesEntity.getRuntime());
            tvdbSeries.setSeriesId(tvdbSeriesEntity.getSeriesId());
            tvdbSeries.setSeriesName(tvdbSeriesEntity.getSeriesName());
            tvdbSeries.setStatus(tvdbSeriesEntity.getStatus());
            tvdbSeries.setAdded(tvdbSeriesEntity.getAdded());
            tvdbSeries.setAddedBy(tvdbSeriesEntity.getAddedBy());
            tvdbSeries.setBanner(tvdbSeriesEntity.getBanner());
            tvdbSeries.setFanart(tvdbSeriesEntity.getFanart());
            tvdbSeries.setLastUpdated(tvdbSeriesEntity.getLastUpdated());
            tvdbSeries.setPoster(tvdbSeriesEntity.getPoster());
            tvdbSeries.setZap2itId(tvdbSeriesEntity.getZap2itId());
        }

        return tvdbSeries;
    }
}