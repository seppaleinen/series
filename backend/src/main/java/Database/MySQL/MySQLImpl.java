package Database.MySQL;

import Database.DBInterface;
import Database.MySQL.Entities.MySQLOMDB;
import Database.MySQL.Entities.MySQLTVDBIMDB;
import Database.MySQL.HibernateManager.MySQLOMDBService;
import Database.MySQL.HibernateManager.MySQLTVDBIMDBService;
import Database.MySQL.Utils.JPAToObject;
import Database.MySQL.Utils.ObjectToJPA;
import Objects.*;

public class MySQLImpl implements DBInterface {
    private String persistence = "default";
    private MySQLTVDBIMDBService mySQLTVDBIMDBService;
    private MySQLOMDBService mySQLOMDBService;

    @Override
    public TVDBIMDB getTVDBIMDB(String imdbId) {
        mySQLTVDBIMDBService = new MySQLTVDBIMDBService(persistence);

        MySQLTVDBIMDB mySQLTVDBIMDB = mySQLTVDBIMDBService.getMySQLTVDBIMDB(imdbId);

        return JPAToObject.convertMySQLTVDBIMDB_To_TVDBIMDB(mySQLTVDBIMDB);
    }

    @Override
    public TVDBEpisode getTVDBEpisode(String episodeId) {
        return null;
    }

    @Override
    public TVDBSeries getTVDBSeries(String seriesId) {
        return null;
    }

    @Override
    public TVDBUpdate getTVDBUpdate() {
        return null;
    }

    @Override
    public OMDB getOMDB(String IMDBId) {
        mySQLOMDBService = new MySQLOMDBService(persistence);

        MySQLOMDB mySQLOMDB = mySQLOMDBService.getMySQLOMDB(IMDBId);

        return JPAToObject.convertMySQLOMDB_To_OMDB(mySQLOMDB);
    }

    @Override
    public void saveTVDBIMDB(TVDBIMDB tvdbimdb) {
        mySQLTVDBIMDBService = new MySQLTVDBIMDBService(persistence);

        MySQLTVDBIMDB mySQLTVDBIMDB = ObjectToJPA.convertTVDBIMDB_To_MySQLTVDBIMDB(tvdbimdb);

        mySQLTVDBIMDBService.saveMySQLTVDBIMDB(mySQLTVDBIMDB);
    }

    @Override
    public void saveTVDBEpisode(TVDBEpisode tvdbEpisode) {

    }

    @Override
    public void saveTVDBSeries(TVDBSeries tvdbSeries) {

    }

    @Override
    public void saveTVDBUpdate(TVDBUpdate tvdbUpdate) {

    }

    @Override
    public void saveOMDB(OMDB omdb) {
        mySQLOMDBService = new MySQLOMDBService(persistence);

        MySQLOMDB mySQLOMDB = ObjectToJPA.convertOMDB_To_MySQLOMDB(omdb);

        mySQLOMDBService.saveMySQLTVDBOMDB(mySQLOMDB);

    }

    protected void setPersistence(String persistence) {
        this.persistence = persistence;
    }
}
