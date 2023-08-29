package bwzSH;

public abstract class Mensch implements PflanzenFresser, Fleischfresser  {

    public void esseFleisch() {
        System.out.println("Ich liebe Fleisch");
    }

   public abstract void essePflanze();

}
