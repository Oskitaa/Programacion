/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Scanner;
import Utils.Utils;

/**
 *
 * @author ese_b
 */
public class Circulo extends Punto {

    private double radio;

    public Circulo() {
        super();
        this.radio = 0;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void capturar() {
        Utils uts = new Utils();
        System.out.println("Introduzca el radio: ");
        setRadio(uts.getInt());
    }

    @Override
    public String toString() {
        return super.toString() + "Circulo{" + "radio=" + radio + '}';
    }

    public double obtieneArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double obtieneCircunferencia() {
        return 2 * Math.PI * radio;
    }

    public double obtieneDiametro() {
        return 2 * radio;
    }

}
