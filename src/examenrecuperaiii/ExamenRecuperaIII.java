/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrecuperaiii;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author RAGAd
 */
public class ExamenRecuperaIII {

    public static void Toto() {
        Scanner read = new Scanner(System.in);

        String mName[] = {"Español", "Matematicas", "Progra"};
        String cName[] = {"Sistemas", "Redes"};
        String eName[][] = {{"David", "Artemio", "Marleni", "Luis"}, {"Fernando", "Ivan", "Aldo", "Julia"}, {"Sofia", "Ilse", "Guadalupe", "Oscar"}, {"Alberto", "Carlos", "Daniel", "Jesus"}};
        String gName[] = {"1A", "1B", "2A", "2B"};
        int[][][] calif = {{{10, 9, 8}, {10, 7, 8}, {9, 9, 10}, {9, 7, 7}},
        {{0, 8, 8}, {10, 10, 10}, {8, 9, 8}, {7, 8, 10}},
        {{7, 8, 10}, {9, 10, 6}, {8, 7, 6}, {0, 9, 8}},
        {{9, 10, 10}, {7, 8, 8}, {5, 0, 0}, {10, 10, 7}}};

        int[] cuat = {1, 2, 1, 2};

        List<Carrera> carrera = new ArrayList();
        int a = 0;
        for (int i = 0; i < 2; i++) {
            Carrera c = new Carrera();
            c.setNombre(cName[i]);

            List<Grupo> gru = new ArrayList();
            for (int j = 0; j < 2; j++) {
                Grupo g = new Grupo();
                g.setGrupo(gName[i]);
                g.setCuatrimestre(cuat[i]);

                List<Estudiante> est = new ArrayList<>();
                for (int k = 0; k < 4; k++) {
                    Estudiante e = new Estudiante();
                    e.setNombre(eName[i][k]);
                    List<Materia> mate = new ArrayList<>();
                    for (int l = 0; l < 3; l++) {
                        Materia m = new Materia();

                        m.setNombre(mName[i]);
                        m.setCalificaciones(calif[a][k][l]);
                        mate.add(m);
                    }
                    e.setMaterias(mate);
                    est.add(e);
                }
                g.setEstudiantes(est);
                gru.add(g);

            }
            c.setGrupos(gru);
            carrera.add(c);
        }

        int opc = 0;
        do {
            System.out.println("");
            System.out.println("");
            System.out.println("Como quieres el promedio");
            System.out.println("1.-Estudiante");
            System.out.println("2.-Grupo");
            System.out.println("3.-Carrera");
            System.out.println("4.-Buscar alumno");
            System.out.println("5.-Salir");
            opc = read.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Ingrese el nombre del Estudiante");
                    String nom = read.next();
                    boolean ban = false;

                    for (Carrera carre : carrera) {
                        List<Grupo> grup = carre.getGrupos();
                        for (Grupo grupo : grup) {
                            List<Estudiante> estu = grupo.getEstudiantes();
                            for (Estudiante estudiante : estu) {
                                if (estudiante.getNombre().equals(nom)) {
                                    System.out.println("El primedio del estudiante " + nom + " es " + estudiante.obtenerPromedios());
                                    ban = true;
                                    break;
                                }
                            }
                            if (ban) {
                                break;
                            }
                        }
                        if (ban) {
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del grupo");
                    String gnom = read.next();
                    boolean ban1 = false;
                    for (Carrera carre : carrera) {
                        List<Grupo> grup = carre.getGrupos();
                        for (Grupo grupo : grup) {
                            if (grupo.getGrupo().equals(gnom)) {
                                System.out.println("El promedio del grupo " + gnom + " es " + grupo.obtenerPromedios());
                                ban1 = true;
                                break;
                            }
                        }
                        if (ban1) {
                            break;
                        }
                    }

                    break;
                case 3:
                    System.out.println("Que carrera es?");
                    String nomCarr = read.next();

                    for (Carrera carre : carrera) {
                        if (carre.getNombre().equals(nomCarr)) {
                            System.out.println("El promedio de la carrera " + nomCarr + " es " + carre.obtenerPromedios());
                            break;
                        }
                    }

                    break;
                case 4:
                    System.out.println("Ingrese el nombre del alumno");
                    String nom2 = read.next();
                    boolean ban2 = false;

                    for (Carrera carre : carrera) {
                        List<Grupo> grup = carre.getGrupos();
                        for (Grupo grupo : grup) {
                            List<Estudiante> estu = grupo.getEstudiantes();
                            for (Estudiante estudiante : estu) {
                                if (estudiante.getNombre().equals(nom2)) {
                                    System.out.println(nom2 + ", " + grupo.getCuatrimestre() + ", " + grupo.getGrupo() + " " + carre.getNombre() + ", " + estudiante.obtenerPromedios());
                                    ban2 = true;
                                    break;
                                }
                            }
                            if (ban2) {
                                break;
                            }
                        }
                        if (ban2) {
                            break;
                        }
                    }
                    break;
                case 5:
                    break;
            }
        } while (opc != 5);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Toto();
    }
}
