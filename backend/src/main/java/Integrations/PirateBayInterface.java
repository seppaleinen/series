package integrations;

import java.io.InputStream;

public interface PirateBayInterface {
    public InputStream getTorrentInfo(String torrentName);

}
