import java.util.*;

public class Spiel {
    private List<String> gegenstaende;
    private Set<String> einzigartigeGegenstaende;
    private Map<String, String> karte;
    private Queue<String> ereignisse;

    public Spiel () {
        this.gegenstaende = new ArrayList<>();
        this.einzigartigeGegenstaende = new HashSet<>();
        this.karte = new HashMap<>();
        this.ereignisse = new LinkedList<>();
    }

    public void erkunden() {
        System.out.println("Du erkundest die Umgebung...");

        karte.put("Verlassene Hühle", "Geheimnisvoller Kristall");
        System.out.println("Entdecker Ort: " + karte);
    }
    public void sammeln() {
        System.out.println("Du sammelst Gegenstände");
        gegenstaende.add("mysteriöser Stein");
        System.out.println("Gegenstände gesammelt: " + gegenstaende);
        einzigartigeGegenstaende.add("Antike Mütze");
        System.out.println("Einzigartige Gegenstände gesammelt: " + einzigartigeGegenstaende);
        ereignisse.add("Ein wildes Tier erscheint!");
        System.out.println("Aktuelle ereignisse: " + ereignisse);
    }
}
