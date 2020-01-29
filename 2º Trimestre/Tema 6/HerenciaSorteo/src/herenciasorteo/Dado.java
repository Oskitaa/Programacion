/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciasorteo;

/**
 *
 * @author ese_b
 */
public class Dado extends sorteo {

    @Override
    public int lanzar() {
        int numRandom;
        numRandom = (int) (Math.random() * 6+1);
        return numRandom;
    }

}
