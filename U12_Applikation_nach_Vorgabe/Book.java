package ch.bwzrappi.m226.u15;

/**
Die Klasse beschreibt ein Buch, das über seinen Titel und die ISBN-Nummer
definiert ist.
<p>Die Informationen zum Buch könenn über get-Methoden abgefragt werden.</p>

<p>Jedes Buch wird durch den Bibliothekar in der Bibliothek eingereiht. Dazu
wird dem Buch der Ablageort bekannt gegeben.</p>
*/
public class Book{

  private String title;
  private String isbn;
  private String placement;
  
  /**
     Initialisiert ein Objekt vom Typ Buch mit dem Titel und der ISBN-Nummer.
     
     <p>Beachte: Das konkrete Buch weiss so noch nicht wo es in der Bibliothek 7
     eingetragen ist. Dies erfolgt erst über den Aufruf der Methode 
     setPlacement().</p>
     @param _title Title des Buchs
     @param _isbn ISBN-Nummer des Buchs
  */
  public Book(String _title, String _isbn){
    title = _title;
    isbn  = _isbn; 
  }
  
  /**
     Legt den Ablageort des Buchs fest.
     @param _placement Ablageort
  */
  public void setPlacement(String _placement){
    placement = _placement;
  }

  /**
     Liest den Titel des Buchs aus.
     @return Buchtitel
  */  
  public String getTitle(){
    return title;
  }
  
  /**
     Liest die ISB-Nummer des Buchs aus.
     @return ISB-Nummer
  */
  public String getISBN(){
    return isbn;
  }
                           
  /**
     Liest den Ablageort des Buchs aus.
     @return Ablageort
  */
  public String getPlacement(){
    return placement;
  }
  
  /**
  Schreibt die Daten des Buchs auf den StdOut.
  */
  public void print(){
    System.out.println("Buchtitel: "+title+" / ISBN: "+isbn+" / Ablageort : "+ placement);
  }
}