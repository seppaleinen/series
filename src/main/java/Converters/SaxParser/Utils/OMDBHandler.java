package Converters.SaxParser.Utils;

import Objects.Constants.OMDBConstants;
import Objects.OMDB;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class OMDBHandler extends DefaultHandler {
    private OMDB omdb;
    private String content;

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case OMDBConstants.ELEMENT:
                omdb = new OMDB();
                omdb.setTitle(attributes.getValue(OMDBConstants.TITLE));
                omdb.setYear(attributes.getValue(OMDBConstants.YEAR));
                omdb.setRated(attributes.getValue(OMDBConstants.RATED));
                omdb.setReleased(attributes.getValue(OMDBConstants.RELEASED));
                omdb.setRuntime(attributes.getValue(OMDBConstants.RUNTIME));
                omdb.setGenre(attributes.getValue(OMDBConstants.GENRE));
                omdb.setDirector(attributes.getValue(OMDBConstants.DIRECTOR));
                omdb.setWriter(attributes.getValue(OMDBConstants.WRITER));
                omdb.setActors(attributes.getValue(OMDBConstants.ACTORS));
                omdb.setPlot(attributes.getValue(OMDBConstants.PLOT));
                omdb.setLanguage(attributes.getValue(OMDBConstants.LANGUAGE));
                omdb.setCountry(attributes.getValue(OMDBConstants.COUNTRY));
                omdb.setAwards(attributes.getValue(OMDBConstants.AWARDS));
                omdb.setPoster(attributes.getValue(OMDBConstants.POSTER));
                omdb.setMetascore(attributes.getValue(OMDBConstants.METASCORE));
                omdb.setImdbRating(attributes.getValue(OMDBConstants.IMDB_RATING));
                omdb.setImdbVotes(attributes.getValue(OMDBConstants.IMDB_VOTES));
                omdb.setImdbID(attributes.getValue(OMDBConstants.IMDB_ID));
                omdb.setType(attributes.getValue(OMDBConstants.TYPE));
                break;
        }
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName){
            case OMDBConstants.ELEMENT:
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