import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FirstClass {
    private static List<String> mediaFormats = new ArrayList<>();

    static {
        setMediaFormats();
    }

    public static void main(String[] args) {
        for(String arg:args) {
            if(isMediaFileAndExists(arg)){
                System.out.println(arg);
            }
        }
    }

    public static boolean isMediaFileAndExists(String filePath) {
        if(isMediaFile(filePath)){
            return fileExists(filePath);
        }
        return false;
    }

    public static boolean fileExists(String filePath) {
        File file = new File(filePath);
        return file.exists();
    }

    public static boolean isMediaFile(String filePath) {
        for(String mediaFormat : mediaFormats){
            if(filePath.contains(mediaFormat)){
                return true;
            }
        }
        return false;
    }

    private static void setMediaFormats() {
        mediaFormats.add(".avi");
        mediaFormats.add(".mpg");
        mediaFormats.add(".mkv");
        mediaFormats.add(".ogm");
        mediaFormats.add(".mp4");
        mediaFormats.add(".mpeg");
    }
}