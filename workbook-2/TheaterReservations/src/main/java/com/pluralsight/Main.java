package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner userinput = new Scanner(System.in);

        //input
        int NumberOfticket =0;
        String date ="";
        String ticket_s="";
        String lastname ="";
        String firstname;
        DateTimeFormatter formatter;

        System.out.print("Enter your name:");
        String Fullname = userinput.nextLine().strip();

        int index = Fullname.indexOf(" ");
        firstname = Fullname.substring(0,index);
        lastname = Fullname.substring(index+1);

        System.out.print("What date will you be coming? (MM/dd/yyyy):");
        date = userinput.nextLine().strip();
        formatter = DateTimeFormatter.ofPattern("M/dd/yyyy");
        LocalDate theaterdate = LocalDate.parse(date, formatter);


        System.out.print("How many tickets would you like to purchase?");
        NumberOfticket = userinput.nextInt();

        if (NumberOfticket > 1)
        {
            ticket_s = "tickets";
        }
        else
        {
            ticket_s = "ticket";
        }

        //output
        System.out.printf("%d %s reserved for " + theaterdate + " under %s, %s", NumberOfticket,ticket_s, lastname, firstname);
    }
}