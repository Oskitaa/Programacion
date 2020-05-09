/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen.Tipos;
import Almacen.Productos;
/**
 *
 * @author ese_b
 */
public class Fruta extends Productos {
    
    public static int contadorFruta = 0;
    private boolean ecologica;

    public Fruta() {
        super();
        this.ecologica = false;
        contador();
    }
    
    private int contador(){
        return codigo= ++contadorFruta; 
    }

    public Fruta(boolean ecologica, String categoria, double precio) {
        super(categoria, precio);
        this.ecologica = ecologica;
    }
     
    
}
