/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Scanner;

/**
 *
 * @author ese_b
 */
public class Punto {

    protected int x;
    protected int y;

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void capturarPunto() {
        Scanner s = new Scanner(System.in);

        System.out.println("Inserta el punto X: ");
        setX(s.nextInt());
        System.out.println("Inserta el punto Y: ");
        setY(s.nextInt());
    }

    public void imprimirPunto() {
        System.out.println("El punto X esta en " + getX());
        System.out.println("El punto Y esta en " + getY());
    }
}
