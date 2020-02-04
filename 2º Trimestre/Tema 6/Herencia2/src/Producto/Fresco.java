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
public class Fresco extends Producto{
    private String fechaEnvasado, paisDeOrigen;
   
    public Fresco( String num_lote){
        super(num_lote);
        fechaEnvasado = "";
        paisDeOrigen = "";
    }
   
    public void setFechaEnvasado(String fecha){
        fechaEnvasado = fecha;
    }
   
    public void setPaisDeOrigen(String pais){
        paisDeOrigen = pais;
    }
   
    public String getFechaEnvasado(){
        return fechaEnvasado;
    }
   
    public String getPaisDeOrigen(){
        return paisDeOrigen;
    }
}
