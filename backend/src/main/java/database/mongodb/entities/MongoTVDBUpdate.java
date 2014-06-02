package database.mongodb.entities;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.List;

@Entity
public class MongoTVDBUpdate {
    public static final String TIME_KEY = "time";
    @Id
    private String time;
    private List<String> seriesList;
    private List<String> episodeList;

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
