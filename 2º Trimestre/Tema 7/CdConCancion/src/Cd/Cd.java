/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cd;

/**
 *
 * @author ese_b
 */
public class Cd {

    static final int SIZE = 5;

    private Cancion cancion[];
    static int contador;

    public Cd() {
        this.cancion = new Cancion[SIZE];
    }

    public void numeroCanciones() {
        System.out.println("El numero de canciones actuales es " + (contador));

        for (int j = 0; j < cancion.length; j++) {
            if (cancion[j] != null) {
                System.out.println((j + 1) + ". " + cancion[j].toString());

            }
        }

    }

    public void dameCancion(int a) {
        if (a > 0) {
            a--;
            if (cancion[a] != null) {
                System.out.println(cancion[a].toString());
            } else {
                System.out.println("No hay cancion en esa posicion.");
            }
        }
    }

    public void grabaCancion(int i, Cancion can) {
        if (i > 0) {
            i--;
            if (cancion[i] != null) {
                can.capturar();
                cancion[i] = can;
            } else {
                System.out.println("No hay nada en esa posicion.");
            }
        }
    }

    public void agrega(Cancion canc) {

        if (contador < SIZE) {
            for (int i = 0; i < cancion.length; i++) {

                if (cancion[i] == null) {
                    canc = new Cancion();
                    canc.capturar();
                    this.cancion[i] = canc;
                    System.out.println("Canción agregada.");
                    contador++;
                    break;
                }
            }

        } else {
            System.out.println("CD completo.");
        }

    }

    public void elimina(int i) {
        if (i > 0) {
            i--;
            if (cancion[i] != null) {
                cancion[i] = null;
                contador--;
                System.out.println("Cancion eliminada");
            } else {
                System.out.println("Error. No hay cancion en esa posicion.");
            }

        }
    }
}
