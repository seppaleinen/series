package converters.staxparser.utils;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.InputStream;

public class XmlStreamReaderHelper {
    private XmlStreamReaderHelper(){}

    public static XMLStreamReader getXMLStreamReader(InputStream inputStream){
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        return createXmlStreamReader(xmlInputFactory, inputStream);
    }

    private static XMLStreamReader createXmlStreamReader(XMLInputFactory xmlInputFactory, InputStream inputStream) {
        XMLStreamReader xmlStreamReader = null;
        try {
            xmlStreamReader = xmlInputFactory.createXMLStreamReader(inputStream);
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
        return xmlStreamReader;
    }

    public static boolean readerHasNext(XMLStreamReader xmlStreamReader) {
        boolean hasNext = false;
        try {
            hasNext = xmlStreamReader.hasNext();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
        return hasNext;
    }

    public static int getNextEvent(XMLStreamReader xmlStreamReader) {
        Integer event = null;
        try {
            event = xmlStreamReader.next();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
        return event;
    }

}
