package com.pluralsight.views;

import com.pluralsight.models.Actor;

import java.util.Scanner;

public class ActorAddView
{
    public Actor getNewActor()
    {
        //prompt the user for actor info

        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Add new Actor");
        System.out.println("-".repeat(40));
        System.out.println("Enter the first name: ");
        String firstName = in.nextLine();

        System.out.println("Enter the last name: ");
        String lastName = in.nextLine();

        return new Actor(0, firstName, lastName);
    }
}
