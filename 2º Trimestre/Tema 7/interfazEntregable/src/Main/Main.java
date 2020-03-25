/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Serie.Serie;
import Utils.Utils;
import Videojuego.Videojuego;
import java.util.ArrayList;
import java.util.Iterator;

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

        Serie ser = new Serie();
        Videojuego vid = new Videojuego();

        ArrayList<Videojuego> juego1 = new ArrayList<Videojuego>();
        ArrayList<Serie> serie1 = new ArrayList<Serie>();

        serie1.add(new Serie("Juego de tronos", "Pepe"));
        serie1.add(new Serie("Hawaii 5.0", "Jose"));

        juego1.add(new Videojuego("Call of duty ", 100));
        juego1.add(new Videojuego("Pokemon", 500));

        Iterator<Serie> itse = serie1.iterator();
        Iterator<Videojuego> itju = juego1.iterator();

        int opc = 0,
                opc2,
                aux, i;

        do {

            Utils.menu("1.Crear serie/videojuego", "2.Entregar S/V", "3.Devolver");
            opc = Utils.getInt();

            switch (opc) {

                case 1:

                    do {

                        Utils.menu("Seleccione que desea crear: ", "0.Salir", "1.Serie", "2.Videojuego");

                        opc2 = Utils.getInt();

                        switch (opc2) {

                            case 0:

                                System.out.println("Adios");
                                break;

                            case 1:

                                ser = new Serie();
                                ser.captura();
                                serie1.add(ser);
                                break;

                            case 2:

                                vid = new Videojuego();
                                vid.captura();
                                juego1.add(vid);
                                break;

                            default:

                                System.out.println("Incorrecto, intentelo de nuevo.");
                                break;

                        }

                    } while (opc2 != 0);

                    break;
                case 2:

                    do {

                        Utils.menu("Seleccione que desea entregar: ", "0.Salir", "1.Serie", "2.Videojuego");

                        opc2 = Utils.getInt();

                        switch (opc2) {

                            case 0:

                                System.out.println("Adios");
                                break;

                            case 1:

                                itse = serie1.iterator();

                                i = 0;

                                while (itse.hasNext()) {
                                    if (serie1.get(i).isEntregado() == false) {
                                        System.out.println((i + 1) + ". " + itse.next().getTitulo());
                                    } else {
                                        itse.next();
                                    }
                                    i++;

                                }

                                System.out.println("Que serie desea entregar?");

                                aux = Utils.getInt() - 1;

                                serie1.get(aux).entregar();

                                break;

                            case 2:

                                itju = juego1.iterator();

                                i = 0;

                                while (itju.hasNext()) {
                                    if (juego1.get(i).isEntregado() == false) {
                                        System.out.println((i + 1) + ". " + itju.next().getTitulo());
                                    } else {
                                        itju.next();
                                    }
                                    i++;

                                }

                                System.out.println("Que videojuego desea entregar?");

                                aux = Utils.getInt() - 1;

                                juego1.get(aux).entregar();

                                break;
                            default:
                                System.out.println("Posicion incorrecta, escoja otra.");
                                break;
                        }

                    } while (opc2 != 0);
                    break;
                case 3:

                    do {

                        Utils.menu("Seleccione que desea devolver: ", "0.Salir", "1.Serie", "2.Videojuego");

                        opc2 = Utils.getInt();

                        switch (opc2) {

                            case 0:

                                System.out.println("Adios");
                                break;

                            case 1:

                                itse = serie1.iterator();

                                i = 0;

                                while (itse.hasNext()) {
                                    if (serie1.get(i).isEntregado() == true) {
                                        System.out.println((i + 1) + ". " + itse.next().getTitulo());
                                    } else {
                                        itse.next();
                                    }
                                    i++;

                                }

                                System.out.println("Que serie desea devolver?");

                                aux = Utils.getInt() - 1;

                                serie1.get(aux).devolver();

                                break;

                            case 2:

                                itju = juego1.iterator();

                                i = 0;

                                while (itju.hasNext()) {
                                    if (juego1.get(i).isEntregado() == true) {
                                        System.out.println((i + 1) + ". " + itju.next().getTitulo());
                                    } else {
                                        itju.next();
                                    }
                                    i++;

                                }

                                System.out.println("Que videojuego desea entregar?");

                                aux = Utils.getInt() - 1;

                                juego1.get(aux).devolver();

                                break;

                            default:
                                System.out.println("Posicion incorrecta, escoja otra.");
                                break;
                        }

                    } while (opc2 != 0);

                    break;
                default:
                    System.out.println("Posicion incorrecta, escoja otra.");
                    break;
            }

        } while (opc != 0);

    }

}
