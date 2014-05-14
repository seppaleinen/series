package Database.PostgreSQL;

import Database.DBInterface;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.Assert.assertNotNull;

public class PostgreSQLImplTest {
    private DBInterface dbInterface;
    private static final String JDBC_CONNECTION = "jdbc:postgresql://127.0.0.1:5432/MYPOSTGRES";


    @Before
    public void setup(){
        dbInterface = new PostgreSQLImpl();
    }

    @Ignore
    @Test
    public void testConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(JDBC_CONNECTION, "root", "minstlol");
        assertNotNull(connection);
    }
}
