package integrations.urlimpl;

import integrations.TVDBInterface;
import org.junit.Before;

public class TvDBImplTest {
    private TVDBInterface tvDB;

    @Before
    public void setup(){
        tvDB = new TVDBImpl();
    }

}
