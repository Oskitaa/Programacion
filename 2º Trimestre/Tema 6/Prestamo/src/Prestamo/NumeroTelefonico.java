/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prestamo;

import Utils.Utils;

/**
 *
 * @author ese_b
 */
public class NumeroTelefonico {

    //Atributos
    private String codigoArea,
            extension,
            intercambio,
            linea;

    //Constructores
    public NumeroTelefonico() {
        codigoArea = "";
        extension = "";
        intercambio = "";
        linea = "";
    }

    public NumeroTelefonico(String codigoArea, String extension, String intercambio, String linea) {
        this.codigoArea = codigoArea;
        this.extension = extension;
        this.intercambio = intercambio;
        this.linea = linea;
    }

    //Getter y setters
    public String getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getIntercambio() {
        return intercambio;
    }

    public void setIntercambio(String intercambio) {
        this.intercambio = intercambio;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    //Metodos
    public void capturar() {
        Utils uts = new Utils();
        System.out.println("Introduzca el codigo del area: ");
        setCodigoArea(uts.getString());
        System.out.println("Introduzca la extension: ");
        setExtension(uts.getString());
        System.out.println("Introduzca el intercambio: ");
        setIntercambio(uts.getString());
        System.out.println("Introduzca la linea: ");
        setLinea(uts.getString());
    }

    @Override
    public String toString() {
        return "numeroTelefonico{" + "codigoArea=" + codigoArea + ", extension=" + extension + ", intercambio=" + intercambio + ", linea=" + linea + '}';
    }

}
