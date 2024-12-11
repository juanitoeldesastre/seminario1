package ejercicios02;

public class DatosAInformacion {
    public static void main(String[] args) {
        // Datos en bruto (temperaturas en °C)
        double[] temperaturas = {18.5, 20.1, 22.3, 19.7, 21.5};

        // Convertir datos en información útil (promedio)
        double suma = 0;
        for (double temp : temperaturas) {
            suma += temp;
        }
        double promedio = suma / temperaturas.length;

        System.out.println("Temperaturas: " + java.util.Arrays.toString(temperaturas));
        System.out.println("Temperatura promedio: " + promedio + "°C");
    }
}
