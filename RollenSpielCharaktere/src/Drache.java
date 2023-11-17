public abstract class Drache extends RollenspielCharakter {
    //da selbst eine abstrakte Klasse, braucht es aktion() nd
    public Drache(String name) {
        super(name, 200);
    }

    public abstract void spucken();
        //Feuer spucken
        //jede Klasse, die davon erbt, muss das implementieren

    public void fliegen() {
        System.out.println("Drache fliegt");
    }
}
