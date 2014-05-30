package database.mongodb.dao;

import database.mongodb.entities.MongoTVDBEpisode;
import com.mongodb.Mongo;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

public class TVDBEpisodeMorphiaDao extends BasicDAO<MongoTVDBEpisode, String> {
    public TVDBEpisodeMorphiaDao(Mongo mongo, Morphia morphia, String DB){
        super(mongo, morphia, DB);
    }
}
