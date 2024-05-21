package com.pluralsight.models;

import com.pluralsight.models.interfaces.Valuable;

public class FinanceApplication
{
    public static void run()
    {
        BankAccount account1 = new BankAccount( "Pam", "123", 12500);
        Valuable account2 = new BankAccount("Gary", "456", 1500);

        account1.deposit(100);
        account1.getValue();
        System.out.println(account1.getValue());
        //account2.deposit(100);

    }
}
