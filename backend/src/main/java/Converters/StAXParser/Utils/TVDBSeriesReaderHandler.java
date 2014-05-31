package converters.staxparser.utils;

import converters.XMLSwitchHelper;
import objects.constants.TVDBSeriesConstants;
import objects.TVDBEpisode;
import objects.TVDBSeries;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;

public class TVDBSeriesReaderHandler {
    private static TVDBSeries tvdbSeries;
    private static TVDBEpisode tvdbEpisode;
    private static String content;

    public static TVDBSeries parse(XMLStreamReader xmlStreamReader) {
        while (XmlStreamReaderHelper.readerHasNext(xmlStreamReader)) {
            int event = XmlStreamReaderHelper.getNextEvent(xmlStreamReader);
            switchEvent(event, xmlStreamReader);
        }
        return tvdbSeries;
    }

    private static void switchEvent(int event, XMLStreamReader xmlStreamReader) {
        switch (event) {
            case XMLStreamConstants.START_ELEMENT:
                if(TVDBSeriesConstants.SERIES_ELEMENT.equals(xmlStreamReader.getLocalName())) {
                    tvdbSeries = new TVDBSeries();
                }
                if(TVDBSeriesConstants.EPISODE_ELEMENT.equals(xmlStreamReader.getLocalName())){
                    tvdbSeries.getTvdbEpisodeList().add(tvdbEpisode);
                    tvdbEpisode = new TVDBEpisode();
                }
                break;
            case XMLStreamConstants.CHARACTERS:
                content = xmlStreamReader.getText().trim();
                break;
            case XMLStreamConstants.END_ELEMENT:
                if(tvdbEpisode==null){
                    XMLSwitchHelper.switchTVDBSeries(tvdbSeries, xmlStreamReader.getLocalName(), content);
                } else {
                    XMLSwitchHelper.switchTVDBEpisode(tvdbEpisode, xmlStreamReader.getLocalName(), content);
                }
                break;
        }
    }
}
