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
public class Pila {

    Nodo top;
    Nodo bottom;

    public Pila() {
        this.top = null;
        this.bottom = null;
    }

    public boolean isEmpty() {
        return bottom == null;
    }

    public void push(Object value) {
        if (isEmpty()) {
            bottom = new Nodo(value);
            top = bottom;
        } else {
            Nodo nuevo = new Nodo(value);
            top.setNext(nuevo);
            top = nuevo;

//             top.setNext(new Nodo(value));
//             top = top.getNext();
        }
    }

    public void readStack() {
        readStack(bottom);
    }

    public void readStack(Nodo aux) {
        if (aux.getNext() == null) {
            System.out.println(aux.getValue());
        } else {
            readStack(aux.getNext());
            System.out.println(aux.getValue());
        }
    }

    public Object peek() {
        return top.getValue();
    }

    public void pop() {
        if (bottom == top) {
            System.out.println(bottom.getValue());
            bottom = null;
        } else {
            Nodo imp = top;
            Nodo aux = bottom;
            while (aux.getNext() != null && aux.getNext() != top) {
                aux = aux.getNext();
            }
            aux.setNext(null);
            top = aux;
            System.out.println(imp.getValue());
        }
    }
}
