/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Utils.Utils;
import Persona.Persona;

/**
 *
 * @author ese_b
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int entradas,
                opc = 0;

        System.out.println("Cuantas entradas hay disponibles? ");
        entradas = Utils.getInt();
        Persona p[] = new Persona[entradas];

        for (int i = 0; i < p.length; i++) {
            p[i] = new Persona();

        }

        do {

            Utils.menu("1.Nueva persona en la cola", "2.Persona accede al recinto", "3.Mostrar sitiacion en la cola", "4.Numero de personas", "5.Salir");
            opc = Utils.getInt();

            switch (opc) {

                case 1:

                    for (int i = 0; i < p.length; i++) {

                        if (p[i].getNombre().equals("")) {
                            p[i].capturar();
                            break;
                        }

                    }

                    break;

                case 2:

                    p[0] = null;

                    for (int i = 1; i < p.length; i++) {

                        p[i - 1] = p[i];

                    }
                    
                    System.out.println("Persona sacada de la fila correctamente.");

                    break;

                case 3:

                    System.out.println("Introduce tu dni");

                    String dni = Utils.getString();

                    for (int i = 0; i < p.length; i++) {

                        if (p[i].getDni().equalsIgnoreCase(dni)) {

                            System.out.println("Se encuentra en la posicion " + (i + 1));

                        }
                    }

                    break;

                case 4:

                    int i = 0;

                    for (Persona pe : p) {

                        if (!pe.getNombre().equals("")) {
                            i++;
                        }

                    }

                    System.out.println("Actualmente hay " + i + " personas en la cola.");

                    break;

                case 5:
                    System.out.println("Adios.");
                    break;

                default:
                    System.out.println("Error al seleccionar opcion.");
                    break;
            }

        } while (opc != 5);

    }

}
