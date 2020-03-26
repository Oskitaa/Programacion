/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Utils.Utils;
import Almacen.Almacen;

/**
 *
 * @author ese_b
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Almacen a = new Almacen();

        int opc = 0;

        do {

            Utils.menu("1.- Añadir una nueva película", "2.- Ver el número de películas de las que dispone la videoteca", "3.- Buscar y mostrar todas las películas por nombre de película", "4.- Buscar y mostrar todas las películas por nombre de director");
            Utils.menu("5.- Buscar y mostrar todas las películas por una temática", "6.- Buscar y mostrar todas las películas que estén disponibles de una temática concreta", "7.- Mostrar todas las películas", "8.- Descatalogar una película", "9.- Salir");

            opc = Utils.getInt("Introduce una opcion: ");

            switch (opc) {

                case 1:
                    a.aniadirPeli();
                    break;
                case 2:
                    a.verDisponible();
                    break;
                case 3:
                    a.verPelisNombre();
                    break;
                case 4:
                    a.verPelisDirector();
                    break;
                case 5:
                    a.verPelisTematica();
                    break;
                case 6:
                    a.verPelisTematicaDisponible();
                    break;
                case 7:
                    a.mostrarPelis();
                    break;
                case 8:
                    a.elminarPeli();
                    break;
                case 9:
                    System.out.println("Adios!!!!");
                    break;
                default:
                    System.out.println("Compruebe el numero.");
                    break;
            }

        } while (opc != 9);

    }

}
