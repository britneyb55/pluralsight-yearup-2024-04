package com.pluralsight;

import java.util.Scanner;
import java.util.Random;
public class FamousQuotes
{
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args)
    {

        String[] quotes =
                {
                     "The only way to do great work is to love what you do.",
                        "In the end, we only regret the chances we didn't take.",
                        "Success is not final, failure is not fatal: It is the courage to continue that counts.",
                        "Believe you can and you're halfway there.",
                        "The best way to predict the future is to invent it.",
                        "Be yourself; everyone else is already taken.",
                        "Life is what happens when you're busy making other plans.",
                        "The only limit to our realization of tomorrow will be our doubts of today.",
                        "The greatest glory in living lies not in never falling, but in rising every time we fall.",
                        "Happiness is not something ready-made. It comes from your own actions."

                };



//        try
//        {
//            System.out.println("select a number between 1 to 10:");
//            int userQuote = userInput.nextInt();
//            userQuote--;
//            System.out.println(quotes[userQuote]);
//        }
//        catch(Exception ex)
//        {
//            System.out.println("Error");
//
//        }
//        System.out.println();

        System.out.println("Options:");
        System.out.println("Would you like to select a quote between the number of 1 - 10? Type Yes");
        System.out.println("Want to see a random quote? type in random");
        System.out.println("Exit - type No");
        System.out.println();
        System.out.println("Type in your answer: ");

        String userChoice = userInput.nextLine();

        if ( userChoice.equalsIgnoreCase("yes"))
        {
            try
            {
                System.out.println("Select a quote between the number of 1 to 10");
                int userQuote = userInput.nextInt();
                userQuote--;
                System.out.println(quotes[userQuote]);
            }
            catch(Exception ex)
            {
                System.out.println("Error");

            }

        }
        else if(userChoice.equalsIgnoreCase("no"))
        {
            System.out.println("exit");
        }
        else if(userChoice.equalsIgnoreCase("random"))
        {
            Random random = new Random();
            String randomElement = quotes[random.nextInt(quotes.length)];
            System.out.println(randomElement);
        }
        else
        {
            System.out.println("Invalid selection");
        }











    }




}