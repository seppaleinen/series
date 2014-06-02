package database.mongodb.dao;

import database.mongodb.entities.MongoTVDBSeries;
import com.mongodb.Mongo;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;

public class TVDBSeriesMorphiaDao extends BasicDAO<MongoTVDBSeries, String> {
    public TVDBSeriesMorphiaDao(Mongo mongo, Morphia morphia, String DB){
        super(mongo, morphia, DB);
    }
}
