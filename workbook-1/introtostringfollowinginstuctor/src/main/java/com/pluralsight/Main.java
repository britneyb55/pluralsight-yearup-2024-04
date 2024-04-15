package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //System.out.println("Hello world!");
        commonMethods();

    }

    public static void commonMethods()
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter yout name: ");
        String fullName =  userInput.nextLine().strip();
        //trim(); //"Dana Wyatt     ";
        System.out.println("--" + fullName + "--");

    }


    public static void formatPhoneNumber()
    {
        // phone.length = 10
        // Array starts with an index of 0 - ..
        String phoneNumber = "8885551212";
        String formattedPhone;


        // first we start from the 0 and end at the beginning of 3
        String areaCode = phoneNumber.substring(0,3);

        //we start at 3 and stop at the beginning of 6
        String prefix = phoneNumber.substring(3,6);

        // we start at 6 and stop at the beginning of 10
        String last4 = phoneNumber.substring(6);

        System.out.println("Area code" + areaCode);
        System.out.println("prefix: " + prefix);
        System.out.println("last 4: " + last4);

 //       formattedPhone = "(" + areaCode + ")" + prefix + "-" + last4;
        formattedPhone = String.format("(%s) %s-%s", areaCode,prefix,last4);
        System.out.println(formattedPhone);





    }
}