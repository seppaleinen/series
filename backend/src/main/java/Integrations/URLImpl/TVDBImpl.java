package integrations.urlimpl;

import integrations.TVDBInterface;
import integrations.urlimpl.utils.UrlConnection;

import java.io.InputStream;

public class TVDBImpl extends UrlConnection implements TVDBInterface {
    @Override
    public InputStream getUpdatesSince(String dateSinceLastUpdate){
        String tvDBUrl = UPDATES_INFORMATION.replaceAll("#", dateSinceLastUpdate);
        return getTVDBInfo(tvDBUrl);
    }

    @Override
    public InputStream getSeriesByName(String seriesName) {
        String tvDBUrl = SERIES_INFORMATION_BY_NAME.replaceAll("#", seriesName.replaceAll(" ", "+"));
        return getTVDBInfo(tvDBUrl);
    }

    @Override
    public InputStream getSeriesInfo(String seriesId) {
        String tvDBUrl = EPISODE_ALL_INFO.replaceAll("#", seriesId);
        return getTVDBInfo(tvDBUrl);
    }

    private InputStream getTVDBInfo(String tvDBUrl){
        return getInputStream(tvDBUrl);
    }
}
