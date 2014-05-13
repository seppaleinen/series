package Database.MySQL.Utils;

import Database.MySQL.Entities.MySQLOMDB;
import Database.MySQL.Entities.MySQLTVDBIMDB;
import Database.MySQL.Entities.MySQLTVDBSeries;
import Objects.OMDB;
import Objects.TVDBIMDB;
import Objects.TVDBSeries;

public class JPAToObject {
    public static TVDBIMDB convertMySQLTVDBIMDB_To_TVDBIMDB(MySQLTVDBIMDB mySQLTVDBIMDB){
        TVDBIMDB tvdbimdb = null;

        if(mySQLTVDBIMDB != null) {
            tvdbimdb = new TVDBIMDB();

            tvdbimdb.setSeriesId(mySQLTVDBIMDB.getSeriesId());
            tvdbimdb.setLanguage(mySQLTVDBIMDB.getLanguage());
            tvdbimdb.setSeriesName(mySQLTVDBIMDB.getSeriesName());
            tvdbimdb.setBanner(mySQLTVDBIMDB.getBanner());
            tvdbimdb.setOverview(mySQLTVDBIMDB.getOverview());
            tvdbimdb.setFirstAired(mySQLTVDBIMDB.getFirstAired());
            tvdbimdb.setImdbId(mySQLTVDBIMDB.getImdbId());
            tvdbimdb.setId(mySQLTVDBIMDB.getId());
        }

        return tvdbimdb;
    }

    public static OMDB convertMySQLOMDB_To_OMDB(MySQLOMDB mySQLOMDB) {
        OMDB omdb = null;

        if(mySQLOMDB != null) {
            omdb = new OMDB();

            omdb.setTitle(mySQLOMDB.getTitle());
            omdb.setYear(mySQLOMDB.getYear());
            omdb.setRated(mySQLOMDB.getRated());
            omdb.setReleased(mySQLOMDB.getReleased());
            omdb.setRuntime(mySQLOMDB.getRuntime());
            omdb.setGenre(mySQLOMDB.getGenre());
            omdb.setDirector(mySQLOMDB.getDirector());
            omdb.setWriter(mySQLOMDB.getWriter());
            omdb.setActors(mySQLOMDB.getActors());
            omdb.setPlot(mySQLOMDB.getPlot());
            omdb.setLanguage(mySQLOMDB.getLanguage());
            omdb.setCountry(mySQLOMDB.getCountry());
            omdb.setAwards(mySQLOMDB.getAwards());
            omdb.setPoster(mySQLOMDB.getPoster());
            omdb.setMetascore(mySQLOMDB.getMetascore());
            omdb.setImdbRating(mySQLOMDB.getImdbRating());
            omdb.setImdbVotes(mySQLOMDB.getImdbVotes());
            omdb.setImdbID(mySQLOMDB.getImdbID());
            omdb.setType(mySQLOMDB.getType());
        }

        return omdb;
    }

    public static TVDBSeries convertMySQLTVDBSeries_To_TVDBSeries(MySQLTVDBSeries mySQLTVDBSeries){
        TVDBSeries tvdbSeries = null;
        
        if(mySQLTVDBSeries != null){
            tvdbSeries = new TVDBSeries();

            tvdbSeries.setActors(mySQLTVDBSeries.getActors());
            tvdbSeries.setAirsDayOfWeek(mySQLTVDBSeries.getAirsDayOfWeek());
            tvdbSeries.setAirsTime(mySQLTVDBSeries.getAirsTime());
            tvdbSeries.setContentRating(mySQLTVDBSeries.getContentRating());
            tvdbSeries.setFirstAired(mySQLTVDBSeries.getFirstAired());
            tvdbSeries.setGenre(mySQLTVDBSeries.getGenre());
            tvdbSeries.setImdbId(mySQLTVDBSeries.getImdbId());
            tvdbSeries.setLanguage(mySQLTVDBSeries.getLanguage());
            tvdbSeries.setNetwork(mySQLTVDBSeries.getNetwork());
            tvdbSeries.setNetworkId(mySQLTVDBSeries.getNetworkId());
            tvdbSeries.setOverview(mySQLTVDBSeries.getOverview());
            tvdbSeries.setRating(mySQLTVDBSeries.getRating());
            tvdbSeries.setRatingCount(mySQLTVDBSeries.getRatingCount());
            tvdbSeries.setRuntime(mySQLTVDBSeries.getRuntime());
            tvdbSeries.setSeriesId(mySQLTVDBSeries.getSeriesId());
            tvdbSeries.setSeriesName(mySQLTVDBSeries.getSeriesName());
            tvdbSeries.setStatus(mySQLTVDBSeries.getStatus());
            tvdbSeries.setAdded(mySQLTVDBSeries.getAdded());
            tvdbSeries.setAddedBy(mySQLTVDBSeries.getAddedBy());
            tvdbSeries.setBanner(mySQLTVDBSeries.getBanner());
            tvdbSeries.setFanart(mySQLTVDBSeries.getFanart());
            tvdbSeries.setLastUpdated(mySQLTVDBSeries.getLastUpdated());
            tvdbSeries.setPoster(mySQLTVDBSeries.getPoster());
            tvdbSeries.setZap2itId(mySQLTVDBSeries.getZap2itId());
        }

        return tvdbSeries;
    }
}