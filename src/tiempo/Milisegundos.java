/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiempo;

/**
 *
 * @author RAGAd
 */
public class Milisegundos {

    /**
     * @param args the command line arguments
     */
    public static int[] ordear(int[] arre) {
        int a;
        for (int i = 0; i < arre.length; i++) {
            for (int j = 0; j < arre.length; j++) {
                if (arre[i] > arre[j]) {
                    a = arre[j];
                    arre[j] = arre[i];
                    arre[i] = a;
                }
            }
        }
        return arre;
    }

    public static int[] ordenarShell(boolean c, int a, int aux, int i, int arr[]) {
        for (a = arr.length / 2; a != 0; a /= 2) {
            c = true;
            while (c) {
                c = false;
                for (i = a; i < arr.length; i++) {
                    if (arr[i - a] < arr[i]) {
                        aux = arr[i];
                        arr[i] = arr[i - a];
                        arr[i - a] = aux;
                        c = true;
                    }
                }
            }
        }
        return arr;
    }

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
        int arr[] = new int[5000];
        int a = 0, aux = 0, i = 0;
        boolean c = false;

        for (int j = 0; j < arr.length; j++) {
            arr[j] = (int) (Math.random() * 100) + 1;
        }
        
        long inicio = System.currentTimeMillis();
        ordear(arr);
        long fin = System.currentTimeMillis();
        long tiempo = fin - inicio;
        
        System.out.println("Metodo de Burbuja = "+ tiempo );
        
        long inicio1 = System.currentTimeMillis();
        ordenarShell(c, a, aux, i, arr);
        long fin1 = System.currentTimeMillis();
        long tiempo1 = fin1 - inicio1;        
        
        System.out.println("Metodo ShellSort = "+ tiempo1);
        
        long inicio2 = System.currentTimeMillis();
        quickSort(arr, 0, arr.length - 1);
        long fin2 = System.currentTimeMillis();
        long tiempo2 = fin2 - inicio2;      
        
        System.out.println("Metodo QuickSort = "+ tiempo2);
    }
}