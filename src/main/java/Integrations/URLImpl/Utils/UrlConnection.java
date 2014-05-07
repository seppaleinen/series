package Integrations.URLImpl.Utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlConnection {
    protected InputStream getInputStream(String address){
        InputStream inputStream = null;
        try {
            URL url = new URL(address);
            inputStream = getInputStream(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return inputStream;
    }

    private InputStream getInputStream(URL url){
        InputStream inputStream = null;
        try {
            inputStream = url.openStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputStream;
    }

}
