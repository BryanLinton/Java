package com.Zoo;

public class GiantBat extends Mammals {
    Mammals gbEnergy = new Mammals(300);

    public void fly(){
        System.out.println("WHOOOOOOOOOOOOSHHHHHHHH");
        gbEnergy.setEnergy(gbEnergy.getEnergy() - 50);
        gbEnergy.displayEnergy();
    }

    public void eatHumans(){
        System.out.println("Oh shit it just killed another person!!");
        gbEnergy.setEnergy(gbEnergy.getEnergy() + 25);
        gbEnergy.displayEnergy();
    }

    public void attackTown(){
        System.out.println("HEEEELLLPPPP FIIIIIIRRRRRREEEEE!!!!! A GIANT FUCKIN BAT IS ATTACKING THE TOWN!!!!");
        gbEnergy.setEnergy(gbEnergy.getEnergy() - 100);
        gbEnergy.displayEnergy();
    }
}
