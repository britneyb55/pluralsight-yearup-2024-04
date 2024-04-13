package com.pluralsight;

import java.util.Scanner;
public class SandwichShop
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        double regular_sandwich = 5.45;
        double large_sandwich = 8.95;
        float Sandwich_size;
        int age;
        double discount;
        double totalPrice;

        System.out.println("Menu");
        System.out.printf("1) Regular Sandwich - $ %.2f \n", regular_sandwich);
        System.out.printf("2) Large Sandwich- $ %.2f \n", large_sandwich);
        System.out.println();


        System.out.print("What sandwich would you like to order today? ");
        Sandwich_size = userInput.nextFloat();

        System.out.print("How old are you? ");
        age = userInput.nextInt();

        if (Sandwich_size == 1 && 17 > age)
        {
            discount = regular_sandwich * 0.1;
            totalPrice = regular_sandwich - discount;

        }
        else if (Sandwich_size == 2 && 17 > age)
        {
            discount = large_sandwich * 0.1;
            totalPrice = large_sandwich - discount;

        }
        else if (Sandwich_size == 1 && 65 < age )
        {
            discount = regular_sandwich * 0.2;
            totalPrice = regular_sandwich - discount;
        }
        else if (Sandwich_size == 2 && 65 < age )
        {
            discount = large_sandwich * 0.2;
            totalPrice = large_sandwich - discount;
        }
        else
        {
            System.out.println("No sandwich");
            return;
        }

        System.out.printf("The total is $ %.2f \n", totalPrice);


    }
}