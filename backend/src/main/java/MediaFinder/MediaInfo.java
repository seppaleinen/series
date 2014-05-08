package MediaFinder;

import Objects.Constants.MediaInfoConstants;
import Objects.FinderSeries;

public class MediaInfo {
    private static final String SEPARATOR = System.getProperty("file.separator");
    private FinderSeries finderSeries;

    public FinderSeries getFinderSeriesFromPath(String mediaPath){
        finderSeries = new FinderSeries();
        finderSeries.setSeriesTitle(getFoldernameFromPath(mediaPath));
        finderSeries.setEpisodeTitle(getFilenameFromPath(mediaPath));
        return finderSeries;
    }

    protected String getFilenameFromPath(String mediaPath){
        return splitInfo(mediaPath, MediaInfoConstants.FILENAME);
    }

    protected String getFoldernameFromPath(String mediaPath){
        return splitInfo(mediaPath, MediaInfoConstants.FOLDERNAME);
    }

    private String splitInfo(String mediaPath, MediaInfoConstants mediaInfoConstant){
        String[] splitMediaPath = mediaPath.split(SEPARATOR);
        int arrayLength = splitMediaPath.length - mediaInfoConstant.getNumber();
        return splitMediaPath[arrayLength];
    }
}
