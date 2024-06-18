package com.pluralsight.controllers;

import com.pluralsight.models.Actor;
import com.pluralsight.services.ActorsDao;


import java.util.List;

public class ActorsController
{
    //define a DAO
    private ActorsDao actorsDao;


    public ActorsController(ActorsDao actorsDao)
    {
        //create a instance of an object
        this.actorsDao = actorsDao;
    }

    public List<Actor> findAllActors()
    {
        var actors = actorsDao.getAll();

        return actors;
    }

    public void addNewActor(Actor actor)
    {
        actorsDao.addActor(actor);
    }

    public Actor searchById(int id)
    {
        return actorsDao.getById(id);
    }

    public void deleteActor(int actorId)
    {
        actorsDao.deleteActor(actorId);
    }
}

