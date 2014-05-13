package Database.MySQL.HibernateManager;

import Database.MySQL.Entities.MySQLOMDB;
import Database.MySQL.Entities.MySQLTVDBIMDB;

import javax.persistence.TypedQuery;

public class MySQLOMDBService extends HibernateManager {
    public MySQLOMDBService(String persistenceName) {
        super(persistenceName);
    }

    public MySQLOMDB getMySQLOMDB(String imdbId) {
        entityManager.getTransaction().begin();

        TypedQuery<MySQLOMDB> query = entityManager.createNamedQuery(MySQLOMDB.FIND_BY_IMDBID, MySQLOMDB.class).setParameter("imdbId", imdbId);

        MySQLOMDB result = getQuerySingleResult(query);

        entityManager.close();

        return result;
    }

    public void saveMySQLTVDBOMDB(MySQLOMDB mySQLOMDB) {
        entityManager.getTransaction().begin();

        entityManager.persist(mySQLOMDB);

        entityManager.flush();

        entityManager.close();
    }

}
