package Integrations;

import java.io.BufferedReader;
import java.net.URL;

public class OmdbImpl extends UrlConnection {
    private static String OMDB_URL = "http://www.omdbapi.com/?";

    public String getOmdbInfo(String title){
        String omdbUrl = getOmdbUrl(title);
        URL url = createUrl(omdbUrl);
        BufferedReader reader = getReader(url);
        String result = readUrl(reader);
        closeReader(reader);
        return result;
    }

    private String getOmdbUrl(String title){
        String url = OMDB_URL;
        url += "t=" + title;
        url += "&r=XML";
        return url;
    }
}
