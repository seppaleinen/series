package Database.MySQL.Utils;

import Database.MySQL.Entities.MySQLTVDBIMDB;
import Objects.TVDBIMDB;

public class ObjectToJPA {
    public static MySQLTVDBIMDB convertTVDBIMDB_To_MySQLTVDBIMDB(TVDBIMDB tvdbimdb){
        MySQLTVDBIMDB mySQLTVDBIMDB = new MySQLTVDBIMDB();

        mySQLTVDBIMDB.setSeriesId(tvdbimdb.getSeriesId());
        mySQLTVDBIMDB.setLanguage(tvdbimdb.getLanguage());
        mySQLTVDBIMDB.setSeriesName(tvdbimdb.getSeriesName());
        mySQLTVDBIMDB.setBanner(tvdbimdb.getBanner());
        mySQLTVDBIMDB.setOverview(tvdbimdb.getOverview());
        mySQLTVDBIMDB.setFirstAired(tvdbimdb.getFirstAired());
        mySQLTVDBIMDB.setImdbId(tvdbimdb.getImdbId());
        mySQLTVDBIMDB.setId(tvdbimdb.getId());

        return mySQLTVDBIMDB;
    }
}
