package org.example.production_subclasses;

import org.example.production_subclasses.Production;

public class Movie extends Production {
    private int movieLength;
    private int launchYear;

    @Override
    public void displayInfo() {
        System.out.println("Movie: " + this.getProductionName());
    }
}
