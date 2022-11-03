package recursividad;

import java.util.Scanner;

public class Promedio {

    

    public static double promedio(double[] arr, int pos, double sum) {
        Scanner read = new Scanner(System.in);
        
        if (pos == arr.length) {
            return sum / arr.length;
        }
        
        System.out.println("Ingresa calificacion - ");
        arr[pos] = read.nextDouble();
        
        sum += arr[pos];
        return promedio(arr, pos + 1, sum);
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int cont;
        int pos = 0;
        double suma = 0;

        System.out.println("Cuantas Calificaciones?");
        cont = read.nextInt();

        double arr[] = new double[cont];

        System.out.println(promedio(arr, pos, suma));
    }
}
