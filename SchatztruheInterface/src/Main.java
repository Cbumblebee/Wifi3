import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Schatztruhe truhe = new Schatztruhe();
        Spieler gamer = new Spieler();
        System.out.println("Wähle aus: \n" +
                            "1: interagiere mit der Schatztruhe\n " +
                            "2: untersuche die Schatztruhe\n" +
                            "3: beende das Spiel");
        while (true) {
            int userInteraction = scanner.nextInt();
            switch (userInteraction) {
                case(1): gamer.interagiereMitElement(truhe); break;
                case(2): gamer.untersucheElement(truhe); break;
                case(3): scanner.close(); break;
            }

        }
    }
}