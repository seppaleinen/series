package Integrations.ApacheHttpImpl;

import Integrations.OMDBInterface;
import org.junit.Before;

public class OMDBApacheImplTest {
    private OMDBInterface omdbInterface;

    @Before
    public void setup(){
        omdbInterface = new OMDBApacheImpl();
    }
}
