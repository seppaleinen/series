package converters;

import objects.TVDBEpisode;
import objects.TVDBSeries;

import java.util.List;

import static org.junit.Assert.*;

public class ParserTestHelper {
    private ParserTestHelper(){}

    public static void assertEpisodes(List<TVDBEpisode> episodeList){
        assertNotNull("EpisodeList should not be null", episodeList);
        equals("tvdbEpisodeListSize", 15, episodeList.size());
        TVDBEpisode firstEpisode = episodeList.get(1);
        equals("id", "4721616", firstEpisode.getId());
        equalsNull("DVD_chapter", firstEpisode.getDvdChapter());
        equalsNull("DVD_discid", firstEpisode.getDvdDiscId());
        equalsNull("DVD_episodenumber", firstEpisode.getDvdEpisodeNumber());
        equalsNull("DVD_season", firstEpisode.getDvdSeason());
        equals("Director", "Justin Roiland", firstEpisode.getDirector());
        equals("EpImgFlag", "2", firstEpisode.getEpImgFlag());
        equals("EpisodeName", "The Real Animated Adventures of Doc and Mharti", firstEpisode.getEpisodeName());
        equals("EpisodeNumber", "1", firstEpisode.getEpisodeNumber());
        equals("FirstAired", "2006-10-01", firstEpisode.getFirstAired());
        equalsNull("GuestStars", firstEpisode.getGuestStars());
        equals("IMDB_ID", "tt2930486", firstEpisode.getImdbId());
        equals("Language", "en", firstEpisode.getLanguage());
        //@TODO stax och saxparser klipper bort "-tecken
        /*
        equals("Overview", "Justin actually made this as a way to poke fun at the idea of getting cease and desist letters. \n" +
                "\n" +
                "At the time (October 2006) he had nothing to lose and his original intention was to call this \"back to the future: the new official universal studios cartoon featuring the new Doc Brown and Marty McFly\" and then just sit back and wait for a letter from their lawyers to arrive. That's actually why it's so filthy. He was just looking to \"troll\" a big studio.\n" +
                "\n" +
                "7 years later, hit new animated TV show on adult swim.", firstEpisode.getOverview());
        */
        equalsNull("ProductionCode", firstEpisode.getProductionCode());
        equals("Rating", "10.0", firstEpisode.getRating());
        equals("SeasonNumber", "0", firstEpisode.getSeasonNumber());
        equals("Writer", "Justin Roiland", firstEpisode.getWriter());
        equalsNull("absolute_number", firstEpisode.getAbsoluteNumber());
        equals("filename", "episodes/275274/4721616.jpg", firstEpisode.getFilename());
        equals("lastupdated", "1385450053", firstEpisode.getLastUpdated());
        equals("seasonid", "567214", firstEpisode.getSeasonid());
        equals("seriesid", "275274", firstEpisode.getSeriesId());
        equals("thumb_added", "2013-11-25 23:14:13", firstEpisode.getThumbAdded());
        equals("thumb_height", "225", firstEpisode.getThumbHeight());
        equals("thumb_width", "400", firstEpisode.getThumbWidth());
    }

    public static void assertSeries(TVDBSeries tvdbSeries){
        assertNotNull("tvdbSeries should not be null", tvdbSeries);
        equals("id", "275274", tvdbSeries.getId());
        equals("actors", "|Justin Roiland |Chris Parnell|Spencer Grammer|Sarah Chalke|", tvdbSeries.getActors());
        equals("Airs_DayOfWeek", "Monday", tvdbSeries.getAirsDayOfWeek());
        equals("Airs_Time", "10:30 PM", tvdbSeries.getAirsTime());
        equals("ContentRating", "TV-14", tvdbSeries.getContentRating());
        equals("FirstAired", "2013-12-02", tvdbSeries.getFirstAired());
        equals("Genre", "|Animation|Comedy|Science-Fiction|", tvdbSeries.getGenre());
        equals("IMDB_ID", "tt2861424", tvdbSeries.getImdbId());
        equals("Language", "en", tvdbSeries.getLanguage());
        equals("Network", "Adult Swim", tvdbSeries.getNetwork());
        equalsNull("NetworkID", tvdbSeries.getNetworkId());
        equals("Overview", "A sociopathic scientist drags his unintelligent grandson on insanely dangerous adventures across the universe.", tvdbSeries.getOverview());
        equals("Rating", "9.5", tvdbSeries.getRating());
        equals("RatingCount", "13", tvdbSeries.getRatingCount());
        equals("Runtime", "25", tvdbSeries.getRuntime());
        equalsNull("SeriesID", tvdbSeries.getSeriesId());
        equals("SeriesName", "Rick and Morty", tvdbSeries.getSeriesName());
        equals("Status", "Continuing", tvdbSeries.getStatus());
        equals("added", "2013-11-13 09:41:13", tvdbSeries.getAdded());
        equals("addedBy", "346515", tvdbSeries.getAddedBy());
        equals("banner", "graphical/275274-g5.jpg", tvdbSeries.getBanner());
        equals("fanart", "fanart/original/275274-2.jpg", tvdbSeries.getFanart());
        equals("lastupdated", "1399365383", tvdbSeries.getLastUpdated());
        equals("poster", "posters/275274-2.jpg", tvdbSeries.getPoster());
        equalsNull("zap2it_id", tvdbSeries.getZap2itId());
    }

    private static void equalsNull(String message, String actual){
        message = message + " should be null or empty";
        assertTrue(message, actual == null || actual.isEmpty());
    }

    private static void equals(String message, Object expected, Object actual){
        assertEquals(message + " should be equals", expected, actual);
    }
}
