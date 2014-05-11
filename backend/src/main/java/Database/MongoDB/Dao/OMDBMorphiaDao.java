package Database.MongoDB.Dao;

import Database.MongoDB.Entities.MongoOMDB;
import com.mongodb.Mongo;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

public class OMDBMorphiaDao extends BasicDAO<MongoOMDB, String> {
    public OMDBMorphiaDao(Mongo mongo, Morphia morphia, String DB){
        super(mongo, morphia, DB);
    }
}
