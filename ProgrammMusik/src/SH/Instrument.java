package SH;

public class Instrument {
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
