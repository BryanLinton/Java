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

    public  Mammals(int energy){
        setEnergy(energy);
        getEnergy();
    }

    public int energyLevel(int energy){
        setEnergy(energy);
        return(getEnergy());
    }

    public int displayEnergy() {

        if(getEnergy() < 0){
            System.out.println("The animal died from exhaustion");
        } else 
        {
            System.out.println("Energy level is " + energy);
        }

        return(getEnergy());
    }
}
