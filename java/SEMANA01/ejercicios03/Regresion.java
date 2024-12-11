package ejercicios03;

public class Regresion {
    public static void main(String[] args) {
        // Años de experiencia
        int[] experiencia = {1, 3, 5, 7, 10};

        // Supongamos que los ingresos se calculan como: ingreso = 5000 + 2000 * años de experiencia
        for (int exp : experiencia) {
            int ingreso = 5000 + 2000 * exp;
            System.out.println("Experiencia: " + exp + " años -> Ingreso estimado: S/." + ingreso);
        }
    }
}
