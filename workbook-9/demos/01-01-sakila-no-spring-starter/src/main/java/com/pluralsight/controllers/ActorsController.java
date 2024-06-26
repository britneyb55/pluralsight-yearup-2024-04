package com.pluralsight.controllers;

import com.pluralsight.models.Actor;
import com.pluralsight.services.ActorsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ActorsController
{
    // controller dependencies
    private ActorsDao actorsDao;

    // constructor dependency injection
    //it looks for a dataSource beam
    //looks for a beam
    @Autowired
    public ActorsController(ActorsDao actorsDao)
    {
        this.actorsDao = actorsDao;
    }


    // controller methods

    public List<Actor> findAllActors()
    {
        var actors = actorsDao.getAll();

        return actors;
    }

    public List<Actor> searchByName(String firstName, String lastName)
    {
        return  actorsDao.searchByName(firstName, lastName);
    }

    public Actor searchById(int id)
    {
        return actorsDao.getById(id);
    }

    public Actor addNewActor(Actor actor)
    {
        return actorsDao.addActor(actor);
    }

    public void updateActor(Actor actor)
    {
        actorsDao.updateActor(actor);
    }

    public void deleteActor(int actorId)
    {
        actorsDao.deleteActor(actorId);
    }
}
