/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.controlador;

import edu.sena.modelo.Alumno;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.context.FacesContext;
import org.primefaces.PrimeFaces;

/**
 *
 * @author josar
 */
@Named(value = "alumnosSession")
@SessionScoped
public class AlumnosSession implements Serializable {

    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    private Alumno alIn = new Alumno();
    private String n1;
    private String n2;
    private String n3;
    private String n4;
    private String n5;

    /**
     * Creates a new instance of AlumnosSession
     */
    public AlumnosSession() {
    }

    public void guardarAlumno() {
        alIn.ponerNotas(0, Integer.parseInt(n1));
        alIn.ponerNotas(1, Integer.parseInt(n2));
        alIn.ponerNotas(2, Integer.parseInt(n3));
        alIn.ponerNotas(3, Integer.parseInt(n4));
        alIn.ponerNotas(4, Integer.parseInt(n5));
        listaAlumnos.add(alIn);
        alIn = new Alumno();
        n1 = "";
        n2 = "";
        n3 = "";
        n4 = "";
        n5 = "";   
        PrimeFaces.current().executeScript("ingresadoCorrecto()");
        
    }

    public void removerAlumno(int pos) {
        listaAlumnos.remove(pos);
        PrimeFaces.current().executeScript("removerCorrecto()");
    }
    
    public void calcularMedia(int pos){
       Alumno obt = listaAlumnos.get(pos);
       int acumulado = obt.obtenNota(0) + obt.obtenNota(1) + obt.obtenNota(2) + obt.obtenNota(3) +obt.obtenNota(4);
       double prom = (acumulado/5);
       PrimeFaces.current().executeScript("promedio('"+obt.getNombres()+"',"+prom+")");
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public Alumno getAlIn() {
        return alIn;
    }

    public void setAlIn(Alumno alIn) {
        this.alIn = alIn;
    }

    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public String getN2() {
        return n2;
    }

    public void setN2(String n2) {
        this.n2 = n2;
    }

    public String getN3() {
        return n3;
    }

    public void setN3(String n3) {
        this.n3 = n3;
    }

    public String getN4() {
        return n4;
    }

    public void setN4(String n4) {
        this.n4 = n4;
    }

    public String getN5() {
        return n5;
    }

    public void setN5(String n5) {
        this.n5 = n5;
    }

}
