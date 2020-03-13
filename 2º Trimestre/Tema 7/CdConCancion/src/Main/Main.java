/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Cd.*;
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

        Cd cd1 = new Cd();
        Cancion can = new Cancion();

        int opc = 0,
                aux;

        do {

            System.out.println("Introduce una opcion");
            Utils.menu("0.Salir", "1.Numero de canciones", "2.Cancion en posicion", "3.Sustituye cancion", "4.Agrega cancion", "5.Eliminar cancion");

            opc = Utils.getInt();

            switch (opc) {

                case 0:

                    System.out.println("Adios!!");
                    break;

                case 1:

                    cd1.numeroCanciones();
                    break;

                case 2:

                    try {
                        System.out.println("Introduce la posicon de la cancion: ");
                        aux = Utils.getInt();
                        cd1.dameCancion(aux);
                    } catch (NullPointerException e) {
                        System.out.println("Introduce una posicion valida.");
                    }

                    break;

                case 3:

                    System.out.println("Introduce la posicon de la cancion a sustituir: ");
                    aux = Utils.getInt();
                    cd1.grabaCancion(aux, can);
                    break;

                case 4:

                    cd1.agrega(can);
                    break;

                case 5:

                    System.out.println("Introduce la posicon de la cancion a eliminar: ");
                    aux = Utils.getInt();
                    cd1.elimina(aux);
                    break;

                default:

                    System.out.println("Introduce una opcion valida.");
                    break;

            }

        } while (opc != 0);

    }

}
