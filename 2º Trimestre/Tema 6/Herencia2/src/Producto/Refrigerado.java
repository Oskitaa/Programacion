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
public class Refrigerado extends Producto{
        private String codigoSuper;
   
    public Refrigerado( String num_lote){
        super(num_lote);
        codigoSuper = "";
    }
   
    public void setcodigoSuper(String codigo){
        codigoSuper = codigo;
    }
   
    public String getcodigoSuper(){
        return codigoSuper;
    }
}
