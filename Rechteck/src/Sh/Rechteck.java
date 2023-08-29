package Sh;

public class Rechteck {
    private double laenge;
    private double breite;

    public Rechteck() {
        this.laenge = 0;
        this.breite = 0;
    }

    public Rechteck(double laenge, double breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public double getLangeSeite() {
        if (breite > laenge) {
            return breite;
        }
        return laenge;
    }

    public void setSeiten(double l, double b) {
        this.breite = b;
        this.laenge = l;
    }

    public double getKurzeSeite() {
        if (this.breite<this.laenge) {
            return this.breite;
        }
        return this.laenge;
    }

    public double getDiagonale() {
        return Math.sqrt(laenge*laenge + breite*breite);
    }

    public double getFlaeche() {
        return laenge * breite;
    }

    public double getUmfang() {
        return 2 * laenge + 2 * breite;
    }
}