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
public class Carrera implements Calculos{
    private String nombre;
    private List <Grupo> grupos = new ArrayList();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List <Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List <Grupo> grupos) {
        this.grupos = grupos;
    }

    @Override
    public double obtenerPromedios() {
        double pro=0;
        for (Grupo grupo : grupos) {
            pro+=grupo.obtenerPromedios();
        }
        pro/=grupos.size();
        return pro;
    }
    
}
