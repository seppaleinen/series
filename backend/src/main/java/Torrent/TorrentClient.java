package torrent;

import jBittorrentAPI.*;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;

public class TorrentClient {
    private final String FILEPATH = this.getClass().getResource("/Torrent/").getPath();

    public TorrentClient(){}

    public void torrent(){
        TorrentProcessor torrentProcessor = new TorrentProcessor();

        Map file = torrentProcessor.parseTorrent(FILEPATH + "/example.torrent");

        TorrentFile torrentFile = torrentProcessor.getTorrentFile(file);

        Constants.SAVEPATH = FILEPATH;

        if(torrentFile != null){
            byte[] id = Utils.generateID();
            DownloadManager downloadManager = new DownloadManager(torrentFile, id);

            downloadManager.startListening(6881, 6889);
            downloadManager.startTrackerUpdate();
            downloadManager.stopTrackerUpdate();
            downloadManager.closeTempFiles();
        }
    }

    public void saveURL(String urlPath){
        try {
            URL url = new URL(urlPath);

            InputStream inputStream = url.openStream();

            IOManager.saveFromURL(inputStream, FILEPATH + "/example.jpop");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
