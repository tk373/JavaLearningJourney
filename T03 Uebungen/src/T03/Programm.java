package T03;

public class Programm {

public static void main(String[] args){
    Auto bmw535 = new Auto();
    bmw535.setLmaoPS("500ps");
    bmw535.setAnzahlSitze("4");
    bmw535.setFarbe("gruen");
    bmw535.setModell("bmw535");
    bmw535.setNutzlast("deineMUM-in-KG");
    bmw535.setMarke("BMW");

    Lieferant saebi = new Lieferant();
    saebi.setNameVertreter("saebi");
    saebi.setAlter("101 Jahre");
    saebi.setFirma("MutterfickerGMBH");
    saebi.setAdresse("Tief im Hurrrrrrrrdenwald");
    saebi.setVerteilzentrum("TiefImSee");
    saebi.setProdukte("VieleVietnamesischeKinder");



    System.out.println("Auto");
    System.out.println("========");

       System.out.println("Marke: "+ bmw535.getMarke());
       System.out.println("Sitze: "+ bmw535.getAnzahlSitze());
       System.out.println("Farbe: "+ bmw535.getFarbe());
       System.out.println("Nutzlast: "+ bmw535.getNutzlast());
       System.out.println("Modell: "+ bmw535.getModell());

       System.out.println("Lieferant");
       System.out.println("=============");

    System.out.println("Name: "+ saebi.getNameVertreter());
    System.out.println("Alter: "+ saebi.getAlter());
    System.out.println("Adresse: "+ saebi.getAdresse());
    System.out.println("Produkte: "+ saebi.getProdukte());
    System.out.println("Firma: "+ saebi.getFirma());







}

}
