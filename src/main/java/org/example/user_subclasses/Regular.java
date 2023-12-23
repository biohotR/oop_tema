package org.example.user_subclasses;

import org.example.IMDB;
import org.example.Request;
import org.example.RequestsManager;

public class Regular extends User implements RequestsManager {
    public Regular(Information information, int experience) {
        super(information, AccountType.REGULAR, experience);
    }

    @Override
    public void addFavorite(Comparable item) {
        getFavorites().add(item);
    }

    @Override
    public void removeFavorite(Comparable item) {
        getFavorites().remove(item);
    }

    @Override
    public void updateExperience(int exp) {
        setExperience(getExperience() + exp);
    }

    @Override
    public void logout() {
        System.out.println("Logging out...");
    }

    @Override
    public void createRequest(Request request) {
        IMDB.getInstance().getRequests().add(request);
    }

    @Override
    public void deleteRequest(Request request) {
        IMDB.getInstance().getRequests().remove(request);
    }
}
