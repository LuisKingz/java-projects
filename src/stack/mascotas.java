/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author lfern
 */
public class mascotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<mascota> stack = new Stack<>();
        Scanner rd = new Scanner(System.in);
        String res;
        do {
            mascota m = new mascota();
            System.out.println("Nombre");
            m.setNombre(rd.next());
            System.out.println("Edad");
            m.setEdad(rd.nextInt());
            System.out.println("Nombre del Dueño");
            m.setNombreDuenho(rd.next());
            System.out.println("Tipo");
            m.setTipo(rd.next());
            stack.push(m);
            System.out.println("---------");
            System.out.println("Otro? s/n");
            res = rd.next();
            System.out.println("---------");
        } while (res.equalsIgnoreCase("s"));
        System.out.println("");
        System.out.println("-------------------------");
        
        for (mascota m : stack) {
            System.out.println(m.getNombre());
            System.out.println(m.getEdad());
            System.out.println(m.getNombreDuenho());
            System.out.println(m.getTipo());
        }
    }

}
