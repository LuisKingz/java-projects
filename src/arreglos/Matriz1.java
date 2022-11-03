package arreglos;

import java.util.Scanner;

public class Matriz1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int arr[][] = new int[5][5];
        int cero[][] = new int[5][5];

        int in = arr.length * arr.length;
        int a = 1, r;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (Math.random() * 50) + 1;
            }
        }

        for (int i = 0; i < cero.length; i++) {
            for (int j = 0; j < cero.length; j++) {
                cero[i][j] = 0;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arr[1].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("}");
        }

        while (a < in) {
            System.out.println("Ingresa un numero 0 - 50");
            r = read.nextInt();

            for (int i = 0; i < arr.length; i++) {
                System.out.print("{");
                for (int j = 0; j < arr.length; j++) {
                    if (r == arr[i][j]) {
                        cero[i][j] = arr[i][j];
                        a++;
                    }
                    System.out.print(cero[i][j] + " ");
                }
                System.out.println("}");
            }
        }
        
        System.out.println("No pos fin :v");
        
        for (int i = 0; i < arr.length; i++) {
                System.out.print("{");
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println("}");
            }
    }
}