/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pez;

/**
 *
 * @author ese_b
 */
public class Peces extends Pez {

    public Peces(String nombre) {
        super(nombre);
    }

    public Peces(Pez p) {
        super(p.nombre);
    }

}
