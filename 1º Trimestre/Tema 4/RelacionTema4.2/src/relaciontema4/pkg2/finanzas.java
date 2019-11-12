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
public class finanzas {

    private double eurodolar;
    private double euros;
    private double dolares;

    public finanzas() {
        eurodolar = 1.36;
    }

    public finanzas(double cambio) {
        eurodolar = cambio;
    }

    public double dolaresToeuros(double dolares) {
        euros = dolares * eurodolar;
        System.out.println(dolares+"$ son "+euros+"€");
        return euros;
    }

    public double eurosToDolares(double euros) {
        dolares = this.euros / eurodolar;
        System.out.println(euros+"€ son "+dolares+"$");
        return dolares;
    }

    public double getEurodolar() {
        return eurodolar;
    }

    public void pedirDatos() {
        Scanner s = new Scanner(System.in);
        int opc;
        do {

            System.out.println("Conversor eurodolar. \n1.Dolar a euro \n2.Euro a dolar \n0.Salir");
            opc = s.nextInt();

            switch (opc) {
                case 0:
                    break;
                case 1:
                    System.out.println("Introduce la cantidad de dolares a convertir. ");
                    dolares = s.nextDouble();
                    dolaresToeuros(dolares);
                    break;
                case 2:
                    System.out.println("Introduce la cantidad de euros a convertir: ");
                    euros = s.nextDouble();
                    eurosToDolares(euros);
                    break;
                default:
                    System.out.println("Solo numeros entre 0 y 3.");

            }

        } while (opc != 0);

    }

}
