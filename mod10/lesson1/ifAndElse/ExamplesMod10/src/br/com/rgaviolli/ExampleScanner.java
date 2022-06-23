package br.com.rgaviolli;

import java.util.Scanner;

public class ExampleScanner {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Insert your age: ");
        int age = s.nextInt();
        System.out.println("You have " + age + " years old.");
    }
}
