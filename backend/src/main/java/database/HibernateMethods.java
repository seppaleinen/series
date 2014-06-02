package database;

import database.entities.*;
import database.entities.utils.JPAToObject;
import database.entities.utils.ObjectToJPA;
import objects.*;

import java.util.List;

public class HibernateMethods implements DBInterface {
    public String persistence = "mysql";
    public HibernateManager hibernateManager;

    @Override
    public TVDBEpisode getTVDBEpisode(String episodeId) {
        hibernateManager = new HibernateManager(persistence);

        TVDBEpisodeEntity tvdbEpisodeEntity = hibernateManager.getEntity(TVDBEpisodeEntity.class, TVDBEpisodeEntity.FIND_BY_SERIESID, "id", episodeId);

        return JPAToObject.convertMySQLTVDBEpisode_To_TVDBEpisode(tvdbEpisodeEntity);
    }

    @Override
    public TVDBSeries getTVDBSeries(String seriesId) {
        hibernateManager = new HibernateManager(persistence);

        TVDBSeriesEntity tvdbSeriesEntity = hibernateManager.getEntity(TVDBSeriesEntity.class, TVDBSeriesEntity.FIND_BY_SERIESID, "id", seriesId);

        return JPAToObject.convertMySQLTVDBSeries_To_TVDBSeries(tvdbSeriesEntity);
    }

    @Override
    public TVDBUpdate getTVDBUpdate() {
        hibernateManager = new HibernateManager(persistence);

        List<TVDBUpdateEntity> tvdbUpdateEntityList = hibernateManager.getEntities(TVDBUpdateEntity.class, TVDBUpdateEntity.FIND_BY_SERIESID);

        if(tvdbUpdateEntityList !=null && !tvdbUpdateEntityList.isEmpty()){
            return JPAToObject.convertMySQLTVDBUpdate_To_TVDBUpdate(tvdbUpdateEntityList.get(0));
        }
        return null;
    }

    @Override
    public void saveTVDBEpisode(TVDBEpisode tvdbEpisode) {
        hibernateManager = new HibernateManager(persistence);

        TVDBEpisodeEntity tvdbEpisodeEntity = ObjectToJPA.convertTVDBEpisode_To_MySQLTVDBEpisode(tvdbEpisode);

        hibernateManager.saveEntity(tvdbEpisodeEntity);
    }

    @Override
    public void saveTVDBSeries(TVDBSeries tvdbSeries) {
        hibernateManager = new HibernateManager(persistence);

        TVDBSeriesEntity tvdbSeriesEntity = ObjectToJPA.convertTVDBSeries_To_MySQLTVDBSeries(tvdbSeries);

        hibernateManager.saveEntity(tvdbSeriesEntity);
    }

    @Override
    public void saveTVDBUpdate(TVDBUpdate tvdbUpdate) {
        hibernateManager = new HibernateManager(persistence);

        TVDBUpdateEntity tvdbUpdateEntity = ObjectToJPA.convertTVDBUpdate_To_MySQLTVDBUpdate(tvdbUpdate);

        hibernateManager.saveEntity(tvdbUpdateEntity);
    }
}
