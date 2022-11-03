/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author RAGAd
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Numero?");
        int a = read.nextInt();
        calcularFactorial(a);
        System.out.println(calcularFactorial(a));
    }

    static int calcularFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n = n * calcularFactorial(n-1);
        }
    }
}
