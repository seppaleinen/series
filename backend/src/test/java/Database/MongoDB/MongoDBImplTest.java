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
        assertNotNull(foundOmdb);
        assertEquals("Title should be the same", omdb.getTitle(), foundOmdb.getTitle());
    }

    @Test
    public void testSaveAndFindTVDBEpisode(){
        TVDBEpisode tvdbEpisode = ObjectCreater.createTVDBEpisode();

        dbInterface.saveTVDBEpisode(tvdbEpisode);

        TVDBEpisode foundTVDBEpisode = dbInterface.getTVDBEpisode(tvdbEpisode.getId());
        assertNotNull("TVDBEpisode should not be null", foundTVDBEpisode);
        assertEquals("EpisodeName should be the same", tvdbEpisode.getEpisodeName(), foundTVDBEpisode.getEpisodeName());
    }

    @Test
    public void testSaveAndFindTVDBIMDB(){
        TVDBIMDB tvdbimdb = ObjectCreater.createTVDBIMDB();

        dbInterface.saveTVDBIMDB(tvdbimdb);

        TVDBIMDB foundTVDBIMDB = dbInterface.getTVDBIMDB(tvdbimdb.getImdbId());
        assertNotNull(foundTVDBIMDB);
        assertEquals("SeriesName should be equal", tvdbimdb.getSeriesName(), foundTVDBIMDB.getSeriesName());
    }

    @Test
    public void testSaveAndFindTVDBSeries(){
        TVDBSeries tvdbSeries = ObjectCreater.createTVDBSeries();

        dbInterface.saveTVDBSeries(tvdbSeries);

        TVDBSeries foundTVDBSeries = dbInterface.getTVDBSeries(tvdbSeries.getSeriesId());
        assertNotNull(foundTVDBSeries);
        assertEquals("SeriesName should be equal", tvdbSeries.getSeriesName(), foundTVDBSeries.getSeriesName());
    }

    @Test
    public void testSaveAndFindTVDBUpdate(){
        TVDBUpdate tvdbUpdate = ObjectCreater.createTVDBUpdate();

        dbInterface.saveTVDBUpdate(tvdbUpdate);

        TVDBUpdate foundTVDBUpdate = dbInterface.getTVDBUpdate();
        assertNotNull("FOUNDTVDBUPDATE should not be null", foundTVDBUpdate);
        assertEquals("Time should be equals", tvdbUpdate.getTime(), foundTVDBUpdate.getTime());
    }

}
