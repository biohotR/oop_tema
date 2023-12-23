package org.example.user_subclasses;

import org.example.Actor;
import org.example.production_subclasses.Production;

public interface StaffInterface {
    public void addProductionSystem(Production p);
    public void addActorSystem(Actor a);
    public void removeProductionSystem(String name);
    public void removeActorSystem(String name);

    public void updateProduction(Production p);
    public void updateActor(Actor a);
}
