package Converters.DomParser.Utils;

import Converters.XMLSwitchHelper;
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
        if(node.getLastChild()!=null) {
            String content = node.getLastChild().getTextContent().trim();
            XMLSwitchHelper.switchTVDBIMDB(tvdbimdb, node.getNodeName(), content);
        }
    }
}
