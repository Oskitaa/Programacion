/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Scanner;

/**
 *
 * @author ese_b
 */
public class Portatil extends Pc{
    
    private double duracionBat;

    public Portatil() {
    }

    public double getDuracionBat() {
        return duracionBat;
    }

    public void setDuracionBat(double duracionBat) {
        this.duracionBat = duracionBat;
    }
    
    
    @Override
    public void capturar() {
        Scanner s = new Scanner(System.in);
        super.capturar();
        System.out.println("Introduce la duracion de la bateria: ");
        setDuracionBat(s.nextInt());
    }

    @Override
    public String toString() {
        return super.toString() + "y la duracion de la bateria es "+getDuracionBat();
        
    }
    
    
    
}
