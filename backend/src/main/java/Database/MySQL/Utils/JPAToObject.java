package Database.MySQL.Utils;

import Database.MySQL.Entities.MySQLOMDB;
import Database.MySQL.Entities.MySQLTVDBIMDB;
import Objects.OMDB;
import Objects.TVDBIMDB;

public class JPAToObject {
    public static TVDBIMDB convertMySQLTVDBIMDB_To_TVDBIMDB(MySQLTVDBIMDB mySQLTVDBIMDB){
        TVDBIMDB tvdbimdb = null;

        if(mySQLTVDBIMDB != null) {
            tvdbimdb = new TVDBIMDB();

            tvdbimdb.setSeriesId(mySQLTVDBIMDB.getSeriesId());
            tvdbimdb.setLanguage(mySQLTVDBIMDB.getLanguage());
            tvdbimdb.setSeriesName(mySQLTVDBIMDB.getSeriesName());
            tvdbimdb.setBanner(mySQLTVDBIMDB.getBanner());
            tvdbimdb.setOverview(mySQLTVDBIMDB.getOverview());
            tvdbimdb.setFirstAired(mySQLTVDBIMDB.getFirstAired());
            tvdbimdb.setImdbId(mySQLTVDBIMDB.getImdbId());
            tvdbimdb.setId(mySQLTVDBIMDB.getId());
        }

        return tvdbimdb;
    }

    public static OMDB convertMySQLOMDB_To_OMDB(MySQLOMDB mySQLOMDB) {
        OMDB omdb = null;

        if(mySQLOMDB != null) {
            omdb = new OMDB();
        }

        return omdb;
    }
}