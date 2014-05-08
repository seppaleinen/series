package MediaFinder.FileFinder;

import MediaFinder.Finder;
import Objects.FinderSeries;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

public class FileFinderTest {
    private static final String MEDIADIR = "/Media";
    private Finder fileFinder;

    @Before
    public void setup(){
        fileFinder = new FileFinder();
    }

    @Test
    public void testFinder(){
        int expectedResultSize = 6;
        String directory = getFile(MEDIADIR);

        List<FinderSeries> result = fileFinder.searchDirectory(directory);

        assertNotNull(result);
        assertFalse("Result should not be empty", result.isEmpty());
        assertEquals("Resultsize should be " + expectedResultSize, expectedResultSize, result.size());
    }

    private String getFile(String directory){
        return this.getClass().getResource(directory).getFile().replace("%20", " ");
    }
}
