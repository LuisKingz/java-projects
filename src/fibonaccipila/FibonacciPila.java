/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccipila;

import java.util.Scanner;

/**
 *
 * @author lfern
 */
public class FibonacciPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean flag = false;
        Pila p = new Pila();
        Fibonacci fib = new Fibonacci();
        int tope = 0;
        do {
            Scanner rd = new Scanner(System.in);
            try {
                System.out.println("Tope");
                tope = rd.nextInt();
                while (tope == 0 || tope < 0) {
                    System.out.println("error");
                    System.out.println("tope");
                    tope = rd.nextInt();
                    flag = false;
                }
                flag = false;
            } catch (Exception e) {
                flag = true;
            }
        } while (flag);

        System.out.println("------------");
        for (int i = 0; i < tope; i++) {
            p.push(fib.fibonacci(i));
        }
        p.readStack();
    }

}
