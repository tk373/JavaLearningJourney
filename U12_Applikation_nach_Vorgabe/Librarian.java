package ch.bwzrappi.m226.u15;
/**
   Die Klasse repräsentiert den Bibliotheker.
   <p>Der Bibliothekar;
   <ul>
       <li>kauft neue Bücher ein, buyNewBook()</li>
       <li>leiht Bücher dem Kunden aus, borrow_aBookToCustomer.....()</li>
       <li>nimmt Bücher zurück, getABookFromCustomer</li>
       <li>mahnt den Kunden, remindCustomer()</li>
       <li>entfernt Bücher aus der Bibliothek, </li>
   </ul></p>
*/
public classLibrarian{
  
  private Library library;
  
  /**
  Initialisiert das Objekt. Dabei wird die Referenz zur Bibliothek
  bekannt gemacht.
  */
  public Librarian(Library _library){
    library = _library;
  }
  
  /**
  Ein neues Buch mit Titel und ISBN-Nummer wird der Bibliothek beigefügt.
  <p>Die Methode erstellt ein neues Buch und fügt es der Bibliothek zu.
  Von der Bibliothek wird der Ablageort mitgeteilt, der dann dem Buch
  übergeben wird.</p>
  @param title Titel des Buchs
  @param isbn ISBN-Nummer des Buchs
  */
  public void buyNewBook(String title, String isbn){
    // nach Sequenzdiagramm implementieren
    // TODO do it
    
    
    /* Hinweis:
    Aufrufe können ineinander geschachtelt sein. Es ist üblich, es
    so zu machen, dient aber nicht der übersichtlichkeit (vor allem
    nicht für Anfänger). 
    */
  }
  
  /**
  Das angefragte Buch wird dem Kunden ausgeliehen.
  <p>Ist das Buch nicht vorhanden, wird der Wert null geliefert. In diesem 
  Fall gibt der Bibliothekar einen Hinweis aus. </p>
  */
  public Book borrow_aBookToCustomerByTitle(String title) {
    // Implementieren Sie entsprechend dem Sequenzdiagramm und dem
    // gezeigten Struktogrammden Code.
    //
    //    +-----------------------------------------------------------------+
    //    | suche Buchtitel in Bibliothek  ( --> liefert die Referenz)      |
    //    +-----------------------------------------------------------------+
    //    | if (gültige Buchreferenez)                                      |
    //    |    --+----------------------------------------------------------+
    //    | then | > return Buchreferenz                                    |
    //    |    --+----------------------------------------------------------+
    //    | else | gib eine Meldung aus, dass Buchtitel nicht in Bibliothek |
    //    |      +----------------------------------------------------------+
    //    |      | > return null                                            |
    //    +------+----------------------------------------------------------+
    //
    //....TODO do it
	  return null;
  }
    
    /**
    Das angefragte Buch wird dem Kunden ausgeliehen.
    <p>Ist das Buch nicht vorhanden, wird der Wert null geliefert. In diesem 
    Fall gibt der Bibliothekar einen Hinweis aus. </p>
    @param isbn ISBN-Nummer des Buchs
    @return Referenz auf das Buch oder null, wenn es den Titel nicht gibt.
    */
    public Book borrow_aBookToCustomerByISBN(String isbn){
      Book aBook = library.searchBookByISBN(isbn);
      if (aBook != null) {
        return aBook;
      } // end of if
      else{
        System.out.println("Das Buch mit der ISBN-Numemr'"+isbn+"' ist nicht verfügbar");
        return null;
      }
    }
    
    
    /**
    Das gelieferte Buch wird in die Bibliothek zurückgestellt.
    @param aBook Referenz auf das Buch
    */
    public void getABookFromCustomer(Book aBook){
      // Implementieren Sie entsprechend dem Sequenzdiagramm den Code
      //....TODO do it
      
    }
    
    /**
    Erinnert den Kunden, dass eine Ausleihe noch offen ist.
    @param theCustomer Referenz des Kunden, der gemahnt wird
    */
    public void remindCustomer(Customer theCustomer){
      // Implementieren Sie entsprechend dem Sequenzdiagramm den Code
      // Der Text "Kunde 'name' wird gemahnt, das Buch 'Titel' zurückzubringen" wird ausgegeben
      //....TODO do it
      System.out.println(".........");
      
    } 
    
    
    /**
    Entfernt ein Buch aus der Bibliothek. 
    Das Buch wird anhand seiner Referenz identifiziert.
    @param title Referenz des Buchs
    */
    public void removeBook(String title){
      // Implementieren Sie entsprechend dem Sequenzdiagramm und dem
      // gezeigten Struktogrammden Code.
      //
      //    +-----------------------------------------------------------------+
      //    | suche Buchtitel in Bibliothek  ( --> liefert die Referenz)      |
      //    +-----------------------------------------------------------------+
      //    | if (gültige Buchreferenz)                                       |
      //    |    --+----------------------------------------------------------+
      //    | then | entferen Buch aus der Bibliothek                         |
      //    +------+----------------------------------------------------------+
      //
      //....TODO do it
      
    }
  }