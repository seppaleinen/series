package converters.staxparser.utils;

import converters.XMLSwitchHelper;
import objects.constants.TVDBSeriesConstants;
import objects.TVDBEpisode;
import objects.TVDBSeries;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TVDBSeriesReaderHandler {
    private List<TVDBSeries> tvdbSeriesList = new ArrayList<>();

    private TVDBSeries tvdbSeries;
    private TVDBEpisode tvdbEpisode;
    private String content;

    public List<TVDBSeries> parse(XMLStreamReader xmlStreamReader) {
        while (XmlStreamReaderHelper.readerHasNext(xmlStreamReader)) {
            int event = XmlStreamReaderHelper.getNextEvent(xmlStreamReader);
            switchEvent(event, xmlStreamReader);
        }
        return tvdbSeriesList;
    }

    private void switchEvent(int event, XMLStreamReader xmlStreamReader) {
        switch (event) {
            case XMLStreamConstants.START_ELEMENT:
                if(TVDBSeriesConstants.SERIES_ELEMENT.equals(xmlStreamReader.getLocalName())) {
                    tvdbSeries = new TVDBSeries();
                }
                if(TVDBSeriesConstants.EPISODE_ELEMENT.equals(xmlStreamReader.getLocalName())){
                    tvdbSeries.getTvdbEpisodeList().add(tvdbEpisode);
                    tvdbEpisode = new TVDBEpisode();
                }
                content = null;
                break;
            case XMLStreamConstants.CHARACTERS:
                if(content == null){
                    content = xmlStreamReader.getText();
                } else {
                    content += xmlStreamReader.getText();
                }
                break;
            case XMLStreamConstants.END_ELEMENT:
                if(tvdbEpisode==null){
                    XMLSwitchHelper.switchTVDBSeries(tvdbSeriesList, tvdbSeries, xmlStreamReader.getLocalName(), content);
                } else {
                    XMLSwitchHelper.switchTVDBEpisode(tvdbEpisode, xmlStreamReader.getLocalName(), content);
                }
                break;
        }
    }
}
