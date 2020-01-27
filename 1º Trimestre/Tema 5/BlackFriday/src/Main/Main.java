/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Utils.Utils;
import blackfriday.BlackFriday;

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
        BlackFriday black1 = new BlackFriday();

        int menu1 = 0;

        do {

            System.out.println("Bienvenido a Mundo Impresoras, seleccione una opción: ");
            System.out.println("0.Sali \n1.Precio \n2.Configuracion impresora \n3.Finalizar compra");
            menu1 = uts.getInt();
            switch (menu1) {

                case 0:
                    System.out.println("Gracias, hasta luego!!!");
                    break;
                case 1:
                    System.out.println("El precio actual es: " + black1.getPrecio() + "€.");
                    break;
                case 2:
                    black1.comprar();
                    System.out.println("Precio total" + black1.getPrecio());
                    break;
                case 3:
                    System.out.println(black1.toString());
                    menu1 = 0;
                    break;
                default:
                    System.out.println("Introduce un numero entre 0 y 3.");
            }

        } while (menu1 != 0);

    }

}
