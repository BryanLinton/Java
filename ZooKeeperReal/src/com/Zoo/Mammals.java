package com.Zoo;

public class Mammals {
    private int energy = 100;

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return this.energy;
    }

    public  Mammals(){
        setEnergy(energy);
        getEnergy();
    }

    public int energyLevel(int energy){
        setEnergy(energy);
        return(getEnergy());
    }

    public int displayEnergy() {
        System.out.println("Energy level is " + energy);
        return(getEnergy());
    }
}
