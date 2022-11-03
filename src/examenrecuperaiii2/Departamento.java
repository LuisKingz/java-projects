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
public class Departamento {
    private String nombre;
    private List<Empleado> empleados;

    public Departamento() {
    }

    public Departamento(String nombre, List<Empleado> empleados) {
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
