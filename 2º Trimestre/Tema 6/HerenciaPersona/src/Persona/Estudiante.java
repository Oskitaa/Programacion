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
public class Estudiante extends Persona{
    
    private int nroCuenta;

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }
  
    public void establecerEstudiante() {
        
        Scanner s = new Scanner (System.in);
        
        super.establecerPersona();
        
        System.out.println("Introduce tu número de cuenta: ");
        
        setNroCuenta(s.nextInt());
        
    }
    
    public void imprimirEstudiante() {
        
        super.imprimirPersona(); 
        
        System.out.println("Tu número de cuenta es: "+ getNroCuenta());
    }
    
    
    
 
}
