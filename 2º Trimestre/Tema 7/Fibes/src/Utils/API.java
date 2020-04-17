/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Entrada.Entrada;
import Enum.Entradas;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ese_b
 */
public class API {

    HashMap<String, ArrayList<Entrada>> mapEntradas = new HashMap<String, ArrayList<Entrada>>();

    HashMap<Integer, Integer> tipoEntradas = new HashMap<Integer, Integer>();

    Entrada e = new Entrada();

    public API() {
        meterEnum();
    }

    //Metodos
    public void venderEntrada() {

        do {
            System.out.println("Introduce tu dni");
            e.setNif(Utils.getString());
        } while (!comprobarDni(e.getNif()));

        e.setCodigo(elegirCodigo());
        e.setTipo(elegirEntrada(e.getCodigo()));

        if (comprobarEntradas()) {

            if (mapEntradas.containsKey(e.getNif())) {
                ArrayList<Entrada> arrayentrada = mapEntradas.get(e.getNif());
                arrayentrada.add(new Entrada());
                degradarEntrada();
                mapEntradas.replace(e.getNif(), arrayentrada);
                System.out.println("Entrada comprada con exito!");
            } else {
                ArrayList<Entrada> arrayEntradas = new ArrayList<>();
                arrayEntradas.add(new Entrada());
                degradarEntrada();
                mapEntradas.put(e.getNif(), arrayEntradas);
                System.out.println("Entrada comprada con exito!");
            }
        } else {
            System.out.println("No hay entradas disponibles");
        }
    }

    public void anularEntrada() {
        if (mapEntradas.isEmpty()) {
            System.out.println("Venda entradas primero");
        } else {
            mostrarEntradasPersona();
        }
    }

    public void mostrarEntradasPersona() {
        if (!mapEntradas.isEmpty()) {

            Set allnif = new TreeSet(mapEntradas.keySet());
            String nif;

            System.out.println("NIF:" + allnif);
            do {
                System.out.println("Introduce tu dni");
                nif = Utils.getString();
            } while (!comprobarDni(nif));

            if (mapEntradas.containsKey(e.getNif())) {

                ArrayList<Entrada> tickets = mapEntradas.get(nif);

                for (Entrada a : tickets) {

                    System.out.println(a.toString());

                }

            } else {
                System.out.println("NIF no valido");
            }
        } else {
            System.out.println("Venda primero una entrada");
        }
    }

    public void mostrarCuantasQuedan() {

        tipoEntradas.forEach((key, valor) -> System.out.println("Tipo: " + Entradas.values()[--key].getTipo() + ": Value: " + valor));

    }

    //metodos auxiliares
    private int elegirCodigo() {

        int elegir = 0;

        do {

            System.out.println("Introduce el codigo de entrada. ");

            for (Entradas e : Entradas.values()) {

                System.out.println(e.getCodigo() + ". " + e.getTipo());

            }

            elegir = Utils.getInt();
            e.setCodigo(elegir);
        } while (!Entradas.stream().anyMatch(p -> p.getCodigo() == e.getCodigo()));

        return elegir;
    }

    private String elegirEntrada(int codigo) {
        return Entradas.values()[--codigo].getTipo();
    }

    private boolean comprobarEntradas() {
        return ((tipoEntradas.get(e.getCodigo()) > 0));
    }

    private boolean comprobarDni(String dni) {
        //Patron del dni, tiene que contener 8 numeros y una letra minuscula o mayuscula
        Pattern pat = Pattern.compile("[0-9]{8}[A-Z a-z]");
        Matcher mat = pat.matcher(dni);
        //Luego lo metemos en el match y si concide lo introducido con el patron devuelve true
        return mat.matches();
    }

    private void meterEnum() {

        for (Entradas a : Entradas.values()) {
            tipoEntradas.put(a.getCodigo(), a.getMaxima());
        }

    }

    private void degradarEntrada() {
        tipoEntradas.replace(e.getCodigo(), tipoEntradas.get(e.getCodigo()) - 1);
    }

}
