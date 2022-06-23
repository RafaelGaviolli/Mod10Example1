package br.com.rgaviolli;

import java.util.Scanner;

public class ExampleScanner1 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Insert your name: ");
        String name = s.nextLine();

        System.out.println("\nInsert you height: ");
        double height = s.nextDouble();

        System.out.println(name + " is " + height + " tall.");
    }
}
