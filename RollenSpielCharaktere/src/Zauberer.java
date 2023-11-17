public class Zauberer extends RollenspielCharakter {

    public Zauberer(String name) {
        super(name, 80);
    }

    @Override
    public void aktion(RollenspielCharakter gegner) {
        System.out.println(getName() + " wirft den Feuerball!"); //this.getName geht auch
        gegner.schadenNehmen(50);
    }
}
