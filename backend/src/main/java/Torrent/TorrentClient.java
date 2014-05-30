package torrent;

import jBittorrentAPI.*;
import torrent.utils.TorrentHelper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.zip.GZIPInputStream;

public class TorrentClient {
    private final String FILEPATH = this.getClass().getResource("/Torrent/").getPath();

    public TorrentClient(){}

    public void torrent(String filename){
        TorrentProcessor torrentProcessor = new TorrentProcessor();

        Map file = torrentProcessor.parseTorrent(FILEPATH + "/" + filename);

        TorrentFile torrentFile = torrentProcessor.getTorrentFile(file);

        Constants.SAVEPATH = FILEPATH;

        if(torrentFile != null){
            byte[] id = Utils.generateID();
            DownloadManager downloadManager = new DownloadManager(torrentFile, id);

            downloadManager.startListening(6881, 6889);
            //downloadManager.blockUntilCompletion();
            downloadManager.startTrackerUpdate();
            downloadManager.stopTrackerUpdate();
            downloadManager.closeTempFiles();
        }
    }

    public String saveURL(String urlPath){
        String filename = null;
        InputStream inputStream = null;
        try {
            URL url = new URL(urlPath);

            inputStream = new GZIPInputStream(url.openStream());

            filename = TorrentHelper.getFilenameFromPath(url.getFile());

            IOManager.saveFromURL(inputStream, FILEPATH + "/" + filename);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            TorrentHelper.closeStream(inputStream);
        }
        return filename;
    }
}
