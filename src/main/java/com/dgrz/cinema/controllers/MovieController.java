package com.dgrz.cinema.controllers;

import com.dgrz.cinema.entities.Movie;
import com.dgrz.cinema.services.MovieService;
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
public class MovieController {

    @RequestMapping(path = "/api/movies/{id}", method = RequestMethod.GET)
    public Movie getMovie(@RequestParam(value="id") int id){

        MovieService ms = new MovieService();
        ms.getMovie(id);

        return null;
    }

    @RequestMapping(path = "/api/movies/", method = RequestMethod.GET)
    public List<Movie> getMovies(){

        MovieService ms = new MovieService();
        ms.getMovies();

        return null;
    }

    @RequestMapping(path = "/api/movies/", method = RequestMethod.PUT)
    public void updateMovie(@RequestBody Movie movie){

        MovieService ms = new MovieService();
        ms.updateMovie(movie);

        return;
    }


    @RequestMapping(path = "/api/movies/{id}", method = RequestMethod.DELETE)
    public void deleteMovie(@RequestParam(value="id") int id){

        MovieService ms = new MovieService();
        ms.deleteMovie(id);

        return;
    }

    @RequestMapping(path = "/api/movies/", method = RequestMethod.POST)
    public void insertMovie(@RequestBody Movie movie){

        MovieService ms = new MovieService();
        ms.insertMovie(movie);

        return;
    }

}
