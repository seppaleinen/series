package Database.MongoDB.Dao;

import Database.MongoDB.Entities.MongoTVDBUpdate;
import com.mongodb.Mongo;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

public class TVDBUpdateMorphiaDao extends BasicDAO<MongoTVDBUpdate, String> {
    public TVDBUpdateMorphiaDao(Mongo mongo, Morphia morphia, String DB){
        super(mongo, morphia, DB);
    }
}
