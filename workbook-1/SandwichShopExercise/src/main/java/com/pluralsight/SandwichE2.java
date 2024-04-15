package com.pluralsight;

import java.util.Scanner;

public class SandwichE2 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        double regular_sandwich = 5.45;
        double large_sandwich = 8.95;
        double Sandwich_size;
        int age;
        String loaded_sandwich;
        double discount;
        double totalPrice;
        double regularextracost = 1.00;
        double largeextracost = 1.75;
        double finalprice;

        System.out.println("Menu");
        System.out.printf("1) Regular Sandwich - $ %.2f \n", regular_sandwich);
        System.out.printf("2) Large Sandwich- $ %.2f \n", large_sandwich);
        System.out.println();


        System.out.print("What sandwich would you like to order today? ");
        Sandwich_size = userInput.nextDouble();

        System.out.print("How old are you? ");
        age = userInput.nextInt();

        System.out.print("Would you like your sandwich loaded? ");
        loaded_sandwich = userInput.next();

        if (loaded_sandwich.equals("yes")) {

            if (Sandwich_size == 1 && 17 > age) {
                discount = regular_sandwich * 0.1;
                totalPrice = regular_sandwich - discount;
                finalprice = regularextracost + totalPrice;

            } else if (Sandwich_size == 2 && 17 > age) {
                discount = large_sandwich * 0.1;
                totalPrice = large_sandwich - discount;
                finalprice = totalPrice + largeextracost;

            } else if (Sandwich_size == 1 && 65 < age) {
                discount = regular_sandwich * 0.2;
                totalPrice = regular_sandwich - discount;
                finalprice = totalPrice + regularextracost;

            } else if (Sandwich_size == 2 && 65 < age) {
                discount = large_sandwich * 0.2;
                totalPrice = large_sandwich - discount;
                finalprice = totalPrice + largeextracost;
            } else {
                return;
            }
        } else {
            if (Sandwich_size == 1 && 17 > age) {
                discount = regular_sandwich * 0.1;
                finalprice = regular_sandwich - discount;

            } else if (Sandwich_size == 2 && 17 > age) {
                discount = large_sandwich * 0.1;
                finalprice = large_sandwich - discount;

            } else if (Sandwich_size == 1 && 65 < age) {
                discount = regular_sandwich * 0.2;
                finalprice = regular_sandwich - discount;
            } else if (Sandwich_size == 2 && 65 < age) {
                discount = large_sandwich * 0.2;
                finalprice = large_sandwich - discount;
            } else {
                return;
            }

        }


        System.out.printf("The total is $ %.2f \n", finalprice);



    }
}
