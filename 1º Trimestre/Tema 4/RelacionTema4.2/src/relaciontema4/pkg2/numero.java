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
public class numero {

    private int numero;

    numero() {
        numero = 0;
    }

    numero(int numero) {
        this.numero = numero;
    }

    public int aniade(int numero) {

        this.numero += numero;
        return this.numero;
    }

    public int resta(int numero) {

        this.numero -= numero;
        return this.numero;
    }

    public int getDoble() {

        this.numero *= 2;
        return numero;
    }

    public int getTriple() {

        this.numero *= 3;
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void mostrarDatos() {

        Scanner s = new Scanner(System.in);
        int opc;
        do {
            int numintro;
            System.out.println("\n1.Sumar \n2.Restas \n3.x2 \n4.x2 \n5.Nuevo numero\n0.Salir");
            opc = s.nextInt();

            switch (opc) {
                case 0:
                    break;
                case 1:
                    System.out.println("Introduce la cantidad a sumer");
                    numintro = s.nextInt();
                    aniade(numintro);
                    System.out.println("Valor actual " + getNumero());
                    break;
                case 2:
                    System.out.println("Introduce la cantidad a restar");
                    numintro = s.nextInt();
                    resta(numintro);
                    System.out.println("Valor actual " + getNumero());

                    break;
                case 3:
                    getDoble();
                    System.out.println("Valor actual " + getNumero());

                    break;
                case 4:
                    getTriple();
                    System.out.println("Valor actual " + getNumero());
                    break;

                case 5:
                    numintro = s.nextInt();
                    setNumero(numintro);
                    System.out.println("Valor actual " + getNumero());
                default:
                    System.out.println("Solo numeros entre 0 y 3.");

            }

        } while (opc != 0);

    }
}
