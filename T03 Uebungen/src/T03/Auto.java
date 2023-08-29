package T03;

public class Auto {
    private String marke;
    private  String modell;
    private String lmaoPS;
    private String farbe;
    private String anzahlSitze;
    private String nutzlast;



    private String getLeistug() {return this.lmaoPS;}

    public String getLmaoPS() {
        return lmaoPS;
    }

    public void setLmaoPS(String lmaoPS) {
        this.lmaoPS = lmaoPS;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public String getAnzahlSitze() {
        return anzahlSitze;
    }

    public void setAnzahlSitze(String anzahlSitze) {
        this.anzahlSitze = anzahlSitze;
    }

    public String getNutzlast() {
        return nutzlast;
    }

    public void setNutzlast(String nutzlast) {
        this.nutzlast = nutzlast;
    }

    private void beschleunigung(){}
    private void  bremsen(){}
    private void dingeOeffnen(){}
    private void licher(){}
}
