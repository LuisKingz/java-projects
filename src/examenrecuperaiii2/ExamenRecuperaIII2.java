/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrecuperaiii2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RAGAd
 */
public class ExamenRecuperaIII2 {

    public static void maino() {
        List<Empresa> empresas = new ArrayList();
        Empresa em = new Empresa();
        em.setNombre("Utez");
        em.setDireccion("Av. Univ Tec");
        em.setTelefono("1234567");

        List<Departamento> depa = new ArrayList();

        /////////////////1111111111//////////////////////////////////
        Departamento dep = new Departamento();

        dep.setNombre("Depa 1");
        List<Empleado> emple = new ArrayList();

        Empleado g = new Empleado();
        g.setNombre("Gerente 1");
        g.setDireccion("Dir g1");
        g.setFechaContratacion("12/03/2001");
        g.setTelefono("2345678");
        g.setSueldoBase(1000);
        g.setPorcentajePrestaciones(5);
        g.setSueldoNeto(g.calcularSueldoNeto());
        g.setPrimaVacacional(g.calcularPrimaVacacional());
        emple.add(g);

        Empleado e = new Empleado();
        e.setNombre("Empleado 1");
        e.setDireccion("Dir e1");
        e.setFechaContratacion("12/03/2001");
        e.setTelefono("3456789");
        e.setSueldoBase(900);
        e.setGerente(g);
        e.setPorcentajePrestaciones(3);
        e.setSueldoNeto(e.calcularSueldoNeto());
        e.setPrimaVacacional(e.calcularPrimaVacacional());
        emple.add(e);

        e = new Empleado();
        e.setNombre("Empleado 11");
        e.setDireccion("Dir e11");
        e.setFechaContratacion("12/03/2001");
        e.setTelefono("3456123");
        e.setSueldoBase(900);
        e.setGerente(g);
        e.setPorcentajePrestaciones(3);
        e.setSueldoNeto(e.calcularSueldoNeto());
        e.setPrimaVacacional(e.calcularPrimaVacacional());
        emple.add(e);

        dep.setEmpleados(emple);
        depa.add(dep);

        ///////////////////222222222222/////////////////////////////////
        dep = new Departamento();

        dep.setNombre("Depa 2");
        emple = new ArrayList();

        g = new Empleado();
        g.setNombre("Gerente 2");
        g.setDireccion("Dir g2");
        g.setFechaContratacion("12/03/2008");
        g.setTelefono("2345678");
        g.setSueldoBase(1100);
        g.setPorcentajePrestaciones(5);
        g.setSueldoNeto(g.calcularSueldoNeto());
        g.setPrimaVacacional(g.calcularPrimaVacacional());
        emple.add(g);

        e = new Empleado();
        e.setNombre("Empleado 2");
        e.setDireccion("Dir e2");
        e.setFechaContratacion("12/03/2008");
        e.setTelefono("3456789");
        e.setSueldoBase(1000);
        e.setGerente(g);
        e.setPorcentajePrestaciones(3);
        e.setSueldoNeto(e.calcularSueldoNeto());
        e.setPrimaVacacional(e.calcularPrimaVacacional());
        emple.add(e);

        e = new Empleado();
        e.setNombre("Empleado 22");
        e.setDireccion("Dir e22");
        e.setFechaContratacion("12/03/2008");
        e.setTelefono("3456123");
        e.setSueldoBase(1000);
        e.setGerente(g);
        e.setPorcentajePrestaciones(3);
        e.setSueldoNeto(e.calcularSueldoNeto());
        e.setPrimaVacacional(e.calcularPrimaVacacional());
        emple.add(e);

        dep.setEmpleados(emple);
        depa.add(dep);

        /////////////////33333333333///////////////////////////////////
        dep = new Departamento();

        dep.setNombre("Depa 3");
        emple = new ArrayList();

        g = new Empleado();
        g.setNombre("Gerente 3");
        g.setDireccion("Dir g3");
        g.setFechaContratacion("12/03/2015");
        g.setTelefono("2345146");
        g.setSueldoBase(1200);
        g.setPorcentajePrestaciones(5);
        g.setSueldoNeto(g.calcularSueldoNeto());
        g.setPrimaVacacional(g.calcularPrimaVacacional());
        emple.add(g);

        e = new Empleado();
        e.setNombre("Empleado 3");
        e.setDireccion("Dir e3");
        e.setFechaContratacion("12/03/2015");
        e.setTelefono("4560987");
        e.setSueldoBase(1100);
        e.setGerente(g);
        e.setPorcentajePrestaciones(3);
        e.setSueldoNeto(e.calcularSueldoNeto());
        e.setPrimaVacacional(e.calcularPrimaVacacional());
        emple.add(e);

        e = new Empleado();
        e.setNombre("Empleado 33");
        e.setDireccion("Dir e33");
        e.setFechaContratacion("12/03/2015");
        e.setTelefono("3456120");
        e.setSueldoBase(1100);
        e.setGerente(g);
        e.setPorcentajePrestaciones(3);
        e.setSueldoNeto(e.calcularSueldoNeto());
        e.setPrimaVacacional(e.calcularPrimaVacacional());
        emple.add(e);

        dep.setEmpleados(emple);
        depa.add(dep);

        /////////////4444444444444///////////////////////////////////////
        dep = new Departamento();

        dep.setNombre("Depa 4");
        emple = new ArrayList();

        g = new Empleado();
        g.setNombre("Gerente 4");
        g.setDireccion("Dir g4");
        g.setFechaContratacion("12/03/2016");
        g.setTelefono("2345122");
        g.setSueldoBase(1300);
        g.setPorcentajePrestaciones(5);
        g.setSueldoNeto(g.calcularSueldoNeto());
        g.setPrimaVacacional(g.calcularPrimaVacacional());
        emple.add(g);

        e = new Empleado();
        e.setNombre("Empleado 4");
        e.setDireccion("Dir e4");
        e.setFechaContratacion("12/03/2016");
        e.setTelefono("4560981");
        e.setSueldoBase(1200);
        e.setGerente(g);
        e.setPorcentajePrestaciones(3);
        e.setSueldoNeto(e.calcularSueldoNeto());
        e.setPrimaVacacional(e.calcularPrimaVacacional());
        emple.add(e);

        e = new Empleado();
        e.setNombre("Empleado 44");
        e.setDireccion("Dir e44");
        e.setFechaContratacion("12/03/2016");
        e.setTelefono("3456121");
        e.setSueldoBase(1200);
        e.setGerente(g);
        e.setPorcentajePrestaciones(3);
        e.setSueldoNeto(e.calcularSueldoNeto());
        e.setPrimaVacacional(e.calcularPrimaVacacional());
        emple.add(e);

        dep.setEmpleados(emple);
        depa.add(dep);

        ///////////55555555/////////////////////////////////////////
        dep = new Departamento();

        dep.setNombre("Depa 5");
        emple = new ArrayList();

        g = new Empleado();
        g.setNombre("Gerente 5");
        g.setDireccion("Dir g5");
        g.setFechaContratacion("12/03/2018");
        g.setTelefono("2345122");
        g.setSueldoBase(1300);
        g.setPorcentajePrestaciones(5);
        g.setSueldoNeto(g.calcularSueldoNeto());
        g.setPrimaVacacional(g.calcularPrimaVacacional());
        emple.add(g);

        e = new Empleado();
        e.setNombre("Empleado 5");
        e.setDireccion("Dir e5");
        e.setFechaContratacion("12/03/2018");
        e.setTelefono("4560981");
        e.setSueldoBase(1200);
        e.setGerente(g);
        e.setPorcentajePrestaciones(3);
        e.setSueldoNeto(e.calcularSueldoNeto());
        e.setPrimaVacacional(e.calcularPrimaVacacional());
        emple.add(e);

        e = new Empleado();
        e.setNombre("Empleado 55");
        e.setDireccion("Dir e55");
        e.setFechaContratacion("12/03/2018");
        e.setTelefono("3456121");
        e.setSueldoBase(1200);
        e.setGerente(g);
        e.setPorcentajePrestaciones(3);
        e.setSueldoNeto(e.calcularSueldoNeto());
        e.setPrimaVacacional(e.calcularPrimaVacacional());
        emple.add(e);

        dep.setEmpleados(emple);
        depa.add(dep);

        em.setDepartamentos(depa);

        empresas.add(em);

        System.out.println("DEPARTAMENTOS------");
        for (Empresa empresa : empresas) {
            for (Departamento departamento : empresa.getDepartamentos()) {
                System.out.println("Departamento: " + departamento.getNombre() + " tiene " + departamento.getEmpleados().size() + " empleados");
            }
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("EMPRESA-------");
        for (Empresa empresa : empresas) {
            int au = 0;
            for (Departamento departamento : empresa.getDepartamentos()) {
                au += departamento.getEmpleados().size();
            }
            System.out.println("La empresa: " + empresa.getNombre() + " tiene " + au + " de empleados.");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("GERENTES-------");
        for (Empresa empresa : empresas) {
            int au = 0;
            for (Departamento departamento : empresa.getDepartamentos()) {
                for (Empleado empleado : departamento.getEmpleados()) {
                    System.out.println("Gerente: " + empleado.getNombre() + " del departamento " + departamento.getNombre() + " gana " + empleado.getSueldoNeto());
                    break;
                }
            }
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("TODOS LOS EMPLEADOS-------");

        for (Empresa empresa : empresas) {
            for (Departamento departamento : empresa.getDepartamentos()) {
                for (Empleado empleado : departamento.getEmpleados()) {
                    System.out.println(empleado.getNombre());
                    System.out.println(empleado.getDireccion());
                    System.out.println(empleado.getFechaContratacion());
                    System.out.println(empleado.getTelefono());
                    System.out.println(empleado.getSueldoBase());
                    if (empleado.getGerente() == null) {
                        System.out.println("Es gerente");
                    } else {
                        System.out.println(empleado.getGerente().getNombre());
                    }
                    System.out.println(empleado.getPorcentajePrestaciones());
                    System.out.println(empleado.getSueldoNeto());
                    System.out.println(empleado.getPrimaVacacional());
                    System.out.println("----------------------------");
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        maino();
    }
}
