package Database.MySQL.Utils;

import Database.MySQL.Entities.MySQLOMDB;
import Database.MySQL.Entities.MySQLTVDBIMDB;
import Database.MySQL.Entities.MySQLTVDBSeries;
import Objects.OMDB;
import Objects.TVDBIMDB;
import Objects.TVDBSeries;

public class ObjectToJPA {
    public static MySQLTVDBIMDB convertTVDBIMDB_To_MySQLTVDBIMDB(TVDBIMDB tvdbimdb){
        MySQLTVDBIMDB mySQLTVDBIMDB = new MySQLTVDBIMDB();

        mySQLTVDBIMDB.setSeriesId(tvdbimdb.getSeriesId());
        mySQLTVDBIMDB.setLanguage(tvdbimdb.getLanguage());
        mySQLTVDBIMDB.setSeriesName(tvdbimdb.getSeriesName());
        mySQLTVDBIMDB.setBanner(tvdbimdb.getBanner());
        mySQLTVDBIMDB.setOverview(tvdbimdb.getOverview());
        mySQLTVDBIMDB.setFirstAired(tvdbimdb.getFirstAired());
        mySQLTVDBIMDB.setImdbId(tvdbimdb.getImdbId());
        mySQLTVDBIMDB.setId(tvdbimdb.getId());

        return mySQLTVDBIMDB;
    }

    public static MySQLOMDB convertOMDB_To_MySQLOMDB(OMDB omdb) {
        MySQLOMDB mySQLOMDB = new MySQLOMDB();

        mySQLOMDB.setTitle(omdb.getTitle());
        mySQLOMDB.setYear(omdb.getYear());
        mySQLOMDB.setRated(omdb.getRated());
        mySQLOMDB.setReleased(omdb.getReleased());
        mySQLOMDB.setRuntime(omdb.getRuntime());
        mySQLOMDB.setGenre(omdb.getGenre());
        mySQLOMDB.setDirector(omdb.getDirector());
        mySQLOMDB.setWriter(omdb.getWriter());
        mySQLOMDB.setActors(omdb.getActors());
        mySQLOMDB.setPlot(omdb.getPlot());
        mySQLOMDB.setLanguage(omdb.getLanguage());
        mySQLOMDB.setCountry(omdb.getCountry());
        mySQLOMDB.setAwards(omdb.getAwards());
        mySQLOMDB.setPoster(omdb.getPoster());
        mySQLOMDB.setMetascore(omdb.getMetascore());
        mySQLOMDB.setImdbRating(omdb.getImdbRating());
        mySQLOMDB.setImdbVotes(omdb.getImdbVotes());
        mySQLOMDB.setImdbID(omdb.getImdbID());
        mySQLOMDB.setType(omdb.getType());

        return mySQLOMDB;
    }

    public static MySQLTVDBSeries convertTVDBSeries_To_MySQLTVDBSeries(TVDBSeries tvdbSeries){
        MySQLTVDBSeries mySQLTVDBSeries = new MySQLTVDBSeries();

        mySQLTVDBSeries.setActors(tvdbSeries.getActors());
        mySQLTVDBSeries.setAirsDayOfWeek(tvdbSeries.getAirsDayOfWeek());
        mySQLTVDBSeries.setAirsTime(tvdbSeries.getAirsTime());
        mySQLTVDBSeries.setContentRating(tvdbSeries.getContentRating());
        mySQLTVDBSeries.setFirstAired(tvdbSeries.getFirstAired());
        mySQLTVDBSeries.setGenre(tvdbSeries.getGenre());
        mySQLTVDBSeries.setImdbId(tvdbSeries.getImdbId());
        mySQLTVDBSeries.setLanguage(tvdbSeries.getLanguage());
        mySQLTVDBSeries.setNetwork(tvdbSeries.getNetwork());
        mySQLTVDBSeries.setNetworkId(tvdbSeries.getNetworkId());
        mySQLTVDBSeries.setOverview(tvdbSeries.getOverview());
        mySQLTVDBSeries.setRating(tvdbSeries.getRating());
        mySQLTVDBSeries.setRatingCount(tvdbSeries.getRatingCount());
        mySQLTVDBSeries.setRuntime(tvdbSeries.getRuntime());
        mySQLTVDBSeries.setSeriesId(tvdbSeries.getSeriesId());
        mySQLTVDBSeries.setSeriesName(tvdbSeries.getSeriesName());
        mySQLTVDBSeries.setStatus(tvdbSeries.getStatus());
        mySQLTVDBSeries.setAdded(tvdbSeries.getAdded());
        mySQLTVDBSeries.setAddedBy(tvdbSeries.getAddedBy());
        mySQLTVDBSeries.setBanner(tvdbSeries.getBanner());
        mySQLTVDBSeries.setFanart(tvdbSeries.getFanart());
        mySQLTVDBSeries.setLastUpdated(tvdbSeries.getLastUpdated());
        mySQLTVDBSeries.setPoster(tvdbSeries.getPoster());
        mySQLTVDBSeries.setZap2itId(tvdbSeries.getZap2itId());

        return mySQLTVDBSeries;
    }
}
