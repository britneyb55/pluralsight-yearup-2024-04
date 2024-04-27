package com.pluralsight;

import java.io.File;
import  java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LoggerDemo
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        logMessage("Start application");

        while (true)
        {


            System.out.println();
            System.out.println("enter a number to divide:");
            int numerator = userInput.nextInt();
            System.out.println("enter a number to divide:");
            int denominator = userInput.nextInt();

            try {
                int answer = numerator / denominator;

                if (answer == 15) {
                    System.out.println("you got the magic answer - game over");
                    System.out.println("End application");
                    break;

                }
            } catch (Exception ex) {
                System.out.println("there was a problem, please try again.");
                System.out.println("Error" + ex.getMessage());
            }
        }
    }

    public static void logMessage(String message)
    {
        File file = new File("logs/application.log");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("kk:mm:ss");

        try (FileWriter filewriter = new FileWriter(file,true) ;
             PrintWriter writer = new PrintWriter(filewriter))

        {
            writer.printf("%s %s - %s \n", now.format(dateFormatter), now.format(timeFormatter), message);

        }
        catch (Exception ex)
        {

        }
    }
}
