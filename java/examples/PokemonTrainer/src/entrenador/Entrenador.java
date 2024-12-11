package entrenador;

import pokemon.Pokemon;

public class Entrenador {
    private String nombre;
    private Pokemon[] equipo;

    public Entrenador(String nombre, Pokemon[] equipo) {
        this.nombre = nombre;
        this.equipo = equipo;
    }

    public void mostrarEquipo() {
        System.out.println("Entrenador: " + nombre);
        System.out.println("Equipo Pokémon:");
        for (Pokemon p : equipo) {
            p.mostrarDatos();
        }
    }
}
