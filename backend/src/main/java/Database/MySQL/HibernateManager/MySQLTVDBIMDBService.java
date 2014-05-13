package Database.MySQL.HibernateManager;

import Database.MySQL.Entities.MySQLTVDBIMDB;

import javax.persistence.TypedQuery;

public class MySQLTVDBIMDBService  extends HibernateManager {
    public MySQLTVDBIMDBService(String persistenceName) {
        super(persistenceName);
    }

    public MySQLTVDBIMDB getMySQLTVDBIMDB(String id) {
        entityManager.getTransaction().begin();

        TypedQuery<MySQLTVDBIMDB> query = entityManager.createNamedQuery(MySQLTVDBIMDB.FIND_BY_IMDBID, MySQLTVDBIMDB.class).setParameter("imdbId", id);

        MySQLTVDBIMDB result = getQuerySingleResult(query);

        entityManager.close();

        return result;
    }

    public void saveMySQLTVDBIMDB(MySQLTVDBIMDB mySQLTVDBIMDB) {
        entityManager.getTransaction().begin();

        entityManager.persist(mySQLTVDBIMDB);

        entityManager.flush();

        entityManager.close();
    }
}
