package converters.domparser.utils;

import converters.XMLSwitchHelper;
import objects.TVDBEpisode;
import objects.TVDBSeries;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class TVDBSeriesNodeHandler {
    private static TVDBSeries tvdbSeries;
    private static TVDBEpisode tvdbEpisode;

    private TVDBSeriesNodeHandler(){}

    public static TVDBSeries parse(Document document) {
        NodeList nodeList = document.getDocumentElement().getChildNodes();
        iterateNodeList(nodeList);
        return tvdbSeries;
    }

    private static void iterateNodeList(NodeList nodeList) {
        for(int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if(node instanceof Element) {
                if(tvdbSeries==null){
                    tvdbSeries = new TVDBSeries();
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
        if(node.getLastChild()!=null) {
            String content = node.getLastChild().getTextContent().trim();
            XMLSwitchHelper.switchTVDBSeries(tvdbSeries, tvdbEpisode, node.getNodeName(), content);
        }
    }
}
