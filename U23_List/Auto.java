package bwz.m226b.uebungen.u8;


public class Auto implements Comparable<Auto> {


    private String marke;
    private String kennzeichen;

    /**
     * erstellt auto mit marke und kennzeichen.
     *
     * @param marke       marke des autos.
     * @param kennzeichen kennzeichen.
     */
    public Auto(String marke, String kennzeichen) {
        this.marke = marke;
        this.kennzeichen = kennzeichen;
    }

    public String getMarke() {

        return marke;
    }

    public void setMarke(String marke) {

        this.marke = marke;
    }

    public String getKennzeichen() {

        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {

        this.kennzeichen = kennzeichen;
    }

    public int compareTo(Auto auto) {
        int compareKennzeichen = this.kennzeichen.compareTo(auto.kennzeichen);

        return compareKennzeichen;
    }

}
