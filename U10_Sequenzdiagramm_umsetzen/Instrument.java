package ch.bwzrappi.m226.u14;

/**
 * Beschreibt ein Musikinstrument, das einen Ton spielen kann.
 */
public class Instrument{
  
  private String bezeichnung;
  
  public Instrument(String bez){
    bezeichnung = bez;
  }
  
  public String getBezeichnung(){
    return bezeichnung;
  }
  
  /*
  spielt den geforderten Ton
  */
  public void spielNote(char note){
    System.out.println(" " + getBezeichnung() + " die Note " + note);
  }
}