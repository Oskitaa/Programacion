/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pez;

import java.util.Objects;

/**
 *
 * @author ese_b
 */
public class Pez {

    protected String nombre;
    static int numPeces;
    
    public Pez() {
        nombre = "";
        numPeces++;
    }

    public Pez(String nombre) {
        this.nombre = nombre;
        numPeces++;
        mostrarPeces();
    }

    public Pez(Pez p) {
        this.nombre = p.nombre;
        numPeces++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Object clone() {
        Object obj = null;
        try {
            obj = (Pez) super.clone();
        } catch (CloneNotSupportedException ex) {
            System.out.println("No se puede duplicar");
        }
        return obj;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pez other = (Pez) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    public void mostrarPeces(){
        System.out.println("Hay " + numPeces);
    }

}
