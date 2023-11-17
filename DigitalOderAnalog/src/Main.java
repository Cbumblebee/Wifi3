// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MusikAbspielGeraet schallplattenSpieler = new SchallplattenSpieler();
        schallplattenSpieler.hoeren(new LP("Jimi Hendrix"));
        MusikAbspielGeraet cdPlayer = new CDPlayer();
        cdPlayer.auswerfen(new LP("Jimi Hendrix"));
        cdPlayer.hoeren(new CD("Jimi Hendrix"));
        MusikAbspielGeraet mp3Player = new MP3Player();
        mp3Player.abspielen(new MP3("Jimi Hendrix"));
        MusikAbspielGeraet kassettenRekorder = new KassettenRekorder();
        kassettenRekorder.hoeren(new Kassette("Jimi Hendrix"));
    }
}