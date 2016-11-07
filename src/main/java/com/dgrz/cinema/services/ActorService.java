package com.dgrz.cinema.services;

import com.dgrz.cinema.entities.Actor;

import java.util.ArrayList;

/**
 * Created by atanakar on 07/11/16.
 */
public class ActorService extends EntityService {

    public Actor getActor(int id) {
        return (Actor) this.find(Actor.class,id);
    }

    public ArrayList getActors() {
        return this.findAll("SELECT * FROM Actor");
    }

    public void updateActor(Actor actor) {
    }

    public void deleteActor(int id) {
        this.delete(Actor.class,id);
    }

    public void insertActor(Actor actor) {
        this.insert(actor);
    }
}
