package com.DungeonsDragons;

public class Ninja extends Human {
    
    public Ninja(String nName){
        this.stealth = 10;
        this.name = nName;
    }

    public int steal(Human target){
        target.health -= this.stealth;
        this.health += this.stealth;
        System.out.println(this.name + " stole " + this.stealth + " health from " + target.name);
        System.out.println(target.name + " has " + target.health + " health remaining.");
        System.out.println(this.name + " gains " + this.stealth + " health");
        System.out.println(this.name + " has " + this.health + " health");
        return(this.stealth);
    }

    public void runAway(){
        this.health -= this.stealth;
        System.out.println(this.name + " slips away into the shadows and loses " + this.stealth + " health.");
        System.out.println(this.name + " has " + this.health + " health remaining.");
    }

    
}
