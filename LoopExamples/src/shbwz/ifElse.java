package shbwz;

import java.util.Random;

public class ifElse {
    public static void  main(String[] args){
elseIf();

    }
    public static void zufallszahl(){
        int RandomNumber= new Random().nextInt(0,10);
        if(RandomNumber % 2 == 0){
           System.out.println("Die Zahl "+RandomNumber+" ist gerade.");
        }
        else {
            System.out.println("Die Zahl "+RandomNumber+" ist ungerade.");
        }
    }
    public static void  elseIf() {
        int Number = new Random().nextInt(10);
        if (Number % 4 == 0) {
            System.out.println("Die Zahl "+Number+" ist durch 4 teilbar");}
        else if(Number % 5 == 0){
            System.out.println("Die Zahl "+Number+" ist durch 5 teilbar");
        }
        else{
            System.out.println("Die Zahl "+Number+" ist weder durch 4 noch durch 5 teilbar");
        }
    }



}
