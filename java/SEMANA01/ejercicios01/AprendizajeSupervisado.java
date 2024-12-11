package ejercicios01;
// Este código entrena un modelo para clasificar números como pares o impares.
import java.util.Arrays;

public class AprendizajeSupervisado {
    public static void main(String[] args) {
        // Datos de entrenamiento
        int[] datos = {2, 4, 6, 8, 10, 1, 3, 5, 7, 9};
        String[] etiquetas = {"Par", "Par", "Par", "Par", "Par", "Impar", "Impar", "Impar", "Impar", "Impar"};

        // Clasificar un nuevo dato
        int numero = 11; // Número a clasificar
        String resultado = (numero % 2 == 0) ? "Par" : "Impar";

        System.out.println("El número " + numero + " es: " + resultado);
    }
}
