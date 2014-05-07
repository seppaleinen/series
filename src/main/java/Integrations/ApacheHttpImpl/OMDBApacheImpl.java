package Integrations.ApacheHttpImpl;

import Integrations.ApacheHttpImpl.ApacheUtils.ApacheHelper;
import Integrations.OMDBInterface;
import java.io.InputStream;

public class OMDBApacheImpl implements OMDBInterface {
    @Override
    public InputStream getOmdbInfo(String title) {
        String OMDBUrl = getOmdbUrl(title);
        return ApacheHelper.getInputStream(OMDBUrl);
    }

    @Override
    public String getOmdbUrl(String title) {
        return OMDB_URL.replace("#", title);
    }
}
