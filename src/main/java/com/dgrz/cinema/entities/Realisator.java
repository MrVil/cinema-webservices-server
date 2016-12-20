package com.dgrz.cinema.entities;

import javax.persistence.*;

/**
 * Created by thomasd on 07/11/16.
 */
@Entity @Table(name = "realisator")
public class Realisator {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String LastNamerea;

    @Column(nullable = false)
    private String FirstNameRea;

    public long getNbRea() {
        return id;
    }

    public void setNbRea(int nbRea) {
        this.id = nbRea;
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
