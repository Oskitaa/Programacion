/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Model.Model;
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
        // TODO code application logic here

        Model e = new Model();

        int opc = 0;
        do {

            Utils.menu("1.- Vender producto", "2.- Dato un producto, mostrar los clientes que han comprado dicho producto.", "3.- Mostrar el total que se ha gastado un cliente determinado.", "0.- Salir");
            opc = Utils.getInt();
            switch (opc) {

                case 0:
                    System.out.println("Adios");
                    break;
                case 1:
                    e.venderProducto();
                    break;
                case 2:
                    e.datosProducto();
                    break;
                case 3:
                    e.mostrarTotalPersona();
                    break;
                default:
                    System.out.println("Error");

            }

        } while (opc != 0);

    }

}
