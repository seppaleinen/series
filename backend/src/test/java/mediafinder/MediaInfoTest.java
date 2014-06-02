package mediafinder;

import objects.FinderSeries;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class MediaInfoTest {
    private MediaInfo mediaInfo;
    private static final String SEPARATOR = System.getProperty("file.separator");
    private static final String SERIES_DIR = "." + SEPARATOR + "Downloads" + SEPARATOR + "Series";
    private static final String ARCHER_DIR = "Archer S05";
    private static final String ARCHER_EPISODE = "Archer.2009.S05E10.HDTV.XviD-AFG.avi";
    private static final String ARCHER_PATH = SERIES_DIR + SEPARATOR + ARCHER_DIR + SEPARATOR + ARCHER_EPISODE;
    private static final String EVANGELION_DIR = "Neon Genesis Evangelion";
    private static final String EVANGELION_EPISODE = "NGE-24.mkv";
    private static final String EVANGELION_PATH = SERIES_DIR + SEPARATOR + EVANGELION_DIR + SEPARATOR + EVANGELION_EPISODE;

    @Before
    public void setup(){
        mediaInfo = new MediaInfo();
    }

    @Test
    public void testGetFilenameFromPath(){
        String result = mediaInfo.getFilenameFromPath(ARCHER_PATH);
        assertNotNull(result);
        assertEquals("Expected filename should be " + ARCHER_EPISODE, ARCHER_EPISODE, result);
    }

    @Test
    public void testGetFoldernameFromPath(){
        String result = mediaInfo.getFoldernameFromPath(ARCHER_PATH);
        assertNotNull(result);
        assertEquals("Expected foldername should be " + ARCHER_DIR, ARCHER_DIR, result);
    }

    @Test
    public void testGetSeriesInfoFromPathArcher(){
        FinderSeries result = mediaInfo.getFinderSeriesFromPath(ARCHER_PATH);
        assertNotNull(result);
        assertEquals("Title should be " + ARCHER_DIR, ARCHER_DIR, result.getSeriesTitle());
        assertEquals("Episode should be " + ARCHER_EPISODE, ARCHER_EPISODE, result.getEpisodeTitle());
    }

    @Test
    public void testGetSeriesInfoFromPathEvangelion(){
        FinderSeries result = mediaInfo.getFinderSeriesFromPath(EVANGELION_PATH);
        assertNotNull(result);
        assertEquals("Title should be " + EVANGELION_DIR, EVANGELION_DIR, result.getSeriesTitle());
        assertEquals("Episode should be " + EVANGELION_EPISODE, EVANGELION_EPISODE, result.getEpisodeTitle());
    }
}
