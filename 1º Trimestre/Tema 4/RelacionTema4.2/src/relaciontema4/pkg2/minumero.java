/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciontema4.pkg2;

import java.util.Scanner;

/**
 *
 * @author ese_b
 */
public class minumero {

    private int num1;
    private int num2;
    private int num3;

    minumero(int numero) {
        this.num1 = numero;
        this.num2 = numero;
        this.num3 = numero;
    }

    public int doble() {
        num1 *= 2;
        return num1;
    }

    public int triple() {
        num2 *= 3;
        return num2;
    }

    public int cuadruple() {
        num3 *= 4;
        return num3;
    }
    
    public void mostrarDatos(){
    
    System.out.println("El doble es "+doble());
    System.out.println("El tiple es "+triple());
    System.out.println("El cuadruple es "+cuadruple());
}}
