/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Utils.Utils;

/**
 *
 * @author ese_b
 */
public class Punto {

    protected int x, y;

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

    public void capturar() {
        Utils uts = new Utils();

        System.out.println("Introduzca un valor par X: ");
        setX(uts.getInt());
        System.out.println("Introduzca un valor par Y: ");
        setY(uts.getInt());

    }

    public void cuadrante() {

        int cuadrante;

        cuadrante = (x < 0 && y > 0) ? 1
                : (x > 0 && y > 0) ? 2
                : (x > 0 && y < 0) ? 3 
                : (x < 0 && y < 0) ? 4: 0;
                    
        if (cuadrante == 0) {
            System.out.println("Prueba otros puntos");}
        else System.out.println("El centro esta en el cuandrate " + cuadrante);
        

    }

    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }

}
