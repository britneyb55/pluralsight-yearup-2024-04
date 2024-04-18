package com.pluralsight.demos;

import java.util.Scanner;
public class LoppTypes
{
    static Scanner userinput = new Scanner(System.in);
    public static void main(String [] args)
    {
        whileLoop();
    }
    public static void whileLoop()
    {
        String playAgain = "y";
        while(playAgain.equalsIgnoreCase("y"))
        {
            System.out.println("Wellcome to my game");

        }
    }

}
