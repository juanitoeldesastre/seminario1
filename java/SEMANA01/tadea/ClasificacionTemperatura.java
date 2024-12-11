package tadea;

import java.util.Scanner;

public class ClasificacionTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una temperatura en °C: ");
        double temperatura = scanner.nextDouble();

        if (temperatura < 15) {
            System.out.println("La temperatura es Fría.");
        } else if (temperatura <= 25) {
            System.out.println("La temperatura es Moderada.");
        } else {
            System.out.println("La temperatura es Caliente.");
        }
        scanner.close();
    }
}
