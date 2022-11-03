/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidorpila;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author lfern
 */
public class Convertidorpila {

    public static List llenarLista(List lista) {

        lista.add("a");
        lista.add("b");
        lista.add("c");
        lista.add("d");
        lista.add("f");

        return lista;
    }

    public static String[] llenarArray(String[] array) {
        array[0] = "1";
        array[1] = "2";
        array[2] = "3";
        array[3] = "4";
        array[4] = "5";
        return array;
    }

    public static void main(String[] args) {
        List listaC = new ArrayList();
        String[] array = new String[5];
        Stack<String> pila1 = new Stack();
        Stack<String> pila2 = new Stack();

        llenarLista(listaC);
        llenarArray(array);

        mostrarPila1(listaC, pila1);
        mostrarPila(array, pila2);
    }

    public static void mostrarPila1(List listaC, Stack pila1) {
        System.out.println("------------Lista----------------");
        for (int i = 0; i < listaC.size(); i++) {
            pila1.push((String) listaC.get(i));
        }

        for (Object string : pila1) {
            System.out.println(string);
        }
        
        pila1.forEach(System.out::println);
    }

    public static void mostrarPila(String array[], Stack pila2) {
        System.out.println("-------------Arreglo-------------");
        for (int i = 0; i < array.length; i++) {
            pila2.push(array[i]);
        }
        for (Object string : pila2) {
            System.out.println(string);
        }
    }
}
