/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RAGAd
 */
public class Main {

    public static void main(String[] args) {
        Personas per = new Personas();
        List<Personas> persona = new ArrayList();
        List<String> aux = new ArrayList();

        per.setNombre("David");
        per.setEdad(19);
        aux.add("Raga");
        aux.add("Negro");
        per.setAopodos(aux);
        persona.add(per);

        per = new Personas();
        aux = new ArrayList();
        per.setNombre("Figueroa");
        per.setEdad(21);
        aux.add("Chapa");
        aux.add("Ota");
        per.setAopodos(aux);
        persona.add(per);

        per = new Personas();
        aux = new ArrayList();
        per.setNombre("Silvia");
        per.setEdad(24);
        aux.add("Chivis");
        per.setAopodos(aux);
        persona.add(per);

        for (Personas personas : persona) {
            System.out.println(personas.getNombre());
            System.out.println(personas.getEdad());
            System.out.println(personas.getAopodos().toString());
            System.out.println("-------");
        }
        
        System.out.println("-----------CON INDICE 2------------");

        per = new Personas();
        aux = new ArrayList();
        
        per.setNombre("Pepe");
        per.setEdad(20);
        aux.add("Dulces");
        per.setAopodos(aux);
        
        persona.add(1, per);

        for (Personas personas : persona) {
            System.out.println(personas.getNombre());
            System.out.println(personas.getEdad());
            System.out.println(personas.getAopodos().toString());
            System.out.println("-------");
        }

        System.out.println("-----------CON REMOVER------------");
        persona.remove(2);

        for (Personas personas : persona) {
            System.out.println(personas.getNombre());
            System.out.println(personas.getEdad());
            System.out.println(personas.getAopodos().toString());
            System.out.println("-------");
        }
    }
}
