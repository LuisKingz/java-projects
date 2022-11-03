/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doslistas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lfern
 */
public class DosListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila p = new Pila();
        Potencia pot = new Potencia();
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            lista1.add((int) (Math.random() * 20) + 1);
            lista2.add((int) (Math.random() * 20) + 1);
        }
        for (Integer integer : lista2) {
            System.out.print(","+integer);
        }
        System.out.println("");
        System.out.println("-----------------------");
        for (Integer integer : lista1) {
            System.out.print(","+integer);
        }
        
        int a = 0;
        int aux;
        for (Integer integer : lista2) {
            aux = pot.calcularPotencia(integer, 2);
            lista2.set(a, aux);
            a++;
        }

        int b = 0;
        int aux2 = 0;
        for (Integer integer : lista1) {
            aux2 = pot.calcularPotencia(integer, 2);
            lista1.set(b, aux2);
            b++;
        }
        System.out.println("lista 2");
        System.out.println("------------------------------");
         for (Integer integer : lista2) {
            System.out.print(","+integer);
        }
         System.out.println("lista 1");
        System.out.println("-------------------------------");
        for (Integer integer : lista1) {
            System.out.print(","+integer);
        }
        for (int i = 0; i < lista1.size(); i++) {
         p.push(lista1.get(i));
         p.push(lista2.get(i));
        }
        System.out.println("");
        System.out.println("-------------");
        p.readStack();
    }

}
