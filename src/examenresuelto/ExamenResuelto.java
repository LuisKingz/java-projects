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
public class ExamenResuelto {

    public static void Listas() {
        Materia mat0 = new Materia("Matemáticas", 0);
        Materia mat5 = new Materia("Español", 5);
        Materia mat6 = new Materia("Ciencias", 6);
        Materia mat7 = new Materia("Quimica", 7);
        Materia mat8 = new Materia("Formación", 8);
        Materia mat9 = new Materia("Base de Datos", 9);
        Materia mat10 = new Materia("Lecturas", 10);

        List<Materia> matE1 = new ArrayList();
        matE1.add(mat10);
        matE1.add(mat9);
        matE1.add(mat8);
        List<Materia> matE2 = new ArrayList();
        matE2.add(mat10);
        matE2.add(mat7);
        matE2.add(mat8);
        List<Materia> matE3 = new ArrayList();
        matE3.add(mat9);
        matE3.add(mat9);
        matE3.add(mat10);
        List<Materia> matE4 = new ArrayList();
        matE4.add(mat9);
        matE4.add(mat7);
        matE4.add(mat7);
        List<Materia> matE5 = new ArrayList();
        matE5.add(mat0);
        matE5.add(mat8);
        matE5.add(mat8);
        List<Materia> matE6 = new ArrayList();
        matE6.add(mat10);
        matE6.add(mat10);
        matE6.add(mat10);
        List<Materia> matE7 = new ArrayList();
        matE7.add(mat8);
        matE7.add(mat9);
        matE7.add(mat8);
        List<Materia> matE8 = new ArrayList();
        matE8.add(mat7);
        matE8.add(mat8);
        matE8.add(mat10);
        List<Materia> matE9 = new ArrayList();
        matE9.add(mat7);
        matE9.add(mat8);
        matE9.add(mat10);
        List<Materia> matE10 = new ArrayList();
        matE10.add(mat9);
        matE10.add(mat10);
        matE10.add(mat6);
        List<Materia> matE11 = new ArrayList();
        matE11.add(mat8);
        matE11.add(mat7);
        matE11.add(mat6);
        List<Materia> matE12 = new ArrayList();
        matE12.add(mat0);
        matE12.add(mat9);
        matE12.add(mat8);
        List<Materia> matE13 = new ArrayList();
        matE13.add(mat9);
        matE13.add(mat10);
        matE13.add(mat10);
        List<Materia> matE14 = new ArrayList();
        matE14.add(mat7);
        matE14.add(mat8);
        matE14.add(mat8);
        List<Materia> matE15 = new ArrayList();
        matE15.add(mat5);
        matE15.add(mat0);
        matE15.add(mat0);
        List<Materia> matE16 = new ArrayList();
        matE16.add(mat10);
        matE16.add(mat10);
        matE16.add(mat7);

        Estudiante e1 = new Estudiante("E1", matE1);
        Estudiante e2 = new Estudiante("E2", matE2);
        Estudiante e3 = new Estudiante("E3", matE3);
        Estudiante e4 = new Estudiante("E4", matE4);
        Estudiante e5 = new Estudiante("E5", matE5);
        Estudiante e6 = new Estudiante("E6", matE6);
        Estudiante e7 = new Estudiante("E7", matE7);
        Estudiante e8 = new Estudiante("E8", matE8);
        Estudiante e9 = new Estudiante("E9", matE9);
        Estudiante e10 = new Estudiante("E10", matE10);
        Estudiante e11 = new Estudiante("E11", matE11);
        Estudiante e12 = new Estudiante("E12", matE12);
        Estudiante e13 = new Estudiante("E13", matE13);
        Estudiante e14 = new Estudiante("E14", matE14);
        Estudiante e15 = new Estudiante("E15", matE15);
        Estudiante e16 = new Estudiante("E16", matE16);

        List<Estudiante> le1 = new ArrayList();
        le1.add(e1);
        le1.add(e2);
        le1.add(e3);
        le1.add(e4);
        List<Estudiante> le2 = new ArrayList();
        le2.add(e5);
        le2.add(e6);
        le2.add(e7);
        le2.add(e8);
        List<Estudiante> le3 = new ArrayList();
        le3.add(e9);
        le3.add(e10);
        le3.add(e11);
        le3.add(e12);
        List<Estudiante> le4 = new ArrayList();
        le4.add(e13);
        le4.add(e14);
        le4.add(e15);
        le4.add(e16);

        Grupo g1 = new Grupo(4, "A", le1);
        Grupo g2 = new Grupo(4, "B", le2);
        Grupo g3 = new Grupo(4, "C", le3);
        Grupo g4 = new Grupo(4, "D", le4);

        List<Grupo> lg1 = new ArrayList();
        lg1.add(g1);
        lg1.add(g2);
        List<Grupo> lg2 = new ArrayList();
        lg2.add(g3);
        lg2.add(g4);

        Carrera ca1 = new Carrera("Ca1", lg1);
        Carrera ca2 = new Carrera("Ca2", lg2);
        
        List<Carrera> carreras = new ArrayList();
        carreras.add(ca1);
        carreras.add(ca2);
        
        

        System.out.println("Promedio por estudiante");
        imprimirPromediosEstudiantes(carreras);

        System.out.println("Promedio por grupos");
        imprimirPromedioGrupos(carreras);

        System.out.println("------------------------");
        buscarEstudiante("E1", carreras);
    }

