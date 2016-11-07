package com.dgrz.cinema.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by atanakar on 07/11/16.
 */

@Controller
public class ActorController {

    @RequestMapping(path = "/api/actor/{id}", method = RequestMethod.GET)
    public Actor getActor(@RequestParam(value="id") int id){

        return null;
    }

    @RequestMapping(path = "/api/actors/", method = RequestMethod.GET)
    public List<Actor> getActors(){

        return null;
    }

    @RequestMapping(path = "/api/actor/{id}", method = RequestMethod.PUT)
    public void updateActor(@RequestParam(value="id") int id){

        return;
    }


    @RequestMapping(path = "/api/actor/{id}", method = RequestMethod.DELETE)
    public void deleteActor(@RequestParam(value="id") int id){

        return;
    }


}
