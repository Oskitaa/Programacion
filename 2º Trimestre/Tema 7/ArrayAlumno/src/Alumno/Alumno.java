/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumno;
import Utils.Utils;
/**
 *
 * @author ese_b
 */
public class Alumno {
    
    //Atributos

    private String nombre;
    private int nota;

    //Constructores
    
    public Alumno() {
        this.nombre = "";
        this.nota = 0;
    }

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public Alumno(Alumno alum) {
        this.nombre = alum.nombre;
        this.nota = alum.nota;
    }
    
    //Getters y setters
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    //Metodos
    
    /**
     * Metodo que lee los datos.
     */
  
    public void capturar(){
        
        System.out.println("Introduce el nombre del alumno: ");
        setNombre(Utils.getString());
        System.out.println("Introduce la nota");
        setNota(Utils.getInt());
        
    }

    /**
     * Metodo que muestra la informacion del objeto.
     * @return 
     */
    @Override
    public String toString() {
        return nombre+" ha sacado un "+nota;
    }
    
    

}
