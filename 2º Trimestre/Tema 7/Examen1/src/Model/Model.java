/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import AlmacenEnum.enumAC;
import AlmacenEnum.enumLavadoras;
import Clientes.Clientes;
import Producto.*;
import java.util.ArrayList;
import Producto.Tipo.*;
import Utils.Utils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ese_b
 */
public class Model implements Serializable {

    private static final long serialVersionUID = 1382568558378521352L;

    Clientes cli;
    Producto po;
    HashMap<String, ArrayList<Producto>> haspro;

    public Model() {
        haspro = new HashMap<>();
        cli = new Clientes();
    }

    public void venderProducto() {

        mostrarProductos();

        do {
            cli.setDNI(Utils.getString("Introduce tu dni"));
        } while (!Utils.comprobarDni(cli.getDNI()));

        if (haspro.containsKey(cli.getDNI())) {
            ArrayList<Producto> arraypro = haspro.get(cli.getDNI());
            arraypro.add(po);
            haspro.replace(cli.getDNI(), arraypro);
            System.out.println("Venta exitosa");
        } else {
            cli.leerDatos();
            ArrayList<Producto> arraypro = new ArrayList<>();
            arraypro.add(po);
            haspro.put(cli.getDNI(), arraypro);
            System.out.println("Venta exitosa");
        }

    }

    public void mostrarProductos() {

        int opc;

        do {
            Utils.menu("Que desea comprar?", "1. Lavadora", "2. Aire acondicionado");
            opc = Utils.getInt();

        } while (opc < 1 || opc > 2);

        int c = 1;

        switch (opc) {
            case 1:

                String respuesta;
                boolean salir = false,
                 seca = false;
                int sum = 0;

                enumLavadoras lava = enumLavadoras.values()[elegirLavadora()];

                do {

                    respuesta = Utils.getString("Tiene secadora? Si o no");

                    if (respuesta.equalsIgnoreCase("si")) {
                        seca = true;
                        salir = true;
                        sum = 200;
                    } else if (respuesta.equalsIgnoreCase("no")) {
                        seca = false;
                        salir = true;

                    }
                } while (!salir);

                po = new Lavadora(lava.getCarga(), seca, lava.getPrecio() + sum, lava.getNombre());

                break;
            case 2:

                enumAC ac = enumAC.values()[elegirAire()];
                po = new AireAcondicionado(ac.getPotencia(), ac.getPrecio(), ac.getNombre());
                break;
        }

    }

    public void datosProducto() {
        if (haspro.isEmpty()) {
            System.out.println("No hay compras realizadas.");
        } else {

            int opc;

            do {
                Utils.menu("Que desea ver?", "1. Lavadora", "2. Aire acondicionado");
                opc = Utils.getInt();

            } while (opc < 1 || opc > 2);

            int c = 1;
            switch (opc) {
                case 1:
                    enumLavadoras lava = enumLavadoras.values()[elegirLavadora()];
                    Set allnif = new TreeSet(haspro.keySet());
                    ArrayList<String> listOfKeys = new ArrayList<>(allnif);

                    Iterator keys = listOfKeys.iterator();
                    for (int i = 0; i < haspro.size(); i++) {

                        String dni = keys.next().toString();

                        ArrayList<Producto> a = haspro.get(dni);

                        for (Producto b : a) {
                            if (b instanceof Lavadora && b.getProveedor().equalsIgnoreCase(lava.getNombre())) {
                                System.out.println("Este usuario " + dni + " ha comprado una lavadora " + lava.getNombre());
                                break;
                            }
                        }

                    }

                    break;
                case 2:
                    enumAC ac = enumAC.values()[elegirAire()];
                    Set allnif2 = new TreeSet(haspro.keySet());
                    ArrayList<String> listOfKeys2 = new ArrayList<>(allnif2);

                    Iterator keys2 = listOfKeys2.iterator();
                    for (int i = 0; i < haspro.size(); i++) {

                        String dni = keys2.next().toString();

                        ArrayList<Producto> a = haspro.get(dni);

                        for (Producto b : a) {
                            if (b instanceof AireAcondicionado && b.getProveedor().equalsIgnoreCase(ac.getNombre())) {
                                System.out.println("Este usuario " + dni + " ha comprado un aire " + ac.getNombre());
                                break;
                            }
                        }

                    }

                    break;

            }

        }

    }

    public void mostrarTotalPersona() {

        if (haspro.isEmpty()) {

            System.out.println("No hay compras realizadas.");

        } else {

            Set allnif = new TreeSet(haspro.keySet());
            String nif, respuesta, texto = "";
            double total = 0;
            System.out.println("NIF:" + allnif);
            do {
                nif = Utils.getString("Introduce tu dni");
            } while (!Utils.comprobarDni(nif));

            if (haspro.containsKey(nif)) {

                ArrayList<Producto> pro = haspro.get(nif);

                for (Producto a : pro) {

                    total += a.getPrecio();

                }

                texto = "La suma total del usuario " + nif + " es " + total + "€.";
                System.out.println(texto);

                respuesta = Utils.getString("Desea realizar una copia en txt? Introduzca si, cualquier otra cosa sera no.");
                if (respuesta.equalsIgnoreCase("si")) {
                    guardarDatos(nif, texto);
                }

            } else {
                System.out.println("No hay nadie con ese dni");
            }

        }
    }

    private int elegirLavadora() {
        int c = 1, opc;
        for (enumLavadoras a : enumLavadoras.values()) {
            System.out.println(c + ". " + a.getNombre());
            c++;
        }

        do {
            System.out.println("Selecciona una lavadora");
            opc = Utils.getInt();

        } while (opc < 1 || opc > enumLavadoras.values().length);

        return opc - 1;
    }

    private int elegirAire() {
        int c = 1, opc;
        for (enumAC b : enumAC.values()) {
            System.out.println(c + ". " + b.getNombre());
            c++;
        }
        do {
            System.out.println("Selecciona un aire acondicionado");
            opc = Utils.getInt();

        } while (opc < 1 || opc > enumAC.values().length);
        return opc - 1;
    }

    private void guardarDatos(String dni, String texto) {
        File arc = new File("Total " + dni + ".txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arc));) {
            bw.write(texto);
            bw.flush();
        } catch (IOException e) {
            System.out.println("Error de escritura.");
        }
    }
}
