package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Put in number: ");
        int any_number = scanner.nextInt();

        if (any_number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        task3();
        task4();
        task5();


    }
    static void task3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Number greater than 0");
        } else if (number < 0) {
            System.out.println("Number is less than 0");
        } else if (number == 0) {
            System.out.println("Number is equal to 0");
        }


    }
    static void task4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert height:");
        int height = scanner.nextInt();

        System.out.println("Please insert weight: ");
        float weight = scanner.nextFloat();

        if (height > 150 && weight <= 180) {
            System.out.println("Fasten your seatbelt!");
        } else {
            System.out.println("I'm sorry you can't go!");
        }
    }
    static void task5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert temperature: ");

        float tempInCelsius = scanner.nextFloat();
        double tempInFahrenheit = (tempInCelsius * 1.8 + 32.0);

        System.out.println("Temperature in Fahrenheit is: " + tempInFahrenheit);
    }
    static void task6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert income:");
        double income = scanner.nextDouble();

        double tax;


    }
}
