/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aparato;
import Utils.Utils;
/**
 *
 * @author ese_b
 */
public class TV extends Aparato {

    //Atributos
    private double tamanio;

    //Constructores
    public TV() {
        super();
        this.tamanio = 32;
    }

    public TV(double tamanio, double precio, int voltaje) {
        super(precio, voltaje);
        this.tamanio = tamanio;
    }

    //Getteres y setters
    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    //Metodos
    @Override
    public void capturar() {
        super.capturar();

        do {
            System.out.println("Introduce el tamanio de la television: ");
            setTamanio(Utils.getInt());
        } while (getTamanio() < 0);
    }

    @Override
    public void imprimir() {
        super.imprimir();

        System.out.println("Con un tamanio de "+getTamanio()+"pulgadas.");
    }

}
