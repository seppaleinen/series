package database;

import objects.*;

public interface DBInterface {
    public TVDBEpisode getTVDBEpisode(String episodeId);
    public TVDBSeries getTVDBSeries(String seriesId);
    public TVDBUpdate getTVDBUpdate();

    public void saveTVDBEpisode(TVDBEpisode tvdbEpisode);
    public void saveTVDBSeries(TVDBSeries tvdbSeries);
    public void saveTVDBUpdate(TVDBUpdate tvdbUpdate);
}
