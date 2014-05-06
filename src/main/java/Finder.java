import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Finder {
    private List<String> result = new ArrayList<>();
    private static List<String> mediaFormats = new ArrayList<>();

    public Finder(){
        mediaFormats.add(".avi");
        mediaFormats.add(".mpg");
        mediaFormats.add(".mkv");
        mediaFormats.add(".ogm");
        mediaFormats.add(".mp4");
        mediaFormats.add(".mpeg");
    }

    public void searchDirectory(String directoryPath) {
        File directory = new File(directoryPath);

        if (directory.isDirectory()) {
            search(directory);
        } else {
            System.out.println(directory.getAbsoluteFile() + " is not a directory!");
        }

    }

    private void search(File file) {

        if (file.isDirectory()) {

            //do you have permission to read this directory?
            if (file.canRead()) {
                for (File temp : file.listFiles()) {
                   checkTempFile(temp);
                }
            } else {
                System.out.println(file.getAbsoluteFile() + "Permission Denied");
            }
        }

    }

    private void checkTempFile(File temp){
        if (temp.isDirectory()) {
            search(temp);
        } else {
            for(String mediaFormat : mediaFormats){
                if(temp.getName().toLowerCase().contains(mediaFormat)){
                    result.add(temp.getAbsoluteFile().toString());
                }
            }

        }
    }

    public List<String> getResult(){
        return result;
    }
}
