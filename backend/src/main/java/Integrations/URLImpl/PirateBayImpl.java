package integrations.urlimpl;

import integrations.PirateBayInterface;
import integrations.urlimpl.utils.UrlConnection;

import java.io.InputStream;

public class PirateBayImpl extends UrlConnection implements PirateBayInterface {
    private static final String API_KEY = "486a08cbced645da8f54e46da29a69c4";
    private static final String PIRATEURL = "http://apify.ifc0nfig.com/tpb/search/#?key=" + API_KEY;

    @Override
    public InputStream getTorrentInfo(String torrentName) {
        String piratebayUrl = PIRATEURL.replace("#", torrentName.replaceAll(" ", "%20"));
        return getPiratebayInfo(piratebayUrl);
    }

    private InputStream getPiratebayInfo(String piratebayUrl){
        return getInputStream(piratebayUrl);
    }
}
