package com.pluralsight.models;

import com.pluralsight.models.interfaces.Valuable;

import java.util.ArrayList;
import java.util.List;

public class FinanceApplication
{
    static Portfolio portfolio = new Portfolio("Investments", "Barton");

    public static void run()
    {

        House home = new House("Home", 250, 1000, 2,1);
        BankAccount savings = new BankAccount("High Yield Savings","HY12345", 500);
        portfolio.add(home);
        portfolio.add(savings);

        System.out.println("Savings value: " + savings.getValue());
        System.out.println("Home value: " + home.getValue());
        System.out.println("---------------------------------------------");
        System.out.println("Total Portfolio worth: " + portfolio.getValue());






    }
}
