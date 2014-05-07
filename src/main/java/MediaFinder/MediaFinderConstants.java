package MediaFinder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MediaFinderConstants {
    private static String avi = ".avi";
    private static String mkv = ".mkv";
    private static String mpg = ".mpg";
    private static String ogm = ".ogm";
    private static String mpeg = ".mpeg";
    private static String mp4 = ".mp4";
    private static List<String> mediaFormats = new ArrayList<>(Arrays.asList(new String[]{avi, mkv, mpg, ogm, mpeg, mp4}));

    public static boolean isFileMedia(String filename) {
        boolean isMedia = false;
        for(String mediaFormat : mediaFormats) {
            if(filename.toLowerCase().contains(mediaFormat)) {
                isMedia = true;
            }
        }
        return isMedia;
    }
}
