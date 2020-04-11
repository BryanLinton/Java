package com.DungeonsDragons;

public class Wizard extends Human {

    public Wizard(String wName){
        this.health = 50;
        this.intelligence = 8;
        this.name = wName;
    }

    public int heal(Human target){
        int heal = this.intelligence;
        target.health += heal;
        System.out.println(this.name + " healed " + target.name + " for " + this.intelligence + " health.");
        System.out.println(target.name + " has " +target.health + " health.");
        return(target.health);
    }

    public int fireball(Human target){
        int fbDamage = this.intelligence * 3;
        target.health -= fbDamage;
        System.out.println(this.name + " cast Fireball on " + target.name + " for " + fbDamage + " damage!");
        System.out.println(target.name + " has " + target.health + " health remaining.");
        return(target.health);
    }


}
