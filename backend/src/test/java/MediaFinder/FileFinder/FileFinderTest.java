package MediaFinder.FileFinder;

import MediaFinder.Finder;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

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
        String directory = getFile(MEDIADIR);

        List<String> result = fileFinder.searchDirectory(directory);

        assertNotNull(result);
        assertFalse("Result should not be empty", result.isEmpty());
    }

    private String getFile(String directory){
        return this.getClass().getResource(directory).getFile().replace("%20", " ");
    }
}
