/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;

import Utils.Utils;

/**
 *
 * @author ese_b
 */
public class Clientes {

    public static int CODIGO = 1000;

    private String nombre;
    private String DNI;
    private int codigo;

    public Clientes() {
        this.nombre = "";
        this.DNI = "";
        this.codigo = sumCogido();
    }

    public Clientes(String nombre, String DNI, int codigo) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.codigo = sumCogido();
    }

    //metodo
    public void leerDatos() {
        setNombre(Utils.getString("Introduzca su nombre"));
    }

    public int sumCogido() {
        return codigo = ++CODIGO;
    }

    //getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
