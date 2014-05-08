package MediaFinder.ApacheFileUtils.Utils;

import MediaFinder.MediaFinderConstants;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class CustomFileVisitor implements FileVisitor<Path> {
    private List<String> result = new ArrayList<>();

    // Called after a directory visit is complete.
    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc)
            throws IOException {
//        System.out.println("FilesExample.main(...).new FileVisitor() {...}.postVisitDirectory()");
//        System.out.println(dir.getFileName());
        return FileVisitResult.CONTINUE;
    }
    // called before a directory visit.
    @Override
    public FileVisitResult preVisitDirectory(Path dir,
                                             BasicFileAttributes attrs) throws IOException {
//        System.out.println("FilesExample.main(...).new FileVisitor() {...}.preVisitDirectory()");
//        System.out.println(dir.getFileName());
        return FileVisitResult.CONTINUE;
    }
    // This method is called for each file visited. The basic attributes of the files are also available.
    @Override
    public FileVisitResult visitFile(Path file,
                                     BasicFileAttributes attrs) throws IOException {
//        System.out.println("FilesExample.main(...).new FileVisitor() {...}.visitFile()");
//        System.out.println(file.getFileName());
        String fileName = file.getFileName().toString();
        if(MediaFinderConstants.isFileMedia(fileName)) {
            result.add(fileName);
        }
        return FileVisitResult.CONTINUE;
    }
    // if the file visit fails for any reason, the visitFileFailed method is called.
    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc)
            throws IOException {
//        System.out.println("FilesExample.main(...).new FileVisitor() {...}.visitFileFailed()");
//        System.out.println(file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    public List<String> getResult() {
        return result;
    }
}
