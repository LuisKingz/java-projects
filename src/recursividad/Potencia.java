package recursividad;

import java.util.Scanner;

public class Potencia {

    public int calcularPotencia(int po, int num) {
        if (num == 0) {
            return 1;
        }
        return po * calcularPotencia(po, num - 1);
    }

    public static void main(String[] args) {
        Potencia to = new Potencia();
        Scanner read = new Scanner(System.in);
        int num;
        int po;
        
        System.out.println("Ingrese numero a elevar");
        num = read.nextInt();

        System.out.println("Ingresa potencia");
        po = read.nextInt();
        
        int r=to.calcularPotencia(num, po);
        
        System.out.print("Potencia --> ");
        System.out.println(r);
    }
}
