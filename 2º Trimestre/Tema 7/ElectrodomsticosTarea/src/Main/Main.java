/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Electrodomestico.Electrodomestico;
import Electrodomestico.Tipos.*;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ese_b
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Electrodomestico> electro = new ArrayList<Electrodomestico>(10);
        
        double Elecsum = 0,
                Lavasum = 0,
                Telesum = 0;

        electro.add(new Electrodomestico());
        electro.add(new Electrodomestico(160, 30));
        electro.add(new Electrodomestico(200, "rosa", 'A', 50));
        electro.add(new Lavadora());
        electro.add(new Lavadora(100, 50));
        electro.add(new Lavadora(50, 500, "negro", 'A', 100));
        electro.add(new Television());
        electro.add(new Television(60, 500));
        electro.add(new Television(65, true, 520, "rojo", 'b', 40));
        
        Iterator<Electrodomestico> itel = electro.iterator();
        
        //Hago el precio final de todas las posiciones del array, debido a que tenia un problema a la hora de sumar el total de los electrodomestico.
        while(itel.hasNext()){
            itel.next().precioFinal();
        }

        //Sumo directamente el precio_base (que ya no seria el base si no el final) a la suma total de los electrodomesticos,por que si ponia que 
        //se hiciera aqui el precio final cuando se metia en electrodomestico se valia mas puesto que el precio_base habia sido modificado.
        for (Electrodomestico e : electro) {

            if (e instanceof Lavadora) {
                Lavasum += e.getPrecio_base();
            }

            if (e instanceof Television) {
                Telesum +=e.getPrecio_base();
            }

            if (e instanceof Electrodomestico) {
                Elecsum += e.getPrecio_base();
            }

        }

        System.out.println("Todos los electrodomesticos suman: " + Elecsum + "€.");
        System.out.println("Todos las lavadoras suman: " + Lavasum + "€.");
        System.out.println("Todos los televisores suman: " + Telesum + "€.");

    }

}
