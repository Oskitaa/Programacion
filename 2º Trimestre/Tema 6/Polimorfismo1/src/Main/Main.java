/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Model.*;
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
        Pc pc1 = new Pc();
        Portatil laptop1 = new Portatil();

        int opc = 0;

        do {
            System.out.println("Seleccione una opción:\n0.Salir \n1.Crear pc \n2.Crear portatil \n3.Mostrar datos Pc \n4.Mostrar datos Portatil");
            opc = uts.getInt();

            switch (opc) {

                case 0:
                    System.out.println("Hasta pronto.");
                    break;

                case 1:
                    pc1.capturar();
                    break;

                case 2:
                    laptop1.capturar();
                    break;

                case 3:
                    System.out.println(pc1.toString());
                    break;

                case 4:
                    System.out.println(laptop1.toString());
                    break;

            }

        } while (opc != 0);

    }

}
