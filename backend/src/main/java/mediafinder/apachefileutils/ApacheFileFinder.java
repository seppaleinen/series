package mediafinder.apachefileutils;

import mediafinder.apachefileutils.utils.CustomFileVisitor;
import mediafinder.Finder;
import objects.FinderSeries;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ApacheFileFinder implements Finder {
    private CustomFileVisitor customFileVisitor;
    private static final boolean IS_WINDOWS = System.getProperty( "os.name" ).contains( "indow" );

    public ApacheFileFinder() {
        customFileVisitor = new CustomFileVisitor();
    }

    @Override
    public List<FinderSeries> searchDirectory(String directoryPath) {
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
        String fixedPath = directory;
        if(IS_WINDOWS) {
            fixedPath = directory.substring(1);
        }
        return FileSystems.getDefault().getPath(fixedPath);
    }
}
