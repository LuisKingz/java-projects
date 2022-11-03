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
public class ShellSort {

    public static void main(String[] args) {
        int arr[] = new int[50];
        int a;

        int aux, i;
        boolean c;
        
        for (int j = 0; j < arr.length; j++) {
            arr[j]=(int) (Math.random()*100) + 1 ;
        }
        
        System.out.println(Arrays.toString(arr));
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
        System.out.println(Arrays.toString(arr));
    }
}
