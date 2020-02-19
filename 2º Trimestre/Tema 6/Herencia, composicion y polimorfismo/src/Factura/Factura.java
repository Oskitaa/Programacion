/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factura;

import Utils.Utils;

/**
 *
 * @author ese_b
 */
public abstract class Factura {
    
    protected static int numero;
    protected double pctDescuento;

    public Factura() {
        this.numero++;
        this.pctDescuento = 0;
    }
    
    public Factura(double pctDescuento) {
        this.numero++;
        this.pctDescuento = pctDescuento;
    }

    public int getNumero() {
        return numero;
    }

    public double getPctDescuento() {
        return pctDescuento;
    }

    public void setPctDescuento(double pctDescuento) {
        this.pctDescuento = pctDescuento;
    }
    
    public void capturar(){
        
        Utils uts = new Utils();
        
        
        
    }
    
    
    
    
}
