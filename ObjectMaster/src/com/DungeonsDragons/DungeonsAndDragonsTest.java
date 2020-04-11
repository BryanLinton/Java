package com.DungeonsDragons;

public class DungeonsAndDragonsTest {

    public static void main(String[] args) {
    Human h1 = new Human();
    Human h2 = new Human("Jerk1");
    Wizard w1 = new Wizard("Jerk Wizard");
    Ninja n1 = new Ninja("Jerk Ninja");

    h2.attack(h1);
    h2.attack(h1);
    h2.attack(h1);

    w1.fireball(h1);
    w1.heal(h1);
    w1.heal(h1);

    n1.steal(h1);
    n1.steal(w1);
    n1.runAway();


    }
}
