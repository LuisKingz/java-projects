/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.Scanner;

/**
 *
 * @author RAGAd
 */
public class Examen1 {
    //
    private static Examen1 ex;
    
    private String[][] arr = {{"1", "David Ramírez Ortega", "200"},
    {"2", "Marleni Pineda Romero", "300"},
    {"3", "Luis Acevedo Reyes", "150"}};

    private Examen1() {
    }

    public static Examen1 getIntsance() {
        if (ex == null) {
            ex = new Examen1();
        }
        return ex;
    }

    public String sueldo(String id, int dias) {
        String res = "No existe";
        double tot;
        for (int i = 0; i < arr.length; i++) {
            if (id.equals(arr[i][0])) {
                dias *= 8;
                tot = dias * Double.parseDouble(arr[i][2]);
                res = "Tu sueldo es = $" + tot;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Examen1 ex = Examen1.getIntsance();

        System.out.println("Ingresa id");
        String id = read.next();
        System.out.println("Ingresa dias trabajados");
        int dias = read.nextInt();

        System.out.println(ex.sueldo(id, dias));
    }
}
