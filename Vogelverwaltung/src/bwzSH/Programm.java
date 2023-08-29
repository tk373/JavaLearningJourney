package bwzSH;

import java.util.EmptyStackException;

public class Programm {
    public static void main(String[] args){

        Vogel birds[] = new Vogel[10];

        System.out.println("Vogelverwaltung");
        System.out.println("===============");

        Ente donald = new Ente("Donald");
        Ente dagobert = new Ente("Dagobert");
        Huhn erna = new Huhn("Erna");
        Ente duffy = new Ente("Duffy");
        Huhn berta = new Huhn("Berta");

        birds[0] = donald;
        birds[1] = dagobert;
        birds[2] = erna;
        birds[3] = duffy;
        birds[4] = berta;
        birds[5] = new Ente("Dagobert Duck");

        for(Vogel vogel: birds){
            if (vogel != null){
                vogel.fliegen();
            }
        }


            /*
        Vogel vogel = new Vogel();
        vogel.fliegen();

        Huhn huhn = new Huhn("big black cock");
        huhn.fliegen();

        Ente ente = new Ente("Donald duck");
        ente.fliegen();
        ente.schwimmen();

         */


    }
}
