package com.dgrz.cinema.controllers;

import com.dgrz.cinema.entities.Actor;
import com.dgrz.cinema.services.ActorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by atanakar on 07/11/16.
 */

@Controller
public class ActorController {

    @RequestMapping(path = "/api/actors/{id}", method = RequestMethod.GET)
    public Actor getActor(@RequestParam(value="id") int id){

        ActorService as = new ActorService();
        as.getActor(id);

        return null;
    }

    @RequestMapping(path = "/api/actors/", method = RequestMethod.GET)
    public List<Actor> getActors(){

        ActorService as = new ActorService();
        as.getActors();

        return null;
    }

    @RequestMapping(path = "/api/actors/", method = RequestMethod.PUT)
    public void updateActor(@RequestBody Actor actor){

        ActorService as = new ActorService();
        as.updateActor(actor);

        return;
    }


    @RequestMapping(path = "/api/actors/{id}", method = RequestMethod.DELETE)
    public void deleteActor(@RequestParam(value="id") int id){

        ActorService as = new ActorService();
        as.deleteActor(id);

        return;
    }

    @RequestMapping(path = "/api/actors/", method = RequestMethod.POST)
    public void insertActor(@RequestBody Actor actor){

        ActorService as = new ActorService();
        as.insertActor(actor);

        return;
    }

}
