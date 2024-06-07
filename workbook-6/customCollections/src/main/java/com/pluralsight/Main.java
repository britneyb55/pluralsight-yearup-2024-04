package com.pluralsight;

import com.pluralsight.models.FixedList;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args)
    {
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        numbers.add(43);

        System.out.println(numbers.getItems());

        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        dates.add(15); // this line should fail

    }
}