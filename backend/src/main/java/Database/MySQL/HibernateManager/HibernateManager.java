package Database.MySQL.HibernateManager;


import javax.persistence.*;

public class HibernateManager {
    public EntityManager entityManager;

    public HibernateManager(String persistenceName) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(persistenceName);
        entityManager = entityManagerFactory.createEntityManager();
    }

    public <T> T getQuerySingleResult(TypedQuery<T> query) {
        T result;
        try {
            result = query.getSingleResult();
        } catch (NoResultException e) {
            result = null;
        }
        return result;
    }
}
