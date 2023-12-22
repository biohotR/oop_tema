package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class IMDB {
    private static IMDB instance = null;
    private List<Request> requests;

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
