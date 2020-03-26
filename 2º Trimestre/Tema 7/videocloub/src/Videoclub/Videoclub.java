/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Videoclub;

import Utils.Utils;

/**
 *
 * @author ese_b
 */
public class Videoclub {

    public static int codpeli = 0;

    private String nombre_peli,
            director,
            tematica;
    private int duracion,
            codigo_peli;
    private boolean disponible;

    public Videoclub() {
        this.nombre_peli = "";
        this.director = "";
        this.tematica = "";
        this.duracion = 0;
        this.codigo_peli += codpeli++;
        this.disponible = true;
    }

    public Videoclub(String nombre_peli, String director, String tematica, int duracion, boolean disponible) {
        this.nombre_peli = nombre_peli;
        this.director = director;
        this.tematica = tematica;
        this.duracion = duracion;
        this.codigo_peli += codpeli++;
        this.disponible = disponible;
    }

    public String getNombre_peli() {
        return nombre_peli;
    }

    public void setNombre_peli(String nombre_peli) {
        this.nombre_peli = nombre_peli;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public String getTematica() {
        return tematica;
    }

    public void capturar() {

        setNombre_peli(Utils.getString("Introduce el nombre de la pelicula: "));
        setDirector(Utils.getString("Introduce el nombre del director: "));
        setDuracion(Utils.getInt("Introduce la duracion: "));

        String respuesta;
        boolean salir = false;
        do {

            respuesta = Utils.getString("Esta disponible? Si o no.");

            if (respuesta.equalsIgnoreCase("si")) {
                setDisponible(true);
                salir = true;
            } else if (respuesta.equalsIgnoreCase("no")) {
                setDisponible(false);
                salir = true;
            }else System.out.println("Error, vuelva a introducir los datos.");

        } while (!salir);

        setTematica(elegirTematica("Introduce la tematica"));

    }

    public String elegirTematica(String a) {

        System.out.println(a);

        Utils.menu("1.Drama", "2.Terror", "3.Romanticas", "4.Humor");

        String elegir[] = {"Drama", "Terror", "Romantica", "Humor"};
        int opc;
        do {

            opc = Utils.getInt("Introduce una opcion: ");

        } while (opc < 1 || opc > 4);

        return elegir[opc - 1];

    }

    @Override
    public String toString() {

        String disponible = isDisponible() ? "esta disponible" : "no esta disponible";

        return getNombre_peli() + " es del director " + getDirector() + ", dura " + getDuracion() + ", es de tipo " + getTematica() + " y " + disponible;
    }

}
