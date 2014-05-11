package Database.MongoDB.Entities;

import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.ArrayList;
import java.util.List;

@Entity
public class MongoTVDBUpdate {
    public static final String TIME_KEY = "time";
    @Id
    private String time;
    @Embedded
    private List<String> seriesList = new ArrayList<>();
    @Embedded
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
