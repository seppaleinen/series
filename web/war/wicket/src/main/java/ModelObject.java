import java.io.Serializable;

public class ModelObject implements Serializable {
    private String directory;
    private String tvdbUpdateText;
    private String tvdbUpdateLabel;

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getTvdbUpdateText() {
        return tvdbUpdateText;
    }

    public void setTvdbUpdateText(String tvdbUpdateText) {
        this.tvdbUpdateText = tvdbUpdateText;
    }

    public String getTvdbUpdateLabel() {
        return tvdbUpdateLabel;
    }

    public void setTvdbUpdateLabel(String tvdbUpdateLabel) {
        this.tvdbUpdateLabel = tvdbUpdateLabel;
    }
}
