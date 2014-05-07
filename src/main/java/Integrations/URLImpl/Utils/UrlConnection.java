package Integrations.URLImpl.Utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlConnection {
    protected URL createUrl(String omdbUrl){
        URL url = null;
        try {
            url = new URL(omdbUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }

    protected InputStream getInputStream(URL url){
        InputStream inputStream = null;
        try {
            inputStream = url.openStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputStream;
    }

}
