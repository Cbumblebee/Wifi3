public class Song {
    private String title;
    private int spieldauer;

    public Song (String title, int spieldauer) {
        this.title = title;
        this.spieldauer = spieldauer;
    }

    public String getTitle() {
        return title;
    }

    public int getSpieldauer() {
        return spieldauer;
    }
}
