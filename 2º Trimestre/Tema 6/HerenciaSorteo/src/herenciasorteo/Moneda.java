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
public class Moneda extends sorteo{

    @Override
    public int lanzar() {
        
        int moneda;
        moneda = (int) (Math.random()*2);
               
        return moneda;
    }
    
    
    
}
