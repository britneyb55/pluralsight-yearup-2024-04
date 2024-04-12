package com.pluralsight;

import java.awt.*;
import java.util.Scanner;

public class PayrollCalculator
{
    public static void main(String[] args)
    {

        Scanner userInput = new Scanner(System.in);

        String EmployeeName;
        float hoursWorked;
        float PayRate;
        float GrossPay;
        float overTimerate = 1.5f;
        float OvertimeHours;
        float overPay;

        //get user input

        System.out.print("Please enter your Name:");
        EmployeeName = userInput.nextLine();

        System.out.print("Enter how may hours you worked this week? ");
        hoursWorked = userInput.nextFloat();

        System.out.print("Enter your pay rate: ");
        PayRate = userInput.nextFloat();

        GrossPay = hoursWorked * PayRate;

        System.out.printf("%s gross pay is %.2f \n", EmployeeName, GrossPay);

        if (hoursWorked > 40) {
            OvertimeHours = hoursWorked - 40;
            overPay = OvertimeHours * PayRate * overTimerate;

            System.out.printf("Your overtime pay rate is %.2f \n", overPay);
        }






    }
}