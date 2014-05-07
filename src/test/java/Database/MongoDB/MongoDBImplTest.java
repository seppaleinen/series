package Database.MongoDB;

import Database.DBInterface;
import org.junit.Before;

public class MongoDBImplTest {
    private DBInterface dbInterface;

    @Before
    public void setup(){
        dbInterface = new MongoDBImpl();
    }
}
