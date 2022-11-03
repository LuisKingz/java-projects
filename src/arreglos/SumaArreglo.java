package arreglos;

import java.util.Scanner;

public class SumaArreglo {

    public static int sumaValores(int arr[], int n) {
        int res = 0;

        if (n == 0) {
            res += arr[0];
        } else {
            res = arr[n] + sumaValores(arr, n - 1);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int arre[] = new int[10];
        int j = 0;

        for (int i = 0; i < arre.length; i++) {
            System.out.println("Ingresa un valor");
            arre[i] = read.nextInt();
        }

        for (int i = 0; i < arre.length; i++) {
            if (arre[i] >= j) {
                j = arre[i];
            }
        }

        int a = arre.length - 1;

        System.out.println("Total = " + sumaValores(arre, a));
        System.out.println("Mayor = " + j);
    }
}
