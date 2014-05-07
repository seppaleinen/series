package MediaFinder.ApacheFileUtils;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class ApacheFileFinderTest {
    private static final String MEDIADIR = "/Media";
    private ApacheFileFinder apacheFileFinder;

    @Before
    public void setup() {
        apacheFileFinder = new ApacheFileFinder();
    }

    @Test
    public void testSearchDirectory() {
        int expectedResultSize = 6;
        String directory = getFile(MEDIADIR);
        List<String> result = apacheFileFinder.searchDirectory(directory);
        assertNotNull("Result should not be null", result);
        assertEquals("Resultsize should be " + expectedResultSize, expectedResultSize, result.size());
    }

    private String getFile(String directory){
        return this.getClass().getResource(directory).getFile().replace("%20", " ");
    }
}
