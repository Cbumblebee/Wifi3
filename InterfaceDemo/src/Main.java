public class Main {
    public static void main(String[] args) {
        Drache eliot = new Drache();
        Drache smaug = new Drache();
        Elf legolas = new Elf();
        Meerjungfrau arielle = new Meerjungfrau();

        taucheMitCharakter(eliot);
        taucheMitCharakter(arielle);
    }
    public static void taucheMitCharakter (Schwimmer schwimmer) {
        schwimmer.schwimme();
    }
}