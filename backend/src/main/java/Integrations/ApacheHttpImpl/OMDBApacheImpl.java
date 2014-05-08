/*package Integrations.ApacheHttpImpl;

import Integrations.ApacheHttpImpl.Utils.ApacheHelper;
import Integrations.OMDBInterface;
import java.io.InputStream;

public class OMDBApacheImpl extends ApacheHelper implements OMDBInterface {
    @Override
    public InputStream getOmdbInfo(String title) {
        String OMDBUrl = getOmdbUrl(title);
        return getInputStream(OMDBUrl);
    }

    private String getOmdbUrl(String title) {
        return OMDB_URL.replace("#", title);
    }
}
*/