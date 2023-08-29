package bwz.m226b.uebungen.u8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parkplatz {

    private List<Auto> alleAutos;

    public Parkplatz() {

        this.alleAutos = new ArrayList<>();
    }

    public String getKennzeichen(int index) {

        return alleAutos.get(index).getKennzeichen();
    }

    public String getMarke(int index) {

        return alleAutos.get(index).getMarke();
    }

    public void addAuto(Auto auto) {

        alleAutos.add(auto);
    }

    public Auto getAuto(int index) {

        return alleAutos.get(index);
    }

    public void removeAuto(int index) {

        alleAutos.remove(index);
    }

    public void removeAuto(Auto auto) {

        alleAutos.remove(auto);
    }

    public int getSize() {

        return alleAutos.size();
    }
   public void sortiereAuto(){
       Collections.sort(alleAutos);
   }
}
