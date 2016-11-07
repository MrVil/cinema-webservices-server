package com.dgrz.cinema.entities;

import javax.persistence.*;

/**
 * Created by thomasd on 07/11/16.
 */
@Entity
@Table(name = "categorie")
public class Categorie {

    @Id
    @GeneratedValue
    private int CodeCat;

    @Column(nullable = false)
    private String LabelCat;


    public int getCodeCat() {
        return CodeCat;
    }

    public void setCodeCat(int codeCat) {
        CodeCat = codeCat;
    }

    public String getLabelCat() {
        return LabelCat;
    }

    public void setLabelCat(String labelCat) {
        LabelCat = labelCat;
    }
}
