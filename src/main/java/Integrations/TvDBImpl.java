package Integrations;

import java.io.BufferedReader;
import java.net.URL;

public class TvDBImpl extends UrlConnection {
    private static final String TVDB_URL = "http://www.thetvdb.com";
    private static final String API_KEY = "B262F7F35C6268EA";
    protected static final String SERIE_INFORMATION = TVDB_URL + "/api/" + API_KEY + "/series/#/en.xml";
    protected static final String EPISODE_INFORMATION = TVDB_URL + "/api/" + API_KEY + "/episodes/#/en.xml";
    protected static final String ALL_UPDATES_SINCE = TVDB_URL + "/api/Updates.php?type=all&time=#";


    public String getUpdatesSince(String dateSinceLastUpdate){
        String tvDBUrl = ALL_UPDATES_SINCE.replaceAll("#", dateSinceLastUpdate);
        return getTVDBInfo(tvDBUrl);
    }

    public String getEpisode(String episodeId){
        String tvDBUrl = EPISODE_INFORMATION.replaceAll("#", episodeId);
        return getTVDBInfo(tvDBUrl);
    }

    public String getSeries(String seriesId){
        String tvDBUrl = SERIE_INFORMATION.replaceAll("#", seriesId);
        return getTVDBInfo(tvDBUrl);
    }

    private String getTVDBInfo(String tvDBUrl){
        URL url = createUrl(tvDBUrl);
        BufferedReader reader = getReader(url);
        String result = readUrl(reader);
        closeReader(reader);
        return result;
    }
}
