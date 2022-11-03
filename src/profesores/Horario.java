/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profesores;

public class Horario extends Profesor {
    double salario;

    public Horario(String nomCompleto, String nomMateria, String titulo, int horas, double sueldoBase) {
        super(nomCompleto, nomMateria, titulo, horas, sueldoBase);
    }

    @Override
    void muestraDatos() {
        
        salario = getSueldoBase() * getHoras();
        
        System.out.println("El/La "+getTitulo()+" Nombre: " + getNomCompleto() + ", Imparte: " + getNomMateria() + ", Gana:" + salario +", Por trabajar por " + getHoras() + " horas.");
    }

}
