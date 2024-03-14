package learning.tema1;

import java.util.Scanner;

public class Tema1 {
    public static void main(String[] args) {



//1.Scrieti un program care afiseaza “Imi place Java”

        System.out.println("Imi place Java!");

        //2.Scrieti un program care afiseaza de 6 ori propozitia “Cursul acesta este foarte fain!”

        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");
        System.out.println("Cursul acesta este foarte fain!");

        //3.Ana are 24 de ani. Fratele ei, David, e cu 6 ani mai mic. Scrieti un program care afiseaza varsta lui David.
        System.out.println(24-6);

        //4.Scrieti un program in care cititi o propozitie de la tastatura

        System.out.println("Introducere text");
        Scanner scanner = new Scanner(System.in);
        String textDeLaTaste = scanner.nextLine();

        System.out.println("A fost printat: " + textDeLaTaste);









    }
}
