/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Videojuego;

import interfaz.Entregable;
import Utils.Utils;

/**
 *
 * @author ese_b
 */
public class Videojuego implements Entregable {

    private String titulo, genero, compania;
    private int horas_est;
    private boolean entregado;

    public Videojuego() {
        this.titulo = "";
        this.genero = "";
        this.compania = "";
        this.horas_est = 10;
        this.entregado = false;
    }

    public Videojuego(String titulo, int horas_est) {
        this.titulo = titulo;
        this.genero = "";
        this.compania = "";
        this.horas_est = horas_est;
        this.entregado = false;
    }

    public Videojuego(String titulo, String genero, String compania, int horas_est) {
        this.titulo = titulo;
        this.genero = genero;
        this.compania = compania;
        this.horas_est = horas_est;
        this.entregado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public int getHoras_est() {
        return horas_est;
    }

    public void setHoras_est(int horas_est) {
        this.horas_est = horas_est;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public void compareTo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "EL nombre del juego es" + getTitulo() + ", tiene " + getHoras_est() + " horas estimadas, lo desarrolla la compañia " + getCompania() + " y se de tipo " + getGenero();
    }

    public void captura() {

        System.out.println("Introduce el nombre del juego:");
        setTitulo(Utils.getString());
        System.out.println("Introduce el numero de horas: ");
        setHoras_est(Utils.getInt());
        System.out.println("Introduce la compañia: ");
        setCompania(Utils.getString());
        System.out.println("Introduce el genero: ");
        setGenero(Utils.getString());

    }

}
