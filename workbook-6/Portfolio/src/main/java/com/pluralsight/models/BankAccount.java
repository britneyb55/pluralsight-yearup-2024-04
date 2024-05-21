package com.pluralsight.models;

import com.pluralsight.models.interfaces.Valuable;

public class BankAccount implements Valuable
{
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double deposit(double amount)
    {
        balance = amount + balance;
        return balance;

    }

    public double withdraw(double amount)
    {
        balance = amount - balance;
        return balance;
    }

    @Override
    public double getValue() {
        return balance;
    }
}
