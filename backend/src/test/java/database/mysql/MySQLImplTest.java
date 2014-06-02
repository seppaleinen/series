package database.mysql;

import database.mongodb.ObjectCreater;
import objects.*;
import org.junit.*;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MySQLImplTest {
    private MySQLImpl dbInterface;
    private static String persistenceName;

    @BeforeClass
    public static void setupClass(){
        persistenceName = databaseExists() ? "mysql" : "mysqltest";
        System.out.println("Running on " + persistenceName + " persistence");
    }

    @Before
    public void setup() {
        dbInterface = new MySQLImpl();
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
