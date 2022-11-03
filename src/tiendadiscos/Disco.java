/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendadiscos;


public class Disco {
    private String titlo;
    private String cantante;
    private String formato;
    private double duracion;

    public Disco(String titlo, String cantante, String formato, double duracion) {
        this.titlo = titlo;
        this.cantante = cantante;
        this.formato = formato;
        this.duracion = duracion;
    }

    

    public Disco() {
    }

    public String getTitlo() {
        return titlo;
    }

    public void setTitlo(String titlo) {
        this.titlo = titlo;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    
    public String toString() {
        return titlo + ", " + cantante + ", " + formato + ", " + duracion;
    }
}
