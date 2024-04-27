package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FormatDates
{
    public static void main(String[] args)
    {

        LocalDateTime today = LocalDateTime.now();
        //09/05/2021
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(today.format(dateFormatter));

        //2021-09-05
        DateTimeFormatter dateFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(today.format(dateFormatter2));

        //September 5, 2021
        DateTimeFormatter dateFormatter3 = DateTimeFormatter.ofPattern("MMMM d yyyy");
        System.out.println(today.format(dateFormatter3));

      //Sunday, Sep 5, 2021  10:02

        DateTimeFormatter dateFormatter4 = DateTimeFormatter.ofPattern("E, MMM d, yyyy HH:mm");
        System.out.println(today.format(dateFormatter4));

        // 5:02 on 05-Sep-2021
        DateTimeFormatter  DateTime = DateTimeFormatter.ofPattern("hh:mm");
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd-MMM-YYYY");
        System.out.println(today.format(DateTime) + " on " + today.format(date));

    }
}