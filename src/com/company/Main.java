package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Task 1 and 2");
        System.out.println("Put in number: ");
        int any_number = scanner.nextInt();

        if (any_number % 2 == 0) {
            System.out.println(any_number + " is even");
        } else {
            System.out.println(any_number + " is odd");
        }

//        task3();
 //       task4();
 //       task5();
//        task6();
 //       task6_David_version();
        task7();



    }
    static void task3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 3");
        System.out.println("Please insert number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println(number + " is greater than 0");
        } else if (number < 0) {
            System.out.println(number + " is less than 0");
        } else {
            System.out.println(number + " is equal to 0");
        }


    }
    static void task4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 4");
        System.out.println("Let's have fun! (or not)");

        System.out.println("Please insert height in cm:");
        int height = scanner.nextInt();

        System.out.println("Please insert weight in kg: ");
        float weight = scanner.nextFloat();

        if (height > 150 && weight <= 180) {
            System.out.println("Fasten your seatbelt!");
        } else {
            System.out.println("I'm sorry you can't go!");
        }
    }
    static void task5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task 5");
        System.out.println("Please insert temperature in Celsius: ");

        float tempInCelsius = scanner.nextFloat();
        double tempInFahrenheit = (tempInCelsius * 1.8 + 32.0);

        System.out.println("Temperature in Fahrenheit is: " + tempInFahrenheit);
    }
    static void task6(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the income tax calculator!");
        System.out.println("Please insert income:");
        double income = scanner.nextDouble();

        if (income < 85528) {
            System.out.println("Your taxes: " + ((income * 0.18) - 556.02));
        } else {
            System.out.println("Your taxes: " + (14839.02 + (0.32 * (income - 85528))));
        }

    }
    static void task6_David_version(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome");

        System.out.println("Insert income");
        double income = scanner.nextDouble();

        double tax;

        if (income <= 85528) {
            tax = (0.18 * income) - 556.02;
        } else {
            tax = 14839.02 + 0.32 * (income - 85528);
        }
        System.out.println("Personal income tax for " + income + "is: " + tax);
    }
    static void task7(){
        Scanner scanner = new Scanner(System.in);
        //Print welcome message
        System.out.println("Welcome to the loan installments payment calculator!");

        System.out.println("Please insert amount: ");
        double amount = scanner.nextDouble();

        System.out.println("Please insert number of installments: ");
        int numberOfInstallments = scanner.nextInt();

        if (amount < 100) {
            System.out.println("Amount should be between 100 and 10000");
        } else if (amount > 10000) {
            amount = 5000;
            System.out.println("Amount set to 5000 because loan cannot exceed 10000");
        }
        if (numberOfInstallments < 6) {
            System.out.println("Installment should be between 6 & 48");
        } else if (numberOfInstallments > 48) {
            numberOfInstallments = 36;
            System.out.println("Installment set to 36 bedcause cannot exceed 48");
        }

        double payment_without_interest = amount / numberOfInstallments;

        double interest;
        //Create condition to calculate interest on loan based on the number of instalments
        if (numberOfInstallments <= 12) {
            interest = amount * 0.025;
        } else if (numberOfInstallments <= 24 ) {
            interest = amount * 0.05;
        } else {
            interest = amount * 0.1;
        }
        double payment_with_interest = interest / numberOfInstallments;
        System.out.println("Amount to be paid per month with interest is: " + (payment_with_interest + payment_without_interest));
    }
}
