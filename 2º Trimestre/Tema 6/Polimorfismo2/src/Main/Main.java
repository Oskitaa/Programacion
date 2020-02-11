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
        Punto punto1 = new Punto();
        Circulo circulo1 = new Circulo();

        int opc = 0;

        do {
            System.out.println("Seleccione una opción:\n0.Salir \n1.Crear punto \n2.Crear circulo \n3.Mostrar datos \n4.Determinar cuadrante");
            opc = uts.getInt();

            switch (opc) {

                case 0:
                    System.out.println("Hasta pronto.");
                    break;

                case 1:
                    punto1.capturar();
                    break;

                case 2:
                    circulo1.capturar();
                    break;

                case 3:
                    System.out.println(punto1.toString());
                    break;

                case 4:
                    punto1.cuadrante();
                    break;

            }

        } while (opc != 0);

    }

}
