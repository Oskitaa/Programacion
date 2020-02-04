/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import java.util.Scanner;

/**
 *
 * @author ese_b
 */
public class Persona {

    /**
     *
     */
    protected int identidad;

    /**
     *
     */
    public Persona() {
    }

    /**
     *
     * @param identidad
     */
    public Persona(int identidad) {
        this.identidad = identidad;
    }

    /**
     *
     * @return
     */
    public int getIdentidad() {
        return identidad;
    }

    /**
     *
     * @param identidad
     */
    public void setIdentidad(int identidad) {
        this.identidad = identidad;
    }

    /**
     *
     */
    public void establecerPersona() {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce tu numero de identidad");
        setIdentidad(s.nextInt());
        
    }

    /**
     *
     */
    public void imprimirPersona() {
        System.out.println("Este es tu número de identidad: "+getIdentidad());
    }

}
