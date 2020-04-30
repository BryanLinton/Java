package com.Pokemon;

public class Pokemon {
    private String name;
    private int health;
    private String type;
    private static int pokemonCount;

    protected void setName(String pName) {this.name = pName;}
    protected void setHealth(int pHealth) {this.health = pHealth;}
    protected void setType(String pType) {this.type = pType;}

    protected String getName() {return this.name;}
    protected int getHealth() {return this.health;}
    protected String getType() {return this.type;}

    public Pokemon(){};

    public Pokemon(String name, int health, String type){
        this.name = name;
        this.health = health;
        this.type = type;
        pokemonCount++;
    }

    void attackPokemon(Pokemon pokemon){
        pokemon.health -= 10;
    }

}
