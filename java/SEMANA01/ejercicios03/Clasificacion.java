package ejercicios03;

public class Clasificacion {
    public static void main(String[] args) {
        // Edad de las personas
        int[] edades = {5, 18, 35, 60, 80};

        for (int edad : edades) {
            if (edad < 18) {
                System.out.println("Edad " + edad + ": Menor de edad");
            } else if (edad <= 65) {
                System.out.println("Edad " + edad + ": Adulto");
            } else {
                System.out.println("Edad " + edad + ": Anciano");
            }
        }
    }
}
