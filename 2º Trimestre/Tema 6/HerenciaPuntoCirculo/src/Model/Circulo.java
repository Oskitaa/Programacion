/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Scanner;

/**
 *
 * @author ese_b
 */
public class Circulo extends Punto {

    private double radio;
    
    public Circulo(){
        super();
        this.radio = 0;
    }

    public Circulo(double radio, int x, int y) {
        super(x, y);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void capturarCirculo(){
        Scanner s = new Scanner(System.in);
        super.capturarPunto();
        System.out.println("Introduce el radio del circulo: ");
        setRadio(s.nextInt());
    }
    
    public double obtieneArea(){
        return Math.PI*Math.pow(radio, 2);
    }
 
    public double obtieneCircunferencia(){
        return 2*Math.PI*radio;
    }
    
    public double obtieneDiametro(){
        return 2*radio;
    }
    
    public void imprime(){
        super.imprimirPunto();
        System.out.println("El area es: "+obtieneArea());
        System.out.println("La circunferencia es: "+obtieneCircunferencia());
        System.out.println("El diametro es: "+obtieneDiametro());
    }
}
 