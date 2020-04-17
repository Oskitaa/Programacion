/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Utils.*;

/**
 *
 * @author ese_b
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        API a = new API();

        int opc = 0;

        do {
            Utils.menu("0.Salir.", "1.Vender entrada.","2.Anular entrada.", "3.Mostrar entradas de una persona.");
            opc = Utils.getInt();

            switch (opc) {

                case 0:
                    System.out.println("Adios");
                    break;
                case 1:
                    a.venderEntrada();
                    break;
                case 2:
                    a.anularEntrada();
                    break;
                case 3:
                    a.mostrarEntradasPersona();
                    break;
                case 4:
                    a.mostrarCuantasQuedan();
                    break;
                default:
                    System.out.println("Introduzca una opcion del menu valida.");
                    break;

            }

        } while (opc != 0);

    }

}
