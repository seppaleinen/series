/*package Integrations.ApacheHttpImpl.Utils;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.IOException;
import java.io.InputStream;

public class ApacheHelper {
    public InputStream getInputStream(String url){
        DefaultHttpClient httpClient = new DefaultHttpClient();

        HttpGet httpGet = new HttpGet(url);

        return getInputStream(httpClient, httpGet);
    }

    private InputStream getInputStream(DefaultHttpClient httpClient, HttpGet httpRequest){
        InputStream inputStream = null;
        try {
            HttpResponse httpResponse = httpClient.execute(httpRequest);
            if (httpResponse.getStatusLine().getStatusCode() != 200){
                return null;
            }
            inputStream = httpResponse.getEntity().getContent();
        } catch (IOException e) {
            e.printStackTrace();
        }
        httpClient.getConnectionManager().shutdown();

        return inputStream;
    }

}
*/