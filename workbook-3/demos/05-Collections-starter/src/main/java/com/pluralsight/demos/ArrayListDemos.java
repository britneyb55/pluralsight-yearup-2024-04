package com.pluralsight.demos;

import com.pluralsight.io.CityLoader;
import com.pluralsight.models.City;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListDemos
{
    public static void main(String[] args)
    {
        displayCountries();

    }

    public static void basicArrayList()
    {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        //ArrayList of only String
        ArrayList<String> heroes = new ArrayList<String>();
        heroes.add("Thor");
        heroes.add("Spider-Man");
        heroes.add("Thor");
        heroes.add("Iron Man");
        heroes.add("Thor");
        heroes.add("Captain America");

        heroes.add("Thor");
        heroes.remove("Thor");



        while(heroes.contains("Thor"))
        {
            heroes.remove("Thor");
        }

        for (String hero:heroes)
        {
            System.out.println(hero);
        }
        System.out.println();

        for(int i = 0; i < heroes.size(); i++)
        {
            String hero = heroes.get(i);
            System.out.println(hero);
        }
//        heroes.add("Hulk");
//        heroes.add("Black Widow");
//        heroes.add("Hawkeye");
//        heroes.add("Ant-Man");
//        heroes.add("Wasp");
//        heroes.add("Black Panther");
//        heroes.add("Doctor Strange");
//        heroes.add("Scarlet Witch");
//        heroes.add("Vision");
//        heroes.add("Falcon");
//        heroes.add("Winter Soldier");
//        heroes.add("Star-Lord");
//        heroes.add("Gamora");
//        heroes.add("Drax the Destroyer");
//        heroes.add("Rocket Raccoon");
//        heroes.add("Groot");


    }

    public static void displayCities()
    {
        //how to load an array from memory
        CityLoader cityLoader = new CityLoader();
        ArrayList<City> cities = cityLoader.loadCities();

        for(City city : cities)
        {
            System.out.println(city.getName() + ", " + city.getCountry());
        }

    }

    //what countries do i have customer in? Country print once

    public static void displayCountries()
    {
        //how to load an array from memory
        CityLoader cityLoader = new CityLoader();
        ArrayList<City> cities = cityLoader.loadCities();
        //create a new array list of string for countries
        ArrayList<String> countries = new ArrayList<>();

        for (City city :cities)
        {
            if(!countries.contains(city.getCountry()))
            {
                countries.add(city.getCountry());
            }
        }

        for(String country:countries)
        {
            System.out.println(country);
        }

    }

    public static void displayCustomerCountriesAsSet()
    {
        CityLoader cityLoader = new CityLoader();
        ArrayList<City> cities = cityLoader.loadCities();
        HashSet<String> countries = new HashSet<>();

        for(City city : cities)
        {
            countries.add(city.getCountry());

        }
        for (String country: countries)
        {
            System.out.println(country);

        }
    }


}
