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
public class Pc {
    
    protected int memoria;

    public Pc() {
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
    
    public void capturar(){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce la memoria: ");
        setMemoria(s.nextInt());
    }

    @Override
    public String toString() {
        return "Pc{" + "memoria=" + memoria + '}';
    }
    
    
    
}
