/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Libro.Libro;
import Utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ese_b
 */
public class Main {

    static ArrayList<Libro> libro1 = new ArrayList<Libro>();

    static Iterator<Libro> itli = libro1.iterator();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        libro1.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "AN324234242ES", 400));
        libro1.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "AN324234242ES", 350));
        libro1.add(new Libro("20 poemas de amor y una canción desesperada", "Pablo Neruda", "AN999333120ES", 45));
        libro1.add(new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", "AN000432753UK", 439));

        int opc = 0;

        do {

            Utils.menu("0.Salir", "1.Modificar nombre titulo", "2.Borrar por nombre de titulo (exacto)", "3.Mostrar todos los libros.");
            opc = Utils.getInt("Introduce una opción: ");

            switch (opc) {
                case 1:
                    itli = libro1.iterator();
                    int libro_modif = 0;
                    mostrar();
                    do {
                        libro_modif = Utils.getInt("Introduce el numero del libro a modificar: ");
                    } while (libro_modif < 1 || libro_modif > libro1.size());

                    String new_name = Utils.getString("Escribe el nuevo nombre del libro: ");
                    libro1.get(libro_modif - 1).setNombre(new_name);

                    break;

                case 2:

                    itli = libro1.iterator();

                    int a = 0;

                    mostrar();
                    String nombre_libro = Utils.getString("Introduce el nombre del libro a borrar.");

                    while (itli.hasNext()) {
                        if (libro1.get(a).getNombre().equalsIgnoreCase(nombre_libro)) {
                            libro1.remove(a);
                            break;
                        } else {
                            itli.next();
                        }
                        a++;
                    }

                    break;

                case 3:
                    mostrar();
                    break;

                case 4:

                    break;

                case 0:
                    System.out.println("Adios.!!!!");
                    break;
                default:
                    System.out.println("Comprube el numero introducido.");
                    break;

            }

        } while (opc != 0);

    }

    public static void mostrar() {
        int i = 1;
        for (Libro lib : libro1) {
            System.out.println(i + (". ") + lib.toString());
            i++;
        }
    }

}
