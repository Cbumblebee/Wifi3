public enum Monate {


    JANUAR("Januar",31, Jahreszeiten.WINTER),
    FEBRUAR("Februar",28, Jahreszeiten.WINTER),
    MAERZ("März",31, Jahreszeiten.FRUEHLING);
    private final String name;
    private final int days;
    private final Jahreszeiten jahreszeit;

    Monate(String name, int days, Jahreszeiten jahreszeit) {
        this.name = name;
        this.days = days;
        this.jahreszeit = jahreszeit;
    }

    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }

    public Jahreszeiten getJahreszeit() {
        return jahreszeit;
    }
    public boolean in(Jahreszeiten vergleichsJahreszeit) {
        return this.jahreszeit == vergleichsJahreszeit;
    }
}
