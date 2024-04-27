package com.pluralsight;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main
{
        public static void main(String[] args)
        {
            Scanner userInput = new Scanner(System.in);
            logMessage("launch");

            String searchTerm;

            while (true)
            {
                System.out.print("Enter a search term (Type 'X' to exit): ");
                searchTerm = userInput.nextLine().trim();
                if (!searchTerm.equalsIgnoreCase("x"))
                {
                    logMessage("Searching for term: " + searchTerm);
                } else
                {
                    break; // Exit the loop if searchTerm is "exit"
                }
            }

            System.out.println("Exit");

            logMessage("exit");


        }




        public static void logMessage(String message)
        {
            File file = new File("logs/log.txt");

            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("kk:mm:ss");

            try (FileWriter filewriter = new FileWriter(file,true);
                 PrintWriter writer = new PrintWriter(filewriter))

            {
                writer.printf("%s %s - %s \n", now.format(dateFormatter), now.format(timeFormatter), message);

            }
            catch (Exception ex)
            {

            }
        }


}