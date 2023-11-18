public class Schatztruhe implements InteraktivesElement, Inspektion {
    private boolean verschlossen = true;
    private String[] list = {"Goldmünzen", "Degen", "Azthekengold"};
    private int tries = 5;

    @Override
    public void untersuche() {
        String curr;
        if (verschlossen) {
            curr = " verschlossen. Finde den Schlüssel!";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("| ");
            for (String item : list) {
                sb.append(item + " | ");
            }
            curr = " offen. Gut gemacht! Die Kiste enthält: " + sb;
        }
        System.out.println("Die Truhe ist" + curr);
    }

    @Override
    public void interagiere() {
        if (verschlossen) {
            tries--;
            System.out.println("Suche Schlüssel... prüfe, ob du ihn gefunden hast!");
            aktualisiereStatus();
        } else  {
            untersuche();
        }
    }

    @Override
    public void aktualisiereStatus() {
        if (tries <= 0) {
            verschlossen = false;
        }
    }
}
