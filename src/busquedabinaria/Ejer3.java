/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedabinaria;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author RAGAd
 */
public class Ejer3 {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int arreglo[][] = new int[4][4];
        int buscar;
        
        for (int j = 0; j < arreglo.length; j++) {
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[j][i] = ((j * arreglo.length) + i) + 4;
            }
        }
        
        for (int j = 0; j < arreglo.length; j++) {
            System.out.println("");
            for (int i = 0; i < arreglo.length; i++) {
                System.out.print(arreglo[j][i] + ", ");
            }
        }
        System.out.println("");

        System.out.println("Ingresa el numero a buscar");
        buscar = leer.nextInt();

        busquedaBinaria(buscar, arreglo);

    }

    public static void busquedaBinaria(int buscar, int arreglo[][]) {
        int izquierdo = 0;
        int derecho = arreglo.length;
        int mitad;
        int contadorError = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (buscar > arreglo[i][arreglo.length - 1]) {
                contadorError++;
            } else {
                while (izquierdo <= derecho) {
                    mitad = (izquierdo + derecho) / 2;
                    if (arreglo[i][mitad] == buscar) {
                        System.out.println("El elemento " + buscar + " esta en la posicion " + i + " x " + mitad);
                        return;
                    } else {
                        if (arreglo[i][mitad] < buscar) {
                            izquierdo = mitad + 1;
                        } else {
                            derecho = mitad - 1;
                        }
                    }
                }
            }
        }
        if (contadorError != 0) {
            System.out.println("No se encontro");
        }
    }
}
