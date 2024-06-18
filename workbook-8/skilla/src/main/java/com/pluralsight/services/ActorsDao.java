package com.pluralsight.services;

import com.pluralsight.models.Actor;

import java.util.List;

public interface ActorsDao
{
    //Define all Crud
    List<Actor> getAll();
    void addActor(Actor actor);
    Actor getById(int id);
    void deleteActor(int actorId);
}
