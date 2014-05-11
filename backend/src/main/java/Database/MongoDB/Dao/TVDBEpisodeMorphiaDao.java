package Database.MongoDB.Dao;

import Database.MongoDB.Entities.MongoOMDB;
import Database.MongoDB.Entities.MongoTVDBEpisode;
import com.mongodb.Mongo;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

public class TVDBEpisodeMorphiaDao extends BasicDAO<MongoTVDBEpisode, String> {
    public TVDBEpisodeMorphiaDao(Mongo mongo, Morphia morphia, String DB){
        super(mongo, morphia, DB);
    }
}
