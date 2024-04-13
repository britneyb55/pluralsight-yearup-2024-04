package com.pluralsight;

// display the product
// ask user for their name
// ask for quantity
// calculate total and display
// ask for money
// give change back
import until.System;
public class GroceryStore
{
    private
    public static void main(String[] args)
    {
        // declare variable

        // declare constants
        final String PRODUCT = "Milka Aplenmilch"; // constance
        final double PRICE = 2.99;

        // input variable
        String customerName;
        int quantity;
        double cashReceived;

        //calculated
        double totalPrice;
        double changeReturned;

        // get user input
        System.out.println("Please enter you name: ");
        customerName = userInput.nextLine();

        System.out.println();
        quantity = 5;

        // calculations
        totalPrice = PRICE * quantity;
        cashReceived = 20;
        changeReturned = cashReceived - totalPrice;


        // display the receipt
        System.out.println();
       //String message = String.format("Total: %.2f" , totalPrice);
        System.out.printf("Total:  $ %6.2f \n" , totalPrice);
        System.out.printf("Cash:   $ %6.2f \n" , cashReceived);
        System.out.printf("Change: $ %6.2f \n " , changeReturned);




    }
}