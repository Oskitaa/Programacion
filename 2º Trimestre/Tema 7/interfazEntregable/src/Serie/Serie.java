/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serie;
import interfaz.Entregable;
import Utils.Utils;
/**
 *
 * @author ese_b
 */
public class Serie implements Entregable{
    
    private String titulo, genero, creador;
    private int num_temp;
    private boolean entregado;

    public Serie() {
        this.titulo = "";
        this.genero = "";
        this.creador = "";
        this.num_temp = 3;
        this.entregado = false;
    }
    
    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.genero = "";
        this.creador = creador;
        this.num_temp = 3;
        this.entregado = false;
    }
    
    public Serie(String titulo,String genero, String creador, int num_temp) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.num_temp = num_temp;
        this.entregado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getNum_temp() {
        return num_temp;
    }

    public void setNum_temp(int num_temp) {
        this.num_temp = num_temp;
    }
    
    @Override
    public boolean isEntregado() {
        return entregado;
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public void compareTo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void captura(){
        
        System.out.println("Introduce el nombre de la serie: ");
        setTitulo(Utils.getString());
        System.out.println("Introduce el genero: ");
        setGenero(Utils.getString());
        System.out.println("Introduce el numero de temporadas: ");
        setNum_temp(Utils.getInt());
        System.out.println("Introduce el creador: ");
        setCreador(Utils.getString());
        
    }

    @Override
    public String toString() {
        return "Serie{" + "titulo=" + titulo + ", genero=" + genero + ", creador=" + creador + ", num_temp=" + num_temp + ", entregado=" + entregado + '}';
    }
    
    
    
    
}
