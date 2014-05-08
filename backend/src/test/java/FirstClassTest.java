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
    private static final String MEDIADIR = "/Media";
    private static final String EXISTINGMEDIAAVI = "Fight club.avi";
    private static final String EXISTINGMEDIAMKV = "Killer clowns from outer space.mkv";
    private static final String EXISTINGMEDIAMP4 = "Alien.mp4";
    private static final String EXISTINGMEDIAMPEG = "Forrest.Gump.mpeg";
    private static final String EXISTINGMEDIAOGM = "Full_Metal_Jacket.ogm";
    private static final String EXISTINGMEDIAMPG = "Jaws.mpg";
    private static final String NOTMEDIA = "NOT_MEDIA.mp3";

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
        arguments = new String[]{getFile(EXISTINGMEDIAAVI)};

        FirstClass.main(arguments);

        assertThat(log.getLog(), containsString(EXISTINGMEDIAAVI));
    }
    @Test
    public void testMultipleArguments() {
        arguments = new String[]{getFile(EXISTINGMEDIAAVI), getFile(EXISTINGMEDIAMKV)};

        FirstClass.main(arguments);

        assertThat(log.getLog(), containsString(EXISTINGMEDIAAVI));
        assertThat(log.getLog(), containsString(EXISTINGMEDIAMKV));
    }

    @Test
    public void testMediaFileFalse(){
        boolean mediaFile = FirstClass.isMediaFile(getFile(NOTMEDIA));

        assertFalse(mediaFile);
    }

    @Test
    public void testMediaFileTrue() {
       List<String> mediaFiles = new ArrayList<String>();
       mediaFiles.add(getFile(EXISTINGMEDIAAVI));
       mediaFiles.add(getFile(EXISTINGMEDIAMPG));
       mediaFiles.add(getFile(EXISTINGMEDIAMKV));
       mediaFiles.add(getFile(EXISTINGMEDIAMP4));
       mediaFiles.add(getFile(EXISTINGMEDIAOGM));
       mediaFiles.add(getFile(EXISTINGMEDIAMPEG));
       for(String mediaFile : mediaFiles){
           boolean isMediaFile = FirstClass.isMediaFile(mediaFile);
           assertTrue(mediaFile + " should be mediafile", isMediaFile);
       }
    }

    @Test
    public void testMediaFileExistsFalse(){
       String NONEXISTANTFILE = this.getClass().getResource("Media").getPath() + "NONEXISTANT";

       boolean exists = FirstClass.fileExists(NONEXISTANTFILE);

       assertFalse(NONEXISTANTFILE + " should not exist", exists);
    }

    @Test
    public void testMediaFileExistsTrue(){
        String EXISTINGFILE = getFile(EXISTINGMEDIAMPG);

        boolean exists = FirstClass.fileExists(EXISTINGFILE);

        assertTrue(EXISTINGFILE + " should exist", exists);
    }

    @Test
    public void testMediaFileAndExist_True(){
        boolean existingMedia = FirstClass.isMediaFileAndExists(getFile(EXISTINGMEDIAMPG));

        assertTrue(EXISTINGMEDIAMPEG + " should exist", existingMedia);
    }

    private String getFile(String filename){
        return this.getClass().getResource(MEDIADIR + "/" + filename).getFile().replace("%20", " ");
    }

}