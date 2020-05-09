/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texto1;

import Model.Actividad;
import Utils.Utils;

/**
 *
 * @author ese_b
 */
public class Texto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Actividad a = new Actividad();
        int opc = 0;
        do {
            Utils.menu("0.Salir", "1.Ejercicio 1", "2.Ejercicio 2", "3.Ejercicio 3");
            opc = Utils.getInt();
            
            switch (opc) {
                
                case 0:
                    System.out.println("adios");
                    break;
                case 1:
                    a.ejercicio1();
                    break;
                case 2:
                    a.ejercicio2();
                    break;
                case 3:
                    a.ejercicio3();
                    break;
                
            }
            
        } while (opc != 0);
        
    }
    
}
