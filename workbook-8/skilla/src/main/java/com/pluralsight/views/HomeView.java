package com.pluralsight.views;

import java.util.Scanner;

public class HomeView
{
    public int getUserSelection()
    {
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Sakila Home");
        System.out.println("-".repeat(40));
        System.out.println(" 1) Show ALl actors");
        System.out.println(" 2) Add new actor ");
        System.out.println(" 3) delete actor ");
        System.out.println(" 0) Exit");
        System.out.println();
        System.out.println("Please select an option");

        return Integer.parseInt(in.nextLine());

    }
}
