/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro;

/**
 *
 * @author ese_b
 */
public class Libro {

    private String nombre, isbn, autor;
    private int num_pag;

    public Libro() {
        this.nombre = "";
        this.isbn = "";
        this.autor = "";
        this.num_pag = 0;
    }

    public Libro(String nombre, String isbn, String autor, int num_pag) {
        this.nombre = nombre;
        this.isbn = isbn;
        this.autor = autor;
        this.num_pag = num_pag;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNum_pag() {
        return num_pag;
    }

    public void setNum_pag(int num_pag) {
        this.num_pag = num_pag;
    }

    @Override
    public String toString() {
        return getNombre() + " es de " + getAutor() + " su ISBN es " + getIsbn() + " y tiene " + getNum_pag() + " paginas.";
    }

    
    
}
