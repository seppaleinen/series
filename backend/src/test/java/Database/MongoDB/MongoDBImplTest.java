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

    @Test
    public void testSaveAndFindTVDBIMDB(){
        TVDBIMDB tvdbimdb = new TVDBIMDB();

        tvdbimdb.setId("ID");
        tvdbimdb.setImdbId("IMDBID");
        tvdbimdb.setSeriesName("SERIESNAME");
        tvdbimdb.setLanguage("LANGUAGE");

        dbInterface.saveTVDBIMDB(tvdbimdb);

        TVDBIMDB foundTVDBIMDB = dbInterface.getTVDBIMDB("IMDBID");
        assertNotNull(foundTVDBIMDB);
        assertEquals("SeriesName should be equal", tvdbimdb.getSeriesName(), foundTVDBIMDB.getSeriesName());
    }

    @Test
    public void testSaveAndFindTVDBSeries(){
        TVDBSeries tvdbSeries = new TVDBSeries();

        tvdbSeries.setImdbId("IMDBID");
        tvdbSeries.setSeriesId("SERIESID");
        tvdbSeries.setSeriesName("SERIESNAME");

        dbInterface.saveTVDBSeries(tvdbSeries);

        TVDBSeries foundTVDBSeries = dbInterface.getTVDBSeries(tvdbSeries.getSeriesId());
        assertNotNull(foundTVDBSeries);
        assertEquals("SeriesName should be equal", tvdbSeries.getSeriesName(), foundTVDBSeries.getSeriesName());
    }

    @Test
    public void testSaveAndFindTVDBUpdate(){
        TVDBUpdate tvdbUpdate = new TVDBUpdate();

        tvdbUpdate.setTime("TIME");
        tvdbUpdate.getEpisodeList().add("EPISODE");
        tvdbUpdate.getSeriesList().add("SERIES");

        dbInterface.saveTVDBUpdate(tvdbUpdate);

        TVDBUpdate foundTVDBUpdate = dbInterface.getTVDBUpdate();
        assertNotNull("FOUNDTVDBUPDATE should not be null", foundTVDBUpdate);
        assertEquals("Time should be equals", tvdbUpdate.getTime(), foundTVDBUpdate.getTime());
    }

}
