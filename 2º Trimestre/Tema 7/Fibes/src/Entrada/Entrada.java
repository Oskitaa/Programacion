/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrada;

import Enum.Entradas;
import Utils.Utils;
/**
 *
 * @author ese_b
 */
public class Entrada {

    public static int numaum = 0;

    private int codigo,
            numero_entrada;

    private String tipo, nif;

    public Entrada() {
        this.codigo = 1;
        this.tipo = "";
        numero_entrada = ++numaum;
    }

    @Override
    public String toString() {
        return "Entrada{" + "codigo=" + codigo + ", numero_entrada=" + numero_entrada + ", tipo=" + tipo + '}';
    }
    
    

    //getters y setter
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumero_entrada() {
        return numero_entrada;
    }

    public void setNumero_entrada(int numero_entrada) {
        this.numero_entrada = numero_entrada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

}
