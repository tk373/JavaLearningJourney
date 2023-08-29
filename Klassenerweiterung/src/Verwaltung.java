package bwz.m320.u18.src;

public class Verwaltung {

    public static void main(String[] args) {
        //aufgabe 1
        Person p = new Person("Willi");
        p.setAlter(12);
        p.print();

        Mitarbeiter m = new Mitarbeiter("ueli");
        m.setPersNr(12);
        m.setAlter(30);

        m.print();

        //aufgabe konstruktor
        Mitarbeiter m2 = new Mitarbeiter("test");
        m2.setPersNr(7);
        m2.setAlter(30);

        m2.print();
    }
}
