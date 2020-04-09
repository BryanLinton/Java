package com.Zoo;

public class Gorilla extends Mammals {
    Mammals gEnergy = new Mammals();

    public void throwSomething(){
        System.out.println("The Gorilla has thrown something! It's feels a bit more tired.");
        gEnergy.setEnergy(gEnergy.getEnergy() - 5);
        gEnergy.displayEnergy();
    }

    public void eatBananas(){
        System.out.println("The gorilla is feels better after eating");
        gEnergy.setEnergy(gEnergy.getEnergy() + 10);
        gEnergy.displayEnergy();
    }

    public void climb(){
        System.out.println("The Gorilla is tired after climbing.");
        gEnergy.setEnergy(gEnergy.getEnergy() - 10);
        gEnergy.displayEnergy();
    }
}
