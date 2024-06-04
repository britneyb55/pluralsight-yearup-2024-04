package com.pluralsight.services;

import com.pluralsight.models.Employee;
import com.pluralsight.models.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonService
{

    public List<Person> findPeople(List<Person> people, String name)
    {
        List<Person> firstName = people.stream()
                                        .filter(person -> person.getFirstName().equalsIgnoreCase(name))
                                        .toList();
        // search for people by first name
        // return a new List<Person> with the search results
        return firstName;
    }

    public List<Person> findPeople(List<Person> people, int age)
    {
        List<Person> peopleByAge = people.stream()
                                         .filter(person -> person.getAge() == age)
                                         .toList();
        return peopleByAge;
    }

    public int calculateAverageAge(List<Person> people)
    {
        var averageAge = people.stream()
                .mapToInt(Integer::getAge)
                .average();

        return averageAge;
    }

    public int findOldestAge(List<Person> people)
    {
        return 0;
    }

    public int findYoungestAge(List<Person> people)
    {
        return 0;
    }

    public List<Person> sortYoungestFirst(List<Person> people)
    {
        return new ArrayList<>();
    }

    public List<Person> sortOldestFirst(List<Person> people)
    {
        return new ArrayList<>();
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
