package com.dgrz.cinema.entities;

import javax.persistence.*;

/**
 * Created by thomasd on 07/11/16.
 */
@Entity
@Table(name = "categorie")
public class Category {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String LabelCat;


    public int getCodeCat() {
        return id;
    }

    public void setCodeCat(int codeCat) {
        id = codeCat;
    }

    public String getLabelCat() {
        return LabelCat;
    }

    public void setLabelCat(String labelCat) {
        LabelCat = labelCat;
    }
}
