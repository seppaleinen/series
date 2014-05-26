package Torrent;

import com.turn.ttorrent.client.Client;
import com.turn.ttorrent.client.SharedTorrent;

import java.io.*;
import java.net.*;

public class TorrentClient {
    private static InetAddress address;

    public TorrentClient(){
        getAddress();
    }

    public void downloadTorrent(String pathToDir, String torrentURL){
        String path = this.getClass().getResource("/Torrent").getPath();
        SharedTorrent sharedTorrent = getSharedTorrent(pathToDir, torrentURL, path);
        Client client = getClient(sharedTorrent);
        client.setMaxDownloadRate(0);
        client.setMaxUploadRate(0);
        client.download();
    }

    private static Client getClient(SharedTorrent sharedTorrent){
        Client client = null;
        try {
            client = new Client(address, sharedTorrent);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return client;
    }

    private static SharedTorrent getSharedTorrent(String pathToDir, String torrentURL, String path){
        SharedTorrent sharedTorrent = null;
        File torrent = getFileFromURL(torrentURL, path);
        try {
            sharedTorrent = SharedTorrent.fromFile(torrent, new File(pathToDir));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sharedTorrent;
    }

    private static File getFileFromURL(String torrentURL, String path){
        String saveFilePath = null;
        try{
            URL url = new URL(torrentURL);
            HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
            int responseCode = httpConn.getResponseCode();

            // always check HTTP response code first
            if (responseCode == HttpURLConnection.HTTP_OK) {
                String fileName = "";
                String disposition = httpConn.getHeaderField("Content-Disposition");
                String contentType = httpConn.getContentType();
                int contentLength = httpConn.getContentLength();

                if (disposition != null) {
                    // extracts file name from header field
                    int index = disposition.indexOf("filename=");
                    if (index > 0) {
                        fileName = disposition.substring(index + 10,
                                disposition.length() - 1);
                        }
                    } else {
                    // extracts file name from URL
                    fileName = torrentURL.substring(torrentURL.lastIndexOf("/") + 1, torrentURL.length());
                    }

                System.out.println("Content-Type = " + contentType);
                System.out.println("Content-Disposition = " + disposition);
                System.out.println("Content-Length = " + contentLength);
                System.out.println("fileName = " + fileName);

                // opens input stream from the HTTP connection
                InputStream inputStream = httpConn.getInputStream();
                saveFilePath = path + File.separator + fileName;

                // opens an output stream to save into file
                FileOutputStream outputStream = new FileOutputStream(saveFilePath);

                int bytesRead = -1;
                byte[] buffer = new byte[4096];
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }

                outputStream.close();
                inputStream.close();

                System.out.println("File downloaded");
                } else {
                System.out.println("No file to download. Server replied HTTP code: " + responseCode);
            }
            httpConn.disconnect();
        }catch (Exception e){
            e.printStackTrace();
        }

        return new File(saveFilePath);
    }

    private void getAddress(){
        try {
            address = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
