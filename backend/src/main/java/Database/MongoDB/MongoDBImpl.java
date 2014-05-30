package database.mongodb;

import database.DBInterface;
import database.mongodb.dao.*;
import database.mongodb.entities.*;
import database.mongodb.utils.MongoToObject;
import database.mongodb.utils.ObjectToMongo;
import objects.*;
import com.mongodb.*;
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

    private MongoClient getMongoClient(){
        MongoClient client = null;
        if(mongoClient==null){
            try {
                client = new MongoClient(ADDRESS, PORT);
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
        } else{
            client = mongoClient;
        }
        return client;
    }

    protected void setMongoClient(MongoClient mongoClient){
        this.mongoClient = mongoClient;
    }
}
