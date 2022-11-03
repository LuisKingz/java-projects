/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimaltobinario;

import java.util.Scanner;

/**
 *
 * @author lfern
 */
public class DecimalToBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        Pila pila = new Pila();
        System.out.println("Numero");
        int num = rd.nextInt();

        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
                pila.push(0);
            } else {
                num/=2;
                pila.push(1);
            }
        }
        
        pila.readStack();
    }

}
