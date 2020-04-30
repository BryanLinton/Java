package com.Pokemon;

import java.util.ArrayList;

public abstract class AbstractPokemon implements PokemonInterface {
    public ArrayList<String> myPokemon = new ArrayList<String>();
    

    public Pokemon createPokemon(String name, int health, String type) {
        myPokemon.add(name);
        return new Pokemon(name, health, type);
    }
    

    public String pokemonInfo(Pokemon pokemon){
        System.out.println("Name: " + pokemon.getName() + " Health: " + pokemon.getHealth() + " Type: " + pokemon.getType());
        return("Name: " + pokemon.getName() + " Health: " + pokemon.getHealth() + " Type: " + pokemon.getType());
    }
}
