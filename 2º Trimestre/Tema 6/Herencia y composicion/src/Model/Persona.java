/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ese_b
 */
public abstract class Persona {

    protected int identidad;
    protected String nombreCompleto;

    public Persona() {
        this.identidad = 0;
        this.nombreCompleto = "";
    }

    public Persona(int identidad, String nombreCompleto) {
        this.identidad = identidad;
        this.nombreCompleto = nombreCompleto;
    }

    public void establecerPersona(int identidad, String nombreCompleto) {
        this.identidad = identidad;
        this.nombreCompleto = nombreCompleto;
    }

    public void capturarPersona() {

        System.out.println("Introduce el ID de la persona: ");
        setIdentidad(Utils.Utils.getInt());
        System.out.println("Introduce el nombre de la persona: ");
        setNombreCompleto(Utils.Utils.getString());
        
    }

    public int getIdentidad() {
        return identidad;
    }

    public void setIdentidad(int identidad) {
        this.identidad = identidad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @Override
    public String toString() {
        return "Persona{" + "identidad=" + identidad + ", nombreCompleto=" + nombreCompleto + '}';
    }

}
