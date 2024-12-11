package PokemonTrainer.src;
import entrenador.Entrenador;
import pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        // Crear los Pokémon
        Pokemon[] equipo = new Pokemon[4];
        equipo[0] = new Pokemon(50, 1.0, false, 'U', "Magneton", 82);
        equipo[1] = new Pokemon(30, 2.1, false, 'C', "Charizard", 6);
        equipo[2] = new Pokemon(20, 0.8, true, 'S', "Squirtle", 7);
        equipo[3] = new Pokemon(18, 1.0, false, 'B', "Bulbasaur", 1);

        // Crear al entrenador
        Entrenador entrenador = new Entrenador("Ash", equipo);

        // Mostrar el equipo del entrenador
        entrenador.mostrarEquipo();
    }
}
