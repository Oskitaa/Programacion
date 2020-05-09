/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen;

import Utils.Utils;
import Enum.enumPuesto;
import Tienda.*;
import java.util.ArrayList;

/**
 *
 * @author ese_b
 */
public class MercaSevilla {

    private ArrayList<Venta> ventas;

    public MercaSevilla() {
        this.ventas = new ArrayList<>();
        ventas.add(new Venta());
    }

    public void mostrarProductosClientes() {
        String dni, aux;
        int opc = 0;
        for (Venta va : ventas) {
            System.out.println(va.getClientes().getDni());
        }

        do {
            System.out.println("Introduce el dni: ");
            dni = Utils.getString();
        } while (!Utils.comprobarDni(dni));
        aux = dni;
        mostrarComercios();

        do {
            System.out.println("Introduce el numero de puesto a elegir");
            opc = Utils.getInt();
        } while (opc <= 0 || opc > enumPuesto.values().length);
        
        enumPuesto p = enumPuesto.values()[--opc];
        
        ventas.stream()
                .filter(v -> v.getClientes().getDni().equals(aux) && v.getPuestos().name().equals(p.name()))
                .forEachOrdered((v) -> {System.out.println(v.toString());});
    }

    private void mostrarComercios() {

        for (enumPuesto ep : enumPuesto.values()) {
            System.out.println(ep.toString());
        }

    }

}
