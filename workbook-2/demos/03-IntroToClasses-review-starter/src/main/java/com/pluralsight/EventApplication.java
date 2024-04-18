package com.pluralsight;

import com.pluralsight.models.*;

import java.util.Scanner;

public class EventApplication
{
    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        Person eventGoer = register();//the person// first scree
        //System.out.println(eventGoer.getFirstName());

        greetGuest(eventGoer);// next screen where is greeting

        displayGuestinfo(eventGoer);// display the guest information

    }

    public static Person register()
    {
        //returs the person information
        //declare variables
        String fullname, firstName, lastName;
        int age;

        //get user input
        System.out.println("Please enter your fullname:");
        fullname = userInput.nextLine();
        System.out.println("please enter your age: ");
        age = userInput.nextInt();
        userInput.nextLine();// clears the memory stream

        //get the first and last names
        String[] names = fullname.split(" ");
        firstName = names[0];
        lastName = names[1];

        //create a  person
        Person person = new Person();
        return person;
       // Person person = new Person();
        //person.setFirstName(firstName);
        //person.setLastName(lastName);


    }

    public static void greetGuest(Person guest)
    {
        //no return because it's a greeting
        System.out.println();
        System.out.printf("Welcome %s %s \n", guest.getFirstName(), guest.getLastName());

    }

    public static void displayGuestinfo(Person guest)
    {
        //think about it Like a profil page that display the information
        System.out.println();
        System.out.println("Guest information");
        System.out.println("------------------");
        System.out.println("Frist name: "+ guest.getFristName());
        System.out.println("Last Name: " + guest.getLastName());
        System.out.println("Age         " + guest.getAge());
    }
}