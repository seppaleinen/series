import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MediaInfoTest {
    private MediaInfo mediaInfo;
    private static final String HOMEDIR = System.getProperty("user.home");
    @Before
    public void setup(){
        mediaInfo = new MediaInfo();
    }

    @Test
    public void testGetFilenameFromPath(){
        String filename = "Pompeii.2014.BDRip.x264-SPARKS.mkv";
        String path = HOMEDIR + "/Downloads/Serier/Pompeii.2014.BDRip.x264-SPARKS/" + filename;
        String result = mediaInfo.getFilenameFromPath(path);
        assertNotNull(result);
        assertEquals(filename, result);
    }
}
