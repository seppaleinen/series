public class MediaInfo {
    private static final String SEPARATOR = System.getProperty("file.separator");

    public String getFilenameFromPath(String mediaPath){
        String[] splitMediaPath = mediaPath.split(SEPARATOR);
        int arrayLength = splitMediaPath.length - 1;
        String filename = splitMediaPath[arrayLength];
        return filename;
    }
}
