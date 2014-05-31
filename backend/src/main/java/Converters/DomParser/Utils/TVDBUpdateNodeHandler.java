package converters.domparser.utils;

import converters.XMLSwitchHelper;
import objects.TVDBUpdate;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class TVDBUpdateNodeHandler {
    private TVDBUpdate tvdbUpdate;
    public TVDBUpdateNodeHandler(){}

    public TVDBUpdate parse(Document document) {
        NodeList nodeList = document.getDocumentElement().getChildNodes();
        iterateNodeList(nodeList);
        return tvdbUpdate;
    }

    private void iterateNodeList(NodeList nodeList) {
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

    private void extractInformationFromNode(Node node) {
        if(node.getLastChild()!=null) {
            String content = node.getLastChild().getTextContent().trim();
            XMLSwitchHelper.switchTVDBUpdate(tvdbUpdate, node.getNodeName(), content);
        }
    }
}
