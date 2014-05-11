package Objects;

import java.io.Serializable;

public class TVDBIMDB implements Serializable {
    private static final long serialVersionUID = 1L;

    private String seriesId;
    private String language;
    private String seriesName;
    private String banner;
    private String overview;
    private String firstAired;
    private String imdbId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TVDBIMDB tvdbimdb = (TVDBIMDB) o;

        if (banner != null ? !banner.equals(tvdbimdb.banner) : tvdbimdb.banner != null) return false;
        if (firstAired != null ? !firstAired.equals(tvdbimdb.firstAired) : tvdbimdb.firstAired != null) return false;
        if (id != null ? !id.equals(tvdbimdb.id) : tvdbimdb.id != null) return false;
        if (imdbId != null ? !imdbId.equals(tvdbimdb.imdbId) : tvdbimdb.imdbId != null) return false;
        if (language != null ? !language.equals(tvdbimdb.language) : tvdbimdb.language != null) return false;
        if (overview != null ? !overview.equals(tvdbimdb.overview) : tvdbimdb.overview != null) return false;
        if (seriesId != null ? !seriesId.equals(tvdbimdb.seriesId) : tvdbimdb.seriesId != null) return false;
        if (seriesName != null ? !seriesName.equals(tvdbimdb.seriesName) : tvdbimdb.seriesName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = seriesId != null ? seriesId.hashCode() : 0;
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (seriesName != null ? seriesName.hashCode() : 0);
        result = 31 * result + (banner != null ? banner.hashCode() : 0);
        result = 31 * result + (overview != null ? overview.hashCode() : 0);
        result = 31 * result + (firstAired != null ? firstAired.hashCode() : 0);
        result = 31 * result + (imdbId != null ? imdbId.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }
}
