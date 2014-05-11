package Database.MySQL.JpaImpl;

import Database.MySQL.Entities.MySQLTVDBIMDB;
import Database.MySQL.Repository.TVDBIMDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

@Repository
@Transactional
public class TVDBIMDBServiceImpl {
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private TVDBIMDBRepository tvdbimdbRepository;

    @Transactional
    public MySQLTVDBIMDB save(MySQLTVDBIMDB mySQLTVDBIMDB){
        return tvdbimdbRepository.save(mySQLTVDBIMDB);
    }

    public MySQLTVDBIMDB findByIMDBID(String imdbId){
        Query query = entityManager.createNativeQuery(MySQLTVDBIMDB.FIND_BY_IMDBID, MySQLTVDBIMDB.class);
        query.setParameter("imdbId", imdbId);
        return null;
    }
}
