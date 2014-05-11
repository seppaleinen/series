package Database.MongoDB;

import Database.DBInterface;
import Database.MongoDB.Dao.*;
import Database.MongoDB.Entities.*;
import Database.MongoDB.Utils.MongoToObject;
import Database.MongoDB.Utils.ObjectToMongo;
import Objects.*;
import Objects.Constants.OMDBConstants;
import Objects.Constants.TVDBEpisodeConstants;
import Objects.Constants.TVDBUpdateConstants;
import com.mongodb.*;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import java.net.UnknownHostException;

public class MongoDBImpl implements DBInterface {
    private MongoClient mongoClient;
    private Morphia morphia;

    private static final String ADDRESS = "localhost";
    private static final int PORT = 27017;
    private static final String DATABASE = "MONGODB";

    public MongoDBImpl(){
        mongoClient = getMongoClient();
        morphia = new Morphia();
    }

    @Override
    public TVDBIMDB getTVDBIMDB(String imdbId) {
        TVDBIMDBMorphiaDao tvdbimdbMorphiaDao = new TVDBIMDBMorphiaDao(mongoClient, morphia, DATABASE);

        MongoTVDBIMDB mongoTVDBIMDB = tvdbimdbMorphiaDao.findOne(MongoTVDBIMDB.IMDBID_KEY, imdbId);

        return MongoToObject.convertMongoTVDBIMDB_To_TVDBIMDB(mongoTVDBIMDB);
    }

    @Override
    public TVDBEpisode getTVDBEpisode(String episodeId) {
        TVDBEpisodeMorphiaDao tvdbEpisodeMorphiaDao = new TVDBEpisodeMorphiaDao(mongoClient, morphia, DATABASE);

        MongoTVDBEpisode mongoTVDBEpisode = tvdbEpisodeMorphiaDao.findOne(MongoTVDBEpisode.ID_KEY, episodeId);

        return MongoToObject.convertMongoTVDBEpisode_To_TVDBEpisode(mongoTVDBEpisode);
    }

    @Override
    public TVDBSeries getTVDBSeries(String seriesId) {
        TVDBSeriesMorphiaDao tvdbSeriesMorphiaDao = new TVDBSeriesMorphiaDao(mongoClient, morphia, DATABASE);

        MongoTVDBSeries mongoTVDBSeries = tvdbSeriesMorphiaDao.findOne(MongoTVDBSeries.SERIESID_KEY, seriesId);

        return MongoToObject.convertMongoTVDBSeries_To_TVDBSeries(mongoTVDBSeries);
    }

    @Override
    public TVDBUpdate getTVDBUpdate() {
        TVDBUpdateMorphiaDao tvdbUpdateMorphiaDao = new TVDBUpdateMorphiaDao(mongoClient, morphia, DATABASE);

        MongoTVDBUpdate mongoTVDBUpdate = tvdbUpdateMorphiaDao.findOne(MongoTVDBUpdate.TIME_KEY, "TIME");

        return MongoToObject.convertMongoTVDBUpdate_To_TVDBUpdate(mongoTVDBUpdate);
    }

    @Override
    public OMDB getOMDB(String IMDBId) {
        OMDBMorphiaDao omdbMorphiaDao = new OMDBMorphiaDao(mongoClient, morphia, DATABASE);

        MongoOMDB mongoOMDB = omdbMorphiaDao.findOne(MongoOMDB.IMDB_KEY, IMDBId);

        return MongoToObject.convertMongoOMDB_To_OMDB(mongoOMDB);
    }

    @Override
    public void saveTVDBIMDB(TVDBIMDB tvdbimdb) {
        MongoTVDBIMDB mongoTVDBIMDB = ObjectToMongo.convertTVDBIMDB_To_MongoTVDBIMDB(tvdbimdb);

        TVDBIMDBMorphiaDao tvdbimdbMorphiaDao = new TVDBIMDBMorphiaDao(mongoClient, morphia, DATABASE);

        tvdbimdbMorphiaDao.save(mongoTVDBIMDB);
    }

    @Override
    public void saveTVDBEpisode(TVDBEpisode tvdbEpisode) {
        MongoTVDBEpisode mongoTVDBEpisode = ObjectToMongo.convertTVDBEpisode_To_MongoTVDBEpisode(tvdbEpisode);

        TVDBEpisodeMorphiaDao tvdbEpisodeMorphiaDao = new TVDBEpisodeMorphiaDao(mongoClient, morphia, DATABASE);

        tvdbEpisodeMorphiaDao.save(mongoTVDBEpisode);
    }

    @Override
    public void saveTVDBSeries(TVDBSeries tvdbSeries) {
        MongoTVDBSeries mongoTVDBSeries = ObjectToMongo.convertTVDBSeries_To_MongoTVDBSeries(tvdbSeries);

        TVDBSeriesMorphiaDao tvdbSeriesMorphiaDao = new TVDBSeriesMorphiaDao(mongoClient, morphia, DATABASE);

        tvdbSeriesMorphiaDao.save(mongoTVDBSeries);
    }

    @Override
    public void saveTVDBUpdate(TVDBUpdate tvdbUpdate) {
        MongoTVDBUpdate mongoTVDBUpdate = ObjectToMongo.convertTVDBUpdate_To_MongoTVDBUpdate(tvdbUpdate);

        TVDBUpdateMorphiaDao tvdbUpdateMorphiaDao = new TVDBUpdateMorphiaDao(mongoClient, morphia, DATABASE);

        tvdbUpdateMorphiaDao.save(mongoTVDBUpdate);
    }

    @Override
    public void saveOMDB(OMDB omdb) {
        MongoOMDB mongoOMDB = ObjectToMongo.convertOMDB_To_MongoOMDB(omdb);

        OMDBMorphiaDao omdbMorphiaDao = new OMDBMorphiaDao(mongoClient, morphia, DATABASE);

        omdbMorphiaDao.save(mongoOMDB);
    }

    private MongoClient getMongoClient(){
        MongoClient client = null;
        if(mongoClient==null){
            try {
                client = new MongoClient(ADDRESS, PORT);
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
        }
        else{
            client = mongoClient;
        }
        return client;
    }

    protected void setMongoClient(MongoClient mongoClient){
        this.mongoClient = mongoClient;
    }
}
