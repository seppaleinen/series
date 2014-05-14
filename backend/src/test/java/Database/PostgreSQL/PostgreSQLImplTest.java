package Database.PostgreSQL;

import Database.DBInterface;
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
    private DBInterface dbInterface;
    private static final String JDBC_CONNECTION = "jdbc:postgresql://127.0.0.1:5432/MYPOSTGRES";
    private static String persistenceName;
    private static EntityManager entityManager;

    @BeforeClass
    public static void beforeClass() throws ClassNotFoundException {
        persistenceName = databaseExists() ? "postgres" : "postgrestest";
        System.out.println("Running on " + persistenceName + " persistence");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(persistenceName);
        entityManager = entityManagerFactory.createEntityManager();
    }

    @Before
    public void setup(){
        dbInterface = new PostgreSQLImpl();
    }

    @Ignore
    @Test
    public void testConnection() throws ClassNotFoundException, SQLException {
        assertEquals("Postgresql server should be running", "postgres", persistenceName);
    }

    private static boolean databaseExists() throws ClassNotFoundException {
        String dbUrl = "jdbc:postgresql://127.0.0.1:5432/MYPOSTGRES";
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
