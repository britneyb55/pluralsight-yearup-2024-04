package com.pluralsight;

import java.sql.SQLOutput;

public class ExerciseDemo
{
    public static void main(String[] args)
    {
        question1();
        question2();
    }

    public static void question1()
    {
        // calculate the amount of change given after buying chocolate
        // CHOCOLATE COSTS 2.99 PER BAR
        // I have $20
        // buy 4 bars of chocolate
        // how much change will I get back?
        /* pursudo code balance is 20, ChocalatePrice is 2.99
        quanity is 4 totalCost = Chocolate
         */
        System.out.println();

        // declare you variables
        double balance = 20;
        double priceOfChocolate = 2.99;
        int quantityBought = 4;
        double totalCost;
        double changeGiven;

        //display the output
        totalCost = priceOfChocolate * quantityBought;
        changeGiven = balance - totalCost;

        // display the output
        System.out.println();
        System.out.println("Chocolate bar: $" + priceOfChocolate);
        System.out.println("Quantity: " + quantityBought);
        System.out.println("--------------------------------------");
        System.out.println("Total: $ " + totalCost);
        System.out.println("Paid: $ " + balance);
        System.out.println("Change Given $ " + changeGiven);


    }

    public static void question2()
    {
        // calculate the perimeter of a circle
        //for a circle with a radius of 12
        System.out.println();


        //variable
        double radius = 12;
        double perimeter;

        //calculate
        perimeter = 2 * Math.PI * radius;

        //output
        System.out.println("The perimeter of a circle with a radius " + radius + " is " + perimeter);

    }

}

