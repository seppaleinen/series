package database.mongodb.entities;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity
public class MongoTVDBEpisode {
    public static final String ID_KEY = "id";
    @Id
    private String id;
    private String seasonid;
    private String episodeNumber;
    private String episodeName;
    private String firstAired;
    private String guestStars;
    private String director;
    private String writer;
    private String overview;
    private String productionCode;
    private String lastUpdated;
    private String flagged;
    private String dvdDiscId;
    private String dvdSeason;
    private String dvdEpisodeNumber;
    private String dvdChapter;
    private String absoluteNumber;
    private String filename;
    private String seriesId;
    private String thumbAdded;
    private String thumbWidth;
    private String thumbHeight;
    private String tmsExport;
    private String mirrorUpdate;
    private String imdbId;
    private String epImgFlag;
    private String rating;
    private String seasonNumber;
    private String language;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSeasonid() {
        return seasonid;
    }

    public void setSeasonid(String seasonid) {
        this.seasonid = seasonid;
    }

    public String getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(String episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public String getEpisodeName() {
        return episodeName;
    }

    public void setEpisodeName(String episodeName) {
        this.episodeName = episodeName;
    }

    public String getFirstAired() {
        return firstAired;
    }

    public void setFirstAired(String firstAired) {
        this.firstAired = firstAired;
    }

    public String getGuestStars() {
        return guestStars;
    }

    public void setGuestStars(String guestStars) {
        this.guestStars = guestStars;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getProductionCode() {
        return productionCode;
    }

    public void setProductionCode(String productionCode) {
        this.productionCode = productionCode;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getFlagged() {
        return flagged;
    }

    public void setFlagged(String flagged) {
        this.flagged = flagged;
    }

    public String getDvdDiscId() {
        return dvdDiscId;
    }

    public void setDvdDiscId(String dvdDiscId) {
        this.dvdDiscId = dvdDiscId;
    }

    public String getDvdSeason() {
        return dvdSeason;
    }

    public void setDvdSeason(String dvdSeason) {
        this.dvdSeason = dvdSeason;
    }

    public String getDvdEpisodeNumber() {
        return dvdEpisodeNumber;
    }

    public void setDvdEpisodeNumber(String dvdEpisodeNumber) {
        this.dvdEpisodeNumber = dvdEpisodeNumber;
    }

    public String getDvdChapter() {
        return dvdChapter;
    }

    public void setDvdChapter(String dvdChapter) {
        this.dvdChapter = dvdChapter;
    }

    public String getAbsoluteNumber() {
        return absoluteNumber;
    }

    public void setAbsoluteNumber(String absoluteNumber) {
        this.absoluteNumber = absoluteNumber;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(String seriesId) {
        this.seriesId = seriesId;
    }

    public String getThumbAdded() {
        return thumbAdded;
    }

    public void setThumbAdded(String thumbAdded) {
        this.thumbAdded = thumbAdded;
    }

    public String getThumbWidth() {
        return thumbWidth;
    }

    public void setThumbWidth(String thumbWidth) {
        this.thumbWidth = thumbWidth;
    }

    public String getThumbHeight() {
        return thumbHeight;
    }

    public void setThumbHeight(String thumbHeight) {
        this.thumbHeight = thumbHeight;
    }

    public String getTmsExport() {
        return tmsExport;
    }

    public void setTmsExport(String tmsExport) {
        this.tmsExport = tmsExport;
    }

    public String getMirrorUpdate() {
        return mirrorUpdate;
    }

    public void setMirrorUpdate(String mirrorUpdate) {
        this.mirrorUpdate = mirrorUpdate;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getEpImgFlag() {
        return epImgFlag;
    }

    public void setEpImgFlag(String epImgFlag) {
        this.epImgFlag = epImgFlag;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(String seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
