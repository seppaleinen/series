package Database;

import Objects.*;

public interface DBInterface {
    public TVDBIMDB getTVDBIMDB(String imdbId);
    public TVDBEpisode getTVDBEpisode(String episodeId);
    public TVDBSeries getTVDBSeries(String seriesId);
    public TVDBUpdate getTVDBUpdate();
    public OMDB getOMDB(String IMDBId);

    public void saveTVDBIMDB(TVDBIMDB tvdbimdb);
    public void saveTVDBEpisode(TVDBEpisode tvdbEpisode);
    public void saveTVDBSeries(TVDBSeries tvdbSeries);
    public void saveTVDBUpdate(TVDBUpdate tvdbUpdate);
    public void saveOMDB(OMDB omdb);
}
