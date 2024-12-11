package tadea;

import java.util.Scanner;

public class Clustering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos datos deseas ingresar? ");
        int n = scanner.nextInt();

        double[] datos = new double[n];
        System.out.println("Ingresa los datos:");
        for (int i = 0; i < n; i++) {
            datos[i] = scanner.nextDouble();
        }

        // Definimos los rangos de los tres clústeres (valores de ejemplo)
        double lim1 = 10.0;
        double lim2 = 20.0;

        System.out.println("Clústeres:");
        for (double dato : datos) {
            if (dato <= lim1) {
                System.out.println(dato + " pertenece al clúster 1.");
            } else if (dato <= lim2) {
                System.out.println(dato + " pertenece al clúster 2.");
            } else {
                System.out.println(dato + " pertenece al clúster 3.");
            }
        }
        scanner.close();
    }
}
