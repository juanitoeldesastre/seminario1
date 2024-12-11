package E3;

import java.util.Scanner;

class Nodo {
    String dato;
    Nodo izquierdo, derecho;
    
    public Nodo(String dato) {
        this.dato = dato;
        this.izquierdo = null;
        this.derecho = null;
    }
}

class ArbolClasificacion {
    Nodo raiz;
    
    public ArbolClasificacion() {
        // Creando el árbol de clasificación
        raiz = new Nodo("¿El postre es un sabor mayormente dulce?");
        raiz.izquierdo = new Nodo("Es un postre horneado como galletas o pastel");
        raiz.derecho = new Nodo("¿Contiene ingredientes como queso o jamón?");
        
        // Subárbol izquierdo (dulce)
        raiz.izquierdo.izquierdo = new Nodo("Dulce XD");
        raiz.izquierdo.derecho = new Nodo("Dulce XD");
        
        // Subárbol derecho (salado)
        raiz.derecho.izquierdo = new Nodo("Saladito XD");
        raiz.derecho.derecho = new Nodo("Salado XD");
    }
    
    public void clasificar() {
        Scanner scanner = new Scanner(System.in);
        Nodo actual = raiz;
        
        // Navegar el árbol hasta llegar a una hoja
        while (actual.izquierdo != null && actual.derecho != null) {
            System.out.println(actual.dato);
            System.out.println("Responde Si o No, XD:");
            String respuesta = scanner.nextLine().toLowerCase();
            
            if (respuesta.equals("si")) {
                actual = actual.izquierdo;
            } else if (respuesta.equals("no")) {
                actual = actual.derecho;
            } else {
                System.out.println("Respuesta inválida!! LOL");
            }
        }
        
        // Llegamos a una hoja, mostramos el resultado
        System.out.println("El postre es: " + actual.dato);
    }
}

public class ejercicio03 {
    public static void main(String[] args) {
        ArbolClasificacion arbol = new ArbolClasificacion();
        arbol.clasificar(); // Iniciar clasificación
    }
}
