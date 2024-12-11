package ejercicios01;

import java.util.ArrayList;
import java.util.List;

public class ClusteringSimple {
    public static void main(String[] args) {
        // Datos de ejemplo
        int[] datos = {10, 20, 15, 30, 25, 70, 75, 80};

        // Agrupamos los datos en dos clústeres según una distancia básica
        List<Integer> cluster1 = new ArrayList<>();
        List<Integer> cluster2 = new ArrayList<>();

        int threshold = 50; // Umbral para dividir
        for (int dato : datos) {
            if (dato <= threshold) {
                cluster1.add(dato);
            } else {
                cluster2.add(dato);
            }
        }

        System.out.println("Cluster 1: " + cluster1);
        System.out.println("Cluster 2: " + cluster2);
    }
}
