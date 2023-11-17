// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Krieger krieger = new Krieger("Conan");
        Zauberer zauberer = new Zauberer("Gandalf");
        RiesenschneckenDrache schleimDrache = new RiesenschneckenDrache("Schleimi");

        krieger.aktion(zauberer);
        zauberer.aktion(schleimDrache);
        schleimDrache.aktion(krieger);

        schleimDrache.fliegen();
    }
}