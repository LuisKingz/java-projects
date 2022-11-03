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
public class Nodo {
    private Nodo sig;
    private Object dato;

    public Nodo(Object dato) {
        this.sig = null;
        this.dato = dato;
    }
    
    
    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }
    
}