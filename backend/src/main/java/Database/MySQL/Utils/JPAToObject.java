package Database.MySQL.Utils;

import Database.MySQL.Entities.*;
import Objects.*;

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
    
    public static TVDBEpisode convertMySQLTVDBEpisode_To_TVDBEpisode(MySQLTVDBEpisode mySQLTVDBEpisode){
        TVDBEpisode tvdbEpisode = null;
        
        if(mySQLTVDBEpisode != null){
            tvdbEpisode = new TVDBEpisode();

            tvdbEpisode.setId(mySQLTVDBEpisode.getId());
            tvdbEpisode.setSeasonid(mySQLTVDBEpisode.getSeasonid());
            tvdbEpisode.setEpisodeNumber(mySQLTVDBEpisode.getEpisodeNumber());
            tvdbEpisode.setEpisodeName(mySQLTVDBEpisode.getEpisodeName());
            tvdbEpisode.setFirstAired(mySQLTVDBEpisode.getFirstAired());
            tvdbEpisode.setGuestStars(mySQLTVDBEpisode.getGuestStars());
            tvdbEpisode.setDirector(mySQLTVDBEpisode.getDirector());
            tvdbEpisode.setWriter(mySQLTVDBEpisode.getWriter());
            tvdbEpisode.setOverview(mySQLTVDBEpisode.getOverview());
            tvdbEpisode.setProductionCode(mySQLTVDBEpisode.getProductionCode());
            tvdbEpisode.setLastUpdated(mySQLTVDBEpisode.getLastUpdated());
            tvdbEpisode.setFlagged(mySQLTVDBEpisode.getFlagged());
            tvdbEpisode.setDvdDiscId(mySQLTVDBEpisode.getDvdDiscId());
            tvdbEpisode.setDvdSeason(mySQLTVDBEpisode.getDvdSeason());
            tvdbEpisode.setDvdEpisodeNumber(mySQLTVDBEpisode.getDvdEpisodeNumber());
            tvdbEpisode.setDvdChapter(mySQLTVDBEpisode.getDvdChapter());
            tvdbEpisode.setAbsoluteNumber(mySQLTVDBEpisode.getAbsoluteNumber());
            tvdbEpisode.setFilename(mySQLTVDBEpisode.getFilename());
            tvdbEpisode.setSeriesId(mySQLTVDBEpisode.getSeriesId());
            tvdbEpisode.setThumbAdded(mySQLTVDBEpisode.getThumbAdded());
            tvdbEpisode.setThumbWidth(mySQLTVDBEpisode.getThumbWidth());
            tvdbEpisode.setThumbHeight(mySQLTVDBEpisode.getThumbHeight());
            tvdbEpisode.setTmsExport(mySQLTVDBEpisode.getTmsExport());
            tvdbEpisode.setMirrorUpdate(mySQLTVDBEpisode.getMirrorUpdate());
            tvdbEpisode.setImdbId(mySQLTVDBEpisode.getImdbId());
            tvdbEpisode.setEpImgFlag(mySQLTVDBEpisode.getEpImgFlag());
            tvdbEpisode.setRating(mySQLTVDBEpisode.getRating());
            tvdbEpisode.setSeasonNumber(mySQLTVDBEpisode.getSeasonNumber());
            tvdbEpisode.setLanguage(mySQLTVDBEpisode.getLanguage());
        }
        
        return tvdbEpisode;
    }

    public static TVDBUpdate convertMySQLTVDBUpdate_To_TVDBUpdate(MySQLTVDBUpdate mySQLTVDBUpdate){
        TVDBUpdate tvdbUpdate = null;

        if(mySQLTVDBUpdate != null){
            tvdbUpdate = new TVDBUpdate();

            tvdbUpdate.setTime(mySQLTVDBUpdate.getTime());
        }

        return tvdbUpdate;
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