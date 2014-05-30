package torrent;

import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.GZIPInputStream;

import static org.junit.Assert.assertEquals;

public class TorrentClientTest {
    private TorrentClient torrentClient;
    private static final String MAGNET_URL = "magnet:?xt=urn:btih:6ac27f86a202bce774eef80eb49e3abfb7aeb62f&dn=Proxima+Nova+Fonts+Collection&tr=udp%3A%2F%2Ftracker.openbittorrent.com%3A80&tr=udp%3A%2F%2Ftracker.publicbt.com%3A80&tr=udp%3A%2F%2Ftracker.istole.it%3A6969&tr=udp%3A%2F%2Fopen.demonii.com%3A1337";
    private static final String URL = "http://torcache.net/torrent/61D264DFDA29C932CBE0C530B61200DEF8321FD7/[kickass.to]acca.p1.gtg.pdf.2012.txt.torrent";

    @Before
    public void setup(){
        torrentClient = new TorrentClient();
    }

    @Test
    public void testSaveURL(){
        String expectedFilename = "[kickass.to]acca.p1.gtg.pdf.2012.txt.torrent";
        String filename = torrentClient.saveURL(URL);
        assertEquals("Filename should be equal to expected", expectedFilename, filename);
    }

    @Test
    public void testDownloadTorrent(){
        String expectedFilename = "[kickass.to]acca.p1.gtg.pdf.2012.txt.torrent";
        String filename = torrentClient.saveURL(URL);
        assertEquals("Filename should be equal to expected", expectedFilename, filename);
        torrentClient.torrent(filename);
    }
}
