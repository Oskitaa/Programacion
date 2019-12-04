/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetes;

import Utilidades.mates.Potenciar;
import Utilidades.mates.Sumar;
import Utils.Utils;

/**
 *
 * @author ese_b
 */
public class Paquetes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Potenciar poten = new Potenciar();
        Sumar sum = new Sumar();
        int opc = 0;
        do {
            System.out.println("Introduce la opcion que desee:\n0.Salir \n1.Potenciar \n2.Sumar");
            opc = Utils.getInt();

            switch (opc) {
                case 0:
                    System.out.println("Adiós!!!");
                    break;
                case 1:
                    System.out.println("introduzca a continuación dos numeros, base y potencia:");
                    System.out.println("Base: ");
                    int numbase = Utils.getInt();
                    System.out.println("Potencia: ");
                    int numpoten = Utils.getInt();
                    int resultpoten = poten.potenciar(numbase, numpoten);
                    System.out.println(resultpoten);
                    break;
                case 2:
                    System.out.println("introduzca a continuación dos numeros, base y potencia:");
                    System.out.println("Base: ");
                    int num1 = Utils.getInt();
                    System.out.println("Potencia: ");
                    int num2 = Utils.getInt();
                    int resultsuma = sum.sumar(num1, num2);
                    System.out.println(resultsuma);
                    break;
                default:
                    System.out.println("Introduce solo numeros entre 0 y 3");
            }
        } while (opc != 0);

    }

}
