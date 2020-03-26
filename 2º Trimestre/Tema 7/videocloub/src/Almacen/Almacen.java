/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen;

import Utils.Utils;
import Videoclub.Videoclub;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ese_b
 */
public class Almacen {

    ArrayList<Videoclub> video = new ArrayList<Videoclub>();

    Iterator<Videoclub> itvi = video.iterator();

    Videoclub vid = new Videoclub();

    //añade una pelicula al array
    public void aniadirPeli() {

        vid.capturar();
        video.add(vid);

    }
    
    //muestra todas las peliculas disponibles
    public void verDisponible() {
        itvi = video.iterator();
        int aux = 0;

        while (itvi.hasNext()) {

            if (video.get(aux).isDisponible()) {
                System.out.println((aux + 1) + ". " + itvi.next().getNombre_peli());
            } else {
                itvi.next();
            }

            aux++;

        }

    }

    //muestra las peliculas que contengan dicho nombre
    public void verPelisNombre() {

        itvi = video.iterator();
        int aux = 0;

        String nombre = Utils.getString("Introduce la pelicula a buscar: ");

        while (itvi.hasNext()) {

            if (video.get(aux).getNombre_peli().toLowerCase().contains(nombre.toLowerCase())) {
                System.out.println((aux + 1) + ". " + itvi.next().getNombre_peli());
            } else {
                itvi.next();
            }

            aux++;

        }
    }

    //busca y muestra las peliculas segun el director
    public void verPelisDirector() {
        itvi = video.iterator();
        int aux = 0;

        String nombre = Utils.getString("Introduce el nombre del director a buscar: ");
        System.out.println("Peliculas del diretor " + nombre);
        while (itvi.hasNext()) {

            if (video.get(aux).getDirector().equalsIgnoreCase(nombre)) {
                System.out.println((aux + 1) + ". " + itvi.next().getNombre_peli());
            } else {
                itvi.next();
            }

            aux++;

        }

    }

    //muestra las peliculas segun la tematica elegida
    public void verPelisTematica() {
        itvi = video.iterator();
        int aux = 0;

        String nombre = vid.elegirTematica("Introduce la tematica: ");
        while (itvi.hasNext()) {

            if (video.get(aux).getTematica().equalsIgnoreCase(nombre)) {
                System.out.println((aux + 1) + ". " + itvi.next().getNombre_peli());
            } else {
                itvi.next();
            }

            aux++;

        }

    }

    //Muestra las peliculas segun la tematica elegida y estando disponible
    public void verPelisTematicaDisponible() {
        itvi = video.iterator();
        int aux = 0;

        String nombre = vid.elegirTematica("Introduce la tematica: ");
        while (itvi.hasNext()) {

            if (video.get(aux).getTematica().equalsIgnoreCase(nombre) && video.get(aux).isDisponible()) {
                System.out.println((aux + 1) + ". " + itvi.next().getNombre_peli());
            } else {
                itvi.next();
            }

            aux++;

        }

    }

    //Muestra todas las peliculas que hay en el almacen
    public void mostrarPelis() {
        
        int i = 1;
        for (Videoclub v : video) {
            System.out.println(i + ". " + v.toString());
            i++;
        }

    }

    //Elimina una pelicula en la posicion indicada
    public void elminarPeli() {
        System.out.println("Que pelicula desea borrar: ");
        mostrarPelis();

        int borrar = 0;

        do {
            borrar = Utils.getInt("");
        } while (borrar < 1 || borrar > video.size());

        video.remove(borrar - 1);

    }

}
