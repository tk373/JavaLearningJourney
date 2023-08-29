package sh;

import Sh.Rechteck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RechteckTest {

    @Test
    void getLangeSeite_WennLaengeKleinerBreite_ErwarteteBreiteSeite() {
        // arrange
        double laenge = 50;
        double breite = 51;
        double erwarte = breite;
        Rechteck rechteck = new Rechteck(laenge, breite);
        // act
        double resultat = rechteck.getLangeSeite();
        //assert
        assertEquals(erwarte, resultat);

    }

    @Test
    void getBreiteSeite_WennBreiteKleinerLaenge_ErwarteteBreiteSeite() {
        // arrange
        double breite = 51;
        double laenge = 50;
        double erwarte = breite;
        Rechteck rechteck = new Rechteck(laenge, breite);
        // act
        double resultat = rechteck.getBreite();
        // assert
        assertEquals(erwarte, resultat);
    }

    @Test
    void getBreite_WennBreiteGleichLaenge_erwarteBreiteSeite() {
        // arrange
        double breite = 50;
        double laenge = 50;
        double erwarte = breite;
        Rechteck rechteck = new Rechteck(laenge, breite);
        // act
        double resultat = rechteck.getBreite();
        // assert
        assertEquals(erwarte, resultat);
    }

    @Test
    public void getbreite_obDefaultGleichNull_erwarteBreiteSeite() {
        // arrange
        double erwarte = 0;
        Rechteck rechteck = new Rechteck();
        // act
        double resultat = rechteck.getBreite();
        // assert
        assertEquals(erwarte, resultat);
    }




    @Test
    void getDiagonale() {
        // arrange
        double laenge = 1;
        double breite = 2;
        Rechteck rechteck = new Rechteck(laenge, breite);
        // act
        double diagonale = rechteck.getDiagonale();
        // assert
        assertEquals(2.2361, diagonale, 0.0001);
    }

    @Test
    void getUmfang_umfangBerechnen_erwartetUmfang() {

    }
}