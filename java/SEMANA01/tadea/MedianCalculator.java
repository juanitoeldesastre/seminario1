package tadea;

import java.util.Arrays;
import java.util.Scanner;

public class MedianCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Solicitar tamaño del conjunto de datos
        System.out.print("¿Cuántos números desea ingresar? ");
        int n = scanner.nextInt();
        
        //array para almacenar los datos
        double[] datos = new double[n];
        
        //ingresar datos
        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            datos[i] = scanner.nextDouble();
        }
        
        //calcular mediana
        double mediana = calcularMediana(datos);
        
        //calcular información adicional
        double promedio = calcularPromedio(datos);
        double desviacionEstandar = calcularDesviacionEstandar(datos, promedio);
        double minimo = encontrarMinimo(datos);
        double maximo = encontrarMaximo(datos);
        
        //resultados
        System.out.println("\n--- Análisis Estadístico ---");
        System.out.printf("Mediana: %.2f%n", mediana);
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.printf("Desviación Estándar: %.2f%n", desviacionEstandar);
        System.out.printf("Valor Mínimo: %.2f%n", minimo);
        System.out.printf("Valor Máximo: %.2f%n", maximo);
        
        // Interpretación de la mediana
        interpretarMediana(mediana, promedio);
        
        scanner.close();
    }
    
    // Método para calcular la mediana
    public static double calcularMediana(double[] datos) {
        // Ordenar los datos
        double[] datosOrdenados = Arrays.copyOf(datos, datos.length);
        Arrays.sort(datosOrdenados);
        
        // Calcular mediana
        int longitud = datosOrdenados.length;
        if (longitud % 2 == 0) {
            // Si la longitud es par, promedio de los dos números centrales
            return (datosOrdenados[longitud/2 - 1] + datosOrdenados[longitud/2]) / 2.0;
        } else {
            // Si la longitud es impar, el número central
            return datosOrdenados[longitud/2];
        }
    }
    
    // Método para calcular el promedio
    public static double calcularPromedio(double[] datos) {
        double suma = 0;
        for (double dato : datos) {
            suma += dato;
        }
        return suma / datos.length;
    }
    
    // Método para calcular la desviación estándar
    public static double calcularDesviacionEstandar(double[] datos, double promedio) {
        double sumaCuadrados = 0;
        for (double dato : datos) {
            sumaCuadrados += Math.pow(dato - promedio, 2);
        }
        return Math.sqrt(sumaCuadrados / datos.length);
    }
    
    // Método para encontrar el mínimo
    public static double encontrarMinimo(double[] datos) {
        double minimo = datos[0];
        for (double dato : datos) {
            if (dato < minimo) {
                minimo = dato;
            }
        }
        return minimo;
    }
    
    // Método para encontrar el máximo
    public static double encontrarMaximo(double[] datos) {
        double maximo = datos[0];
        for (double dato : datos) {
            if (dato > maximo) {
                maximo = dato;
            }
        }
        return maximo;
    }
    
    // Método para interpretar la mediana
    public static void interpretarMediana(double mediana, double promedio) {
        System.out.println("\n--- Interpretación ---");
        
        if (mediana == promedio) {
            System.out.println("Distribución Simétrica: La mediana y el promedio son iguales.");
        } else if (mediana < promedio) {
            System.out.println("Distribución Sesgada a la Izquierda: Hay valores extremos bajos.");
        } else {
            System.out.println("Distribución Sesgada a la Derecha: Hay valores extremos altos.");
        }
    }
}