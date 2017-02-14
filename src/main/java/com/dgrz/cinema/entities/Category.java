package com.dgrz.cinema.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by thomasd on 07/11/16.
 */
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String labelCat;

    @OneToMany(mappedBy="category")
    private List<Movie> movies = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLabelCat() { return labelCat; }

    public void setLabelCat(String labelCat) {
        this.labelCat = labelCat;
    }

    public List<Movie> getMovies() { return this.movies; }

    public void setMovies(List<Movie> movies) {this.movies = movies;}
}
