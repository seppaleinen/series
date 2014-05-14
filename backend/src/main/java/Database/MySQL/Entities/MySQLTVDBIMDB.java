package Database.MySQL.Entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TVDBIMDB")
@NamedQueries(
        @NamedQuery(name = "findIMDBByImdbId", query = "select TVDBIMDB from MySQLTVDBIMDB TVDBIMDB where TVDBIMDB.imdbId = :imdbId")
)
public class MySQLTVDBIMDB implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final String FIND_BY_IMDBID = "findIMDBByImdbId";

    private String seriesId;
    private String language;
    private String seriesName;
    private String banner;
    private String overview;
    private String firstAired;
    private String imdbId;
    @Id
    private String id;

    public String getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(String seriesId) {
        this.seriesId = seriesId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getFirstAired() {
        return firstAired;
    }

    public void setFirstAired(String firstAired) {
        this.firstAired = firstAired;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
