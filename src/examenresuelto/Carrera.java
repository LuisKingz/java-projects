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
public class Carrera implements Calculos{
    private String nombre;
    private List<Grupo> listaGrupo;
    
    public Carrera(){
        
    }

    public Carrera(String nombre, List<Grupo> listaGrupo) {
        this.nombre = nombre;
        this.listaGrupo = listaGrupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Grupo> getListaGrupo() {
        return listaGrupo;
    }

    public void setListaGrupo(List<Grupo> listaGrupo) {
        this.listaGrupo = listaGrupo;
    }

    @Override
    public double obtenerPromedios() {
        double resultado = 0.0;
        for (Grupo grupo : this.getListaGrupo()) {
            resultado = resultado + grupo.obtenerPromedios();
        }
        resultado = resultado/this.getListaGrupo().size();
        return resultado;
    }

    
}
