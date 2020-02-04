/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto;

/**
 *
 * @author ese_b
 */
public class Congelado extends Producto{
    
    private double temperaturaRecom;
   
    public Congelado(String num_lote){
        super(num_lote);
        temperaturaRecom = 0;
    }
   
    public void settemperaturaRecom(double temperaturaRecom){
        temperaturaRecom = temperaturaRecom;
    }
   
    public double gettemperaturaRecom(){
        return temperaturaRecom;
    
}
}
