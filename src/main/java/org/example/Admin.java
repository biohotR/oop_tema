package org.example;

public class Admin extends Staff {
    public Admin(User.Information information, int experience) {
        super(information, experience);
    }

    public void deleteRequest(Request request) {
        getStaffRequests().remove(request);
    }

    public void createRequest(Request request) {
        getStaffRequests().add(request);
    }

    @Override
    public void removeActorSystem(String name) {

    }
}
