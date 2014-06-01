package converters.saxparser.utils;

import converters.XMLSwitchHelper;
import objects.constants.TVDBSeriesConstants;
import objects.TVDBEpisode;
import objects.TVDBSeries;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class TVDBSeriesHandler extends DefaultHandler {
    private List<TVDBSeries> tvdbSeriesList = new ArrayList<>();

    private TVDBSeries tvdbSeries;
    private TVDBEpisode tvdbEpisode;
    private String content;

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case TVDBSeriesConstants.SERIES_ELEMENT:
                tvdbSeries = new TVDBSeries();
                break;
            case TVDBSeriesConstants.EPISODE_ELEMENT:
                tvdbSeries.getTvdbEpisodeList().add(tvdbEpisode);
                tvdbEpisode = new TVDBEpisode();
                break;
        }
        content = null;
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(tvdbEpisode == null){
            XMLSwitchHelper.switchTVDBSeries(tvdbSeriesList, tvdbSeries, qName, content);
        } else {
            XMLSwitchHelper.switchTVDBEpisode(tvdbEpisode, qName, content);
        }
    }
    public void characters(char[] ch, int start, int length) throws SAXException {
        if(content==null){
            content = String.copyValueOf(ch, start, length);
        } else {
            content += String.copyValueOf(ch, start, length);
        }
    }

    public List<TVDBSeries> getTVDBSeries(){
        return tvdbSeriesList;
    }
}