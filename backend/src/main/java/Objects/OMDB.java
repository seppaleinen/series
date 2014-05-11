package Objects;

import java.io.Serializable;

public class OMDB implements Serializable {
    private static final long serialVersionUID = 1L;

    private String title;
    private String year;
    private String rated;
    private String released;
    private String runtime;
    private String genre;
    private String director;
    private String writer;
    private String actors;
    private String plot;
    private String language;
    private String country;
    private String awards;
    private String poster;
    private String metascore;
    private String imdbRating;
    private String imdbVotes;
    private String imdbID;
    private String type;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
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

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getMetascore() {
        return metascore;
    }

    public void setMetascore(String metascore) {
        this.metascore = metascore;
    }

    public String getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }

    public String getImdbVotes() {
        return imdbVotes;
    }

    public void setImdbVotes(String imdbVotes) {
        this.imdbVotes = imdbVotes;
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OMDB omdb = (OMDB) o;

        if (actors != null ? !actors.equals(omdb.actors) : omdb.actors != null) return false;
        if (awards != null ? !awards.equals(omdb.awards) : omdb.awards != null) return false;
        if (country != null ? !country.equals(omdb.country) : omdb.country != null) return false;
        if (director != null ? !director.equals(omdb.director) : omdb.director != null) return false;
        if (genre != null ? !genre.equals(omdb.genre) : omdb.genre != null) return false;
        if (imdbID != null ? !imdbID.equals(omdb.imdbID) : omdb.imdbID != null) return false;
        if (imdbRating != null ? !imdbRating.equals(omdb.imdbRating) : omdb.imdbRating != null) return false;
        if (imdbVotes != null ? !imdbVotes.equals(omdb.imdbVotes) : omdb.imdbVotes != null) return false;
        if (language != null ? !language.equals(omdb.language) : omdb.language != null) return false;
        if (metascore != null ? !metascore.equals(omdb.metascore) : omdb.metascore != null) return false;
        if (plot != null ? !plot.equals(omdb.plot) : omdb.plot != null) return false;
        if (poster != null ? !poster.equals(omdb.poster) : omdb.poster != null) return false;
        if (rated != null ? !rated.equals(omdb.rated) : omdb.rated != null) return false;
        if (released != null ? !released.equals(omdb.released) : omdb.released != null) return false;
        if (runtime != null ? !runtime.equals(omdb.runtime) : omdb.runtime != null) return false;
        if (title != null ? !title.equals(omdb.title) : omdb.title != null) return false;
        if (type != null ? !type.equals(omdb.type) : omdb.type != null) return false;
        if (writer != null ? !writer.equals(omdb.writer) : omdb.writer != null) return false;
        if (year != null ? !year.equals(omdb.year) : omdb.year != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (rated != null ? rated.hashCode() : 0);
        result = 31 * result + (released != null ? released.hashCode() : 0);
        result = 31 * result + (runtime != null ? runtime.hashCode() : 0);
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        result = 31 * result + (director != null ? director.hashCode() : 0);
        result = 31 * result + (writer != null ? writer.hashCode() : 0);
        result = 31 * result + (actors != null ? actors.hashCode() : 0);
        result = 31 * result + (plot != null ? plot.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (awards != null ? awards.hashCode() : 0);
        result = 31 * result + (poster != null ? poster.hashCode() : 0);
        result = 31 * result + (metascore != null ? metascore.hashCode() : 0);
        result = 31 * result + (imdbRating != null ? imdbRating.hashCode() : 0);
        result = 31 * result + (imdbVotes != null ? imdbVotes.hashCode() : 0);
        result = 31 * result + (imdbID != null ? imdbID.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
