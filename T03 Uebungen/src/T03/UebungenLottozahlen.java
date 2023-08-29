package T03;
import java.util.Random;

public class UebungenLottozahlen {
    public static void  main(String[] args){
        int[] lottozahlen = new int[20];
        Random cock = new Random();
        for(int i = 0; i < 20; i++ ){
         lottozahlen[i] = cock.nextInt(1,20);
        }
        for (int lol: lottozahlen) {
            System.out.println(lol);
        }




    }
}
