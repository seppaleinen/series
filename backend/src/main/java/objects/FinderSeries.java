package objects;

import java.io.Serializable;

public class FinderSeries implements Serializable {
    private static final long serialVersionUID = 1L;

    private String seriesTitle;
    private String episodeTitle;

    public String getSeriesTitle() {
        return seriesTitle;
    }

    public void setSeriesTitle(String seriesTitle) {
        this.seriesTitle = seriesTitle;
    }

    public String getEpisodeTitle() {
        return episodeTitle;
    }

    public void setEpisodeTitle(String episodeTitle) {
        this.episodeTitle = episodeTitle;
    }
}
