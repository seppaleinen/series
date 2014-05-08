package Converters.StAXParser.Utils;

import Objects.Constants.OMDBConstants;
import Objects.OMDB;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;

public class OMDBReaderHandler {
    private static OMDB omdb;

    public static OMDB parse(XMLStreamReader xmlStreamReader) {
        while (XmlStreamReaderHelper.readerHasNext(xmlStreamReader)) {
            int event = XmlStreamReaderHelper.getNextEvent(xmlStreamReader);
            switchEvent(event, xmlStreamReader);
        }
        return omdb;
    }

    private static void switchEvent(int event, XMLStreamReader xmlStreamReader) {
        switch (event) {
            case XMLStreamConstants.START_ELEMENT:
                if(OMDBConstants.ELEMENT.equals(xmlStreamReader.getLocalName())) {
                    omdb = new OMDB();
                    omdb.setTitle(xmlStreamReader.getAttributeValue(0));
                    omdb.setYear(xmlStreamReader.getAttributeValue(1));
                    omdb.setRated(xmlStreamReader.getAttributeValue(2));
                    omdb.setReleased(xmlStreamReader.getAttributeValue(3));
                    omdb.setRuntime(xmlStreamReader.getAttributeValue(4));
                    omdb.setGenre(xmlStreamReader.getAttributeValue(5));
                    omdb.setDirector(xmlStreamReader.getAttributeValue(6));
                    omdb.setWriter(xmlStreamReader.getAttributeValue(7));
                    omdb.setActors(xmlStreamReader.getAttributeValue(8));
                    omdb.setPlot(xmlStreamReader.getAttributeValue(9));
                    omdb.setLanguage(xmlStreamReader.getAttributeValue(10));
                    omdb.setCountry(xmlStreamReader.getAttributeValue(11));
                    omdb.setAwards(xmlStreamReader.getAttributeValue(12));
                    omdb.setPoster(xmlStreamReader.getAttributeValue(13));
                    omdb.setMetascore(xmlStreamReader.getAttributeValue(14));
                    omdb.setImdbRating(xmlStreamReader.getAttributeValue(15));
                    omdb.setImdbVotes(xmlStreamReader.getAttributeValue(16));
                    omdb.setImdbID(xmlStreamReader.getAttributeValue(17));
                    omdb.setType(xmlStreamReader.getAttributeValue(18));
                }
                break;
        }
    }}
