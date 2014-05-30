package torrent;

import org.junit.Before;
import org.junit.Test;

public class TorrentClientTest {
    private TorrentClient torrentClient;
    private static final String URL = "http://torcache.net/torrent/61D264DFDA29C932CBE0C530B61200DEF8321FD7/[kickass.to]acca.p1.gtg.pdf.2012.txt.torrent";

    @Before
    public void setup(){
        torrentClient = new TorrentClient();
    }

    @Test
    public void testDownloadTorrent(){
        torrentClient.torrent();
    }

    @Test
    public void testSaveURL(){
        torrentClient.saveURL(URL);
    }
}
