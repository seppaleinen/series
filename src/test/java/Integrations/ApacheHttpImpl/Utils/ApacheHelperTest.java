package Integrations.ApacheHttpImpl.Utils;

import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static junit.framework.Assert.assertNotNull;

public class ApacheHelperTest {
    private ApacheHelper apacheHelper;

    @Before
    public void setup() {
        apacheHelper = new ApacheHelper();
    }

    @Test
    public void testGetInputStream() {
        String address = "http://www.google.se/";
        InputStream inputStream = apacheHelper.getInputStream(address);
        assertNotNull(inputStream);
    }
}
