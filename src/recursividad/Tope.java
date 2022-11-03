package recursividad;

import java.util.Scanner;

public class Tope {
    
    public int sumar(int n){
        if(n==0){
            return 0;
        }
        return n = n+ sumar (n-1);
    }
    

    public static void main(String[] args) {
        Tope to = new Tope();
        Scanner read = new Scanner(System.in);
        int tope;
        
        System.out.println("Ingresa el tope");
        tope=read.nextInt();
        
        System.out.println(to.sumar(tope));
        
    }    
}
