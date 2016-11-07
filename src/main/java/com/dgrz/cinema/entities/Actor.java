package com.dgrz.cinema.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Created by thomasd on 10/10/16.
 */

@Entity
@Table(name = "actor")
public class Actor implements Serializable {

    @Id
    @GeneratedValue
    private int nbAct;

    @Column(nullable = false)
    private String lastNameAct;

    @Column(nullable = false)
    private String firstNameAct;

    @Column(nullable = false)
    private String birthDate;

    @Column(nullable = true)
    private String deathDate;

    public String getLastNameAct() {
        return lastNameAct;
    }

    public void setLastNameAct(String lastNameAct) {
        this.lastNameAct = lastNameAct;
    }

    public String getFirstNameAct() {
        return firstNameAct;
    }

    public void setFirstNameAct(String firstNameAct) {
        this.firstNameAct = firstNameAct;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(String deathDate) {
        this.deathDate = deathDate;
    }
}