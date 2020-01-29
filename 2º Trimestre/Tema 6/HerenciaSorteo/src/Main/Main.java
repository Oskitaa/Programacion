/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import herenciasorteo.Dado;
import herenciasorteo.Moneda;
/**
 *
 * @author ese_b
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Moneda mon1 = new Moneda();
        Dado dado1 = new Dado();
        
       int lanzaDado = dado1.lanzar();
       int lanzaMoneda = mon1.lanzar();
       
        System.out.println("Ha tirado el dado y ha salido " + lanzaDado);
        
        switch(lanzaMoneda){
        
            case 0:
                System.out.println("Ha lanzado la moneda y ha salido cara");
                break;
            case 1:
                System.out.println("Ha lanzado la moneda y ha salido cruz");
                break;
    }
               
        
    }
}
