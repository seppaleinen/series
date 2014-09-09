//package integrations.urlimpl;
//
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//
//import java.io.IOException;
//
//public class TorrentLeechCrawler {
//    protected Document getDocumentFromURL(String url){
//        Document document = null;
//        try {
//            document = Jsoup.connect(url).get();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return document;
//    }
//
//    protected boolean login(String username, String password){
//        return false;
//    }
//}
