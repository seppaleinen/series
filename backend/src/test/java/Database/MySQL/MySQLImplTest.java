package Database.MySQL;

import Database.DBInterface;
import Database.MongoDB.ObjectCreater;
import Database.MySQL.Entities.MySQLTVDBIMDB;
import Database.MySQL.Utils.ObjectToJPA;
import Objects.OMDB;
import Objects.TVDBIMDB;
import org.junit.*;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.sql.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class MySQLImplTest {
    private MySQLImpl dbInterface;
    private static EntityManager entityManager;
    private static String persistenceName;

    @BeforeClass
    public static void setupClass(){
        persistenceName = databaseExists() ? "default" : "test";
        System.out.println("Running on " + persistenceName + " persistence");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(persistenceName);
        entityManager = entityManagerFactory.createEntityManager();
    }

    @Before
    public void setup() {
        dbInterface = new MySQLImpl();
        dbInterface.setPersistence(persistenceName);
    }

    @Test
    public void testHibernateTVDBIMDB(){
        entityManager.getTransaction().begin();
        TVDBIMDB tvdbimdb = ObjectCreater.createTVDBIMDB();
        MySQLTVDBIMDB mySQLTVDBIMDB = ObjectToJPA.convertTVDBIMDB_To_MySQLTVDBIMDB(tvdbimdb);
        entityManager.persist(mySQLTVDBIMDB);
        TypedQuery<MySQLTVDBIMDB> query = entityManager.createNamedQuery(MySQLTVDBIMDB.FIND_BY_IMDBID, MySQLTVDBIMDB.class).setParameter("imdbId", mySQLTVDBIMDB.getImdbId());
        MySQLTVDBIMDB foundMySQLTVDBIMDB = query.getSingleResult();
        assertNotNull("Result should not be null", foundMySQLTVDBIMDB);
        assertEquals("Objects should be equals", mySQLTVDBIMDB, foundMySQLTVDBIMDB);
        entityManager.close();
    }

    @Test
    public void testSaveAndFindTVDBIMDB() {
        TVDBIMDB tvdbimdb = ObjectCreater.createTVDBIMDB();

        dbInterface.saveTVDBIMDB(tvdbimdb);

        TVDBIMDB foundTVDBIMDB = dbInterface.getTVDBIMDB(tvdbimdb.getImdbId());

        assertNotNull("Result should not be null", foundTVDBIMDB);
        assertEquals("Objects should be equals", tvdbimdb, foundTVDBIMDB);
    }

    @Test
    public void testSaveAndFindOMDB() {
        OMDB omdb = ObjectCreater.createOMDB();

        dbInterface.saveOMDB(omdb);

        OMDB foundOMDB = dbInterface.getOMDB(omdb.getImdbID());

        assertNotNull("Result should not be null", foundOMDB);
        assertEquals("Objects should be equals", omdb, foundOMDB);
    }


    private static boolean databaseExists() {
        String dbUrl = "jdbc:mysql://localhost:3306/MYDB";
        String username = "root";
        String password = "minstlol";

        String dbClass = "com.mysql.jdbc.Driver";
        try {
            Class.forName(dbClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            DriverManager.getConnection(dbUrl, username, password);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
}
