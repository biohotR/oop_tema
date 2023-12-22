package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Actor implements Comparable<Actor> {
    private String name;
    private String biography;
    private List<String> filmography;

    public Actor(String name, String biography) {
        this.name = name;
        this.biography = biography;
        this.filmography = new ArrayList<>();
    }

    public void addProduction(String productionName) {
        if (!filmography.contains(productionName)) {
            filmography.add(productionName);
        }
    }

    public int compareTo(Actor other) {
        return this.name.compareTo(other.name);
    }
}
