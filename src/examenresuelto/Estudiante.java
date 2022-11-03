/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenresuelto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marle
 */
public class Estudiante implements Calculos{
    private String nombre;
    private List<Materia> listaMateria;
    
    public Estudiante(){
        
    }

    public Estudiante(String nombre, List<Materia> listaMateria) {
        this.nombre = nombre;
        this.listaMateria = listaMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getListaMateria() {
        return listaMateria;
    }

    public void setListaMateria(List<Materia> listaMateria) {
        this.listaMateria = listaMateria;
    }

    @Override
    public double obtenerPromedios() {
        double resultado = 0;
        for (Materia materia : this.getListaMateria()) {
            resultado = resultado + materia.getCalificacion();
            
        }
        resultado = resultado/this.getListaMateria().size();
        return resultado;
    }
    
    
}
