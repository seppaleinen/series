package Integrations;

import java.io.InputStream;

public interface TVDBInterface {
    public static final String TVDB_URL = "http://www.thetvdb.com/api/";
    public static final String API_KEY = "B262F7F35C6268EA";
    public static final String SERIE_INFORMATION = TVDB_URL + API_KEY + "/series/#/en.xml";
    public static final String EPISODE_INFORMATION = TVDB_URL + API_KEY + "/episodes/#/en.xml";
    public static final String UPDATES_INFORMATION = TVDB_URL + "Updates.php?type=all&time=#";
    public static final String IMDB_INFORMATION = TVDB_URL + "GetSeriesByRemoteID.php?imdbid=#";

    public InputStream getUpdatesSince(String dateSinceLastUpdate);
    public InputStream getEpisode(String episodeId);
    public InputStream getSeries(String seriesId);
    public InputStream getIMDB(String imdbId);
}
