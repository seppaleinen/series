package Database.MySQL.HibernateManager;

import Database.MySQL.Entities.MySQLOMDB;
import Database.MySQL.Entities.MySQLTVDBIMDB;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

public class MySQLOMDBService extends HibernateManager {
    public MySQLOMDBService(String persistenceName) {
        super(persistenceName);
    }

    public MySQLOMDB getMySQLOMDB(String imdbId) {
        return getEntity(MySQLOMDB.class, MySQLOMDB.FIND_BY_IMDBID, "imdbId", imdbId);
    }

    public void saveMySQLTVDBOMDB(MySQLOMDB mySQLOMDB) {
        saveEntity(mySQLOMDB);
    }
}
