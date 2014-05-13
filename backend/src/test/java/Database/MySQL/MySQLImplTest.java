package Database.MySQL;

import Database.MongoDB.ObjectCreater;
import Database.MySQL.Entities.MySQLTVDBIMDB;
import Database.MySQL.Utils.ObjectToJPA;
import Objects.*;
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

    @Test
    public void testSaveAndFindTVDBSeries() {
        TVDBSeries tvdbSeries = ObjectCreater.createTVDBSeries();

        dbInterface.saveTVDBSeries(tvdbSeries);

        TVDBSeries foundTVDBSeries = dbInterface.getTVDBSeries(tvdbSeries.getSeriesId());

        assertNotNull("Result should not be null", foundTVDBSeries);
        assertEquals("Objects should be equals", tvdbSeries, foundTVDBSeries);
    }

    @Test
    public void testSaveAndFindTVDBEpisode() {
        TVDBEpisode tvdbEpisode = ObjectCreater.createTVDBEpisode();

        dbInterface.saveTVDBEpisode(tvdbEpisode);

        TVDBEpisode foundTVDBEpisode = dbInterface.getTVDBEpisode(tvdbEpisode.getSeriesId());

        assertNotNull("Result should not be null", foundTVDBEpisode);
        assertEquals("Objects should be equals", tvdbEpisode, foundTVDBEpisode);
    }

    @Test
    public void testSaveAndFindTVDBUpdate() {
        TVDBUpdate tvdbUpdate = ObjectCreater.createTVDBUpdate();

        dbInterface.saveTVDBUpdate(tvdbUpdate);

        TVDBUpdate foundTVDBUpdate = dbInterface.getTVDBUpdate();

        assertNotNull("Result should not be null", foundTVDBUpdate);
        assertEquals("Objects should be equals", tvdbUpdate, foundTVDBUpdate);
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
