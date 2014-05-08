package Integrations.URLImpl;

import Integrations.OMDBInterface;
import Integrations.URLImpl.Utils.UrlConnection;

import java.io.InputStream;

public class OMDBImpl extends UrlConnection implements OMDBInterface {
    public InputStream getOmdbInfo(String title){
        String omdbUrl = getOmdbUrl(title);
        return getInputStream(omdbUrl);
    }

    private String getOmdbUrl(String title){
        String formattedTitle = title.replace(" ", "+");
        return OMDB_URL.replace("#", formattedTitle);
    }
}
