package Database.MySQL;

import Database.DBInterface;
import Objects.*;

public class MySQLImpl implements DBInterface {
    @Override
    public TVDBIMDB getTVDBIMDB(String imdbId) {
        return null;
    }

    @Override
    public TVDBEpisode getTVDBEpisode(String episodeId) {
        return null;
    }

    @Override
    public TVDBSeries getTVDBSeries(String seriesId) {
        return null;
    }

    @Override
    public TVDBUpdate getTVDBUpdate() {
        return null;
    }

    @Override
    public OMDB getOMDB(String IMDBId) {
        return null;
    }

    @Override
    public void saveTVDBIMDB(TVDBIMDB tvdbimdb) {

    }

    @Override
    public void saveTVDBEpisode(TVDBEpisode tvdbEpisode) {

    }

    @Override
    public void saveTVDBSeries(TVDBSeries tvdbSeries) {

    }

    @Override
    public void saveTVDBUpdate(TVDBUpdate tvdbUpdate) {

    }

    @Override
    public void saveOMDB(OMDB omdb) {

    }
}
