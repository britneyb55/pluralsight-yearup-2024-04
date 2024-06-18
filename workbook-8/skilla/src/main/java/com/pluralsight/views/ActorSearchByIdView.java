package com.pluralsight.views;

import java.util.Scanner;

public class ActorSearchByIdView
{
    public int getActorId()
    {
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Search for Actor");
        System.out.println("-".repeat(40));
        System.out.print("Enter the id: ");

        return Integer.parseInt(in.nextLine());
    }
}

