/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto;

import java.time.LocalDate;

/**
 *
 * @author ese_b
 */
public class Producto {

    LocalDate date = LocalDate.now();

    protected int num_lote;
    protected LocalDate fecha_caduciad;

    public Producto() {
        this.num_lote = 0;
        this.fecha_caduciad = dateRandom();
    }

    public Producto(int num_lote) {
        this.num_lote = num_lote;
        this.fecha_caduciad = dateRandom();
    }

    public Producto(Producto p) {
        this.num_lote = p.num_lote;
        this.fecha_caduciad = p.dateRandom();
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getNum_lote() {
        return num_lote;
    }

    public void setNum_lote(int num_lote) {
        this.num_lote = num_lote;
    }

    public LocalDate getFecha_caduciad() {
        return fecha_caduciad;
    }

    public void setFecha_caduciad(LocalDate fecha_caduciad) {
        this.fecha_caduciad = fecha_caduciad;
    }

    public LocalDate dateRandom() {

        int randomyear;
        int randomday;
        randomyear = (int) (Math.random() * 5 + 1);
        randomday = (int) (Math.random() * 366);
        date = date.plusYears(randomyear).plusDays(randomday);

        return date;

    }

}
