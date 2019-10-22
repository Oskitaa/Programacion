/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciontema3;

import java.util.Scanner;

/**
 *
 * @author ese_b
 */
public class Ejercicios {

    Scanner s = new Scanner(System.in);

    public void ejercicio1() {

        System.out.println(".- Escribir un programa que detecte si un número introducido desde teclado es positivo o negativo");

        int num = s.nextInt();

        if (num > 0) {
            System.out.println("Es positivo");
        } else if (num < 0) {
            System.out.println("Es negativo");
        } else {
            System.out.println("O no es positivo ni negativo");
        }
        

    }

    public void ejercicio2() {

        System.out.println("Escribir un programa que detecte si un número leído desde el teclado es mayor o menor que 100.");

        int num = s.nextInt();

        if (num > 100) {
            System.out.println("Es mayor que 100");
        } else if (num < 100) {
            System.out.println("Es menor que 100");

        } else {
            System.out.println("Es 100");
        }

    }

    public void ejercicio3() {
    }

    public void ejercicio4() {
    }

    public void ejercicio5() {
    }

    public void ejercicio6() {
    }

    public void ejercicio7() {
    }

    public void ejercicio8() {
    }

    public void ejercicio9() {
    }

    public void ejercicio10() {
    }

    public void ejercicio11() {
    }

    public void ejercicio12() {
    }

    public void ejercicio13() {
    }

    public void ejercicio14() {
    }

}
