
public class Main {
    public static void main(String[] args) {
        Kuenstler person = new Kuenstler("Die Fanta4","Deutschland");

        Album album1 = new Album("4:99", person, "Deutsch");
        Song song = new Song("Titel1", 5);
        album1.addSong("Song1", song);
        album1.viewAlbum();

    }
}