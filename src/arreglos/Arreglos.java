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
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        String [] nom = new String [5];
        int [][] num = new int[4][4];
        int a=1;
        
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[1].length; j++) {
                num[i][j]=a;
                a++;
            }
        }
        
        for (int i = 0; i < nom.length; i++) {
            System.out.println("Ingresa Nombres");
            nom[i]=read.next();
        }
        System.out.println("----------------------");
        for (int i = 0; i < nom.length; i++) {
            System.out.println(nom[i]);
        }
        System.out.println("----------------------");
        for (int i = 0; i < num.length; i++) {
            System.out.print("{");
            for (int j = 0; j < num[1].length; j++) {
                System.out.print(num[i][j]+",");
            }
            System.out.println("}");
        }
        
    }
    
}
