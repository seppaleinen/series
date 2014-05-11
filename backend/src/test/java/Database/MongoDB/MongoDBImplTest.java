package Database.MongoDB;

import Objects.OMDB;
import Objects.TVDBEpisode;
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
    public void testSaveOMDB(){
        OMDB omdb = new OMDB();

        omdb.setImdbID("IMDBID");
        omdb.setTitle("TITLE");
        omdb.setType("TYPE");
        omdb.setGenre("GENRE");

        dbInterface.saveOMDB(omdb);
    }

    @Test
    public void testSaveAndFindOMDB(){
        OMDB omdb = new OMDB();

        omdb.setImdbID("IMDBID");
        omdb.setTitle("TITLE");
        omdb.setType("TYPE");
        omdb.setGenre("GENRE");

        dbInterface.saveOMDB(omdb);

        OMDB foundOmdb = dbInterface.getOMDB("IMDBID");
        assertNotNull(foundOmdb);
        assertEquals("Title should be the same", omdb.getTitle(), foundOmdb.getTitle());
    }

    @Test
    public void testSaveTVDBEpisode(){
        TVDBEpisode tvdbEpisode = new TVDBEpisode();

        tvdbEpisode.setId("EPISODEID");
        tvdbEpisode.setLanguage("LANGUAGE");
        tvdbEpisode.setImdbId("IMDBID");
        tvdbEpisode.setEpisodeName("EPISODENAME");

        dbInterface.saveTVDBEpisode(tvdbEpisode);
    }

    @Test
    public void testSaveAndFindTVDBEpisode(){
        TVDBEpisode tvdbEpisode = new TVDBEpisode();

        tvdbEpisode.setId("EPISODEID");
        tvdbEpisode.setLanguage("LANGUAGE");
        tvdbEpisode.setImdbId("IMDBID");
        tvdbEpisode.setEpisodeName("EPISODENAME");

        dbInterface.saveTVDBEpisode(tvdbEpisode);

        TVDBEpisode foundTVDBEpisode = dbInterface.getTVDBEpisode("EPISODEID");
        assertNotNull("TVDBEpisode should not be null", foundTVDBEpisode);
        assertEquals("EpisodeName should be the same", tvdbEpisode.getEpisodeName(), foundTVDBEpisode.getEpisodeName());
    }

}
