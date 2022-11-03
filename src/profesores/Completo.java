/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profesores;

public class Completo extends Profesor {

    double salario;

    public Completo(String nomCompleto, String nomMateria, String titulo, double sueldoBase) {
        super(nomCompleto, nomMateria, titulo, sueldoBase);
    }

    @Override
    void muestraDatos() {
        
        salario = getSueldoBase() * 15;
        
        System.out.println("El/La "+getTitulo()+" Nombre: "+getNomCompleto()+", Imparte: "+getNomMateria()+", Gana:"+salario+" Por trabajar por tiempo comleto");
    }

}
