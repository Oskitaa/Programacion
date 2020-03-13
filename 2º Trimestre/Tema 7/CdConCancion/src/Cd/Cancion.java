/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cd;

import Utils.Utils;

/**
 *
 * @author ese_b
 */
public class Cancion {
    
    private String nombre_cancion;
    private int duracion;
    
    public Cancion() {
        this.nombre_cancion = "";
        this.duracion = 0;
    }
    
    public Cancion(String nombre_cancion, int duracion) {
        this.nombre_cancion = nombre_cancion;
        this.duracion = duracion;
    }
    
    public String getNombre_cancion() {
        return nombre_cancion;
    }
    
    public void setNombre_cancion(String nombre_cancion) {
        this.nombre_cancion = nombre_cancion;
    }
    
    public int getDuracion() {
        return duracion;
    }
    
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public void capturar() {
        
        System.out.println("Introduce el nombre de la cancion: ");
        setNombre_cancion(Utils.getString());
        System.out.println("Introduce los minutos (sin segundos) de la cancion: ");
        setDuracion(Utils.getInt());
        
    }
    
    @Override
    public String toString() {
        return nombre_cancion + " dura " + duracion;
    }
    
}
