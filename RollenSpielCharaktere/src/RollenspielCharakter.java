public abstract class RollenspielCharakter {
    //abstrakte Klasse; man kann ihn als Datentyp angeben, aber nicht als Klasse instanzieren
    public String name;

    private int lebenspunkte;

    public RollenspielCharakter(String name, int lebenspunkte) {
           this.name = name;
           this.lebenspunkte = lebenspunkte;
    }
    public int getLebenspunkte() {
        return lebenspunkte;
    }
    public void setLebenspunkte(int lebenspunkte) {
        this.lebenspunkte = lebenspunkte;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void schadenNehmen (int schaden) {
        this.lebenspunkte -= schaden;
        System.out.println(this.name + " hat " + schaden + " Schaden genommen und hat nun " + this.lebenspunkte + " Lebenspkte.");
        if (this.lebenspunkte <= 0) {
            System.out.println(this.name + " ist besiegt.");
        }
    }

    public abstract void aktion(RollenspielCharakter gegner); //keine {}!!
}
