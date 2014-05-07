package Integrations;

import java.io.InputStream;

public interface OMDBInterface {
    public static String OMDB_URL = "http://www.omdbapi.com/?t=#&r=XML";
    public InputStream getOmdbInfo(String title);
    public String getOmdbUrl(String title);
}
