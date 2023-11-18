import java.util.ArrayList;
import java.util.Map;

public class Album {
    private String name;
    private Kuenstler kuenstler;
    private String language;
    private ArrayList<Song> list;

    public Album(String name, Kuenstler kuenstler, String language) {
        this.name = name;
        this.kuenstler = kuenstler;
        this.language = language;
    }

    public void addSong(String name, Song song) {
        list.add(song);
    }

    public String getName() {
        return name;
    }

    public Kuenstler getKuenstler() {
        return kuenstler;
    }

    public String getLanguage() {
        return language;
    }

    public String viewAlbum() {
        StringBuilder sb = new StringBuilder();
        sb.append("Album: " + this.getName());
        sb.append("vom Künstler: " + kuenstler.getName());
        sb.append("Land: " + kuenstler.getHerkunftsland());
        sb.append("----------------");
        for (int i = 0; i < list.size(); i++) {
            sb.append("" + i + ". " + list.get(i).getTitle() + " -- " + list.get(i).getSpieldauer());
        }
        return sb.toString();
    }
}
