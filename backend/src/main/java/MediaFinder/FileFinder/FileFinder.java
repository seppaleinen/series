package MediaFinder.FileFinder;

import MediaFinder.Finder;
import MediaFinder.MediaFinderConstants;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileFinder implements Finder {
    private List<String> result = new ArrayList<>();

    public List<String> searchDirectory(String directoryPath) {
        File directory = new File(directoryPath);

        if (directory.isDirectory()) {
            search(directory);
        } else {
            System.out.println(directory.getAbsoluteFile() + " is not a directory!");
        }

        return result;
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
            if(MediaFinderConstants.isFileMedia(temp.getName())) {
                result.add(temp.getAbsoluteFile().toString());
            }
        }
    }
}
