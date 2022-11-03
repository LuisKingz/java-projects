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
public class Grupo implements Calculos{
    private int cuatrimestre;
    private String grupo;
    private List <Estudiante> estudiantes = new ArrayList();

    public int getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public List <Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List <Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public double obtenerPromedios() {
        double pro=0;
        for (Estudiante estudiante : estudiantes) {
            pro+=estudiante.obtenerPromedios();
        }
        pro/=estudiantes.size();
        return pro;
    }
    
    
}
