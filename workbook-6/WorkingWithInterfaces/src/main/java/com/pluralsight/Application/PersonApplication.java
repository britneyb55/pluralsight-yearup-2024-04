package com.pluralsight.Application;
import com.pluralsight.models.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonApplication
{

    public static void run() {
        List<Person> myFamily = new ArrayList<>();
        myFamily.add(new Person("Dana", "Wyatt", 63));
        myFamily.add(new Person("Zachary", "Johnson ", 31));
        myFamily.add(new Person("Elisha", "Lanister", 63));
        myFamily.add(new Person("Ian", "Snow", 16));
        myFamily.add(new Person("Zephaniah", "Hughes", 9));
        myFamily.add(new Person("Ezra", "Aiden", 17));

        System.out.println("Sorting by first Name");

        Collections.sort(myFamily);
        for(Person family : myFamily)
        {
            System.out.println(family.getFirstName() + " " + family.getLastName() + " " + family.getAge());
        }

    }
}
