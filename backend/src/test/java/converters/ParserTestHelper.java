package converters;

import objects.TVDBEpisode;
import objects.TVDBSeries;

import java.util.List;

import static org.junit.Assert.*;

public class ParserTestHelper {
    private ParserTestHelper(){}

    public static void assertMultipleSeriesByName(List<TVDBSeries> tvdbSeriesList){
        assertNotNull("tvdbSeriesList should not be null", tvdbSeriesList);
        equals("Size", 6, tvdbSeriesList.size());

        TVDBSeries tvdbSeriesFirst = tvdbSeriesList.get(0);
        equals("seriesid", "74995", tvdbSeriesFirst.getSeriesId());
        equals("language", "en", tvdbSeriesFirst.getLanguage());
        equals("SeriesName", "Cosmos", tvdbSeriesFirst.getSeriesName());
        equals("banner", "graphical/74995-g7.jpg", tvdbSeriesFirst.getBanner());
        equals("Overview", "Carl Sagan brings us the Cosmos, everything that ever was and ever will be, in an approach that is easily accessible even for those of us that are not science wizards.  This 13 part series covers everything from the history of astronomy, the challenges it faced at its creation, how the universe was created and how it all might end.First aired in 1980, updated segments have been added to the series to include recent discoveries and the current theories in astronomy.Winner of an Emmy and a Peabody Award.", tvdbSeriesFirst.getOverview());
        equals("FirstAired", "1980-09-28", tvdbSeriesFirst.getFirstAired());
        equals("Network", "PBS", tvdbSeriesFirst.getNetwork());
        equals("IMDB_ID", "tt0081846", tvdbSeriesFirst.getImdbId());
        equals("zap2it_id", "SH001071", tvdbSeriesFirst.getZap2itId());
        equals("id", "74995", tvdbSeriesFirst.getId());

        TVDBSeries tvdbSeriesSecond = tvdbSeriesList.get(1);
        equals("seriesid", "278770", tvdbSeriesSecond.getSeriesId());
        equals("language", "en", tvdbSeriesSecond.getLanguage());
        equals("SeriesName", "Ultraman Cosmos", tvdbSeriesSecond.getSeriesName());
        equals("banner", "graphical/278770-g.jpg", tvdbSeriesSecond.getBanner());
        equals("FirstAired", "2001-07-07", tvdbSeriesSecond.getFirstAired());
        equals("id", "278770", tvdbSeriesSecond.getId());

        TVDBSeries tvdbSeriesThird = tvdbSeriesList.get(2);
        equals("seriesid", "271623", tvdbSeriesThird.getSeriesId());
        equals("language", "en", tvdbSeriesThird.getLanguage());
        equals("SeriesName", "Images of the Cosmos", tvdbSeriesThird.getSeriesName());
        equals("Overview", "A study of how revolutions in Astronomy have enabled Astronomers to more accurately map our Galaxy & beyond.", tvdbSeriesThird.getOverview());
        equals("FirstAired", "1993-07-18", tvdbSeriesThird.getFirstAired());
        equals("id", "271623", tvdbSeriesThird.getId());

        TVDBSeries tvdbSeriesFourth = tvdbSeriesList.get(3);
        equals("seriesid", "257422", tvdbSeriesFourth.getSeriesId());
        equals("language", "en", tvdbSeriesFourth.getLanguage());
        equals("SeriesName", "Beyond the Cosmos", tvdbSeriesFourth.getSeriesName());
        equals("banner", "graphical/257422-g2.jpg", tvdbSeriesFourth.getBanner());
        equals("Overview", "The world may run on it, but do we actually know what 'time' really is? Travel back to the Big Bang, where physicists believe the ultimate secrets of time may be hidden.  Brian Greene is going to let you in on a secret: We've all been deceived. Our perceptions of time and space have led us astray. Much of what we thought we knew about our universe-that the past has already happened and the future is yet to be, that space is just an empty void, that our universe is the only universe that exists-just might be wrong. The Fabric of the Cosmos, a four-hour series based on the book by renowned physicist and acclaimed author Brian Greene, takes us to the frontiers of physics to see how scientists are piecing together the most complete picture yet of space, time and the universe. With each step, audiences will discover that just beneath the surface of our everyday experience lies a world we'd hardly recognize-a startling world far stranger and more wondrous than anyone expected.", tvdbSeriesFourth.getOverview());
        equals("FirstAired", "2012-04-03", tvdbSeriesFourth.getFirstAired());
        equals("id", "257422", tvdbSeriesFourth.getId());

        TVDBSeries tvdbSeriesFifth = tvdbSeriesList.get(4);
        equals("seriesid", "260586", tvdbSeriesFifth.getSeriesId());
        equals("language", "en", tvdbSeriesFifth.getLanguage());
        equals("SeriesName", "Cosmos: A Spacetime Odyssey", tvdbSeriesFifth.getSeriesName());
        equals("banner", "graphical/260586-g5.jpg", tvdbSeriesFifth.getBanner());
        equals("Overview", "Hosted by renowned astrophysicist Neil deGrasse Tyson, Cosmos explores how we discovered the laws of nature and found our coordinates in space and time. It brings to life never-before-told stories of the heroic quest for knowledge and transport viewers to new worlds and across the universe for a vision of the cosmos on the grandest scale. The most profound scientific concepts are presented with stunning clarity, uniting skepticism and wonder, and weaving rigorous science with the emotional and spiritual into a transcendent experience.", tvdbSeriesFifth.getOverview());
        equals("FirstAired", "2014-03-09", tvdbSeriesFifth.getFirstAired());
        equals("Network", "FOX", tvdbSeriesFifth.getNetwork());
        equals("IMDB_ID", "tt2395695", tvdbSeriesFifth.getImdbId());
        equals("zap2it_id", "SH01446110", tvdbSeriesFifth.getZap2itId());
        equals("id", "260586", tvdbSeriesFifth.getId());

        TVDBSeries tvdbSeriesSixth = tvdbSeriesList.get(5);
        equals("seriesid", "81034", tvdbSeriesSixth.getSeriesId());
        equals("language", "en", tvdbSeriesSixth.getLanguage());
        equals("SeriesName", "The Cosmos A Beginner's Guide", tvdbSeriesSixth.getSeriesName());
        equals("banner", "graphical/81034-g.jpg", tvdbSeriesSixth.getBanner());
        equals("Overview", "It's the story of everything - from the first microseconds of our universe to the exciting future of first contact and homes beyond our Earth. Join Adam Hart-Davis, Janet Sumner and Maggie Aderin for a journey around the planet to discover the latest thinking about the Cosmos.", tvdbSeriesSixth.getOverview());
        equals("FirstAired", "2007-10-07", tvdbSeriesSixth.getFirstAired());
        equals("Network", "BBC Two", tvdbSeriesSixth.getNetwork());
        equals("id", "81034", tvdbSeriesSixth.getId());
    }

