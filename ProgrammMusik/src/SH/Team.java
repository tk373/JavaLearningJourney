package SH;

public class Team {

    /**
     * Klasse zur Applikationsausführung (ohne Objektcharakter). Dient der Erzeugung
     * der benötigten Objekte und der Regelung der Methodenaufrufe.
     */

        public static void main(String[] args) {
            Instrument gitarre = new Instrument("gitarre");
            Instrument Klavier = new Instrument("klavier");

            Musiker Alfredo = new Musiker("Alfredo", gitarre);
            Musiker CapitalBre = new Musiker("CapitalBre", Klavier);

            Alfredo.spielNote('a');
            CapitalBre.spielNote('f');
        }
    }

