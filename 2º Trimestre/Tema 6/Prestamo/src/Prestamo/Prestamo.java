/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prestamo;

import java.time.LocalDate;
import Utils.Utils;

/**
 *
 * @author ese_b
 */
public class Prestamo extends Persona {

    //Atributos
    private int numPrestamo;
    private Persona solicitante;
    private double valor;
    private LocalDate fechaEntrega,
            fechaAutorizacion,
            fechaPago;

    //Constructores
    public Prestamo() {
        this.numPrestamo = 0;
        this.solicitante = new Persona();
        this.fechaEntrega = LocalDate.of(2020, 1, 1);
        this.fechaAutorizacion = LocalDate.of(2020, 6, 1);
        this.fechaPago = LocalDate.of(2020, 1, 20);
        this.valor = 0;
    }

    //Getters y setters
    public int getNumPrestamo() {
        return numPrestamo;
    }

    public void setNumPrestamo(int numPrestamo) {
        this.numPrestamo = numPrestamo;
    }

    public Persona getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Persona solicitante) {
        this.solicitante = solicitante;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public LocalDate getFechaAutorizacion() {
        return fechaAutorizacion;
    }

    public void setFechaAutorizacion(LocalDate fechaAutorizacion) {
        this.fechaAutorizacion = fechaAutorizacion;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    //Metodos
    public void capturar() {

        Utils uts = new Utils();

        System.out.print("Introduce el numero del prestamo: ");
        setNumPrestamo(uts.getInt());
        System.out.print("Introduce la cantidad del prestamo: ");
        setValor(uts.getDouble());

        do {
            System.out.println("Introduce la fecha de autorizacion: ");
            this.fechaAutorizacion = super.capturarFecha();
        } while (fechaAutorizacion.getDayOfMonth() >= 20);

        setFechaEntrega(getFechaAutorizacion().plusDays(7));

        setFechaPago(getFechaAutorizacion().plusDays(30));
    }

    @Override
    public String toString() {
        return "Prestamo{" + "numPrestamo=" + numPrestamo + ", solicitante=" + solicitante + ", valor=" + valor + ", fechaEntrega=" + fechaEntrega + ", fechaAutorizacion=" + fechaAutorizacion + ", fechaPago=" + fechaPago + '}';
    }

}
