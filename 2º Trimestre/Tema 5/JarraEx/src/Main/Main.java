/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Jarra.Jarra;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ese_b
 */
public class Main {

    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        int cantidada, cantidadb;
        
        try {
            
            System.out.println("Introduzca la cantidad de la jarra a: ");
            cantidada = s.nextInt();
            System.out.println("Introduzca la cantidad de la jarra b: ");
            cantidadb = s.nextInt();
            Jarra jarraA = new Jarra(10, cantidada);
            Jarra jarraB = new Jarra(10, cantidadb);
            jarraA.llena();
            jarraB.vacia();
            System.out.println("JA " + jarraA.toString());
            System.out.println("JB " + jarraB.toString());
            jarraB.llenaDesde(jarraA);
            jarraA.llena();
            jarraB.llenaDesde(jarraA);
            jarraB.vacia();
            jarraB.llenaDesde(jarraA);
            jarraA.llena();
            jarraB.llenaDesde(jarraA);
            System.out.println("JA " + jarraA.toString());
            System.out.println("JB " + jarraB.toString());
        } catch (InputMismatchException e) {
            System.out.println("Introduzca solo numeros");
        } catch (RuntimeException e) {
            System.out.println("Error parametros incorrectos");
        }
    }

}
