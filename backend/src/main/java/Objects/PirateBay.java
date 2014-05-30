package objects;

public class PirateBay {
    private String id;
    private String name;
    private String category;
    private String magnet;
    private String uploaded;
    private String uploader;
    private String size;
    private String seeders;
    private String leechers;
    private String trusted;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMagnet() {
        return magnet;
    }

    public void setMagnet(String magnet) {
        this.magnet = magnet;
    }

    public String getUploaded() {
        return uploaded;
    }

    public void setUploaded(String uploaded) {
        this.uploaded = uploaded;
    }

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSeeders() {
        return seeders;
    }

    public void setSeeders(String seeders) {
        this.seeders = seeders;
    }

    public String getLeechers() {
        return leechers;
    }

    public void setLeechers(String leechers) {
        this.leechers = leechers;
    }

    public String getTrusted() {
        return trusted;
    }

    public void setTrusted(String trusted) {
        this.trusted = trusted;
    }
}
