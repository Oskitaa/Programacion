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
public class TV extends Aparato{
    
    private int tamanio;
    
    public TV (){
        tamanio = 0;
    }
    
    
    public TV (int tamanio){
        this.tamanio = tamanio;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "TV{" + "tamanio=" + tamanio + '}';
    }
    
    public void capturarTV(){
        
        super.capturarAparato();
        
        System.out.println("Introduce las pulgadas del TV: ");
        setTamanio(Utils.Utils.getInt());
        
    }
    
}
