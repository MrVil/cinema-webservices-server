package com.dgrz.cinema.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by atanakar on 07/11/16.
 */

@Controller
public class MovieController {

    @RequestMapping(path = "/api/movie/{id}", method = RequestMethod.GET)
    public Movie getMovie(@RequestParam(value="id") int id){

        return null;
    }

    @RequestMapping(path = "/api/movies/", method = RequestMethod.GET)
    public List<Movie> getMovies(){

        return null;
    }

    @RequestMapping(path = "/api/movie/{id}", method = RequestMethod.PUT)
    public void updateMovie(@RequestParam(value="id") int id){

        return;
    }

    @RequestMapping(path = "/api/movie/{id}", method = RequestMethod.DELETE)
    public void deleteMovie(@RequestParam(value="id") int id){

        return;
    }


}
