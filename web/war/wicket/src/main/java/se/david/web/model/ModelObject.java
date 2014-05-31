package se.david.web.model;

import java.io.Serializable;

public class ModelObject implements Serializable {
    private String directory;
    private String tvdbUpdateText;
    private String tvdbUpdateLabel;
    private String tvdbSeriesAllText;
    private String tvdbSeriesAllLabel;
    private String tvdbSeriesByNameText;
    private String tvdbSeriesByNameLabel;

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

    public String getTvdbSeriesAllText() {
        return tvdbSeriesAllText;
    }

    public void setTvdbSeriesAllText(String tvdbSeriesAllText) {
        this.tvdbSeriesAllText = tvdbSeriesAllText;
    }

    public String getTvdbSeriesAllLabel() {
        return tvdbSeriesAllLabel;
    }

    public void setTvdbSeriesAllLabel(String tvdbSeriesAllLabel) {
        this.tvdbSeriesAllLabel = tvdbSeriesAllLabel;
    }

    public String getTvdbSeriesByNameText() {
        return tvdbSeriesByNameText;
    }

    public void setTvdbSeriesByNameText(String tvdbSeriesByNameText) {
        this.tvdbSeriesByNameText = tvdbSeriesByNameText;
    }

    public String getTvdbSeriesByNameLabel() {
        return tvdbSeriesByNameLabel;
    }

    public void setTvdbSeriesByNameLabel(String tvdbSeriesByNameLabel) {
        this.tvdbSeriesByNameLabel = tvdbSeriesByNameLabel;
    }
}
