package com.dgrz.cinema.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by thomasd on 07/11/16.
 */
@Entity @IdClass(CharacterID.class) @Table(name = "character")
public class Character {
    @Id
    private int nbMovie;

    @Id
    private int nbActor;

    @Column(nullable = false)
    private String nameCharacter;

    public int getNbMovie() {
        return nbMovie;
    }

    public void setNbMovie(int nbMovie) {
        this.nbMovie = nbMovie;
    }

    public int getNbActor() {
        return nbActor;
    }

    public void setNbActor(int nbActor) {
        this.nbActor = nbActor;
    }

    public String getNameCharacter() {
        return nameCharacter;
    }

    public void setNameCharacter(String nameCharacter) {
        this.nameCharacter = nameCharacter;
    }
}


class CharacterID implements Serializable {
    int nbMovie;
    int nbActor;
}