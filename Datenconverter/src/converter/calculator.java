package converter;
import java.util.Scanner;
public class calculator{
public static void main(String[] args){
    int activator = 1;
    while ( activator == 1){
        Menu();
        activator = activator + 1;
        Scanner scanning = new Scanner(System.in);
        String auswahlRechnung = scanning.nextLine();
        int auswahl = Integer.parseInt(auswahlRechnung);
        switch (auswahl){
            case 1: calculatePlus();
                    break;
            case 2: calculateMinus();
                    break;
            case 3: calculateTimes();
                    break;
            case 4: calculateDivide();
                    break;
        }
        System.out.println("Wollen Sie eine weitere Rechnung vollziehen?");
        System.out.println("1. JA");
        System.out.println("2. NEIN");
        String yesorNah= scanning.nextLine();
        int fortfahren = Integer.parseInt(yesorNah);

       switch (fortfahren) {
           case 1: activator = activator - 1;
                   break;
           case 2: activator = activator + 1;
                   break;
       }
    }

}
public static void Menu(){
    System.out.println(" Einfacher Taschenrechner");
    System.out.println("---------------------------");
    System.out.println("1. Plus rechnen");
    System.out.println("2. Minus rechnen");
    System.out.println("3. Mal rechnen ");
    System.out.println("4. Geteilt rechen");

}

public static void calculateMinus(){
    Scanner scanning = new Scanner(System.in);
    System.out.println("A - B = C");
    System.out.println("Bitte geben Sie A ein:");
    String eingabeA = scanning.nextLine();
    double eingabeMinusA = Integer.parseInt(eingabeA);
    System.out.println("Bitte geben Sie B ein:");
    String eingabeB = scanning.nextLine();
    double eingabeMinusB = Integer.parseInt(eingabeB);
    double ergebnisMinus = eingabeMinusA - eingabeMinusB;
    System.out.println("Das Ergebnis ist "+ergebnisMinus);

}
    public static void calculatePlus(){
        Scanner scanning = new Scanner(System.in);
        System.out.println("A + B = C");
        System.out.println("Bitte geben Sie A ein:");
        String eingabeA = scanning.nextLine();
        double eingabeMinusA = Integer.parseInt(eingabeA);
        System.out.println("Bitte geben Sie B ein:");
        String eingabeB = scanning.nextLine();
        double eingabeMinusB = Integer.parseInt(eingabeB);
        double ergebnisMinus = eingabeMinusA + eingabeMinusB;
        System.out.println("Das Ergebnis ist "+ergebnisMinus);
    }
    public static void calculateTimes(){
        Scanner scanning = new Scanner(System.in);
        System.out.println("A * B = C");
        System.out.println("Bitte geben Sie A ein:");
        String eingabeA = scanning.nextLine();
        double eingabeMalA = Integer.parseInt(eingabeA);
        System.out.println("Bitte geben Sie B ein:");
        String eingabeB = scanning.nextLine();
        double eingabeMalB = Integer.parseInt(eingabeB);
        double ergebnisMal = eingabeMalA * eingabeMalB;
        System.out.println("Das Ergebnis ist "+ergebnisMal);
    }
    public static void calculateDivide(){
        Scanner scanning = new Scanner(System.in);
        System.out.println("A / B = C");
        System.out.println("Bitte geben Sie A ein:");
        String eingabeA = scanning.nextLine();
        double eingabeMinusA = Integer.parseInt(eingabeA);
        System.out.println("Bitte geben Sie B ein:");
        String eingabeB = scanning.nextLine();
        double eingabeMinusB = Integer.parseInt(eingabeB);
        double ergebnisMinus = eingabeMinusA / eingabeMinusB;
        System.out.println("Das Ergebnis ist "+ergebnisMinus);
    }
}

