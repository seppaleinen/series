package database.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TVDBUPDATE")
@NamedQueries(
        @NamedQuery(name = "findUpdateBy", query = "select tvdbupdate from TVDBUpdateEntity tvdbupdate")
)
public class TVDBUpdateEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final String FIND_BY_SERIESID = "findUpdateBy";

    @Id
    @Column(name = "UPDATETIME")
    private String time;

    @OneToMany(mappedBy = "TVDBUpdateEntity", cascade = {CascadeType.ALL}, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<UpdateEpisodeEntity> episodeList = new ArrayList<>();

    @OneToMany(mappedBy = "TVDBUpdateEntity", cascade = {CascadeType.ALL}, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<UpdateSeriesEntity> seriesList = new ArrayList<>();

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<UpdateEpisodeEntity> getEpisodeList() {
        return episodeList;
    }

    public void setEpisodeList(List<UpdateEpisodeEntity> episodeList) {
        this.episodeList = episodeList;
    }

    public List<UpdateSeriesEntity> getSeriesList() {
        return seriesList;
    }

    public void setSeriesList(List<UpdateSeriesEntity> seriesList) {
        this.seriesList = seriesList;
    }
}
