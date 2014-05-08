package Converters.DomParser.Utils;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;

public class DocumentHandler {
    public static Document getDocumentFromInputStream(InputStream inputStream){
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = getDocumentBuilder(documentBuilderFactory);
        Document document = getDocumentFromDocumentBuilder(documentBuilder, inputStream);
        return document;
    }

    private static DocumentBuilder getDocumentBuilder(DocumentBuilderFactory documentBuilderFactory){
        DocumentBuilder documentBuilder = null;
        try {
            documentBuilder = documentBuilderFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        return documentBuilder;
    }

    private static Document getDocumentFromDocumentBuilder(DocumentBuilder documentBuilder, InputStream inputStream){
        Document document = null;
        try {
            document = documentBuilder.parse(inputStream);
        } catch (SAXException | IOException e) {
            e.printStackTrace();
        }
        return document;
    }
}
