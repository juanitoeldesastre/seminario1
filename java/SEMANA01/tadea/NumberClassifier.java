package tadea;

import java.util.Scanner;

public class NumberClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //array para almacenar los números
        int[] numeros = new int[10];
        
        //contadores
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        //Ingresar números
        System.out.println("Ingrese 10 números:");
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            
            // Clasificación supervisada
            if (numeros[i] > 0) {
                positivos++;
            } else if (numeros[i] < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        
        //Resultados de la clasificación
        System.out.println("\n--- Resultados de Clasificación ---");
        System.out.println("Números Positivos: " + positivos);
        System.out.println("Números Negativos: " + negativos);
        System.out.println("Números Cero: " + ceros);
        
        //Números de cada categoría
        System.out.println("\n--- Detalle de Números ---");
        
        System.out.print("Números Positivos: ");
        for (int num : numeros) {
            if (num > 0) {
                System.out.print(num + " ");
            }
        }
        
        System.out.print("\nNúmeros Negativos: ");
        for (int num : numeros) {
            if (num < 0) {
                System.out.print(num + " ");
            }
        }
        
        System.out.print("\nNúmeros Cero: ");
        for (int num : numeros) {
            if (num == 0) {
                System.out.print(num + " ");
            }
        }
        
        //cerrar scanner
        scanner.close();
    }
}