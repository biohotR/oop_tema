package org.example.user_subclasses;

import org.example.Actor;
import org.example.IMDB;
import org.example.Request;
import org.example.user_subclasses.Staff;

public class Admin extends Staff {
    public Admin(Information information, int experience) {
        super(information, experience, AccountType.ADMIN);
    }

    public void deleteRequest(Request request) {
        getStaffRequests().remove(request);
    }

    public void createRequest(Request request) {
        getStaffRequests().add(request);
    }

    @Override
    public void removeActorSystem(String name) {
        IMDB.getInstance().getActors().removeIf(actor -> actor.getName().equals(name));
    }
}
