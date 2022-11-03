package arreglos;

import java.util.Scanner;

public class Matriz3 {

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
        System.out.println("-----------------------------------");

        for (int i = 0; i < arre.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arre[1].length; j++) {
                if (j == 0 || i == 0 || i == arre.length - 1 || j == arre.length - 1) {
                    System.out.print("0 ");
                } else {
                    System.out.print(arre[i][j] + " ");
                }
            }
            System.out.println("}");
        }

    }
}
