package Converters.DomParser.Utils;

import Converters.XMLSwitchHelper;
import Objects.OMDB;
import org.w3c.dom.*;

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
                NamedNodeMap attributes = node.getAttributes();
                iterateNamedNodeMap(attributes);
            }
        }
    }

    private static void iterateNamedNodeMap(NamedNodeMap namedNodeMap) {
        for(int j = 0; j < namedNodeMap.getLength(); j++) {
            Node node = namedNodeMap.item(j);
            extractInformationFromNode(node);
        }
    }

    private static void extractInformationFromNode(Node node) {
        if(node.getLastChild()!=null) {
            String content = node.getLastChild().getTextContent().trim();
            XMLSwitchHelper.switchOMDB(omdb, node.getNodeName(), content);
        }
    }

}
