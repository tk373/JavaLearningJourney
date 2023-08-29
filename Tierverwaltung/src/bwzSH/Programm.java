package bwzSH;

public class Programm {
    public static void main(String[] args){
    Loewe loewe = new Loewe();
    loewe.esseFleisch();

    Bison bison = new Bison();
    bison.essePflanze();

    Kind ole = new Kind();
    ole.essePflanze();
    ole.esseFleisch();

    Erwachsene linus = new Erwachsene();
    linus.essePflanze();
    linus.esseFleisch();

    }
}
