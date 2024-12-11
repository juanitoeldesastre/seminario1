package pokemon;

public class Pokemon {
    private int nivel;
    private double estatura;
    private boolean shiny;
    private char sexo;
    private String mote;
    private long numeroPokedex;

    public Pokemon(int nivel, double estatura, boolean shiny, char sexo, String mote, long numeroPokedex) {
        this.nivel = nivel;
        this.estatura = estatura;
        this.shiny = shiny;
        this.sexo = sexo;
        this.mote = mote;
        this.numeroPokedex = numeroPokedex;
    }

    public void mostrarDatos() {
        System.out.println("Mote: " + mote);
        System.out.println("Nivel: " + nivel);
        System.out.println("Estatura: " + estatura + "m");
        System.out.println("Es Shiny: " + (shiny ? "Sí" : "No"));
        System.out.println("Sexo: " + sexo);
        System.out.println("Número Pokédex: " + numeroPokedex);
        System.out.println("--------------------");
    }
}
