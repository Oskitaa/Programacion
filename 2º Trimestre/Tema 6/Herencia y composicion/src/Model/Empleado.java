/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Utils.Utils;
import java.time.DateTimeException;
import java.time.LocalTime;

/**
 *
 * @author ese_b
 */
public class Empleado extends Persona {

    protected LocalTime horaEntrada;
    protected LocalTime horaSalida;

    Utils uts = new Utils();

    public Empleado() {
        super();
        this.horaEntrada = LocalTime.of(0, 0, 0);
        this.horaSalida = LocalTime.of(0, 0, 0);
    }

    public Empleado(LocalTime horaEntrada, LocalTime horaSalida, int identidad, String nombreCompleto) {
        super(identidad, nombreCompleto);
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public void establecerEmpleado(LocalTime horaEntrada, LocalTime horaSalida) {
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public void capturarEmpleado() {
        if (horaEntrada.equals(horaSalida) || horaSalida.isAfter(horaEntrada)) {
            super.capturarPersona();
        }

        System.out.println("Introduce la hora de entrada:");
        setHoraEntrada(capturarHora());
        System.out.println("Introduce la hora de salida");
        setHoraSalida(capturarHora());

        if (horaSalida.isBefore(horaEntrada)) {
            System.out.println("Introduce una hora de entrada y salida correcta, no puedes salir antes de entrar.");
            capturarEmpleado();
        }
    }

    public LocalTime capturarHora() {

        int hora = 0,
                minutos = 0,
                segundos = 0;
        do {

            try {
                System.out.println("Introduce las horas");
                hora = uts.getInt();

                System.out.println("Introduce los minutos");
                minutos = uts.getInt();

                System.out.println("Introduce los segundos");
                segundos = uts.getInt();
                return LocalTime.of(hora, minutos, segundos);

            } catch (DateTimeException exception) {
                System.out.println("Inroduce una hora correcata.");
            }

        } while (true);

    }

    public boolean valida() {
        return getHoraEntrada().isAfter(getHoraSalida());
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + '}';
    }

}
