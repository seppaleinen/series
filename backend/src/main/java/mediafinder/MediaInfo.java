package mediafinder;

import objects.constants.MediaInfoConstants;
import objects.FinderSeries;

public class MediaInfo {
    private static final boolean IS_WINDOWS = System.getProperty( "os.name" ).contains( "indow" );
    private final String SEPARATOR = System.getProperty("file.separator");
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
        String SEP = IS_WINDOWS ? SEPARATOR + SEPARATOR : SEPARATOR;
        String[] splitMediaPath = mediaPath.split(SEP);
        int arrayLength = splitMediaPath.length - mediaInfoConstant.getNumber();
        return splitMediaPath[arrayLength];
    }
}
