package com.Pokemon;

public class PokemonTest {

    public static void main(String[] args) {
    
    Pokedex pokedex = new Pokedex();
    Pokemon meanPokemon = new Pokemon();
    
	Pokemon charmander = pokedex.createPokemon("Charmander", 100, "fire");
    Pokemon pikachu = pokedex.createPokemon("Pikachu", 50, "electric");
    
		
    meanPokemon.attackPokemon(charmander);
    meanPokemon.attackPokemon(pikachu);
	pokedex.pokemonInfo(charmander);
    pokedex.pokemonInfo(pikachu);
    pokedex.listPokemon();
    
    }
}
