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
public class Lista {
    
    Nodo inicio;
    Nodo fin;
    
    public Lista() {
        this.inicio = null;
        this.fin = null;
    }
    
    public void add(Object dato) {
        if (inicio == null) {
            inicio = new Nodo(dato);
            fin = inicio;
        } else {
            Nodo aux = fin;
            Nodo nuevo = new Nodo(dato);
            aux.setSig(nuevo);
            fin = nuevo;
        }
    }
    
    public void mostrarLista() {
        Nodo next = inicio;
        while (next != null) {
            System.out.print(next.getDato() + "----->");
            next = next.getSig();
        }
    }
    
    public boolean isEmpty() {
        if (this.inicio == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void set(Object data, int index) {
        int aux = 1;
        Nodo next = inicio;
        while (next != null && aux != index) {
            aux++;
            next = next.getSig();
        }
        next.setDato(data);
    }
    
    public void add(Object data, int index) {
        Nodo ant = inicio;
        Nodo sig = inicio;
        int aux = 1;
        while (sig != null && aux != index) {
            aux++;
            ant = sig;
            sig = sig.getSig();
        }
        Nodo nuevo = new Nodo(data);
        ant.setSig(nuevo);
        nuevo.setSig(sig);
    }
    
    public void get(int index) {
        int aux = 1;
        Nodo next = inicio;
        while (aux != index) {
            aux++;
            next = next.getSig();
        }
        System.out.println(next.getDato());
    }
    
    public void remove() {
        Nodo aux = inicio.getSig();
        inicio = aux;
    }
    
    public void remove(int index) {
        int aux = 1;
        Nodo ant = inicio;
        Nodo sig = inicio;
        while (sig != null && aux != index) {
            aux++;
            ant = sig;
            sig = sig.getSig();
        }
        if (sig.getSig() != null) {
            sig = sig.getSig();
            ant.setSig(sig);
        }else{
            fin = ant;
        }
    }
}
