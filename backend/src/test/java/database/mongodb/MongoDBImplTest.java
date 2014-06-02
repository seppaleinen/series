package database.mongodb;

import objects.*;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import de.bwaldvogel.mongo.MongoServer;
import de.bwaldvogel.mongo.backend.memory.MemoryBackend;
import org.junit.Before;
import org.junit.Ignore;
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

    @Ignore
    @Test
    public void testSaveAndFindTVDBEpisode(){
        TVDBEpisode tvdbEpisode = ObjectCreater.createTVDBEpisode();

        dbInterface.saveTVDBEpisode(tvdbEpisode);

        TVDBEpisode foundTVDBEpisode = dbInterface.getTVDBEpisode(tvdbEpisode.getId());
        assertEquals("objects should be equals", tvdbEpisode, foundTVDBEpisode);
    }

    @Ignore
    @Test
    public void testSaveAndFindTVDBSeries(){
        TVDBSeries tvdbSeries = ObjectCreater.createTVDBSeries();

        dbInterface.saveTVDBSeries(tvdbSeries);

        TVDBSeries foundTVDBSeries = dbInterface.getTVDBSeries(tvdbSeries.getSeriesId());
        assertEquals("objects should be equals", tvdbSeries, foundTVDBSeries);
    }

    @Ignore
    @Test
    public void testSaveAndFindTVDBUpdate(){
        TVDBUpdate tvdbUpdate = ObjectCreater.createTVDBUpdate();

        dbInterface.saveTVDBUpdate(tvdbUpdate);

        TVDBUpdate foundTVDBUpdate = dbInterface.getTVDBUpdate();
        assertEquals("objects should be equals", tvdbUpdate, foundTVDBUpdate);
    }
}
