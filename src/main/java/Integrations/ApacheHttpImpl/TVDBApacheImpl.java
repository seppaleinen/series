package Integrations.ApacheHttpImpl;

import Integrations.ApacheHttpImpl.ApacheUtils.ApacheHelper;
import Integrations.TVDBInterface;

import java.io.InputStream;

public class TVDBApacheImpl implements TVDBInterface {
    @Override
    public InputStream getUpdatesSince(String dateSinceLastUpdate) {
        String TVDBUpdatesUrl = getURL(UPDATES_INFORMATION, dateSinceLastUpdate);
        return ApacheHelper.getInputStream(TVDBUpdatesUrl);
    }

    @Override
    public InputStream getEpisode(String episodeId) {
        String TVDBEpisodeUrl = getURL(EPISODE_INFORMATION, episodeId);
        return ApacheHelper.getInputStream(TVDBEpisodeUrl);
    }

    @Override
    public InputStream getSeries(String seriesId) {
        String TVDBSeriesUrl = getURL(SERIE_INFORMATION, seriesId);
        return ApacheHelper.getInputStream(TVDBSeriesUrl);
    }

    @Override
    public InputStream getIMDB(String imdbId) {
        String TVDBIMDBUrl = getURL(IMDB_INFORMATION, imdbId);
        return ApacheHelper.getInputStream(TVDBIMDBUrl);
    }

    private String getURL(String URL, String title) {
        return URL.replace("#", title);
    }
}
