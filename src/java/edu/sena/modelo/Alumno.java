/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.modelo;

/**
 *
 * @author josar
 */
public class Alumno extends Persona {

    private int notas[] = new int[5];
    private String observaciones;
    private int nfaltas;
    private static int faltaGrave = 2;

    public Alumno() {
    }

    public Alumno(String observaciones, int nfaltas) {
        this.observaciones = observaciones;
        this.nfaltas = nfaltas;
    }

    public Alumno(String observaciones, int nfaltas, String nombres, String apellidos, String tipodocumento, long documento) {
        super(nombres, apellidos, tipodocumento, documento);
        this.observaciones = observaciones;
        this.nfaltas = nfaltas;
    }

    public int obtenNota(int i) {
        return notas[i];
    }

    public String obtenObservaciones() {
        return observaciones;
    }

    public int obtenNFaltas() {
        return nfaltas;
    }

    public void ponerNotas(int pos, int nota) {
        notas[pos] = nota;
    }

    public void ponerObservacion(String observacion) {
        this.observaciones = observacion;
    }

    public void ponerFalta() {
        nfaltas++;
    }

    public void quitarFalta() {
        nfaltas--;
    }

    public int estaFotut() {
        return (nfaltas / faltaGrave);
    }

    public int getNfaltas() {
        return nfaltas;
    }

    public void setNfaltas(int nfaltas) {
        this.nfaltas = nfaltas;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public static int getFaltaGrave() {
        return faltaGrave;
    }

    public static void setFaltaGrave(int aFaltaGrave) {
        faltaGrave = aFaltaGrave;
    }

}
