package MediaFinder;

import Objects.FinderSeries;

import java.util.List;

public interface Finder {
    public List<FinderSeries> searchDirectory(String directoryPath);
}
