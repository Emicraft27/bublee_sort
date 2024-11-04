package bubble_sort;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

    public static int[] leerArreglo( int[] datos ) throws IOException {
        System.out.println("Lctura de datos del arreglo");
        for (int i = 0; i < datos.length; i++) {
            System.out.println("Escribe un número: [" + i + "]: ");
            entrada = bufer.readLine();
            datos[i] = Integer.parseInt(entrada);
        }
        return datos;
    }

    public static int[] bubbleSort( int[] datos ){
        int aux;
        boolean intercambios;
        
        do {
            intercambios = false;
            for (int i = 0; i < datos.length - 1; i++) {
                if (datos[i] > datos[i + 1]) {
                    // Intercambiamos los valores
                    aux = datos[i];
                    datos[i] = datos[i + 1];
                    datos[i + 1] = aux;
                    intercambios = true;
                }
            }
        } while (intercambios == true);
        return datos;
    }

    public static void imprimirArreglo( int[] datos ){
        System.out.println("---------------------------");
        System.out.println("Valores del arreglo: ");
        for (int i = 0; i < datos.length; i++) {
            System.out.println("1: " + i + " datos[i] " + datos[i]);
        System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) throws IOException {
        int n;
        int[] datos;

        System.out.println("Método bubble sort: ");
        System.out.println("Escribe el tamaño del arreglo: ");
        entrada = bufer.readLine();
        n = Integer.parseInt(entrada);

        datos = new int[n];
        datos = leerArreglo(datos);
        datos = bubbleSort(datos);
        imprimirArreglo(datos);
    }
}