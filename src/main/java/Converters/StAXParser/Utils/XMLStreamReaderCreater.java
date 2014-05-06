package Converters.StAXParser.Utils;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.InputStream;

public class XMLStreamReaderCreater {
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
}
