/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aparato;

/**
 *
 * @author ese_b
 */
public class Equipo extends Aparato{
    
    private int cantidadCds;
    
    
    public Equipo(){
        
        cantidadCds = 0;
        
    }
    public Equipo(int cantidadCds){
        
        this.cantidadCds = cantidadCds;
        
    }

    public int getCantidadCds() {
        return cantidadCds;
    }

    public void setCantidadCds(int cantidadCds) {
        this.cantidadCds = cantidadCds;
    }

    @Override
    public String toString() {
        return "Equipo{" + "cantidadCds=" + cantidadCds + '}';
    }
    
    public void capturarEquipo(){
        
        super.capturarAparato();
        System.out.println("Introduce la cantidad de Cds que se pueden introducir: ");
        setCantidadCds(Utils.Utils.getInt());
        
 
    }
    
    
  
    
}
