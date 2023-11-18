public enum MountainbikeTyp {
    DOWNHILL("Downhill", "Entwickelt für schnelle Abfahrten"),
    FULLY("Fully", "Vollgefedert, versch. Terrains"),
    HARDTAIL("Hardtail", "Bike mit Frontfederung, festem Heck");

    private final String name;
    private final String beschreibung;

    MountainbikeTyp(String name, String beschreibung) {
        this.name = name;
        this.beschreibung = beschreibung;
    }

    public String getName() {
        return name;
    }
    public String getBeschreibung() {
        return beschreibung;
    }
}
