package br.com.rgaviolli.ifelse;

import java.util.Scanner;

public class ExamplePPT2 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Insert a number: ");
        int result = s.nextInt();

        if (result > 1 && result < 5) {
            System.out.println("Result is between 1 and 5");
        } else if (result >= 5 && result <8) {
            System.out.println("Result is between 5 an 8");
        } else {
            System.out.println("Result is different from previous");
        }
    }
}
