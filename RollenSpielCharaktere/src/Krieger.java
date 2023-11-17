public class Krieger extends RollenspielCharakter {

    public Krieger(String name) {
        super(name, 150);
    }

    @Override
    public void aktion(RollenspielCharakter gegner) {
        System.out.println(getName() + " schlägt mit dem Schwert!"); //this.getName geht auch
        gegner.schadenNehmen(30);
    }
}
