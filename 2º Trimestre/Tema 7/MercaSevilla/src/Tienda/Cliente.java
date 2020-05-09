package Tienda;

import java.util.ArrayList;
import Almacen.Productos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ese_b
 */
public class Cliente {

    private String nombre,
            dni;
    ArrayList<Productos> arrayPro;

    public Cliente() {
        this.nombre = "";
        this.dni = "";
        arrayPro = new ArrayList<Productos>();
    }

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        arrayPro = new ArrayList<Productos>();
    }

    @Override
    public String toString() {
        return getNombre() + "con DNI: " + getDni() + "/nHa comprado los siguientes productos:" + arrayPro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

}
