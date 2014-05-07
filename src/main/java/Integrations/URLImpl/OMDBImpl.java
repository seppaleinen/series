package Integrations.URLImpl;

import Integrations.OMDBInterface;
import Integrations.URLImpl.Utils.UrlConnection;

import java.io.InputStream;
import java.net.URL;

public class OMDBImpl extends UrlConnection implements OMDBInterface {
    public InputStream getOmdbInfo(String title){
        String omdbUrl = getOmdbUrl(title);
        return getInputStream(omdbUrl);
    }

    private String getOmdbUrl(String title){
        return OMDB_URL.replace("#", title);
    }
}
