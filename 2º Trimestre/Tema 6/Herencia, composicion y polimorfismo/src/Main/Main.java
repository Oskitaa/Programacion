/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Factura.*;
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

        Utils uts = new Utils();
        
        
        

        int opc = 0;

        do {

            System.out.println("Introduce una opcion: ");
            System.out.println("0.Salir \n1.Factura Equipo \n2.Factura iPod \n3.Factura TV");

            opc = uts.getInt();

            switch (opc) {

                case 0:
                    System.out.println("Hasta pronto!!!");
                    break;

                case 1:
                    FacturaEquipo fraequi = new FacturaEquipo();
                    fraequi.capturar();
                    fraequi.imprimir();

                    break;

                case 2:
                    FacturaiPod fraipod = new FacturaiPod();
                    fraipod.capturar();
                    fraipod.imprimir();
                    break;

                case 3:
                    FacturaTV fratv = new FacturaTV();
                    fratv.capturar();
                    fratv.imprimir();
                    break;

            }

        } while (opc != 0);

    }

}
