public class RiesenschneckenDrache extends Drache {
    public RiesenschneckenDrache(String name) {
        super(name);
    }
    @Override
    public void spucken () {
        System.out.println(" spuckt furchtbaren Schleim!");
    }

    @Override
    public void aktion(RollenspielCharakter gegner) {
        System.out.println(getName()); //this.getName geht auch
        spucken();
        gegner.schadenNehmen(60);
    }
}
