package com.pluralsight.services.csv;

import com.pluralsight.models.Actor;
import com.pluralsight.services.ActorsDao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CsvActorsDao implements ActorsDao
{


    @Override
    public List<Actor> getAll()
    {
        var actors = new ArrayList<Actor>();

        File file = new File("files/actors.csv");

        try(Scanner scanner = new Scanner(file))
        {
            scanner.nextLine();

            while(scanner.hasNext())
            {
                var line = scanner.nextLine();
                var columns = line.split("\\|");

                Actor actor = new Actor(Integer.parseInt(columns[0]), columns[1],columns[2]);
                actors.add(actor);
            }
        } catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        return actors;
    }

    @Override
    public void addActor(Actor actor) {

    }

    @Override
    public Actor getById(int id) {
        return null;
    }

    @Override
    public void deleteActor(int actorId) {

    }
}
