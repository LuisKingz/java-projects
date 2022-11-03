/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author RAGAd
 */
public class Vocales {

    public static void main(String[] args) {
        Random r = new Random();
        char array[] = new char[10];

        for (int i = 0; i < 10; i++) {
            int valorLetra = (r.nextInt(25) + 97);
            array[i] = (char) valorLetra;
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < 10; i++) {
            if (array[i] == 'a' || array[i] == 'e' || array[i] == 'i' || array[i] == 'o' || array[i] == 'u') {
                System.out.println(array[i] + " en la posicion " + i);
            }
        }

    }
}
