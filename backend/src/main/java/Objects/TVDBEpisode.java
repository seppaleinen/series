package Objects;

import java.io.Serializable;

public class TVDBEpisode implements Serializable {
    private static final long serialVersionUID = 1L;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TVDBEpisode that = (TVDBEpisode) o;

        if (absoluteNumber != null ? !absoluteNumber.equals(that.absoluteNumber) : that.absoluteNumber != null)
            return false;
        if (director != null ? !director.equals(that.director) : that.director != null) return false;
        if (dvdChapter != null ? !dvdChapter.equals(that.dvdChapter) : that.dvdChapter != null) return false;
        if (dvdDiscId != null ? !dvdDiscId.equals(that.dvdDiscId) : that.dvdDiscId != null) return false;
        if (dvdEpisodeNumber != null ? !dvdEpisodeNumber.equals(that.dvdEpisodeNumber) : that.dvdEpisodeNumber != null)
            return false;
        if (dvdSeason != null ? !dvdSeason.equals(that.dvdSeason) : that.dvdSeason != null) return false;
        if (epImgFlag != null ? !epImgFlag.equals(that.epImgFlag) : that.epImgFlag != null) return false;
        if (episodeName != null ? !episodeName.equals(that.episodeName) : that.episodeName != null) return false;
        if (episodeNumber != null ? !episodeNumber.equals(that.episodeNumber) : that.episodeNumber != null)
            return false;
        if (filename != null ? !filename.equals(that.filename) : that.filename != null) return false;
        if (firstAired != null ? !firstAired.equals(that.firstAired) : that.firstAired != null) return false;
        if (flagged != null ? !flagged.equals(that.flagged) : that.flagged != null) return false;
        if (guestStars != null ? !guestStars.equals(that.guestStars) : that.guestStars != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (imdbId != null ? !imdbId.equals(that.imdbId) : that.imdbId != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (lastUpdated != null ? !lastUpdated.equals(that.lastUpdated) : that.lastUpdated != null) return false;
        if (mirrorUpdate != null ? !mirrorUpdate.equals(that.mirrorUpdate) : that.mirrorUpdate != null) return false;
        if (overview != null ? !overview.equals(that.overview) : that.overview != null) return false;
        if (productionCode != null ? !productionCode.equals(that.productionCode) : that.productionCode != null)
            return false;
        if (rating != null ? !rating.equals(that.rating) : that.rating != null) return false;
        if (seasonNumber != null ? !seasonNumber.equals(that.seasonNumber) : that.seasonNumber != null) return false;
        if (seasonid != null ? !seasonid.equals(that.seasonid) : that.seasonid != null) return false;
        if (seriesId != null ? !seriesId.equals(that.seriesId) : that.seriesId != null) return false;
        if (thumbAdded != null ? !thumbAdded.equals(that.thumbAdded) : that.thumbAdded != null) return false;
        if (thumbHeight != null ? !thumbHeight.equals(that.thumbHeight) : that.thumbHeight != null) return false;
        if (thumbWidth != null ? !thumbWidth.equals(that.thumbWidth) : that.thumbWidth != null) return false;
        if (tmsExport != null ? !tmsExport.equals(that.tmsExport) : that.tmsExport != null) return false;
        if (writer != null ? !writer.equals(that.writer) : that.writer != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (seasonid != null ? seasonid.hashCode() : 0);
        result = 31 * result + (episodeNumber != null ? episodeNumber.hashCode() : 0);
        result = 31 * result + (episodeName != null ? episodeName.hashCode() : 0);
        result = 31 * result + (firstAired != null ? firstAired.hashCode() : 0);
        result = 31 * result + (guestStars != null ? guestStars.hashCode() : 0);
        result = 31 * result + (director != null ? director.hashCode() : 0);
        result = 31 * result + (writer != null ? writer.hashCode() : 0);
        result = 31 * result + (overview != null ? overview.hashCode() : 0);
        result = 31 * result + (productionCode != null ? productionCode.hashCode() : 0);
        result = 31 * result + (lastUpdated != null ? lastUpdated.hashCode() : 0);
        result = 31 * result + (flagged != null ? flagged.hashCode() : 0);
        result = 31 * result + (dvdDiscId != null ? dvdDiscId.hashCode() : 0);
        result = 31 * result + (dvdSeason != null ? dvdSeason.hashCode() : 0);
        result = 31 * result + (dvdEpisodeNumber != null ? dvdEpisodeNumber.hashCode() : 0);
        result = 31 * result + (dvdChapter != null ? dvdChapter.hashCode() : 0);
        result = 31 * result + (absoluteNumber != null ? absoluteNumber.hashCode() : 0);
        result = 31 * result + (filename != null ? filename.hashCode() : 0);
        result = 31 * result + (seriesId != null ? seriesId.hashCode() : 0);
        result = 31 * result + (thumbAdded != null ? thumbAdded.hashCode() : 0);
        result = 31 * result + (thumbWidth != null ? thumbWidth.hashCode() : 0);
        result = 31 * result + (thumbHeight != null ? thumbHeight.hashCode() : 0);
        result = 31 * result + (tmsExport != null ? tmsExport.hashCode() : 0);
        result = 31 * result + (mirrorUpdate != null ? mirrorUpdate.hashCode() : 0);
        result = 31 * result + (imdbId != null ? imdbId.hashCode() : 0);
        result = 31 * result + (epImgFlag != null ? epImgFlag.hashCode() : 0);
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        result = 31 * result + (seasonNumber != null ? seasonNumber.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        return result;
    }
}
