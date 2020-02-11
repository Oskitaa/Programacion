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
public class Empleado {

    protected LocalTime horaEntrada;
    protected LocalTime horaSalida;
    
    Utils uts = new Utils();

    public Empleado() {
        this.horaEntrada = LocalTime.of(8, 0, 0);
        this.horaSalida = LocalTime.of(16, 0, 0);
    }

    public Empleado(LocalTime horaEntrada, LocalTime horaSalida) {
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
    
    public LocalTime capturarHora (){
    
        int hora = 0,
            minutos = 0,
            segundos = 0;
        try{
        System.out.println("Introduce las horas");
        hora = uts.getInt();
        
        System.out.println("Introduce los minutos");
        minutos = uts.getInt();
        
        System.out.println("Introduce los segundos");
        segundos = uts.getInt();
        }
        catch (DateTimeException e){
            System.out.println("Inroduce una hora correcata.");
            uts.next();
        }
    return LocalTime.of(hora,minutos,segundos); 
   }
    

}
