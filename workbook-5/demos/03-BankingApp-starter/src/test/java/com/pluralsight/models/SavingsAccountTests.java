package com.pluralsight.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTests
{
    private SavingsAccount account;

    @BeforeEach
    public void setup()
    {
        account = new SavingsAccount(456, "Julian", 5000);
    }

    @Test
    public void canWithdraw_shouldReturnTrue_ifWithdraw_islowerthanBalance()
    {
        //
        double expectedValue = 25;
        double withdrawAmount = 4975;

        //act
        boolean balanceAmount = account.canWithdraw(withdrawAmount);

        //assert
        assertTrue(balanceAmount, "Because the amount is $5000 and the amount to withdraw is $4975. The remaining balance is 25.  ");
    }

    @Test
    public void canwithdraw_shouldReturnFalse_ifWithdraw_isHigherThanBalance()
    {
        double withdrawAmount = 4985;

        boolean balanceAmount = account.canWithdraw(withdrawAmount);

        assertFalse(balanceAmount, "Because the amount is $5000 and the amount to withdraw is $4985.  it is less than the Min balance it requires.");
    }

    @Test
    public void withdraw_shouldDeceaseTheAmount_whenWithdrawAmount()
    {
        //assest
        double expectedAmount = 25;
        double withdrawAmount = 4975;

        //act
        double withdraw = account.withdraw(withdrawAmount);


        //assert
        assertEquals(expectedAmount, withdraw);

    }

    @Test
    public void withdraw_shouldNotDecreaseTheAmount_whenWithdrawAmount()
    {
        double expectedAmount = 15;
        double withdrawAmount = 4985;

        //act
        double withdraw = account.withdraw(withdrawAmount);


        //assert
        assertEquals(expectedAmount, withdraw);
    }


}