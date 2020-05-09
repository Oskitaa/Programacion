/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Model.Actividad;
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
        Actividad a = new Actividad();
        int opc = 0;
        do {
            Utils.menu("0.Salir", "1.Ejercicio 5", "2.Ejercicio 6");
            opc = Utils.getInt();

            switch (opc) {

                case 0:
                    System.out.println("adios");
                    break;
                case 1:
                    a.ejercicio5();
                    break;
                case 2:
                    a.ejercicio6();
                    break;
                default:
                    System.out.println("Numero erroneo");
                    break;
            }

        } while (opc != 0);

    }

}
