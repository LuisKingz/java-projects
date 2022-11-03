/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author RAGAd
 */

public class Numeros {
    public static int[] ordear(int[] arre) {
        int a;
        for (int i = 0; i < arre.length; i++) {
            for (int j = 0; j < arre.length; j++) {
                if (arre[i] < arre[j]) {
                    a = arre[j];
                    arre[j] = arre[i];
                    arre[i] = a;
                }
            }
        }
        return arre;
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int arre[] = new int [10];
        int a;
        
        for (int i = 0; i < arre.length; i++) {
            System.out.println("Ingresa numeros");
            arre[i]=read.nextInt();
        }
        ordear(arre);
        a=arre[0];
        for (int i = 0; i < arre.length; i++) {
            
            if (a == arre[i]) {
                System.out.println(a +" en la posicion "+ i);
            }
        }
    }
}
