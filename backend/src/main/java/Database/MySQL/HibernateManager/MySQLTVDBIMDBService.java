package Database.MySQL.HibernateManager;

import Database.MySQL.Entities.MySQLTVDBIMDB;

import javax.persistence.*;

public class MySQLTVDBIMDBService extends HibernateManager {
    public MySQLTVDBIMDBService(String persistence) {
        super(persistence);
    }

    public MySQLTVDBIMDB getMySQLTVDBIMDB(String id) {
        return getEntity(MySQLTVDBIMDB.class, MySQLTVDBIMDB.FIND_BY_IMDBID, "imdbId", id);
    }

    public void saveMySQLTVDBIMDB(MySQLTVDBIMDB mySQLTVDBIMDB) {
        saveEntity(mySQLTVDBIMDB);
    }
}
