package Database.MySQL.HibernateManager;


import Database.MySQL.Entities.MySQLOMDB;

import javax.persistence.*;
import java.io.Serializable;

public class HibernateManager {
    public EntityManager entityManager;

    public HibernateManager(String persistenceName) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(persistenceName);
        entityManager = entityManagerFactory.createEntityManager();
    }

    public <T> T getEntity(Class<T> clazz, String namedQueryString, String parameter, String parameterValue){
        entityManager.getTransaction().begin();

        TypedQuery<T> query = entityManager.createNamedQuery(namedQueryString, clazz).setParameter(parameter, parameterValue);

        T result = getQuerySingleResult(query);

        entityManager.close();

        return result;
    }

    public <T> void saveEntity(T t){
        entityManager.getTransaction().begin();

        entityManager.persist(t);

        entityManager.flush();

        entityManager.getTransaction().commit();

        entityManager.close();
    }

    private <T> T getQuerySingleResult(TypedQuery<T> query) {
        T result;
        try {
            result = query.getSingleResult();
        } catch (NoResultException e) {
            result = null;
        }
        return result;
    }
}
