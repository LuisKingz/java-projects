/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

/**
 *
 * @author RAGAd
 */
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila pila = new Pila();

        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        pila.push(6);
        System.out.println("Imprimir pila");
        pila.readStack();
        System.out.println("------------------");
        System.out.println("Imprimiendo cima");
        System.out.println(pila.peek());
        System.out.println("------------------");
        System.out.println("Eliminando...");
        pila.pop();
        pila.pop();
        pila.pop();
        System.out.println("------------------");
        System.out.println("Imprimiendo nueva pila");
        pila.readStack();
        System.out.println("------------------");
        pila.pop();
        pila.pop();
        pila.pop();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        System.out.println("------------------");
        System.out.println("Imprimiendo nueva pila");
        pila.readStack();   
    }
}