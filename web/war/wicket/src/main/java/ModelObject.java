import java.io.Serializable;

public class ModelObject implements Serializable {
    private String directory;
    private String omdbText;
    private String omdbLabel;
    private String tvdbIMDBText;
    private String tvdbIMDBLabel;
    private String tvdbSeriesText;
    private String tvdbSeriesLabel;
    private String tvdbEpisodeText;
    private String tvdbEpisodeLabel;
    private String tvdbUpdateText;
    private String tvdbUpdateLabel;

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getOmdbText() {
        return omdbText;
    }

    public void setOmdbText(String omdbText) {
        this.omdbText = omdbText;
    }

    public String getOmdbLabel() {
        return omdbLabel;
    }

    public void setOmdbLabel(String omdbLabel) {
        this.omdbLabel = omdbLabel;
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

    public String getTvdbSeriesText() {
        return tvdbSeriesText;
    }

    public void setTvdbSeriesText(String tvdbSeriesText) {
        this.tvdbSeriesText = tvdbSeriesText;
    }

    public String getTvdbSeriesLabel() {
        return tvdbSeriesLabel;
    }

    public void setTvdbSeriesLabel(String tvdbSeriesLabel) {
        this.tvdbSeriesLabel = tvdbSeriesLabel;
    }

    public String getTvdbEpisodeText() {
        return tvdbEpisodeText;
    }

    public void setTvdbEpisodeText(String tvdbEpisodeText) {
        this.tvdbEpisodeText = tvdbEpisodeText;
    }

    public String getTvdbEpisodeLabel() {
        return tvdbEpisodeLabel;
    }

    public void setTvdbEpisodeLabel(String tvdbEpisodeLabel) {
        this.tvdbEpisodeLabel = tvdbEpisodeLabel;
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
