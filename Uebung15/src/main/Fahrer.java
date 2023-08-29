package main;

public class Fahrer {
   //Atribute der Klasse
    private String name;
  private Auto dasAuto = new Auto();

  public Fahrer(Auto dasAuto){
      this.dasAuto = dasAuto;
  }
  public Fahrer(Auto dasAuto, String name){
      this.dasAuto = dasAuto;
      this.name = name;
  }
  public void setName(String name){
      this.name = name;
  }
  public String getName(){
      return name;
  }




}
