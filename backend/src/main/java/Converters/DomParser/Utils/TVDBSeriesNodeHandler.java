package converters.domparser.utils;

import converters.XMLSwitchHelper;
import objects.TVDBEpisode;
import objects.TVDBSeries;
import objects.constants.TVDBSeriesConstants;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class TVDBSeriesNodeHandler {
    private TVDBSeries tvdbSeries;
    private TVDBEpisode tvdbEpisode;

    public TVDBSeriesNodeHandler(){}

    public TVDBSeries parse(Document document) {
        NodeList nodeList = document.getDocumentElement().getChildNodes();
        iterateNodeList(nodeList);
        return tvdbSeries;
    }

    private void iterateNodeList(NodeList nodeList) {
        for(int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if(node instanceof Element) {
                String tagName = ((Element) node).getTagName();
                if(TVDBSeriesConstants.SERIES_ELEMENT.equals(tagName) && tvdbSeries==null){
                    tvdbSeries = new TVDBSeries();
                } else if(TVDBSeriesConstants.EPISODE_ELEMENT.equals(tagName)){
                    tvdbSeries.getTvdbEpisodeList().add(tvdbEpisode);
                    tvdbEpisode = new TVDBEpisode();
                }
                NodeList childNodeList = node.getChildNodes();
                iterateChildNodeList(childNodeList);
            }
        }
    }

    private void iterateChildNodeList(NodeList nodeList) {
        for(int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if(node instanceof Element) {
                extractInformationFromNode(node);
            }
        }
    }

    private void extractInformationFromNode(Node node) {
        if(node.getLastChild()!=null) {
            String content = node.getLastChild().getTextContent().trim();
            if(tvdbEpisode != null){
                XMLSwitchHelper.switchTVDBEpisode(tvdbEpisode, node.getNodeName(), content);
            } else{
                XMLSwitchHelper.switchTVDBSeries(tvdbSeries, node.getNodeName(), content);
            }
        }
    }
}
