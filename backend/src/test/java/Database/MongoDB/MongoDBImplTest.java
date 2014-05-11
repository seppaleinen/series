package Database.MongoDB;

import Objects.*;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import de.bwaldvogel.mongo.MongoServer;
import de.bwaldvogel.mongo.backend.memory.MemoryBackend;
import org.junit.Before;
import org.junit.Test;

import java.net.InetSocketAddress;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MongoDBImplTest {
    private MongoDBImpl dbInterface;

    @Before
    public void setup(){
        dbInterface = new MongoDBImpl();
        MongoServer server = new MongoServer(new MemoryBackend());
        InetSocketAddress serverAddress = server.bind();
        MongoClient client = new MongoClient(new ServerAddress(serverAddress));
        dbInterface.setMongoClient(client);
    }

    @Test
    public void testSaveAndFindOMDB(){
        OMDB omdb = ObjectCreater.createOMDB();

        dbInterface.saveOMDB(omdb);

        OMDB foundOmdb = dbInterface.getOMDB(omdb.getImdbID());
        assertEquals("Objects should be equals", omdb, foundOmdb);
    }

    @Test
    public void testSaveAndFindTVDBEpisode(){
        TVDBEpisode tvdbEpisode = ObjectCreater.createTVDBEpisode();

        dbInterface.saveTVDBEpisode(tvdbEpisode);

        TVDBEpisode foundTVDBEpisode = dbInterface.getTVDBEpisode(tvdbEpisode.getId());
        assertEquals("Objects should be equals", tvdbEpisode, foundTVDBEpisode);
    }

    @Test
    public void testSaveAndFindTVDBIMDB(){
        TVDBIMDB tvdbimdb = ObjectCreater.createTVDBIMDB();

        dbInterface.saveTVDBIMDB(tvdbimdb);

        TVDBIMDB foundTVDBIMDB = dbInterface.getTVDBIMDB(tvdbimdb.getImdbId());
        assertEquals("Objects should be equals", tvdbimdb, foundTVDBIMDB);
    }

    @Test
    public void testSaveAndFindTVDBSeries(){
        TVDBSeries tvdbSeries = ObjectCreater.createTVDBSeries();

        dbInterface.saveTVDBSeries(tvdbSeries);

        TVDBSeries foundTVDBSeries = dbInterface.getTVDBSeries(tvdbSeries.getSeriesId());
        assertEquals("Objects should be equals", tvdbSeries, foundTVDBSeries);
    }

    @Test
    public void testSaveAndFindTVDBUpdate(){
        TVDBUpdate tvdbUpdate = ObjectCreater.createTVDBUpdate();

        dbInterface.saveTVDBUpdate(tvdbUpdate);

        TVDBUpdate foundTVDBUpdate = dbInterface.getTVDBUpdate();
        assertEquals("Objects should be equals", tvdbUpdate, foundTVDBUpdate);
    }
}
