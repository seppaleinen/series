package integrations.urlimpl;

import org.jsoup.nodes.Document;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TorrentLeechCrawlerTest {
    private static final String TORRENT_LEECH_URL = "http://www.torrentleech.org/";
    private TorrentLeechCrawler crawler;

    @Before
    public void setup(){
        crawler = new TorrentLeechCrawler();
    }

    @Test
    public void testGetDocument(){
        Document document = crawler.getDocumentFromURL(TORRENT_LEECH_URL);
        assertNotNull("Document should not be null", document);
    }

    @Ignore
    @Test
    public void testTorrentLeechLogin(){
        String username = "";
        String password = "";
        boolean loggedIn = crawler.login(username, password);
        assertTrue("loggedIn should be true", loggedIn);
    }
}
