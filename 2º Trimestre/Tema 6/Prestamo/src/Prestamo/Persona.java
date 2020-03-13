/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prestamo;

import Utils.Utils;
import java.time.DateTimeException;
import java.time.LocalDate;

/**
 *
 * @author ese_b
 */
public class Persona {

    //Atributos
    private LocalDate fechaNacimiento;
    private String identidad,
            primerApellido,
            primerNombre,
            segundoApellido,
            segundoNombre;
    private NumeroTelefonico telefonoCasa,
            telefonoMovil,
            telefonoOficina;

    //Constructores
    public Persona() {
        this.identidad = "";
        this.primerNombre = "";
        this.primerApellido = "";
        this.segundoApellido = "";
        this.segundoNombre = "";
        this.telefonoCasa = new NumeroTelefonico();
        this.telefonoMovil = new NumeroTelefonico();
        this.telefonoOficina = new NumeroTelefonico();
    }

    //Metodos
    //Metodo encargado de capturar los datos de la persona
    public void capturar() {
        Utils uts = new Utils();

        System.out.print("Identidad de la persona: ");
        this.identidad = uts.getString();
        System.out.print("Primer nombre de la persona: ");
        this.primerNombre = uts.getString();
        System.out.print("Primer apellido de la persona: ");
        this.primerApellido = uts.getString();
        System.out.print("Segundo apellido de la persona: ");
        this.segundoApellido = uts.getString();
        System.out.println("Introduce la fecha de nacimiento: ");
        fechaNacimiento = capturarFecha();
        System.out.println("Datos del numero de telefono movil: ");
        telefonoMovil.capturar();
        System.out.println("Datos del numero de telefono de casa: ");
        telefonoCasa.capturar();
    }

    public LocalDate capturarFecha() {
        Utils uts = new Utils();
        int year, month, day;
        do {
            try {
                System.out.print("Introduce el anio: ");
                year = uts.getInt();
                do {
                    System.out.print("Introduce el mes: ");
                    month = uts.getInt();
                } while (month < 1 || month > 12);
                System.out.print("Introduce el dia: ");
                day = uts.getInt();
                return LocalDate.of(year, month, day);
            } catch (DateTimeException ex) {
                System.out.println("Los datos introducidos para las fechas son incorrectos, por favor vuelve a intentarlo:");
            }
        } while (true);
    }

}
