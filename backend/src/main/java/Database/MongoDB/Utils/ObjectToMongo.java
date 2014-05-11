package Database.MongoDB.Utils;

import Database.MongoDB.Entities.MongoOMDB;
import Database.MongoDB.Entities.MongoTVDBEpisode;
import Objects.OMDB;
import Objects.TVDBEpisode;

public class ObjectToMongo {
    public static MongoOMDB convertOMDB_To_MongoOMDB(OMDB omdb) {
        MongoOMDB mongoOMDB = new MongoOMDB();

        mongoOMDB.setTitle(omdb.getTitle());
        mongoOMDB.setYear(omdb.getYear());
        mongoOMDB.setRated(omdb.getRated());
        mongoOMDB.setReleased(omdb.getReleased());
        mongoOMDB.setRuntime(omdb.getRuntime());
        mongoOMDB.setGenre(omdb.getGenre());
        mongoOMDB.setDirector(omdb.getDirector());
        mongoOMDB.setWriter(omdb.getWriter());
        mongoOMDB.setActors(omdb.getActors());
        mongoOMDB.setPlot(omdb.getPlot());
        mongoOMDB.setLanguage(omdb.getLanguage());
        mongoOMDB.setCountry(omdb.getCountry());
        mongoOMDB.setAwards(omdb.getAwards());
        mongoOMDB.setPoster(omdb.getPoster());
        mongoOMDB.setMetascore(omdb.getMetascore());
        mongoOMDB.setImdbRating(omdb.getImdbRating());
        mongoOMDB.setImdbVotes(omdb.getImdbVotes());
        mongoOMDB.setImdbID(omdb.getImdbID());
        mongoOMDB.setType(omdb.getType());

        return mongoOMDB;
    }

    public static MongoTVDBEpisode convertTVDBEpisode_To_MongoTVDBEpisode(TVDBEpisode tvdbEpisode) {
        MongoTVDBEpisode mongoTVDBEpisode = new MongoTVDBEpisode();

        mongoTVDBEpisode.setEpisodeId(tvdbEpisode.getId());
        mongoTVDBEpisode.setSeasonid(tvdbEpisode.getSeasonid());
        mongoTVDBEpisode.setEpisodeNumber(tvdbEpisode.getEpisodeNumber());
        mongoTVDBEpisode.setEpisodeName(tvdbEpisode.getEpisodeName());
        mongoTVDBEpisode.setFirstAired(tvdbEpisode.getFirstAired());
        mongoTVDBEpisode.setGuestStars(tvdbEpisode.getGuestStars());
        mongoTVDBEpisode.setDirector(tvdbEpisode.getDirector());
        mongoTVDBEpisode.setWriter(tvdbEpisode.getWriter());
        mongoTVDBEpisode.setOverview(tvdbEpisode.getOverview());
        mongoTVDBEpisode.setProductionCode(tvdbEpisode.getProductionCode());
        mongoTVDBEpisode.setLastUpdated(tvdbEpisode.getLastUpdated());
        mongoTVDBEpisode.setFlagged(tvdbEpisode.getFlagged());
        mongoTVDBEpisode.setDvdDiscId(tvdbEpisode.getDvdDiscId());
        mongoTVDBEpisode.setDvdSeason(tvdbEpisode.getDvdSeason());
        mongoTVDBEpisode.setDvdEpisodeNumber(tvdbEpisode.getDvdEpisodeNumber());
        mongoTVDBEpisode.setDvdChapter(tvdbEpisode.getDvdChapter());
        mongoTVDBEpisode.setAbsoluteNumber(tvdbEpisode.getAbsoluteNumber());
        mongoTVDBEpisode.setFilename(tvdbEpisode.getFilename());
        mongoTVDBEpisode.setSeriesId(tvdbEpisode.getSeriesId());
        mongoTVDBEpisode.setThumbAdded(tvdbEpisode.getThumbAdded());
        mongoTVDBEpisode.setThumbWidth(tvdbEpisode.getThumbWidth());
        mongoTVDBEpisode.setThumbHeight(tvdbEpisode.getThumbHeight());
        mongoTVDBEpisode.setTmsExport(tvdbEpisode.getTmsExport());
        mongoTVDBEpisode.setMirrorUpdate(tvdbEpisode.getMirrorUpdate());
        mongoTVDBEpisode.setImdbId(tvdbEpisode.getImdbId());
        mongoTVDBEpisode.setEpImgFlag(tvdbEpisode.getEpImgFlag());
        mongoTVDBEpisode.setRating(tvdbEpisode.getRating());
        mongoTVDBEpisode.setSeasonNumber(tvdbEpisode.getSeasonNumber());
        mongoTVDBEpisode.setLanguage(tvdbEpisode.getLanguage());

        return mongoTVDBEpisode;
    }
}