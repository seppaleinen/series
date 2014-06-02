package mediafinder.apachefileutils.utils;

import mediafinder.MediaFinderConstants;
import objects.FinderSeries;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class CustomFileVisitor implements FileVisitor<Path> {
    private List<FinderSeries> result = new ArrayList<>();

    // Called after a directory visit is complete.
    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc)
            throws IOException {
        return FileVisitResult.CONTINUE;
    }
    // called before a directory visit.
    @Override
    public FileVisitResult preVisitDirectory(Path dir,
                                             BasicFileAttributes attrs) throws IOException {
        return FileVisitResult.CONTINUE;
    }
    // This method is called for each file visited. The basic attributes of the files are also available.
    @Override
    public FileVisitResult visitFile(Path file,
                                     BasicFileAttributes attrs) throws IOException {
        String fileName = file.getFileName().toString();
        if(MediaFinderConstants.isFileMedia(fileName)) {
            FinderSeries finderSeries = new FinderSeries();
            finderSeries.setEpisodeTitle(fileName);
            finderSeries.setSeriesTitle(file.getParent().getFileName().toString());
            result.add(finderSeries);
        }
        return FileVisitResult.CONTINUE;
    }
    // if the file visit fails for any reason, the visitFileFailed method is called.
    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc)
            throws IOException {
        return FileVisitResult.CONTINUE;
    }

    public List<FinderSeries> getResult() {
        return result;
    }
}
