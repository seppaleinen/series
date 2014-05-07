package MediaFinder.ApacheFileUtils;

import MediaFinder.ApacheFileUtils.Utils.CustomFileVisitor;
import MediaFinder.Finder;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ApacheFileFinder implements Finder {
    @Override
    public List<String> searchDirectory(String directoryPath) {
        Path directory = getPath(directoryPath);
        CustomFileVisitor customFileVisitor = new CustomFileVisitor();
        try {
            Files.walkFileTree(directory, customFileVisitor);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customFileVisitor.getResult();
    }

    private Path getPath(String directory) {
        return FileSystems.getDefault().getPath(directory);
    }
}
