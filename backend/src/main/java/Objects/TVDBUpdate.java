package Objects;

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
}
