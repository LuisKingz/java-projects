package arreglos;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int arre[][] = new int[3][3];
        int a=0;

        for (int i = 0; i < arre.length; i++) {
            for (int j = 0; j < arre[1].length; j++) {
                System.out.println("Ingresa datos");
                arre[i][j] = read.nextInt();
            }
        }
        
        for (int i = 0; i < arre.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arre[1].length; j++) {
                System.out.print(arre[i][j] +" ");                
            }
            System.out.println("}");
        }
        
        System.out.println("_________");
        for (int i = 0; i < arre.length; i++) {
            System.out.println(arre[a][a]);
            a++;
        }
    }
}