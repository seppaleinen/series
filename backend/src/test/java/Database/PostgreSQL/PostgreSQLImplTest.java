package Database.PostgreSQL;

import Database.DBInterface;
import org.junit.Before;

public class PostgreSQLImplTest {
    private DBInterface dbInterface;

    @Before
    public void setup(){
        dbInterface = new PostgreSQLImpl();
    }
}
