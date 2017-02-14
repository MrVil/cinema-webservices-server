package com.dgrz.cinema.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by thomasd on 10/10/16
 */
@Entity
public class Movie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private Category category;

    public Category getCategory() { return this.category; }

    public void setCategory(Category category) { this.category = category; }

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private int length;

    @Column(nullable = false)
    private String releaseDate;

    @Column(nullable = false)
    private int budget;

    @Column(nullable = false)
    private int income;

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }
}