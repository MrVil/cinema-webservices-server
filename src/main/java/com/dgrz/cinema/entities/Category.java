package com.dgrz.cinema.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by thomasd on 07/11/16.
 */
@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue
    @Column(name="ID")
    private long id;

    @Column
    private String labelCat;

    @OneToMany(fetch = FetchType.LAZY, mappedBy="category_id", cascade = CascadeType.ALL)
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
