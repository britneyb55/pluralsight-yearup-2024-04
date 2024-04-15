package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        String middle_name_only;

        System.out.print("Please enter you name:");
        String first_name = userInput.nextLine().strip();

        System.out.print("Enter you middle name or initials:");
        String middle_name = userInput.nextLine().strip();

        System.out.print("Enter your last name:");
        String last_name = userInput.nextLine().strip();

        System.out.print("Enter your suffix:");
        String user_suffix = userInput.nextLine().strip();



        if(middle_name.isEmpty() && user_suffix.isEmpty())
        {
            System.out.printf("Full name: %s %s", first_name, last_name);
        }
        else if (middle_name.isEmpty()){
            System.out.printf("Full name: %s %s, %s", first_name, last_name, user_suffix);
        }
        else if (user_suffix.isEmpty())
        {
            System.out.printf("Full name: %s %s %s",first_name, middle_name, last_name);
        }
        else
        {
            System.out.printf("Full name: %s %s %s, %s", first_name, middle_name, last_name, user_suffix);

        }
        
    }

}