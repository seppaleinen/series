package database.entities.utils;

import database.entities.*;
import objects.*;

import java.util.ArrayList;
import java.util.List;

public class ObjectToJPA {
    private ObjectToJPA(){}

    public static TVDBEpisodeEntity convertTVDBEpisode_To_MySQLTVDBEpisode(TVDBEpisode tvdbEpisode){
        TVDBEpisodeEntity TVDBEpisodeEntity = new TVDBEpisodeEntity();

        TVDBEpisodeEntity.setId(tvdbEpisode.getId());
        TVDBEpisodeEntity.setSeasonid(tvdbEpisode.getSeasonid());
        TVDBEpisodeEntity.setEpisodeNumber(tvdbEpisode.getEpisodeNumber());
        TVDBEpisodeEntity.setEpisodeName(tvdbEpisode.getEpisodeName());
        TVDBEpisodeEntity.setFirstAired(tvdbEpisode.getFirstAired());
        TVDBEpisodeEntity.setGuestStars(tvdbEpisode.getGuestStars());
        TVDBEpisodeEntity.setDirector(tvdbEpisode.getDirector());
        TVDBEpisodeEntity.setWriter(tvdbEpisode.getWriter());
        TVDBEpisodeEntity.setOverview(tvdbEpisode.getOverview());
        TVDBEpisodeEntity.setProductionCode(tvdbEpisode.getProductionCode());
        TVDBEpisodeEntity.setLastUpdated(tvdbEpisode.getLastUpdated());
        TVDBEpisodeEntity.setFlagged(tvdbEpisode.getFlagged());
        TVDBEpisodeEntity.setDvdDiscId(tvdbEpisode.getDvdDiscId());
        TVDBEpisodeEntity.setDvdSeason(tvdbEpisode.getDvdSeason());
        TVDBEpisodeEntity.setDvdEpisodeNumber(tvdbEpisode.getDvdEpisodeNumber());
        TVDBEpisodeEntity.setDvdChapter(tvdbEpisode.getDvdChapter());
        TVDBEpisodeEntity.setAbsoluteNumber(tvdbEpisode.getAbsoluteNumber());
        TVDBEpisodeEntity.setFilename(tvdbEpisode.getFilename());
        TVDBEpisodeEntity.setSeriesId(tvdbEpisode.getSeriesId());
        TVDBEpisodeEntity.setThumbAdded(tvdbEpisode.getThumbAdded());
        TVDBEpisodeEntity.setThumbWidth(tvdbEpisode.getThumbWidth());
        TVDBEpisodeEntity.setThumbHeight(tvdbEpisode.getThumbHeight());
        TVDBEpisodeEntity.setTmsExport(tvdbEpisode.getTmsExport());
        TVDBEpisodeEntity.setMirrorUpdate(tvdbEpisode.getMirrorUpdate());
        TVDBEpisodeEntity.setImdbId(tvdbEpisode.getImdbId());
        TVDBEpisodeEntity.setEpImgFlag(tvdbEpisode.getEpImgFlag());
        TVDBEpisodeEntity.setRating(tvdbEpisode.getRating());
        TVDBEpisodeEntity.setSeasonNumber(tvdbEpisode.getSeasonNumber());
        TVDBEpisodeEntity.setLanguage(tvdbEpisode.getLanguage());
        
        return TVDBEpisodeEntity;
    }

    public static TVDBUpdateEntity convertTVDBUpdate_To_MySQLTVDBUpdate(TVDBUpdate tvdbUpdate){
        TVDBUpdateEntity TVDBUpdateEntity = new TVDBUpdateEntity();

        TVDBUpdateEntity.setTime(tvdbUpdate.getTime());
        List<UpdateEpisodeEntity> updateEpisodeEntityList = convertStringList_To_MySQLUpdateEpisode(TVDBUpdateEntity, tvdbUpdate.getEpisodeList());
        TVDBUpdateEntity.setEpisodeList(updateEpisodeEntityList);
        List<UpdateSeriesEntity> updateSeriesEntityList = convertStringList_To_MySQLUpdateSeries(TVDBUpdateEntity, tvdbUpdate.getSeriesList());
        TVDBUpdateEntity.setSeriesList(updateSeriesEntityList);

        return TVDBUpdateEntity;
    }

