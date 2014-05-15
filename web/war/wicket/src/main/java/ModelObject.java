import java.io.Serializable;

public class ModelObject implements Serializable {
    private String directory;
    private String searchOMDB;
    private String OMDBTitle;
    private String tvdbIMDBText;
    private String tvdbIMDBLabel;

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getSearchOMDB() {
        return searchOMDB;
    }

    public void setSearchOMDB(String searchOMDB) {
        this.searchOMDB = searchOMDB;
    }

    public String getOMDBTitle() {
        return OMDBTitle;
    }

    public void setOMDBTitle(String OMDBTitle) {
        this.OMDBTitle = OMDBTitle;
    }

    public String getTvdbIMDBText() {
        return tvdbIMDBText;
    }

    public void setTvdbIMDBText(String tvdbIMDBText) {
        this.tvdbIMDBText = tvdbIMDBText;
    }

    public String getTvdbIMDBLabel() {
        return tvdbIMDBLabel;
    }

    public void setTvdbIMDBLabel(String tvdbIMDBLabel) {
        this.tvdbIMDBLabel = tvdbIMDBLabel;
    }
}
