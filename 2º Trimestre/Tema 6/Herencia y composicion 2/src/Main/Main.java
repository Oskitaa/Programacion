/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Aparato.Equipo;
import Factura.Factura;
import Utils.Utils;

/**
 *
 * @author ese_b
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Factura fra1 = new Factura();
        Utils uts = new Utils();

        int opc = 0;

        do {

            System.out.println("Seleccione una opcion: ");
            System.out.println("0.Salir \n1.Comprar TV \n2.Comprar equipo sonido");
            
            opc = uts.getInt();
            switch (opc) {
                
                
                case 0:
                    System.out.println("Adios!!");
                    break;

                case 1:
                    fra1.capturarFactTV();
                    break;
                case 2:
                    fra1.capturarFactEquipo();
                    break;

            }

        } while (opc != 0);

    }

}
