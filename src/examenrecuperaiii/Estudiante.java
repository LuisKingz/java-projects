/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrecuperaiii;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RAGAd
 */
public class Estudiante implements Calculos{
    private String nombre;
    private List <Materia> materias = new ArrayList();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List <Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List <Materia> materias) {
        this.materias = materias;
    }
    
    @Override
    public double obtenerPromedios() {
        double pro=0;
        for (Materia materia : materias) {
            pro+=materia.getCalificaciones();
        }
        pro/=materias.size();
        
        return pro;
    }
    
}
