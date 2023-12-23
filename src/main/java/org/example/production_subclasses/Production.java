package org.example.production_subclasses;

import lombok.Getter;
import lombok.Setter;
import org.example.Rating;

import java.util.List;

@Getter @Setter
public abstract class Production implements Comparable<Production> {
    enum Genre {
        Action, Adventure, Comedy, Drama, Horror, SF,
        Fantasy, Romance, Mystery, Thriller, Crime, Biography, War
    }

    private String productionName;
    private String movieSubject;
    private List<String> stageDirectors;
    private List<String> actors;
    private List<Genre> genres;
    private List<Rating> ratings;
    private Double movieGrade;

    public abstract void displayInfo();

    @Override
    public int compareTo(Production other){
        return this.productionName.compareTo(other.productionName);
    };
}

