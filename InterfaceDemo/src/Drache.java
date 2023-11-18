public class Drache implements Flieger, Schwimmer {
    @Override
    public void fliege() {
        System.out.println("Der Drache fliegt.");
    }
    @Override
    public void schwimme() {
        System.out.println("Der Drache schwimmt.");
    }
}
