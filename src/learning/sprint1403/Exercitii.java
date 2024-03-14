package learning.sprint1403;

import java.util.Scanner;

public class Exercitii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduceti text");
        String textCitit= scanner.nextLine();
        String eliminaSpatiiGoale=textCitit.trim();
        System.out.println("Noul tau text: "+ eliminaSpatiiGoale);
    }
}
