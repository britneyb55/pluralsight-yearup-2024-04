package com.pluralsight.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTests
{

    @Test
    public void withdraw_shouldDecreaseBalance_byWithdrawalAmount()
    {
        // arrange
        BankAccount account = new CheckingAccount(123, "Angelica", 5000);
        double withdrawalAmount = 500;
        double expectedNewBalance = 4500;

        // act
        double actualReturnValue = account.withdraw(withdrawalAmount);

        // assert -- verify that the action did what it was supposed to do
        // verify that the withdraw() method returned the expected amount
        assertEquals(expectedNewBalance, actualReturnValue, "Because the account had $5000 and I withdrew $500");

        // check if the balance actually got updated
        double actualNewBalance = account.getBalance();
        assertEquals(expectedNewBalance, actualNewBalance, "Because the account had $5000 and I withdrew $500");
    }

    @Test
    public void deposit_shouldIncreaseBalance_byDepositAmount()
    {
        // arrange
        BankAccount account = new CheckingAccount(123, "Angelica", 5000);
        double withdrawalAmount = 500;
        double expectedNewBalance = 5500;

        // act
        double actualReturnValue = account.deposit(withdrawalAmount);

        // assert -- verify that the action did what it was supposed to do
        // verify that the deposit() method returned the expected amount
        assertEquals(expectedNewBalance, actualReturnValue, "Because the account had $5000 and I deposited $500");

        // check if the balance actually got updated
        double actualNewBalance = account.getBalance();
        assertEquals(expectedNewBalance, actualNewBalance, "Because the account had $5000 and I deposited $500");
    }

    @Test
    public void transfer_shouldMoveMoney_fromOneAccount_toAnother()
    {
        //assert
        BankAccount fromAccount = new SavingsAccount(123, "Angelica", 5000);
        BankAccount toAccount = new CheckingAccount(123, "Alan", 5000);

        //act
        boolean transferSucceded = fromAccount.transfer(toAccount,500);

        double expectedFromBalance = 4500;
        double expectedToBalance = 5500;
        double actualFromBalance = fromAccount.getBalance();
        double actualToBalance = toAccount.getBalance();

        assertTrue(transferSucceded, "Because $500 should have been moved from Angelica's account to Fahd");
        assertEquals(expectedFromBalance, actualFromBalance);
        assertEquals(expectedToBalance, actualToBalance);
    }

    @Test
    public void transfer_shouldNotMoveMoney_whenSavingsAccount_hasInsufficientFunds()
    {
        //assert
        BankAccount fromAccount = new SavingsAccount(123, "Guy", 5000);
        BankAccount toAccount = new CheckingAccount(123, "Guy", 1000);

        //act
        boolean transferSucceeded = fromAccount.transfer(toAccount,5000);

        double expectedFromBalance = 5000;
        double expectedToBalance = 1000;
        double actualFromBalance = fromAccount.getBalance();
        double actualToBalance = toAccount.getBalance();

        assertFalse(transferSucceeded, "Because a savings account has a minimum balance of $25");
        assertEquals(expectedFromBalance, actualFromBalance, "Because no money should have been transferred");
        assertEquals(expectedToBalance, actualToBalance,"Because no money should have been transferred");
    }

}