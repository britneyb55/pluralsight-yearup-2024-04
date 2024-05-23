package com.pluralsight.services;

import com.pluralsight.models.Employee;
import com.pluralsight.models.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonService
{

    public List<Person> findPeople(List<Person> people, String name)
    {
        List<Person> firstName = new ArrayList<>();

        for(Person personInfo:people )
        {
            if(personInfo.getFirstName().equalsIgnoreCase(name))
            {

                firstName.add(personInfo);

            }

        }
        // search for people by first name
        // return a new List<Person> with the search results
        return firstName;
    }

    public List<Person> findPeople(List<Person> people, int age)
    {
        List<Person> peopleAge = new ArrayList<>();

        for(Person personInfo: people )
        {
            if(personInfo.getAge() == age)
            {

                peopleAge.add(personInfo);

            }

        }

        return peopleAge;
    }

    public int calculateAverageAge(List<Person> people)
    {
        int age = 0;
        int i = 0;
        for(Person personInfo: people )
        {
            i++;
            age += personInfo.getAge();


        }
        return age/i;

    }

    public int findOldestAge(List<Person> people)
    {
        int perviousAge = 0;
        for(Person personInfo: people )
        {
            if(personInfo.getAge() > perviousAge)
            {
              perviousAge = personInfo.getAge();

            }

        }

        return perviousAge;
    }

    public int findYoungestAge(List<Person> people)
    {
        int perviousAge = 0;
        int oldestAge =0;
        int i = 0;

        for(Person personInfo: people )
        {
            while(i < 1)
            {
                if(personInfo.getAge() > perviousAge)
                {
                    i++;
                    perviousAge = personInfo.getAge();

                }

            }

            if (personInfo.getAge() > perviousAge)
            {
                oldestAge = personInfo.getAge();
            }
            else
            {
                perviousAge = personInfo.getAge();
            }



        }

        return perviousAge;
    }

    public List<Person> sortYoungestFirst(List<Person> people)
    {
        List<Person> youngestFirst = new ArrayList<>(people);
        Collections.sort(youngestFirst);

        return youngestFirst;
    }

    public List<Person> sortOldestFirst(List<Person> people)
    {
        List<Person> oldestFirst = new ArrayList<>(people);
        Collections.sort(oldestFirst, Collections.reverseOrder());

        return oldestFirst;
    }

    public List<Employee> createEmployees(List<Person> people)
    {
        
        // populate the list of Employees with...
        // create a new Employee for each person in your people list
        // the salary of each employee is based on their age $3,000 per year
        // i.e. a 10 year old = $30,000, a 40 year old = $120,000 etc
        return new ArrayList<>();
    }
}
