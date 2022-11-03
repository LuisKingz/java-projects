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
public class BusquedaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void busBinaria(int cla, int arr[]) {
        int iz = 0, de = arr.length - 1, me, in = -1;
        while (iz <= de) {
            me = (iz + de) / 2;
            if (arr[me] == cla) {
                in = arr[me];
                System.out.println("El elemento " + cla + " esta en: " + me);
                return;
            } else {
                if (arr[me] < cla) {
                    iz = me + 1;
                } else if (arr[me] > cla){
                    de = me - 1;
                }
            }
        }
        System.out.println("No se encontro");
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int arre[] = new int[20];
        int a;

        for (int i = 0; i < arre.length; i++) {
            arre[i] = (int) (Math.random() * 100) + 1;
        }
        
        //BURBUJA
        for (int i = 0; i < arre.length; i++) {
            for (int j = 0; j < arre.length; j++) {
                if (arre[i] < arre[j]) {
                    a = arre[j];
                    arre[j] = arre[i];
                    arre[i] = a;
                }
            }
        }
        System.out.println(Arrays.toString(arre));
        System.out.println("Ingrea una clave");
        int b = read.nextInt();
        
        busBinaria(b, arre);

    }

}
