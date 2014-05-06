package Integrations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlConnection {
    protected String readUrl(BufferedReader reader){
        String result = null;
        try {
            for (String line; (line = reader.readLine()) != null;) {
                result = line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    protected void closeReader(BufferedReader reader){
        if(reader!=null){
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    protected BufferedReader getReader(URL url){
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return reader;
    }

    protected URL createUrl(String omdbUrl){
        URL url = null;
        try {
            url = new URL(omdbUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }
}
