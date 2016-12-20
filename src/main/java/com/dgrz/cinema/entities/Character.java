package com.dgrz.cinema.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by thomasd on 07/11/16.
 */
@Entity @IdClass(CharacterID.class) @Table(name = "character")
public class Character {
    @Id
    private long nbMovie;

    @Id
    private long nbActor;

    @Column(nullable = false)
    private String nameCharacter;

    public long getNbMovie() {
        return nbMovie;
    }

    public void setNbMovie(int nbMovie) {
        this.nbMovie = nbMovie;
    }

    public long getNbActor() {
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
    long nbMovie;
    long nbActor;
}