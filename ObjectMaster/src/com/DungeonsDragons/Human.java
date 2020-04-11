package com.DungeonsDragons;

public class Human {
    protected int strength;
    protected int stealth;
    protected int intelligence;
    protected int health;
    protected String name;
    
    protected int hStrength = 3;
    protected int hStealth = 3;
    protected int hIntelligence = 3;
    protected int hHealth = 100;
    protected String hName = "Bobbert";

    public Human(){
        this.strength = hStrength;
        this.stealth = hStealth;
        this.intelligence = hIntelligence;
        this.health = hHealth;
        this.name = hName;
    }

    public Human(String cName){
        this.strength = hStrength;
        this.stealth = hStealth;
        this.intelligence = hIntelligence;
        this.health = hHealth;
        this.name = cName;
    }

    public int attack(Human target){
        int aDamage = this.strength;
        target.health -= aDamage;
        System.out.println(this.name + " attacked " + target.name + " for " + this.strength + " damage!");
        System.out.println(target.name + " has " + target.health + " Health remaining");
        return(target.health);
    }


}
