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
    private long id;

    @Column
    private String labelCat;

    @ManyToMany
    private List<Movie> movies = new ArrayList<>();

    public long getCodeCat() {
        return id;
    }

    public void setCodeCat(int codeCat) {
        id = codeCat;
    }

    public String getLabelCat() { return labelCat; }

    public void setLabelCat(String labelCat) {
        this.labelCat = labelCat;
    }
}
