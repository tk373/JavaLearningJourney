package bwz.m226b.uebungen.u8;

public class AutoApp {

    public static void main(String[] args) {
        Parkplatz parkplatz = new Parkplatz();
        //
        parkplatz.addAuto(new Auto("Toyota", "ZH 333444"));
        parkplatz.addAuto(new Auto("VW", "GE 111222"));
        parkplatz.addAuto(new Auto("Porsche", "BE 1"));
        parkplatz.addAuto(new Auto("Fiat", "TI 5556677"));
        //
        parkplatz.sortiereAuto();
        print(parkplatz);
        //
        parkplatz.removeAuto(2);
        print(parkplatz);
        //
        Auto a = parkplatz.getAuto(1);
        parkplatz.removeAuto(a);
        print(parkplatz);
    }

    public static void print(Parkplatz liste) {
        for (int i = 0; i < liste.getSize(); i++) {
            System.out.println("Auto " + i + ": " + liste.getKennzeichen(i) + " - " + liste.getMarke(i));
        } // end of for
        System.out.println("--------------------------------------");
    }
}
