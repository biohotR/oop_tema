package org.example.user_subclasses;
import org.example.IMDB;


import org.example.Request;
import org.example.RequestsManager;

public class Contributor extends Staff implements RequestsManager {
    public Contributor(Information information, int experience) {
        super(information, experience, AccountType.CONTRIBUTOR);
    }


    @Override
    public void createRequest(Request request) {
        getStaffRequests().add(request);
    }

    @Override
    public void deleteRequest(Request request) {
        getStaffRequests().remove(request);
    }

    @Override
    public void removeActorSystem(String name) {
        IMDB.getInstance().getActors().removeIf(actor -> actor.getName().equals(name));
    }
}
