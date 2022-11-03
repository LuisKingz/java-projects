/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author RAGAd
 */
public class Matriz2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int arre[][] = new int[4][4];

        for (int i = 0; i < arre.length; i++) {
            for (int j = 0; j < arre.length; j++) {
                System.out.println("Inresa valores");
                arre[i][j] = read.nextInt();
            }
        }
        for (int i = 0; i < arre.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arre[1].length; j++) {
                System.out.print(arre[i][j] + " ");
            }
            System.out.println("}");
        }
        
        System.out.println("---------------------------");
        
        for (int i = 0; i < arre.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arre[1].length; j++) {
                if (i == 0 || i == 3) {
                    System.out.print(0 + " ");
                } else if (i == 1 && j == 0 || i == 1 && j == 3 || i == 2 && j == 0 || i==2 && j==3) {
                    System.out.print(0 + " ");
                }else{
                    System.out.print(arre[i][j] + " ");
                }

            }
            System.out.println("}");
        }

    }
}
