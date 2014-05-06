package Converters.DomParser.Utils;

import Objects.Constants.TVDBIMDBConstants;
import Objects.TVDBIMDB;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class TVDBIMDBNodeHandler {
    private static TVDBIMDB tvdbimdb;

    public static TVDBIMDB parse(Document document) {
        NodeList nodeList = document.getDocumentElement().getChildNodes();
        iterateNodeList(nodeList);
        return tvdbimdb;
    }

    private static void iterateNodeList(NodeList nodeList) {
        for(int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if(node instanceof Element) {
                if(tvdbimdb==null){
                    tvdbimdb = new TVDBIMDB();
                }
                NodeList childNodeList = node.getChildNodes();
                iterateChildNodeList(childNodeList);
            }
        }
    }

    private static void iterateChildNodeList(NodeList nodeList) {
        for(int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if(node instanceof Element) {
                extractInformationFromNode(node);
            }
        }
    }

    private static void extractInformationFromNode(Node node) {
        String content = node.getLastChild().getTextContent().trim();
        switch (node.getNodeName()) {
            case TVDBIMDBConstants.SERIES_ID:
                tvdbimdb.setSeriesId(content);
                break;
            case TVDBIMDBConstants.LANGUAGE:
                tvdbimdb.setLanguage(content);
                break;
            case TVDBIMDBConstants.SERIES_NAME:
                tvdbimdb.setSeriesName(content);
                break;
            case TVDBIMDBConstants.BANNER:
                tvdbimdb.setBanner(content);
                break;
            case TVDBIMDBConstants.OVERVIEW:
                tvdbimdb.setOverview(content);
                break;
            case TVDBIMDBConstants.FIRST_AIRED:
                tvdbimdb.setFirstAired(content);
                break;
            case TVDBIMDBConstants.IMDB_ID:
                tvdbimdb.setImdbId(content);
                break;
            case TVDBIMDBConstants.ID:
                tvdbimdb.setId(content);
                break;
        }
    }
}
