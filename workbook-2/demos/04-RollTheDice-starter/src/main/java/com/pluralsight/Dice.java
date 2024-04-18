package com.pluralsight;

public class Dice
{
    //roll is a method
    public int roll()
    {
        int randomNumber = (int)(Math.random() * 6) + 1;
        return randomNumber;
    }
}
