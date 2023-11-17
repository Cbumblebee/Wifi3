public abstract class MusikAbspielGeraet {

    private String device;

    public MusikAbspielGeraet(String device) {
        this.device = device;
    }

    public void einlegen(Tontraeger tt) {
        System.out.println("Ich lege  mit " + this.device +  " " + tt.getTitel() + " ein.");
    }
    public void abspielen(Tontraeger tt) {
        System.out.println("Ich spiele  mit " + this.device + " " + tt.getTitel() + " ab.");
    }
    public void hoeren(Tontraeger tt) {
        System.out.println("Ich höre mit " + this.device +  " " + " die Musik von " + tt.getTitel());
    }
    public void auswerfen(Tontraeger tt) {
        System.out.println("ich werfe  mit " + this.device + " " + tt.getTitel() + " aus.");
    }
}
