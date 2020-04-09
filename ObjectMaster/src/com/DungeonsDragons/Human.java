package com.DungeonsDragons;

public class Human {
    private int strength = 3;
    private int stealth = 3;
    private int intelligence = 3;
    private int health = 100;

    public void setStrength(int strength) {this.strength = strength;}
    public void setStealth(int stealth) {this.stealth = stealth;}
    public void setIntelligence(int intelligence) {this.intelligence = intelligence;}
    public void setHealth(int health) {this.health = health;}

    public int getStrength() {return this.strength;}
    public int getStealth() {return this.stealth;}
    public int getIntelligence() {return this.intelligence;}
    public int getHealth() {return this.health;}

    public Human(){
        setStrength(strength);
        setStealth(stealth);
        setIntelligence(intelligence); 
        setHealth(health);
    }

    public int attack(){
        setHealth(getHealth() - getStrength());
        System.out.println(getHealth());
        return(getHealth());
    }


}
