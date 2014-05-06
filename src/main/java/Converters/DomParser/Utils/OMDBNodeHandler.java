package Converters.DomParser.Utils;

import Objects.Constants.OMDBConstants;
import Objects.OMDB;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class OMDBNodeHandler {
    private static OMDB omdb;
    public static OMDB parse(Document document) {
        NodeList nodeList = document.getDocumentElement().getChildNodes();
        iterateNodeList(nodeList);
        return omdb;
    }

    private static void iterateNodeList(NodeList nodeList) {
        for(int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if(node instanceof Element) {
                if(omdb==null){
                    omdb = new OMDB();
                }
                omdb.setTitle(node.getAttributes().getNamedItem(OMDBConstants.TITLE).getNodeValue());
                omdb.setYear(node.getAttributes().getNamedItem(OMDBConstants.YEAR).getNodeValue());
                omdb.setRated(node.getAttributes().getNamedItem(OMDBConstants.RATED).getNodeValue());
                omdb.setReleased(node.getAttributes().getNamedItem(OMDBConstants.RELEASED).getNodeValue());
                omdb.setRuntime(node.getAttributes().getNamedItem(OMDBConstants.RUNTIME).getNodeValue());
                omdb.setGenre(node.getAttributes().getNamedItem(OMDBConstants.GENRE).getNodeValue());
                omdb.setDirector(node.getAttributes().getNamedItem(OMDBConstants.DIRECTOR).getNodeValue());
                omdb.setWriter(node.getAttributes().getNamedItem(OMDBConstants.WRITER).getNodeValue());
                omdb.setActors(node.getAttributes().getNamedItem(OMDBConstants.ACTORS).getNodeValue());
                omdb.setPlot(node.getAttributes().getNamedItem(OMDBConstants.PLOT).getNodeValue());
                omdb.setLanguage(node.getAttributes().getNamedItem(OMDBConstants.LANGUAGE).getNodeValue());
                omdb.setCountry(node.getAttributes().getNamedItem(OMDBConstants.COUNTRY).getNodeValue());
                omdb.setAwards(node.getAttributes().getNamedItem(OMDBConstants.AWARDS).getNodeValue());
                omdb.setPoster(node.getAttributes().getNamedItem(OMDBConstants.POSTER).getNodeValue());
                omdb.setMetascore(node.getAttributes().getNamedItem(OMDBConstants.METASCORE).getNodeValue());
                omdb.setImdbRating(node.getAttributes().getNamedItem(OMDBConstants.IMDB_RATING).getNodeValue());
                omdb.setImdbVotes(node.getAttributes().getNamedItem(OMDBConstants.IMDB_VOTES).getNodeValue());
                omdb.setImdbID(node.getAttributes().getNamedItem(OMDBConstants.IMDB_ID).getNodeValue());
                omdb.setType(node.getAttributes().getNamedItem(OMDBConstants.TYPE).getNodeValue());
            }
        }
    }
}
