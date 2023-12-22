package org.example;

public class Contributor extends Staff implements RequestsManager {
    public Contributor(User.Information information, int experience) {
        super(information, experience);
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
    }
}
