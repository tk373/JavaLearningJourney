package bwz.m320.u18.src;

public class Mitarbeiter extends Person {

    private int persNr;

    public Mitarbeiter(String name) {
        super(name);
    }

    public int getPersNr() {
        return persNr;
    }

    public void setPersNr(int persNr) {

        this.persNr = persNr;
    }

    public void print() {

        System.out.println("Mitarbeiter: name=" + name + ", alter=" + alter + ", persNr=" + persNr);
    }
}


