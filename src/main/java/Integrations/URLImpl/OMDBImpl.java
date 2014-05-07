package Integrations.URLImpl;

import Integrations.OMDBInterface;
import Integrations.URLImpl.Utils.UrlConnection;

import java.io.InputStream;
import java.net.URL;

public class OMDBImpl extends UrlConnection implements OMDBInterface {
    public InputStream getOmdbInfo(String title){
        String omdbUrl = getOmdbUrl(title);
        URL url = createUrl(omdbUrl);
        return getInputStream(url);
    }

    public String getOmdbUrl(String title){
        return OMDB_URL.replace("#", title);
    }
}
