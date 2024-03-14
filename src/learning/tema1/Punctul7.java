package learning.tema1;

import java.util.Scanner;

public class Punctul7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti nr");
        int numar = scanner.nextInt();
        int rezultat = adunare (numar);
        System.out.println("Rezutatul este:".concat(String.valueOf(rezultat)));

    }
    public static int adunare(int numar){
        return numar + 5;
    }


}
