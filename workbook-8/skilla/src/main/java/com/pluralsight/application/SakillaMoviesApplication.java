package com.pluralsight.application;

import com.pluralsight.models.Actor;

import java.util.List;

public class SakillaMoviesApplication
{

    private ApplicationConfiguration config;


    public SakillaMoviesApplication(ApplicationConfiguration config)

    {
      this.config = config;
    }

    public void run()
    {
        while(true)
        {
            int selection = config.homeView.getUserSelection();

            switch (selection)
            {
                case 1 -> displayActorList();
                case 2 -> addActor();
                case 3 -> deleteActor();
                case 0 -> System.exit(0);
            }
        }

    }



    private void displayActorList()
    {
        //go to the actors controller and get a list of actors
        List<Actor> actors = config.actorsController.findAllActors();

        // call the actor listView and pass in th returned list
        config.actorListView.displayActors(actors);
    }

    private void addActor()
    {
        Actor newActor = config.actorAddView.getNewActor();
        config.actorsController.addNewActor(newActor);
    }

    private void deleteActor()
    {
        int searchId = config.actorSearchByIdView.getActorId();
        Actor actor = config.actorsController.searchById(searchId);

        config.actorsController.deleteActor(actor.getActorId());
    }
}