    public static void assertSeriesByName(TVDBSeries tvdbSeries){
        assertNotNull("tvdbSeries should not be null", tvdbSeries);
        equals("seriesid", "275274", tvdbSeries.getSeriesId());
        equals("language", "en", tvdbSeries.getLanguage());
        equals("SeriesName", "Rick and Morty", tvdbSeries.getSeriesName());
        equals("banner", "graphical/275274-g5.jpg", tvdbSeries.getBanner());
        equals("Overview", "A sociopathic scientist drags his unintelligent grandson on insanely dangerous adventures across the universe.", tvdbSeries.getOverview());
        equals("FirstAired", "2013-12-02", tvdbSeries.getFirstAired());
        equals("Network", "Adult Swim", tvdbSeries.getNetwork());
        equals("IMDB_ID", "tt2861424", tvdbSeries.getImdbId());
        equals("id", "275274", tvdbSeries.getId());
        assertTrue("EpisodeList should be empty", tvdbSeries.getTvdbEpisodeList().isEmpty());
    }

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
        equals("Overview", "Justin actually made this as a way to poke fun at the idea of getting cease and desist letters. \n" +
                "\n" +
                "At the time (October 2006) he had nothing to lose and his original intention was to call this \"back to the future: the new official universal studios cartoon featuring the new Doc Brown and Marty McFly\" and then just sit back and wait for a letter from their lawyers to arrive. That's actually why it's so filthy. He was just looking to \"troll\" a big studio.\n" +
                "\n" +
                "7 years later, hit new animated TV show on adult swim. ", firstEpisode.getOverview());
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
