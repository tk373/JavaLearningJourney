package main;

public class Auto {
    public Auto(String nrSchild, Fahrer fahrer) {
        this.nrSchild = nrSchild;
        this.fahrer[cnt] = fahrer;
        this.cnt++;
    }

    //Atribute der Klasse
    private String nrSchild = ("SG 999");
    private Fahrer fahrer[] = new Fahrer[10];
    private int cnt = 0;

    public Auto(){}
    public String getNrSchild(){
        return nrSchild;
    }

    public void setNrSchild(String nrSchild) {
        this.nrSchild = nrSchild;
    }

    public Fahrer[] getFahrer() {
        return fahrer;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public void setFahrer(Fahrer fahrer) {
        this.fahrer[cnt] = fahrer;
        this.cnt++;
    }
}
