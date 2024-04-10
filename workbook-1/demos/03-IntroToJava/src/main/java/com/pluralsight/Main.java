package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        // variable naming
        // camelCasing
        // PascalCasing
        // snake_case -- not really used in java
        // UPPER_CASE -- in java this is for constants
        // kebab-case -- does not work in java (but used in other languages)
        // System is just a class


        // numbers

        // declare a variable the has count of kids on a bus
        byte countOfKidsOnBus;
        countOfKidsOnBus = 127; // ininializing it
        System.out.println("kids on bus:" + countOfKidsOnBus);

        //declare a variable that has a count of the number of buses in the school district
        int countOfBusesInDistrict =  12;
        System.out.println("Buses in the school dirstrict" + countOfBusesInDistrict);


        //price of chocolate
        double priceOfChocolate = 1.5;

        // are all of the kids on the bus?
        boolean kidsAreOnBus = true;

        // the first letter of the alphabet
        char firstLetter = 'a'; // single quotes always mean one letter

        // name of your favorite restaurant
        // string is not a primitive data type
        String favoriteRestaurant = "Texas Roadhouse";
    }
}