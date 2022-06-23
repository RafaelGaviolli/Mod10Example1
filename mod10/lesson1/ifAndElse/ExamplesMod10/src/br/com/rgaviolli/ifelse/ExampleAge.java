package br.com.rgaviolli.ifelse;

import java.util.Scanner;

public class ExampleAge {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Insert your age: ");
        int age = s.nextInt();
        String ageSt = getAge(age);
        System.out.println(ageSt);
    }

    public static String getAge(int age) {
        if (age >= 0 && age <= 5) {
            return "You are a baby.";
        } else if (age >= 6 && age <= 10) {
        return "You are a kid.";
        } else if (age >= 11 && age <=18) {
            return "You are a teenager.";
        } else if (age >= 19 && age <60) {
            return "You are a adult.";
        } else {
            return "You are a elderly.";
        }
    }

}
