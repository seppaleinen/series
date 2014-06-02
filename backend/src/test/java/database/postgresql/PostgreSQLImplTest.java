package database.postgresql;

import database.mongodb.ObjectCreater;
import objects.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PostgreSQLImplTest {
    private PostgreSQLImpl dbInterface;
    private static String persistenceName;

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

    @Ignore
    @Test
    public void testSaveAndFindTVDBSeries() {
        TVDBSeries tvdbSeries = ObjectCreater.createTVDBSeries();

        dbInterface.saveTVDBSeries(tvdbSeries);

        TVDBSeries foundTVDBSeries = dbInterface.getTVDBSeries(tvdbSeries.getSeriesId());

        assertNotNull("Result should not be null", foundTVDBSeries);
        assertEquals("objects should be equals", tvdbSeries, foundTVDBSeries);
    }

    @Ignore
    @Test
    public void testSaveAndFindTVDBEpisode() {
        TVDBEpisode tvdbEpisode = ObjectCreater.createTVDBEpisode();

        dbInterface.saveTVDBEpisode(tvdbEpisode);

        TVDBEpisode foundTVDBEpisode = dbInterface.getTVDBEpisode(tvdbEpisode.getSeriesId());

        assertNotNull("Result should not be null", foundTVDBEpisode);
        assertEquals("objects should be equals", tvdbEpisode, foundTVDBEpisode);
    }

    @Ignore
    @Test
    public void testSaveAndFindTVDBUpdate() {
        TVDBUpdate tvdbUpdate = ObjectCreater.createTVDBUpdate();

        dbInterface.saveTVDBUpdate(tvdbUpdate);

        TVDBUpdate foundTVDBUpdate = dbInterface.getTVDBUpdate();

        assertNotNull("Result should not be null", foundTVDBUpdate);
        assertEquals("objects should be equals", tvdbUpdate, foundTVDBUpdate);
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
            return false;
        }
    }
}
