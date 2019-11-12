/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciontema4.pkg2;

/**
 *
 * @author ese_b
 */
public class Coche2 {

    private String marca;
    private String modelo;

    Coche2() {
        this.marca = "Lamborghini";
        this.modelo = "Aurus";
    }

    Coche2(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    
}
