public class Mountainbike {
    private String marke;
    private double preis;
    private MountainbikeTyp typ; //Enum verwendet

    public Mountainbike (String marke, double preis, MountainbikeTyp typ) {
        this.marke = marke;
        this.preis = preis;
        this.typ = typ;
    }
    public void zeigeDetails() {
        System.out.println("Preis: " + preis);
        System.out.println("Mountainbike-Marke: " + marke);
        System.out.println("Typ: " + typ.getName());
        System.out.println("Beschreibung: " + typ.getBeschreibung());
    }
}
