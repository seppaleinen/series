/*package Integrations.ApacheHttpImpl;

import Integrations.ApacheHttpImpl.Utils.ApacheHelper;
import Integrations.TVDBInterface;

import java.io.InputStream;

public class TVDBApacheImpl extends ApacheHelper implements TVDBInterface {
    @Override
    public InputStream getUpdatesSince(String dateSinceLastUpdate) {
        String TVDBUpdatesUrl = getURL(UPDATES_INFORMATION, dateSinceLastUpdate);
        return getInputStream(TVDBUpdatesUrl);
    }

    @Override
    public InputStream getEpisode(String episodeId) {
        String TVDBEpisodeUrl = getURL(EPISODE_INFORMATION, episodeId);
        return getInputStream(TVDBEpisodeUrl);
    }

    @Override
    public InputStream getSeries(String seriesId) {
        String TVDBSeriesUrl = getURL(SERIE_INFORMATION, seriesId);
        return getInputStream(TVDBSeriesUrl);
    }

    @Override
    public InputStream getIMDB(String imdbId) {
        String TVDBIMDBUrl = getURL(IMDB_INFORMATION, imdbId);
        return getInputStream(TVDBIMDBUrl);
    }

    private String getURL(String URL, String title) {
        return URL.replace("#", title);
    }
}
*/