package Database.MySQL;

import Database.DBInterface;
import Database.MongoDB.ObjectCreater;
import Database.MySQL.Entities.MySQLTVDBIMDB;
import Database.MySQL.Utils.ObjectToJPA;
import Objects.TVDBIMDB;
import org.junit.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import static org.junit.Assert.assertEquals;

public class MySQLImplTest {
    private DBInterface dbInterface;
    private static EntityManagerFactory factory;
    private static EntityManager entityManager;

    //@BeforeClass
    public static void setupClass() {
        factory = Persistence.createEntityManagerFactory("default");
        entityManager = factory.createEntityManager();
    }

    @Before
    public void setup(){
        dbInterface = new MySQLImpl();
    }

    @Ignore
    @Test
    public void testSaveAndFindTVDBIMDB(){
        TVDBIMDB tvdbimdb = ObjectCreater.createTVDBIMDB();

        dbInterface.saveTVDBIMDB(tvdbimdb);

        TVDBIMDB foundTVDBIMDB = dbInterface.getTVDBIMDB(tvdbimdb.getImdbId());
        assertEquals("Objects should be equals", tvdbimdb, foundTVDBIMDB);
    }

    @Ignore
    @Test
    public void testEntityMySQLTVDBIMDB(){
        entityManager.getTransaction().begin();

        TVDBIMDB tvdbimdb = ObjectCreater.createTVDBIMDB();
        MySQLTVDBIMDB mySQLTVDBIMDB = ObjectToJPA.convertTVDBIMDB_To_MySQLTVDBIMDB(tvdbimdb);
        entityManager.persist(mySQLTVDBIMDB);
        entityManager.flush();
    }
}
