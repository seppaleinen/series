package Database.MongoDB;

import Database.DBInterface;
import Database.MongoDB.Dao.OMDBMorphiaDao;
import Database.MongoDB.Dao.TVDBEpisodeMorphiaDao;
import Database.MongoDB.Entities.MongoOMDB;
import Database.MongoDB.Entities.MongoTVDBEpisode;
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

    private static final String TVDBUPDATE_KEY = "TVDBUPDATE";
    private static final String TVDBSERIES_KEY = "TVDBSERIES";
    private static final String TVDBEPISODE_KEY = "TVDBEPISODE";
    private static final String TVDBIMDB_KEY = "TVDBIMDB";
    private static final String OMDB_KEY = "OMDB";

    public MongoDBImpl(){
        mongoClient = getMongoClient();
        morphia = new Morphia();
    }

    @Override
    public TVDBIMDB getTVDBIMDB(String imdbId) {
        return null;
    }

    @Override
    public TVDBEpisode getTVDBEpisode(String episodeId) {
        TVDBEpisodeMorphiaDao tvdbEpisodeMorphiaDao = new TVDBEpisodeMorphiaDao(mongoClient, morphia, DATABASE);

        MongoTVDBEpisode mongoTVDBEpisode = tvdbEpisodeMorphiaDao.findOne("episodeId", episodeId);

        return MongoToObject.convertMongoTVDBEpisode_To_TVDBEpisode(mongoTVDBEpisode);
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
        OMDBMorphiaDao omdbMorphiaDao = new OMDBMorphiaDao(mongoClient, morphia, DATABASE);

        MongoOMDB mongoOMDB = omdbMorphiaDao.findOne(OMDBConstants.IMDB_ID, IMDBId);

        return MongoToObject.convertMongoOMDB_To_OMDB(mongoOMDB);
    }

    @Override
    public void saveTVDBIMDB(TVDBIMDB tvdbimdb) {
        //saveObject(tvdbimdb, DATABASE);
    }

    @Override
    public void saveTVDBEpisode(TVDBEpisode tvdbEpisode) {
        MongoTVDBEpisode mongoTVDBEpisode = ObjectToMongo.convertTVDBEpisode_To_MongoTVDBEpisode(tvdbEpisode);

        TVDBEpisodeMorphiaDao tvdbEpisodeMorphiaDao = new TVDBEpisodeMorphiaDao(mongoClient, morphia, DATABASE);

        tvdbEpisodeMorphiaDao.save(mongoTVDBEpisode);
    }

    @Override
    public void saveTVDBSeries(TVDBSeries tvdbSeries) {

        //saveObject(tvdbSeries, DATABASE);
    }

    @Override
    public void saveTVDBUpdate(TVDBUpdate tvdbUpdate) {

        //saveObject(tvdbUpdate, DATABASE);
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
