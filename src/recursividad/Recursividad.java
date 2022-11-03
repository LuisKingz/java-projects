package recursividad;

import java.util.Scanner;

public class Recursividad {

    public int calcularFactorial(int n){
        if(n==0){
            return 1;
        }
        return n = n * calcularFactorial(n-1);
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Recursividad factorial = new Recursividad();
        System.out.println("Numero? ");
        int a = read.nextInt();
        System.out.println(factorial.calcularFactorial(a));
    }
    
}
