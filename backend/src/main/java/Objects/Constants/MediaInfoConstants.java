package objects.constants;

public enum MediaInfoConstants {
    FILENAME(1),
    FOLDERNAME(2);

    private int index;

    MediaInfoConstants(int index){
        this.index = index;
    }

    public int getNumber(){
        return index;
    }
}
