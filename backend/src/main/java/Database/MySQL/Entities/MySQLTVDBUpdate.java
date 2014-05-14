package Database.MySQL.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TVDBUPDATE")
@NamedQueries(
        @NamedQuery(name = "findUpdateBy", query = "select tvdbupdate from MySQLTVDBUpdate tvdbupdate")
)
public class MySQLTVDBUpdate implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final String FIND_BY_SERIESID = "findUpdateBy";

    @Id
    @Column(name = "time", unique = true)
    private String time;

    @OneToMany(mappedBy = "mySQLTVDBUpdate", cascade = {CascadeType.ALL}, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<MySQLUpdateEpisode> episodeList = new ArrayList<>();

    @OneToMany(mappedBy = "mySQLTVDBUpdate", cascade = {CascadeType.ALL}, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<MySQLUpdateSeries> seriesList = new ArrayList<>();


    //@OneToMany(mappedBy = "licens", cascade = {CascadeType.ALL}, orphanRemoval = true)
    //private List<AktivSubstansLicens> substanser = new ArrayList<>();


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<MySQLUpdateEpisode> getEpisodeList() {
        return episodeList;
    }

    public void setEpisodeList(List<MySQLUpdateEpisode> episodeList) {
        this.episodeList = episodeList;
    }

    public List<MySQLUpdateSeries> getSeriesList() {
        return seriesList;
    }

    public void setSeriesList(List<MySQLUpdateSeries> seriesList) {
        this.seriesList = seriesList;
    }
}
