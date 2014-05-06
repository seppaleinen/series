import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class FirstClassTest{
    private static final String HOMEDIR = System.getProperty("user.home");
    private static final String EXISTINGMEDIA = HOMEDIR + "/Downloads/Serier/Pompeii.2014.BDRip.x264-SPARKS/Pompeii.2014.BDRip.x264-SPARKS.mkv";
    private String[] arguments;
    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Before
    public void setup(){
        arguments = null;
    }
    @After
    public void tearDown() {
    }
    @Test
    public void testOneArgument() {
        arguments = new String[]{EXISTINGMEDIA};

        FirstClass.main(arguments);

        assertThat(log.getLog(), containsString(EXISTINGMEDIA));
    }
    @Test
    public void testMultipleArguments() {
        arguments = new String[]{EXISTINGMEDIA, EXISTINGMEDIA};

        FirstClass.main(arguments);

        assertThat(log.getLog(), containsString(EXISTINGMEDIA));
        assertThat(log.getLog(), containsString(EXISTINGMEDIA));
    }

    @Test
    public void testMediaFileFalse(){
        String NOTMEDIAFILE = HOMEDIR + "/hoj.txt";

        boolean mediaFile = FirstClass.isMediaFile(NOTMEDIAFILE);

        assertFalse(mediaFile);
    }

    @Test
    public void testMediaFileTrue() {
       List<String> mediaFiles = new ArrayList<String>();
       mediaFiles.add(HOMEDIR + "/Downloads/hej.avi");
       mediaFiles.add(HOMEDIR + "/Downloads/hej.mpg");
       mediaFiles.add(HOMEDIR + "/Downloads/hej.mkv");
       mediaFiles.add(HOMEDIR + "/Downloads/hej.mp4");
       mediaFiles.add(HOMEDIR + "/Downloads/hej.ogm");
       mediaFiles.add(HOMEDIR + "/Downloads/hej.mpeg");
       for(String mediaFile : mediaFiles){
           boolean isMediaFile = FirstClass.isMediaFile(mediaFile);
           assertTrue(mediaFile + " should be mediafile", isMediaFile);
       }
    }

    @Test
    public void testMediaFileExistsFalse(){
       String NONEXISTANTFILE = HOMEDIR + "/hejhej.txt";

       boolean exists = FirstClass.fileExists(NONEXISTANTFILE);

       assertFalse(NONEXISTANTFILE + " should not exist", exists);
    }

    @Test
    public void testMediaFileExistsTrue(){
        String EXISTINGFILE = HOMEDIR + "/Downloads/PapersPlease.app";

        boolean exists = FirstClass.fileExists(EXISTINGFILE);

        assertTrue(EXISTINGFILE + " should exist", exists);
    }


    @Test
    public void testMediaFileAndExist_NoMediaFile() {
        String NONEXISTANTFILE = HOMEDIR + "/hejhej.txt";

        boolean exists = FirstClass.isMediaFileAndExists(NONEXISTANTFILE);

        assertFalse(exists);
    }

    @Test
    public void testMediaFileAndExist_NonExistant() {
        String NONMEDIAFILE = HOMEDIR + "/hejhej.avi";

        boolean exists = FirstClass.isMediaFileAndExists(NONMEDIAFILE);

        assertFalse(exists);
    }

    @Test
    public void testMediaFileAndExist_True(){
        boolean existingMedia = FirstClass.isMediaFileAndExists(EXISTINGMEDIA);

        assertTrue(EXISTINGMEDIA + " should exist", existingMedia);
    }
}