package shBWZ;

public class RabbatRechner {
    private double betragsRabatte[] = new double[3];
    private double mengenRabatte[] = new double[3];

    public double[] getBetragsRabatte() {
        return betragsRabatte;
    }

    public void setBetragsRabatte(double[] betragsRabatte) {
        this.betragsRabatte = betragsRabatte;
    }

    public double[] getMengenRabatte() {
       return mengenRabatte;
    }

    public void setMengenRabatte(double[] mengenRabatte) {
        this.mengenRabatte = mengenRabatte;
    }
    public RabbatRechner(){
        betragsRabatte[0]=0.005;
        betragsRabatte[1]=0.01;
        betragsRabatte[2]=0.015;
        mengenRabatte[0]=0.005;
        mengenRabatte[1]=0.01;
        mengenRabatte[2]=0.15;
    }
    public RabbatRechner(double[] betragsRabatte){
        this.betragsRabatte = betragsRabatte;
        mengenRabatte[0]=0.005;
        mengenRabatte[1]=0.01;
        mengenRabatte[2]=0.15;
    }
    public RabbatRechner(double[] betragsRabatte ,double[] mengenRabatte ){
     this.betragsRabatte = betragsRabatte;
     this.mengenRabatte = mengenRabatte;
    }
    public double berechneBetragsRabatt(double betrag){

        if (betrag >= 10000){
            betrag=betrag*betragsRabatte[2];
            return betrag;
        } else if (betrag >=5000) {
            betrag=betrag*betragsRabatte[1];
            return betrag;
        } else if (betrag >= 1000) {
            betrag= betrag*betragsRabatte[0];
            return betrag;
        }else {
            return 0;
        }
    }
    public double berechneMengenRabatt(int stueckzahl, double artikelPreis){
        if (artikelPreis >=100){
            artikelPreis=artikelPreis*betragsRabatte[2];
            return artikelPreis;
        } else if (artikelPreis >= 50) {
            artikelPreis=artikelPreis*betragsRabatte[1];
            return artikelPreis;
        } else if (artikelPreis >= 10) {
            artikelPreis=artikelPreis*betragsRabatte[0];
            return artikelPreis;
        }else {
            return 0;
        }
    }
    public double berechneGesamtRabatt(int stueckzahl, double artikelPreis){
        return 0;
    }






}
