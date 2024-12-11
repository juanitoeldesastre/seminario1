package tadea;

import java.util.Scanner;

public class RegresionLineal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coeficientes de la regresión lineal
        double m = 2.5; // pendiente (relación entre altura y peso)
        double b = 20;  // intersección (peso base)

        System.out.print("Ingresa la altura en metros: ");
        double altura = scanner.nextDouble();

        double pesoPredicho = m * altura + b;
        System.out.println("El peso predicho para una altura de " + altura + " m es: " + pesoPredicho + " kg.");

        scanner.close();
    }
}
