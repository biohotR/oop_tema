package org.example;

import lombok.Getter;
import lombok.Setter;
import org.example.production_subclasses.Movie;
import org.example.production_subclasses.Series;
import org.example.user_subclasses.Admin;
import org.example.user_subclasses.Contributor;
import org.example.user_subclasses.Regular;

import java.io.File;
import java.util.List;

@Getter @Setter
public class IMDB {
    private static IMDB instance = null;
    private List<Request> requests;
    private List<Regular> regularUsers;
    private List<Admin> admins;
    private List<Contributor> contributors;
    private List<Actor> actors;
    private List<Movie> movies;
    private List<Series> series;


    public static void main(String[] args) {
        System.out.println("Hello world");
    }

    public static synchronized IMDB getInstance() {
        if (instance == null) {
            instance = new IMDB();
        }
        return instance;
    }
}
