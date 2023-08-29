package ch.bwzrappi.m226.u15;

/**
 * Die Bibliothek verwaltet eine Vielzahl von Büchern.
 *
 * <p>Ein neues Buch wird der Bibliothek mit addBook() zugefügt.</p>
 *
 * <p>Bücher können innerhalb der Bibliothek über den Titel oder
 * die ISBN-Nummer gesucht werden. Dies erfolgt über die Methoden
 * searchBookByTitle() bzw. searchBookByISBN().</p>
 *
 * <p>Für die Ausleihe wird ein Buch entweder über den Standort oder die
 * Referenz des Buchs identifiziert. Ist ein Buch ausgeliehen, erscheint es
 * nicht mehr im Inventar der Bibkliothek.<br>
 * Die Ausleihe erfolgt über die Methode getBook().</p>
 *
 * <p>Wird ein Buch zurückgebracht, wird es mit putBook() wieder in die
 * Bibliothek eingetragen (und erscheint somit wieder im Inventar).</p>
 *
 * <p>Mit removeBook() wird ein Buch definitiv aus der Bibliothek ausgetragen
 * (entfernt).</p>
 *
 * <p>Um den Bestand der Bibliothek zu überprüfen, kann das Inventar der
 * vorhandenen Bücher abgerufen werden. Dabei werden Bücher, die in der
 * Ausleihe sind, nicht angezeigt!<br>
 * Das Inventar der Bibbliothek wird mit printInventory() ausgegeben.</p>
 */

import java.util.Date;
import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

public class Library {

    private Vector<Book> library;
    private Random rand;


    /**
     * Initialisiert die Bibliothek.
     */
    public Library() {
        library = new Vector<Book>();
        rand = new Random(new Date().getTime());
    }

    /**
     * Fügt ein Buch der Bibliothek zu.<br>
     * Das Buch bekommt einen Standort zugewiesen.
     *
     * @param aBook Referenz auf das Buch, das in die Bibliothek eingefügt wird
     * @return Standort des Buchs in der Bibliothek
     */
    public String addBook(Book aBook) {
        library.add(aBook);
        return getFreePlacement();
    }

    /**
     * Entfernt ein Buch aus der Bibliothek.
     * Das Buch wird anhand des Ablgeorts bestimmt und dann ausgetragen.
     *
     * @param placement Ablageort des Buchs
     */
    public void removeBook(String placement) {
        removeBook(searchBookByPlacement(placement));
    }

    /**
     * Entfernt ein Buch aus der Bibliothek.
     * Das Buch wird anhand seiner Referenz identifiziert.
     *
     * @param aBook Referenz des Buchs
     */
    public void removeBook(Book aBook) {
        library.remove(aBook);
    }

    /**
     * Sucht nach einem Buch in der Bibliothek.<br>
     * Die Suche erfolgt anhand des Buchtitel.
     *
     * @param title Buchtitel
     * @return Referenz auf Buch oder null, wenn Titel nicht vorhanden
     */
    public Book searchBookByTitle(String title) {
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getTitle().equals(title)) {
                return library.get(i);
            } // end of if
        } // end of for
        return null;
    }

    /**
     * Sucht nach einem Buch in der Bibliothek.<br>
     * Die Suche erfolgt anhand der ISBN-Nummer.
     *
     * @param isbn ISBN-Nummer
     * @return Referenz auf Buch oder null, wenn Titel nicht vorhanden
     */
    public Book searchBookByISBN(String isbn) {
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getISBN().equals(isbn)) {
                return library.get(i);
            } // end of if
        } // end of for
        return null;
    }

    /*
    Sucht nach einem Buch anhand des Ablageorts.
    */
    private Book searchBookByPlacement(String placement) {
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getPlacement().equals(placement)) {
                return library.get(i);
            } // end of if
        } // end of for
        return null;
    }

    /**
     * Leiht ein Buch aus der Biblithek aus.<br>
     * Das Buch wird anhand des Ablageortes aus der Bibliothek ausgetragen.
     *
     * @param _placement Ablageort des Buchs
     * @return Referenz des Buchs
     */
    public Book getBook(String _placement) {
        Book b = searchBookByPlacement(_placement);
        library.remove(b);
        return b;
    }

    /**
     * Leiht ein Buch aus der Biblithek aus.<br>
     * Das Buch wird anhand seiner Referenz identifiziert und aus der
     * Bibliothek ausgetragen
     *
     * @param aBook Referenz des Buchs
     * @return die eigene Referenz
     */
    public Book getBook(Book aBook) {
        library.remove(aBook);
        return aBook;
    }

    /**
     * Legt ein Buch zurück in die Bibliothek. Das Buch wird über seine
     * Referenz identifiziert.<br>
     * Der Ablageort ist im Buch vermerkt und dient dazu. das Buch am richtigen
     * Ort einzufügen.;
     *
     * @param aBook Referenz auf das Buch
     */
    public void putBook(Book aBook) {
        library.add(aBook);
    }


    /**
     * Gibt den aktuellen Stand der Bücher in der Bibliothek aus.
     * Bücher die ausgeliehen sind, erscheinen nicht im Inventar.
     */
    public void printInventory() {
        for (Enumeration<Book> e = library.elements(); e.hasMoreElements(); ) {
            Book b = e.nextElement();

            System.out.println("-------------------------------------");
            System.out.println("Buch:    " + b.getTitle());
            System.out.println("ISBN:    " + b.getISBN());
            System.out.println("Ablage:  " + b.getPlacement());
        }
    }

    /*
    Erzeugt einen zufälligen Namen für den Ablageort eines Buchs.
    */
    private String getFreePlacement() {
        String placement = "";
        placement += (char) (rand.nextInt(25) + 65);
        placement += rand.nextInt(30) + 10;
        return placement;
    }


    public static void main(String[] args) {
        Book x;
        Library b = new Library();
        //
        System.out.println("Errichte Bibliothek");
        x = new Book("Ein Titel", "123-456");
        x.setPlacement(b.addBook(x));
        x = new Book("Ein Titel", "123-456");
        x.setPlacement(b.addBook(x));
        x = new Book("Ein neuer Titel", "3-223-452-898");
        x.setPlacement(b.addBook(x));
        x = new Book("Ein Buch", "x67-3-445-6-22");
        x.setPlacement(b.addBook(x));
        //
        b.printInventory();
        //
        System.out.println("\nSuche Buch mit Titel 'Ein Titel'");
        x = b.searchBookByTitle("Ein Titel");
        if (x != null)
            x.print();
        System.out.println("\nSuche Buch mit Titel 'falscher Titel'");
        x = b.searchBookByTitle("falscher Titel");
        if (x != null)
            x.print();
        else
            System.out.println("Buch 'falscher Titel' existiert nciht");
        //
        System.out.println("\nDas Buch 'Ein Buch' ausleihen (= aus Bibliothek nehmen)");
        x = b.searchBookByTitle("Ein Buch");
        b.getBook(x.getPlacement());
        //
        b.printInventory();
        //
        System.out.println("\nBuch zurückgeben");
        b.putBook(x);
        //
        b.printInventory();
        //
        System.out.println("\nBuch 'Ein Titel' aus der Bibliothek löschen");
        b.removeBook(b.searchBookByTitle("Ein Titel").getPlacement());
        //
        b.printInventory();
        //
    }

}