    private static List<UpdateEpisodeEntity> convertStringList_To_MySQLUpdateEpisode(TVDBUpdateEntity TVDBUpdateEntity, List<String> episodeList) {
        List<UpdateEpisodeEntity> updateEpisodeEntityList = new ArrayList<>();
        UpdateEpisodeEntity updateEpisodeEntity = null;

        for(String episodeId : episodeList) {
            updateEpisodeEntity = new UpdateEpisodeEntity();

            updateEpisodeEntity.setEpisodeId(episodeId);
            updateEpisodeEntity.setTVDBUpdateEntity(TVDBUpdateEntity);

            updateEpisodeEntityList.add(updateEpisodeEntity);
        }

        return updateEpisodeEntityList;
    }

    private static List<UpdateSeriesEntity> convertStringList_To_MySQLUpdateSeries(TVDBUpdateEntity TVDBUpdateEntity, List<String> seriesList) {
        List<UpdateSeriesEntity> updateSeriesEntityList = new ArrayList<>();
        UpdateSeriesEntity updateSeriesEntity = null;

        for(String episodeId : seriesList) {
            updateSeriesEntity = new UpdateSeriesEntity();

            updateSeriesEntity.setSeriesId(episodeId);
            updateSeriesEntity.setTVDBUpdateEntity(TVDBUpdateEntity);

            updateSeriesEntityList.add(updateSeriesEntity);
        }

        return updateSeriesEntityList;
    }

    public static TVDBSeriesEntity convertTVDBSeries_To_MySQLTVDBSeries(TVDBSeries tvdbSeries){
        TVDBSeriesEntity TVDBSeriesEntity = new TVDBSeriesEntity();

        TVDBSeriesEntity.setActors(tvdbSeries.getActors());
        TVDBSeriesEntity.setAirsDayOfWeek(tvdbSeries.getAirsDayOfWeek());
        TVDBSeriesEntity.setAirsTime(tvdbSeries.getAirsTime());
        TVDBSeriesEntity.setContentRating(tvdbSeries.getContentRating());
        TVDBSeriesEntity.setFirstAired(tvdbSeries.getFirstAired());
        TVDBSeriesEntity.setGenre(tvdbSeries.getGenre());
        TVDBSeriesEntity.setImdbId(tvdbSeries.getImdbId());
        TVDBSeriesEntity.setLanguage(tvdbSeries.getLanguage());
        TVDBSeriesEntity.setNetwork(tvdbSeries.getNetwork());
        TVDBSeriesEntity.setNetworkId(tvdbSeries.getNetworkId());
        TVDBSeriesEntity.setOverview(tvdbSeries.getOverview());
        TVDBSeriesEntity.setRating(tvdbSeries.getRating());
        TVDBSeriesEntity.setRatingCount(tvdbSeries.getRatingCount());
        TVDBSeriesEntity.setRuntime(tvdbSeries.getRuntime());
        TVDBSeriesEntity.setSeriesId(tvdbSeries.getSeriesId());
        TVDBSeriesEntity.setSeriesName(tvdbSeries.getSeriesName());
        TVDBSeriesEntity.setStatus(tvdbSeries.getStatus());
        TVDBSeriesEntity.setAdded(tvdbSeries.getAdded());
        TVDBSeriesEntity.setAddedBy(tvdbSeries.getAddedBy());
        TVDBSeriesEntity.setBanner(tvdbSeries.getBanner());
        TVDBSeriesEntity.setFanart(tvdbSeries.getFanart());
        TVDBSeriesEntity.setLastUpdated(tvdbSeries.getLastUpdated());
        TVDBSeriesEntity.setPoster(tvdbSeries.getPoster());
        TVDBSeriesEntity.setZap2itId(tvdbSeries.getZap2itId());

        return TVDBSeriesEntity;
    }
}
