package database.mongodb;

import objects.*;

public class ObjectCreater {
    public static TVDBUpdate createTVDBUpdate(){
        TVDBUpdate tvdbUpdate = new TVDBUpdate();

        tvdbUpdate.setTime("TIME");
        tvdbUpdate.getEpisodeList().add("EPISODE1");
        tvdbUpdate.getEpisodeList().add("EPISODE2");
        tvdbUpdate.getSeriesList().add("SERIES1");
        tvdbUpdate.getSeriesList().add("SERIES2");

        return tvdbUpdate;
    }

    public static TVDBSeries createTVDBSeries(){
        TVDBSeries tvdbSeries = new TVDBSeries();

        tvdbSeries.setActors("ACTORS");
        tvdbSeries.setAirsDayOfWeek("AIRSDAYOFWEEK");
        tvdbSeries.setAirsTime("AIRSTIME");
        tvdbSeries.setContentRating("CONTENTRATING");
        tvdbSeries.setFirstAired("FIRSTAIRED");
        tvdbSeries.setGenre("GENRE");
        tvdbSeries.setImdbId("IMDBID");
        tvdbSeries.setLanguage("LANGUAGE");
        tvdbSeries.setNetwork("NETWORK");
        tvdbSeries.setNetworkId("NETWORKID");
        tvdbSeries.setOverview("OVERVIEW");
        tvdbSeries.setRating("RATING");
        tvdbSeries.setRatingCount("RATINGCOUNT");
        tvdbSeries.setRuntime("RUNTIME");
        tvdbSeries.setSeriesId("SERIESID");
        tvdbSeries.setSeriesName("SERIESNAME");
        tvdbSeries.setStatus("STATUS");
        tvdbSeries.setAdded("ADDED");
        tvdbSeries.setAddedBy("ADDEDBY");
        tvdbSeries.setBanner("BANNER");
        tvdbSeries.setFanart("FANART");
        tvdbSeries.setLastUpdated("LASTUPDATED");
        tvdbSeries.setPoster("POSTER");
        tvdbSeries.setZap2itId("ZAP2ITID");

        return tvdbSeries;
    }

    public static TVDBEpisode createTVDBEpisode(){
        TVDBEpisode tvdbEpisode  = new TVDBEpisode();

        tvdbEpisode.setId("ID");
        tvdbEpisode.setSeasonid("SEASONID");
        tvdbEpisode.setEpisodeNumber("EPISODENUMBER");
        tvdbEpisode.setEpisodeName("EPISODENAME");
        tvdbEpisode.setFirstAired("FIRSTAIRED");
        tvdbEpisode.setGuestStars("GUESTSTARS");
        tvdbEpisode.setDirector("DIRECTOR");
        tvdbEpisode.setWriter("WRITER");
        tvdbEpisode.setOverview("OVERVIEW");
        tvdbEpisode.setProductionCode("PRODUCTIONCODE");
        tvdbEpisode.setLastUpdated("LASTUPDATED");
        tvdbEpisode.setFlagged("FLAGGED");
        tvdbEpisode.setDvdDiscId("DVDDISCID");
        tvdbEpisode.setDvdSeason("DVDSEASON");
        tvdbEpisode.setDvdEpisodeNumber("DVDEPISODENUMBER");
        tvdbEpisode.setDvdChapter("DVDCHAPTER");
        tvdbEpisode.setAbsoluteNumber("ABSOLUTENUMBER");
        tvdbEpisode.setFilename("FILENAME");
        tvdbEpisode.setSeriesId("SERIESID");
        tvdbEpisode.setThumbAdded("THUMBADDED");
        tvdbEpisode.setThumbWidth("THUMBWIDTH");
        tvdbEpisode.setThumbHeight("THUMBHEIGHT");
        tvdbEpisode.setTmsExport("TMSEXPORT");
        tvdbEpisode.setMirrorUpdate("MIRRORUPDATE");
        tvdbEpisode.setImdbId("IMDBID");
        tvdbEpisode.setEpImgFlag("EPIMGFLAG");
        tvdbEpisode.setRating("RATING");
        tvdbEpisode.setSeasonNumber("SEASONNUMBER");
        tvdbEpisode.setLanguage("LANGUAGE");

        return tvdbEpisode;
    }
}
