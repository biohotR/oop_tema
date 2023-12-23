package org.example.user_subclasses;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import lombok.Getter;
import lombok.Setter;
import org.example.Actor;
import org.example.Request;
import org.example.production_subclasses.Production;

@Getter @Setter
public abstract class Staff extends User implements StaffInterface {
    private List<Request> staffRequests;
    private SortedSet<Comparable> productionsAndActorsAdded; // set for productions and actors added by staff

    public Staff(Information information, int experience, AccountType accountType) {
        super(information, accountType, experience);
        this.staffRequests = new ArrayList<>();
        this.productionsAndActorsAdded = new TreeSet<>();
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
    public void addProductionSystem(Production p) {
        productionsAndActorsAdded.add(p);
    }

    @Override
    public void addActorSystem(Actor a) {
        productionsAndActorsAdded.add((a));
    }

    @Override
    public void removeProductionSystem(String name) {
        productionsAndActorsAdded.removeIf(p -> ((Production) p).getProductionName().equals(name));
    }

    @Override
    public abstract void removeActorSystem(String name);
    public void updateProduction(Production p) {
        productionsAndActorsAdded.remove(p);
        productionsAndActorsAdded.add(p);
    }
    public void updateActor(Actor a) {
        productionsAndActorsAdded.remove(a);
        productionsAndActorsAdded.add((a));
    }
}