    private static void imprimirPromediosEstudiantes(List<Carrera> carreras) {
        for (Carrera c : carreras) {
            for (Grupo g : c.getListaGrupo()) {
                for (Estudiante e : g.getListaEstudiante()) {
                    System.out.println("El estudiante: " + e.getNombre() + " tiene un promedio de: " + e.obtenerPromedios());
                }
            }
        }
    }

    private static void imprimirPromedioGrupos(List<Carrera> carreras) {
        for (Carrera c : carreras) {
            for (Grupo g : c.getListaGrupo()) {
                System.out.println("El promedio del grupo: " + g.getCuatrimestre() + "°" + g.getGrupo() + " es: "
                        + g.obtenerPromedios());
            }
        }
    }

    private static void buscarEstudiante(String llave, List<Carrera> carreras) {
        for (Carrera c : carreras) {
            for (Grupo g : c.getListaGrupo()) {
                for (Estudiante e : g.getListaEstudiante()) {
                    if (e.getNombre().equals(llave)) {
                        System.out.println(e.getNombre() + " " + c.getNombre() + " " + g.getCuatrimestre() + " " + e.obtenerPromedios());
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Carrera> carrera = new ArrayList();
            Carrera ca = new Carrera();
            ca.setNombre("c1");

                List<Grupo> lg = new ArrayList();
                Grupo gr = new Grupo();
                gr.setGrupo("A");
                gr.setCuatrimestre(1);

                    List<Estudiante> es = new ArrayList();
                    Estudiante est = new Estudiante();
                    est.setNombre("E1");

                        List<Materia> mat = new ArrayList();
                        Materia m = new Materia();
                        m.setNombre("M1");
                        m.setCalificacion(9);
                        mat.add(m);

                        m = new Materia();
                        m.setNombre("M2");
                        m.setCalificacion(10);
                        mat.add(m);

                        m = new Materia();
                        m.setNombre("M3");
                        m.setCalificacion(8);
                        mat.add(m);

                        est.setListaMateria(mat);

                    es.add(est);

                gr.setListaEstudiante(es);

                lg.add(gr);

            ca.setListaGrupo(lg);

        carrera.add(ca);
        
        System.out.println("Promedio por estudiante");
        imprimirPromediosEstudiantes(carrera);

        System.out.println("Promedio por grupos");
        imprimirPromedioGrupos(carrera);

        System.out.println("------------------------");
        buscarEstudiante("E1", carrera);
        
    }
}