package learning.tema1;

import java.util.Scanner;

public class Punctul7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti nr");





        int numar = scanner.nextInt();
        int rezultat = adunare (numar);
        System.out.println("Rezutatul este:".concat(String.valueOf(rezultat)));


        System.out.println("Introduceti nr2");
        double numar2 = scanner.nextInt();
        double rezultat2 = scadere (numar2);
        System.out.println("Rezutatul este:" + rezultat2);

        System.out.println("Introduceti nr3");
        double numar3 = scanner.nextInt();
        double rezultat3 = inmultire (numar3);
        System.out.println("Rezutatul este:" + rezultat3);

        System.out.println("Introduceti nr4");
        int numar4 = scanner.nextInt();
        int rezultat4 = impartire (numar4);
        System.out.println("Rezutatul este:".concat(String.valueOf(rezultat4)));

        System.out.println("Introduceti nr5");
        int numar5 = scanner.nextInt();
        int rezultat5 = modul (numar5);
        System.out.println("Rezutatul este:".concat(String.valueOf(rezultat4)));


    }
    public static int adunare(int numar){
        return numar + 5;
    }
    public static double scadere(double numar2) {return numar2 - -12.3;}
    public static double inmultire(double numar3) {return numar3 * -3.2;}
    public static int impartire(int numar4) {return numar4 /4;}
    public static int modul(int numar5) {return numar5 %6;}


}
