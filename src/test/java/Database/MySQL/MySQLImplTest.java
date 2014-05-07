package Database.MySQL;

import Database.DBInterface;
import org.junit.Before;

public class MySQLImplTest {
    private DBInterface dbInterface;

    @Before
    public void setup(){
        dbInterface = new MySQLImpl();
    }
}
