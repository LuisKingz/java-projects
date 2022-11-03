/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrecuperaiii2;

import java.io.PrintStream;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author RAGAd
 */
public class Empleado {

    private String nombre;
    private String direccion;
    private String fechaContratacion;
    private String telefono;
    private double sueldoBase;
    private Empleado gerente;
    private int porcentajePrestaciones;
    private double sueldoNeto;
    private double primaVacacional;

    static Calendar fecha = new GregorianCalendar();

    public Empleado() {
    }

    public Empleado(String nombre, String direccion, String fechaContratacion, String telefono, double sueldoBase, Empleado gerente, int porcentajePrestaciones, double sueldoNeto, double primaVacacional) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaContratacion = fechaContratacion;
        this.telefono = telefono;
        this.sueldoBase = sueldoBase;
        this.gerente = gerente;
        this.porcentajePrestaciones = porcentajePrestaciones;
        this.sueldoNeto = sueldoNeto;
        this.primaVacacional = primaVacacional;
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

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public Empleado getGerente() {
        return gerente;
    }

    public void setGerente(Empleado gerente) {
        this.gerente = gerente;
    }

    public int getPorcentajePrestaciones() {
        return porcentajePrestaciones;
    }

    public void setPorcentajePrestaciones(int porcentajePrestaciones) {
        this.porcentajePrestaciones = porcentajePrestaciones;
    }

    public double getSueldoNeto() {
        return sueldoNeto;
    }

    public void setSueldoNeto(double sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }

    public double getPrimaVacacional() {
        return primaVacacional;
    }

    public void setPrimaVacacional(double primaVacacional) {
        this.primaVacacional = primaVacacional;
    }

    public double calcularSueldoNeto() {
        double res = 0;
        res = this.getSueldoBase() + ((this.getSueldoBase() * this.getPorcentajePrestaciones()) / 100);
        return res;
    }

    public double calcularPrimaVacacional() {
        double prim = 0;
        int f1 = fecha.get(Calendar.YEAR);

        String[] texto_split = this.getFechaContratacion().split("/");
        int f = Integer.parseInt(texto_split[2]);

        int a = f1 - f;

        if (a == 1) {
            //.5
            prim =(this.getSueldoNeto() * .05);
        } else if (a > 1 && a < 5) {
            //.7
            prim =(this.getSueldoNeto() * .07);
        } else if (a > 5) {
            //.10
            prim =(this.getSueldoNeto() * .1);
        } else {
            prim = 0;
        }

        return prim;
    }
}
