/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas.listas1;

/**
 *
 * @author RAGAd
 */
public class ListaSimple {

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.add("Nombre 1");
        lista.add("Nombre 2");
        lista.add("Nombre 3");
        lista.add("Nombre 4");
        lista.add("Nombre 5");
        lista.add("Nombre 6");

        if (lista.isEmpty()) {
            System.out.println("No hay nada");
        } else {
            lista.mostrarLista();
        }
        System.out.println("");
        System.out.println("---------------");
        lista.set("Nombre 5", 4);
        lista.mostrarLista();
        System.out.println("---------------");
        lista.add("nombre 1.5", 2);
        lista.mostrarLista();
        System.out.println("---------------");
        lista.get(3);
        System.out.println("---------------");
        lista.remove();
        lista.mostrarLista();
        System.out.println("---------------");
        lista.remove(5);
        lista.mostrarLista();
    }
}
