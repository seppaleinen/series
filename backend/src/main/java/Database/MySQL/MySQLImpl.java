package Database.MySQL;

import Database.DBInterface;
import Database.MySQL.Entities.*;
import Database.MySQL.HibernateManager.HibernateManager;
import Database.MySQL.Utils.JPAToObject;
import Database.MySQL.Utils.ObjectToJPA;
import Objects.*;

import java.util.List;

public class MySQLImpl implements DBInterface {
    private String persistence = "default";
    private HibernateManager hibernateManager;

    @Override
    public TVDBIMDB getTVDBIMDB(String imdbId) {
        hibernateManager = new HibernateManager(persistence);

        MySQLTVDBIMDB mySQLTVDBIMDB = hibernateManager.getEntity(MySQLTVDBIMDB.class, MySQLTVDBIMDB.FIND_BY_IMDBID, "imdbId", imdbId);

        return JPAToObject.convertMySQLTVDBIMDB_To_TVDBIMDB(mySQLTVDBIMDB);
    }

    @Override
    public TVDBEpisode getTVDBEpisode(String episodeId) {
        hibernateManager = new HibernateManager(persistence);

        MySQLTVDBEpisode mySQLTVDBEpisode = hibernateManager.getEntity(MySQLTVDBEpisode.class, MySQLTVDBEpisode.FIND_BY_SERIESID, "id", episodeId);

        return JPAToObject.convertMySQLTVDBEpisode_To_TVDBEpisode(mySQLTVDBEpisode);
    }

    @Override
    public TVDBSeries getTVDBSeries(String seriesId) {
        hibernateManager = new HibernateManager(persistence);

        MySQLTVDBSeries mySQLTVDBSeries = hibernateManager.getEntity(MySQLTVDBSeries.class, MySQLTVDBSeries.FIND_BY_SERIESID, "id", seriesId);

        return JPAToObject.convertMySQLTVDBSeries_To_TVDBSeries(mySQLTVDBSeries);
    }

    @Override
    public TVDBUpdate getTVDBUpdate() {
        hibernateManager = new HibernateManager(persistence);

        List<MySQLTVDBUpdate> mySQLTVDBUpdate = hibernateManager.getEntities(MySQLTVDBUpdate.class, MySQLTVDBUpdate.FIND_BY_SERIESID);

        if(mySQLTVDBUpdate!=null){
            JPAToObject.convertMySQLTVDBUpdate_To_TVDBUpdate(mySQLTVDBUpdate.get(0));
        }
        return null;
    }

    @Override
    public OMDB getOMDB(String IMDBId) {
        hibernateManager = new HibernateManager(persistence);

        MySQLOMDB mySQLOMDB = hibernateManager.getEntity(MySQLOMDB.class, MySQLOMDB.FIND_BY_IMDBID, "imdbId", IMDBId);

        return JPAToObject.convertMySQLOMDB_To_OMDB(mySQLOMDB);
    }

    @Override
    public void saveTVDBIMDB(TVDBIMDB tvdbimdb) {
        hibernateManager = new HibernateManager(persistence);

        MySQLTVDBIMDB mySQLTVDBIMDB = ObjectToJPA.convertTVDBIMDB_To_MySQLTVDBIMDB(tvdbimdb);

        hibernateManager.saveEntity(mySQLTVDBIMDB);
    }

    @Override
    public void saveTVDBEpisode(TVDBEpisode tvdbEpisode) {
        hibernateManager = new HibernateManager(persistence);

        MySQLTVDBEpisode mySQLTVDBEpisode = ObjectToJPA.convertTVDBEpisode_To_MySQLTVDBEpisode(tvdbEpisode);

        hibernateManager.saveEntity(mySQLTVDBEpisode);
    }

    @Override
    public void saveTVDBSeries(TVDBSeries tvdbSeries) {
        hibernateManager = new HibernateManager(persistence);

        MySQLTVDBSeries mySQLTVDBSeries = ObjectToJPA.convertTVDBSeries_To_MySQLTVDBSeries(tvdbSeries);

        hibernateManager.saveEntity(mySQLTVDBSeries);
    }

    @Override
    public void saveTVDBUpdate(TVDBUpdate tvdbUpdate) {
        hibernateManager = new HibernateManager(persistence);

        MySQLTVDBUpdate mySQLTVDBUpdate = ObjectToJPA.convertTVDBUpdate_To_MySQLTVDBUpdate(tvdbUpdate);

        hibernateManager.saveEntity(mySQLTVDBUpdate);
    }

    @Override
    public void saveOMDB(OMDB omdb) {
        hibernateManager = new HibernateManager(persistence);

        MySQLOMDB mySQLOMDB = ObjectToJPA.convertOMDB_To_MySQLOMDB(omdb);

        hibernateManager.saveEntity(mySQLOMDB);
    }

    protected void setPersistence(String persistence) {
        this.persistence = persistence;
    }
}
