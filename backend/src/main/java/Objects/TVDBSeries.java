package Objects;

import java.io.Serializable;

public class TVDBSeries implements Serializable {
    private static final long serialVersionUID = 1L;

    private String actors;
    private String airsDayOfWeek;
    private String airsTime;
    private String contentRating;
    private String firstAired;
    private String genre;
    private String imdbId;
    private String language;
    private String network;
    private String networkId;
    private String overview;
    private String rating;
    private String ratingCount;
    private String runtime;
    private String seriesId;
    private String seriesName;
    private String status;
    private String added;
    private String addedBy;
    private String banner;
    private String fanart;
    private String lastUpdated;
    private String poster;
    private String zap2itId;

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getAirsDayOfWeek() {
        return airsDayOfWeek;
    }

    public void setAirsDayOfWeek(String airsDayOfWeek) {
        this.airsDayOfWeek = airsDayOfWeek;
    }

    public String getAirsTime() {
        return airsTime;
    }

    public void setAirsTime(String airsTime) {
        this.airsTime = airsTime;
    }

    public String getContentRating() {
        return contentRating;
    }

    public void setContentRating(String contentRating) {
        this.contentRating = contentRating;
    }

    public String getFirstAired() {
        return firstAired;
    }

    public void setFirstAired(String firstAired) {
        this.firstAired = firstAired;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(String ratingCount) {
        this.ratingCount = ratingCount;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(String seriesId) {
        this.seriesId = seriesId;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAdded() {
        return added;
    }

    public void setAdded(String added) {
        this.added = added;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getFanart() {
        return fanart;
    }

    public void setFanart(String fanart) {
        this.fanart = fanart;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getZap2itId() {
        return zap2itId;
    }

    public void setZap2itId(String zap2itId) {
        this.zap2itId = zap2itId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TVDBSeries that = (TVDBSeries) o;

        if (actors != null ? !actors.equals(that.actors) : that.actors != null) return false;
        if (added != null ? !added.equals(that.added) : that.added != null) return false;
        if (addedBy != null ? !addedBy.equals(that.addedBy) : that.addedBy != null) return false;
        if (airsDayOfWeek != null ? !airsDayOfWeek.equals(that.airsDayOfWeek) : that.airsDayOfWeek != null)
            return false;
        if (airsTime != null ? !airsTime.equals(that.airsTime) : that.airsTime != null) return false;
        if (banner != null ? !banner.equals(that.banner) : that.banner != null) return false;
        if (contentRating != null ? !contentRating.equals(that.contentRating) : that.contentRating != null)
            return false;
        if (fanart != null ? !fanart.equals(that.fanart) : that.fanart != null) return false;
        if (firstAired != null ? !firstAired.equals(that.firstAired) : that.firstAired != null) return false;
        if (genre != null ? !genre.equals(that.genre) : that.genre != null) return false;
        if (imdbId != null ? !imdbId.equals(that.imdbId) : that.imdbId != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (lastUpdated != null ? !lastUpdated.equals(that.lastUpdated) : that.lastUpdated != null) return false;
        if (network != null ? !network.equals(that.network) : that.network != null) return false;
        if (networkId != null ? !networkId.equals(that.networkId) : that.networkId != null) return false;
        if (overview != null ? !overview.equals(that.overview) : that.overview != null) return false;
        if (poster != null ? !poster.equals(that.poster) : that.poster != null) return false;
        if (rating != null ? !rating.equals(that.rating) : that.rating != null) return false;
        if (ratingCount != null ? !ratingCount.equals(that.ratingCount) : that.ratingCount != null) return false;
        if (runtime != null ? !runtime.equals(that.runtime) : that.runtime != null) return false;
        if (seriesId != null ? !seriesId.equals(that.seriesId) : that.seriesId != null) return false;
        if (seriesName != null ? !seriesName.equals(that.seriesName) : that.seriesName != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (zap2itId != null ? !zap2itId.equals(that.zap2itId) : that.zap2itId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = actors != null ? actors.hashCode() : 0;
        result = 31 * result + (airsDayOfWeek != null ? airsDayOfWeek.hashCode() : 0);
        result = 31 * result + (airsTime != null ? airsTime.hashCode() : 0);
        result = 31 * result + (contentRating != null ? contentRating.hashCode() : 0);
        result = 31 * result + (firstAired != null ? firstAired.hashCode() : 0);
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        result = 31 * result + (imdbId != null ? imdbId.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (network != null ? network.hashCode() : 0);
        result = 31 * result + (networkId != null ? networkId.hashCode() : 0);
        result = 31 * result + (overview != null ? overview.hashCode() : 0);
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        result = 31 * result + (ratingCount != null ? ratingCount.hashCode() : 0);
        result = 31 * result + (runtime != null ? runtime.hashCode() : 0);
        result = 31 * result + (seriesId != null ? seriesId.hashCode() : 0);
        result = 31 * result + (seriesName != null ? seriesName.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (added != null ? added.hashCode() : 0);
        result = 31 * result + (addedBy != null ? addedBy.hashCode() : 0);
        result = 31 * result + (banner != null ? banner.hashCode() : 0);
        result = 31 * result + (fanart != null ? fanart.hashCode() : 0);
        result = 31 * result + (lastUpdated != null ? lastUpdated.hashCode() : 0);
        result = 31 * result + (poster != null ? poster.hashCode() : 0);
        result = 31 * result + (zap2itId != null ? zap2itId.hashCode() : 0);
        return result;
    }
}
