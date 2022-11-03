/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenresuelto;

import java.util.List;

/**
 *
 * @author marle
 */
public class Grupo implements Calculos{
    private int cuatrimestre;
    private String grupo;
    private List<Estudiante> listaEstudiante;
    
    public Grupo(){
    }

    public Grupo(int cuatrimestre, String grupo, List<Estudiante> listaEstudiante) {
        this.cuatrimestre = cuatrimestre;
        this.grupo = grupo;
        this.listaEstudiante = listaEstudiante;
    }

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

    public List<Estudiante> getListaEstudiante() {
        return listaEstudiante;
    }

    public void setListaEstudiante(List<Estudiante> listaEstudiante) {
        this.listaEstudiante = listaEstudiante;
    }

    @Override
    public double obtenerPromedios() {
        double resultado = 0;
        for (Estudiante estudiante : this.getListaEstudiante()) {
            resultado = resultado + estudiante.obtenerPromedios();
        }
        resultado = resultado / this.getListaEstudiante().size();
        return resultado;
    }

    
}
