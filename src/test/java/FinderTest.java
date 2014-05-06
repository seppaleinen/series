import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FinderTest {
    private static final String MEDIADIR = "/Media";
    private Finder finder;

    @Before
    public void setup(){
        finder = new Finder();
    }

    @Test
    public void testFinder(){
        String directory = getFile(MEDIADIR);

        finder.searchDirectory(directory);

        List<String> result = finder.getResult();

        assertNotNull(result);
        assertFalse("Result should not be empty", result.isEmpty());
    }

    private String getFile(String directory){
        return this.getClass().getResource(directory).getFile().replace("%20", " ");
    }
}
