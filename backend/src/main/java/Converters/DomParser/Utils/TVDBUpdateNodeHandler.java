package Converters.DomParser.Utils;

import Converters.XMLSwitchHelper;
import Objects.TVDBUpdate;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class TVDBUpdateNodeHandler {
    private static TVDBUpdate tvdbUpdate;

    public static TVDBUpdate parse(Document document) {
        NodeList nodeList = document.getDocumentElement().getChildNodes();
        iterateNodeList(nodeList);
        return tvdbUpdate;
    }

    private static void iterateNodeList(NodeList nodeList) {
        for(int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if(node instanceof Element) {
                if(tvdbUpdate==null){
                    tvdbUpdate = new TVDBUpdate();
                }
                extractInformationFromNode(node);
            }
        }
    }

    private static void extractInformationFromNode(Node node) {
        if(node.getLastChild()!=null) {
            String content = node.getLastChild().getTextContent().trim();
            XMLSwitchHelper.switchTVDBUpdate(tvdbUpdate, node.getNodeName(), content);
        }
    }
}
