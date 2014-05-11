package Database.MongoDB.Utils;

import Database.MongoDB.Entities.MongoOMDB;
import Database.MongoDB.Entities.MongoTVDBEpisode;
import Objects.OMDB;
import Objects.TVDBEpisode;

public class MongoToObject {
    public static OMDB convertMongoOMDB_To_OMDB(MongoOMDB mongoOMDB){
        OMDB omdb = null;

        if(mongoOMDB!=null){
            omdb = new OMDB();

            omdb.setTitle(mongoOMDB.getTitle());
            omdb.setYear(mongoOMDB.getYear());
            omdb.setRated(mongoOMDB.getRated());
            omdb.setReleased(mongoOMDB.getReleased());
            omdb.setRuntime(mongoOMDB.getRuntime());
            omdb.setGenre(mongoOMDB.getGenre());
            omdb.setDirector(mongoOMDB.getDirector());
            omdb.setWriter(mongoOMDB.getWriter());
            omdb.setActors(mongoOMDB.getActors());
            omdb.setPlot(mongoOMDB.getPlot());
            omdb.setLanguage(mongoOMDB.getLanguage());
            omdb.setCountry(mongoOMDB.getCountry());
            omdb.setAwards(mongoOMDB.getAwards());
            omdb.setPoster(mongoOMDB.getPoster());
            omdb.setMetascore(mongoOMDB.getMetascore());
            omdb.setImdbRating(mongoOMDB.getImdbRating());
            omdb.setImdbVotes(mongoOMDB.getImdbVotes());
            omdb.setImdbID(mongoOMDB.getImdbID());
            omdb.setType(mongoOMDB.getType());
        }

        return omdb;
    }

    public static TVDBEpisode convertMongoTVDBEpisode_To_TVDBEpisode(MongoTVDBEpisode mongoTVDBEpisode){
        TVDBEpisode tvdbEpisode = null;

        if(mongoTVDBEpisode != null){
            tvdbEpisode = new TVDBEpisode();

            tvdbEpisode.setId(mongoTVDBEpisode.getEpisodeId());
            tvdbEpisode.setSeasonid(mongoTVDBEpisode.getSeasonid());
            tvdbEpisode.setEpisodeNumber(mongoTVDBEpisode.getEpisodeNumber());
            tvdbEpisode.setEpisodeName(mongoTVDBEpisode.getEpisodeName());
            tvdbEpisode.setFirstAired(mongoTVDBEpisode.getFirstAired());
            tvdbEpisode.setGuestStars(mongoTVDBEpisode.getGuestStars());
            tvdbEpisode.setDirector(mongoTVDBEpisode.getDirector());
            tvdbEpisode.setWriter(mongoTVDBEpisode.getWriter());
            tvdbEpisode.setOverview(mongoTVDBEpisode.getOverview());
            tvdbEpisode.setProductionCode(mongoTVDBEpisode.getProductionCode());
            tvdbEpisode.setLastUpdated(mongoTVDBEpisode.getLastUpdated());
            tvdbEpisode.setFlagged(mongoTVDBEpisode.getFlagged());
            tvdbEpisode.setDvdDiscId(mongoTVDBEpisode.getDvdDiscId());
            tvdbEpisode.setDvdSeason(mongoTVDBEpisode.getDvdSeason());
            tvdbEpisode.setDvdEpisodeNumber(mongoTVDBEpisode.getDvdEpisodeNumber());
            tvdbEpisode.setDvdChapter(mongoTVDBEpisode.getDvdChapter());
            tvdbEpisode.setAbsoluteNumber(mongoTVDBEpisode.getAbsoluteNumber());
            tvdbEpisode.setFilename(mongoTVDBEpisode.getFilename());
            tvdbEpisode.setSeriesId(mongoTVDBEpisode.getSeriesId());
            tvdbEpisode.setThumbAdded(mongoTVDBEpisode.getThumbAdded());
            tvdbEpisode.setThumbWidth(mongoTVDBEpisode.getThumbWidth());
            tvdbEpisode.setThumbHeight(mongoTVDBEpisode.getThumbHeight());
            tvdbEpisode.setTmsExport(mongoTVDBEpisode.getTmsExport());
            tvdbEpisode.setMirrorUpdate(mongoTVDBEpisode.getMirrorUpdate());
            tvdbEpisode.setImdbId(mongoTVDBEpisode.getImdbId());
            tvdbEpisode.setEpImgFlag(mongoTVDBEpisode.getEpImgFlag());
            tvdbEpisode.setRating(mongoTVDBEpisode.getRating());
            tvdbEpisode.setSeasonNumber(mongoTVDBEpisode.getSeasonNumber());
            tvdbEpisode.setLanguage(mongoTVDBEpisode.getLanguage());
        }

        return tvdbEpisode;
    }

    }
