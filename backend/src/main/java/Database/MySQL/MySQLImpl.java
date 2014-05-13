package Database.MySQL;

import Database.DBInterface;
import Database.MySQL.Entities.MySQLOMDB;
import Database.MySQL.Entities.MySQLTVDBIMDB;
import Database.MySQL.Entities.MySQLTVDBSeries;
import Database.MySQL.HibernateManager.HibernateManager;
import Database.MySQL.Utils.JPAToObject;
import Database.MySQL.Utils.ObjectToJPA;
import Objects.*;

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
        return null;
    }

    @Override
    public TVDBSeries getTVDBSeries(String seriesId) {
        hibernateManager = new HibernateManager(persistence);

        MySQLTVDBSeries mySQLTVDBSeries = hibernateManager.getEntity(MySQLTVDBSeries.class, MySQLTVDBSeries.FIND_BY_SERIESID, "id", seriesId);

        return JPAToObject.convertMySQLTVDBSeries_To_TVDBSeries(mySQLTVDBSeries);
    }

    @Override
    public TVDBUpdate getTVDBUpdate() {
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

    }

    @Override
    public void saveTVDBSeries(TVDBSeries tvdbSeries) {
        hibernateManager = new HibernateManager(persistence);

        MySQLTVDBSeries mySQLTVDBSeries = ObjectToJPA.convertTVDBSeries_To_MySQLTVDBSeries(tvdbSeries);

        hibernateManager.saveEntity(mySQLTVDBSeries);
    }

    @Override
    public void saveTVDBUpdate(TVDBUpdate tvdbUpdate) {

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
