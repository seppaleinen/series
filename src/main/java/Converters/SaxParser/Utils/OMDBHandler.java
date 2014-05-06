package Converters.SaxParser.Utils;

import Objects.OMDB;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class OMDBHandler extends DefaultHandler {
    private static final String ELEMENT = "movie";
    private static final String TITLE = "title";
    private static final String YEAR = "year";
    private static final String RATED = "rated";
    private static final String RELEASED = "released";
    private static final String RUNTIME = "runtime";
    private static final String GENRE = "genre";
    private static final String DIRECTOR = "director";
    private static final String WRITER = "writer";
    private static final String ACTORS = "actors";
    private static final String PLOT = "plot";
    private static final String LANGUAGE = "language";
    private static final String COUNTRY = "country";
    private static final String AWARDS = "awards";
    private static final String POSTER = "poster";
    private static final String METASCORE = "metascore";
    private static final String IMDB_RATING = "imdbRating";
    private static final String IMDB_VOTES = "imdbVotes";
    private static final String IMDB_ID = "imdbID";
    private static final String TYPE = "type";

    private OMDB omdb;
    private String content;

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case ELEMENT:
                omdb = new OMDB();
                omdb.setTitle(attributes.getValue(TITLE));
                omdb.setYear(attributes.getValue(YEAR));
                omdb.setRated(attributes.getValue(RATED));
                omdb.setReleased(attributes.getValue(RELEASED));
                omdb.setRuntime(attributes.getValue(RUNTIME));
                omdb.setGenre(attributes.getValue(GENRE));
                omdb.setDirector(attributes.getValue(DIRECTOR));
                omdb.setWriter(attributes.getValue(WRITER));
                omdb.setActors(attributes.getValue(ACTORS));
                omdb.setPlot(attributes.getValue(PLOT));
                omdb.setLanguage(attributes.getValue(LANGUAGE));
                omdb.setCountry(attributes.getValue(COUNTRY));
                omdb.setAwards(attributes.getValue(AWARDS));
                omdb.setPoster(attributes.getValue(POSTER));
                omdb.setMetascore(attributes.getValue(METASCORE));
                omdb.setImdbRating(attributes.getValue(IMDB_RATING));
                omdb.setImdbVotes(attributes.getValue(IMDB_VOTES));
                omdb.setImdbID(attributes.getValue(IMDB_ID));
                omdb.setType(attributes.getValue(TYPE));
                break;
        }
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName){
            case ELEMENT:
                break;
        }
    }
    public void characters(char[] ch, int start, int length) throws SAXException {
        content = String.copyValueOf(ch, start, length).trim();
    }

    public OMDB getOMDB(){
        return omdb;
    }
}