package recursividad;

import java.util.Scanner;

public class ParImpar {

    public boolean par(int n) {
        if (n == 0) {
            return true;
        } else {
            return impar(n - 1);
        }
    }

    public boolean impar(int n) {
        if (n == 0) {
            return false;
        } else {
            return par(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        ParImpar num = new ParImpar();
        int n;

        System.out.println("Ingrese un número");
        n = read.nextInt();

        if (num.impar(n)) {
            System.out.println("es Impar");
        }else{
            System.out.println("es Par");
        }
    }
}
