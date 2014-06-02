package objects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TVDBUpdate implements Serializable {
    private static final long serialVersionUID = 1L;

    private String time;
    private List<String> seriesList = new ArrayList<>();
    private List<String> episodeList = new ArrayList<>();

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<String> getSeriesList() {
        return seriesList;
    }

    public void setSeriesList(List<String> seriesList) {
        this.seriesList = seriesList;
    }

    public List<String> getEpisodeList() {
        return episodeList;
    }

    public void setEpisodeList(List<String> episodeList) {
        this.episodeList = episodeList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TVDBUpdate that = (TVDBUpdate) o;

        if (episodeList != null ? !episodeList.equals(that.episodeList) : that.episodeList != null) return false;
        if (seriesList != null ? !seriesList.equals(that.seriesList) : that.seriesList != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = time != null ? time.hashCode() : 0;
        result = 31 * result + (seriesList != null ? seriesList.hashCode() : 0);
        result = 31 * result + (episodeList != null ? episodeList.hashCode() : 0);
        return result;
    }
}
