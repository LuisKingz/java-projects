/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import java.util.Arrays;

/**
 *
 * @author RAGAd
 */
public class QuikSort {

    public static void quickSort(int[] arreglo, int izquierda, int derecha) {
        int pivote = arreglo[izquierda];
        int i = izquierda;
        int j = derecha;
        int auxIntercambio;
        while (i < j) {
            while (arreglo[i] <= pivote && i < j) {
                i++;
            }
            while (arreglo[j] > pivote) {
                j--;
            }
            if (i < j) {
                auxIntercambio = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = auxIntercambio;
            }
        }
        arreglo[izquierda] = arreglo[j];
        arreglo[j] = pivote;
        if (izquierda < j - 1) {
            quickSort(arreglo, izquierda, j - 1);
        }
        if (j + 1 < derecha) {
            quickSort(arreglo, j + 1, derecha);
        }
    }

    public static void main(String[] args) {

        int[] numeros = new int[10];

        System.out.println("Vector desordenado");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println(Arrays.toString(numeros));

        quickSort(numeros, 0, numeros.length - 1);
        System.out.println("\nVector Ordenado");
        System.out.println(Arrays.toString(numeros));

    }

}
