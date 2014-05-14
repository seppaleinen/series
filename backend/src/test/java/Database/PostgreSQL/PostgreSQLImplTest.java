package Database.PostgreSQL;

import Database.DBInterface;
import Database.MongoDB.ObjectCreater;
import Objects.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PostgreSQLImplTest {
    private PostgreSQLImpl dbInterface;
    private static final String JDBC_CONNECTION = "jdbc:postgresql://127.0.0.1:5432/MYPOSTGRES";
    private static String persistenceName;
    private static EntityManager entityManager;

    @BeforeClass
    public static void beforeClass() throws ClassNotFoundException {
        persistenceName = databaseExists() ? "postgres" : "postgrestest";
        System.out.println("Running on " + persistenceName + " persistence");
    }

    @Before
    public void setup(){
        dbInterface = new PostgreSQLImpl();
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

    private static boolean databaseExists() throws ClassNotFoundException {
        String dbUrl = "jdbc:postgresql://localhost:5432/mypostgres";
        String username = "root";
        String password = "minstlol";

        String dbClass = "org.postgresql.Driver";
        Class.forName(dbClass);

        try {
            DriverManager.getConnection(dbUrl, username, password);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
