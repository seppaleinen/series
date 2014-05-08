package Integrations.URLImpl;

import Integrations.TVDBInterface;
import Integrations.URLImpl.Utils.UrlConnection;

import java.io.InputStream;

public class TVDBImpl extends UrlConnection implements TVDBInterface {
    public InputStream getUpdatesSince(String dateSinceLastUpdate){
        String tvDBUrl = UPDATES_INFORMATION.replaceAll("#", dateSinceLastUpdate);
        return getTVDBInfo(tvDBUrl);
    }

    public InputStream getEpisode(String episodeId){
        String tvDBUrl = EPISODE_INFORMATION.replaceAll("#", episodeId);
        return getTVDBInfo(tvDBUrl);
    }

    public InputStream getSeries(String seriesId){
        String tvDBUrl = SERIE_INFORMATION.replaceAll("#", seriesId);
        return getTVDBInfo(tvDBUrl);
    }

    public InputStream getIMDB(String imdbId){
        String tvDBUrl = IMDB_INFORMATION.replaceAll("#", imdbId);
        return getTVDBInfo(tvDBUrl);
    }

    private InputStream getTVDBInfo(String tvDBUrl){
        return getInputStream(tvDBUrl);
    }
}
