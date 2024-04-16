package com.pluralsight;

import java.util.Scanner;
public class FullNameParser{
    public static void main(String[] args)
    {
        Scanner userinput = new Scanner(System.in);

        System.out.print("Enter your Full name:");
        String fullname = userinput.nextLine().strip();



        //break names into parts
        String firstName = "" ;
        String middleName = "" ;
        String lastName = "";

        String[] word = fullname.split(" ");

        firstName = word[0];

        boolean hasMiddleName = word.length > 2;

        if(hasMiddleName)
        {
            middleName = word[1];
            lastName = word[2];

        }
        else {
            middleName = "(none)";
            lastName = word[1];

        }

        System.out.println();
        System.out.printf("First Name: %s \n", firstName);
        System.out.printf("Middle Name: %s \n", middleName);
        System.out.printf("Last Name: %s \n", lastName);




    }
}