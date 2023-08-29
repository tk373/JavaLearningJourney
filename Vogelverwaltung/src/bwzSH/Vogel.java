package bwzSH;

public class Vogel {
    private String farbe;

    public Vogel(){
        System.out.println();
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public String getSchnabelform() {
        return schnabelform;
    }

    public void setSchnabelform(String schnabelform) {
        this.schnabelform = schnabelform;
    }

    private String schnabelform;

    public void fliegen(){
        System.out.println("Vogel.fliegen()");
    }
}
