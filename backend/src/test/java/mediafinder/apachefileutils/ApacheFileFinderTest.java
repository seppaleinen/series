package mediafinder.apachefileutils;

import objects.FinderSeries;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ApacheFileFinderTest {
    private static final String MEDIADIR = "/Media";
    private ApacheFileFinder apacheFileFinder;

    @Before
    public void setup() {
        apacheFileFinder = new ApacheFileFinder();
    }

    @Ignore
    @Test
    public void testSearchDirectory() {
        int expectedResultSize = 6;
        String directory = getFile(MEDIADIR);
        List<FinderSeries> result = apacheFileFinder.searchDirectory(directory);
        assertNotNull("Result should not be null", result);
        assertEquals("Resultsize should be " + expectedResultSize, expectedResultSize, result.size());
    }

    private String getFile(String directory){
        return this.getClass().getResource(directory).getFile().replace("%20", " ");
    }
}
