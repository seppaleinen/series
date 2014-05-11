package Database.MongoDB.Dao;

import Database.MongoDB.Entities.MongoOMDB;
import Database.MongoDB.Entities.MongoTVDBIMDB;
import com.mongodb.Mongo;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

public class TVDBIMDBMorphiaDao extends BasicDAO<MongoTVDBIMDB, String> {
    public TVDBIMDBMorphiaDao(Mongo mongo, Morphia morphia, String DB){
        super(mongo, morphia, DB);
    }
}
