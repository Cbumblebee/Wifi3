import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Willkommen im Abenteuer!");
        Spiel spiel = new Spiel();
        String eingabe;
        while (true) {
            System.out.println("Was magst tun? (erkunden/sammeln/beenden) ");
            eingabe = scanner.nextLine();

            switch (eingabe) {
                case "erkunden": spiel.erkunden(); break;
                case "sammeln": spiel.sammeln(); break;
                case "beenden": System.out.println("spiel beendet"); return;
                default: System.out.println("Ungültige Eingabe");
            }
        }

    }
}