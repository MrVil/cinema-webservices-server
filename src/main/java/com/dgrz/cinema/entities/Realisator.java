package com.dgrz.cinema.entities;

import javax.persistence.*;

/**
 * Created by thomasd on 07/11/16.
 */
@Entity @Table(name = "realisator")
public class Realisator {

    @Id
    @GeneratedValue
    private int nbRea;

    @Column(nullable = false)
    private String LastNamerea;

    @Column(nullable = false)
    private String FirstNameRea;

    public int getNbRea() {
        return nbRea;
    }

    public void setNbRea(int nbRea) {
        this.nbRea = nbRea;
    }

    public String getLastNamerea() {
        return LastNamerea;
    }

    public void setLastNamerea(String lastNamerea) {
        LastNamerea = lastNamerea;
    }

    public String getFirstNameRea() {
        return FirstNameRea;
    }

    public void setFirstNameRea(String firstNameRea) {
        FirstNameRea = firstNameRea;
    }
}
