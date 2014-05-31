package integrations;

import java.io.InputStream;

public interface TVDBInterface {
    public static final String TVDB_URL = "http://www.thetvdb.com";
    public static final String API_KEY = "B262F7F35C6268EA";
    public static final String UPDATES_INFORMATION =        TVDB_URL + "/api/Updates.php?type=all&time=#";
    public static final String EPISODE_ALL_INFO =           TVDB_URL + "/data/series/#/all/";
    public static final String SERIES_INFORMATION_BY_NAME = TVDB_URL + "/api/GetSeries.php?seriesname=#";

    public InputStream getUpdatesSince(String dateSinceLastUpdate);
    public InputStream getSeriesByName(String seriesName);
    public InputStream getSeriesInfo(String seriesId);
}
