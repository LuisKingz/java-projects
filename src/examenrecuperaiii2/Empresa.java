/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrecuperaiii2;

import java.util.List;

/**
 *
 * @author RAGAd
 */
public class Empresa {
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Departamento>departamentos;

    public Empresa() {
    }
    
    public Empresa(String nombre, String direccion, String telefono, List<Departamento> departamentos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.departamentos = departamentos;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

        
}
