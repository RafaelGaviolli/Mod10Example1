package br.com.rgaviolli.ifelse;

import java.util.Scanner;

public class ExamplesPPTConsole {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Insert a number: ");

        int result = s.nextInt();
        if (result == 1) {
            System.out.println("Result is equal to 1");
        } else if (result > 1) {
            System.out.println("Result is greater than 1");
        }else
            System.out.println("Result is lesser than 1");
        }

}

