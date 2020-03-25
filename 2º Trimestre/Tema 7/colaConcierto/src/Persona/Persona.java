/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import Utils.Utils;
import java.util.StringTokenizer;

/**
 *
 * @author ese_b
 */
public class Persona {
    
    private static int num_entrada;
    
    private String nombre, apellidos, dni;
    private int entradas;
    
    public Persona() {
        this.nombre = "";
        this.apellidos = "";
        this.dni = "";
        this.entradas = ++num_entrada;
    }
    
    public Persona(String nombre, String apellidos, String dni, int numero_entrada) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.entradas = ++num_entrada;
    }
    
    public Persona(Persona p) {
        this.nombre = p.nombre;
        this.apellidos = p.apellidos;
        this.dni = p.dni;
        this.entradas = ++num_entrada;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public String getDni() {
        return dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNum_entrada() {
        return num_entrada;
    }
    
    
    
    public void capturar() {
        
        StringTokenizer token;
        String aux;
        
        System.out.println("Introduce el nombre: ");
        setNombre(Utils.getString());
        System.out.println("Introduce tus apellidos: ");
        aux = Utils.getString();
        token = new StringTokenizer(aux);
        setApellidos(token.nextToken());
        System.out.println("Introduce tu dni: ");
        setDni(Utils.getString());
        
    }
    
    
    
    
    
}
