/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Alumno.Alumno;

/**
 *
 * @author ese_b
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Alumno alum[];
        alum = new Alumno[3];

        for (int i = 0; i < alum.length; i++) {
            alum[i] = new Alumno();
        }

        for (Alumno o : alum) {
            o.capturar();
        }

        for (Alumno o : alum) {
            System.out.println(o.toString());
        }

    }

}
