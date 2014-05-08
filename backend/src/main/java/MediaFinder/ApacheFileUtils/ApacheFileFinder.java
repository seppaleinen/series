package MediaFinder.ApacheFileUtils;

import MediaFinder.ApacheFileUtils.Utils.CustomFileVisitor;
import MediaFinder.Finder;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ApacheFileFinder implements Finder {
    private CustomFileVisitor customFileVisitor;

    public ApacheFileFinder() {
        customFileVisitor = new CustomFileVisitor();
    }

    @Override
    public List<String> searchDirectory(String directoryPath) {
        Path directory = getPath(directoryPath);
        walkFileTree(directory);
        return customFileVisitor.getResult();
    }

    private void walkFileTree(Path directory) {
        try {
            Files.walkFileTree(directory, customFileVisitor);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Path getPath(String directory) {
        return FileSystems.getDefault().getPath(directory);
    }
}