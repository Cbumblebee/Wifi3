public class Main {
    public static void main(String[] args) {
        Monate monat = Monate.FEBRUAR;
        System.out.println(monat.getName() + " hat " + monat.getDays() + " Tage.");
        if (monat.getJahreszeit() == Jahreszeiten.WINTER) {
            System.out.println("Dieser Monat ist im Winter.");
        }
        if (monat.in(Jahreszeiten.WINTER)) {
            System.out.println("Dieser Monat ist im Winter.");
        }
    }
}
