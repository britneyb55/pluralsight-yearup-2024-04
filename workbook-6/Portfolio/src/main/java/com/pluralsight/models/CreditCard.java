package com.pluralsight.models;

import com.pluralsight.models.interfaces.Valuable;

public class CreditCard implements Valuable
{
    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double charge(double amount)
    {
        return 0;
    }

    public double pay(double amount)
    {
        return 0;
    }
    @Override
    public double getValue()
    {
        return 0;
    }
}
