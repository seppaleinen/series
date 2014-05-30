package torrent.utils;

import java.io.IOException;
import java.io.InputStream;

public class TorrentHelper {
    private TorrentHelper(){}

    public static String getFilenameFromPath(String pathname){
        String[] splitted = pathname.split("/");
        int splittedLength = splitted.length - 1;
        return splitted[splittedLength];
    }

    public static void closeStream(InputStream inputStream){
        try {
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
