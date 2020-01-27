/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*Crear una clase Empleado que modele la información que una empresa
mantiene sobre cada empleado: N¡ tipo (porcentaje) de IRPF, casado o no y número de hijos. La clase
debe contemplar accedentes y mutadores para todos los atributos. Al crear los objetos se
podrá proporcionar, si se quiere, el número de DNI. Los demás servicios que deberán
proporcionar los objetos de la clase serán los siguientes:*/
package empleado;

/**
 *
 * @author ese_b
 */
public class Empleado {

    private String nif;
    private double sueldo_base, pago_hextra;
    private int num_hijos, num_hextra;
    private boolean iscasado;

    private final static int IRPF = 21;

    public Empleado() {
        this.nif = "";
        this.sueldo_base = 0;
        this.pago_hextra = 0;
        this.num_hijos = 0;
        this.num_hextra = 0;
        this.iscasado = false;
    }

    public Empleado(String nif, double sueldo_base, double pago_hextra, int num_hijos, int num_hextra, boolean iscasado) {
        this.nif = nif;
        this.sueldo_base = sueldo_base;
        this.pago_hextra = pago_hextra;
        this.num_hijos = num_hijos;
        this.num_hextra = num_hextra;
        this.iscasado = iscasado;
    }

    public Empleado(Empleado e) {
        this.nif = e.nif;
        this.sueldo_base = e.sueldo_base;
        this.pago_hextra = e.pago_hextra;
        this.num_hijos = e.num_hijos;
        this.num_hextra = e.num_hextra;
        this.iscasado = e.iscasado;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public double getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(double sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public double getPago_hextra() {
        return pago_hextra;
    }

    public void setPago_hextra(double pago_hextra) {
        this.pago_hextra = pago_hextra;
    }

    public int getNum_hijos() {
        return num_hijos;
    }

    public void setNum_hijos(int num_hijos) {
        this.num_hijos = num_hijos;
    }

    public int getNum_hextra() {
        return num_hextra;
    }

    public void setNum_hextra(int num_hextra) {
        this.num_hextra = num_hextra;
    }

    public boolean isCasado() {
        return iscasado;
    }

    public void setCasado(boolean casado) {
        this.iscasado = casado;
    }

    /**
     * Cálculo y devolución del complemento correspondiente a las horas extra
     * realizadas.
     *
     * @return
     */
    public double calcularHorasExtras() {
        return num_hextra * pago_hextra;
    }

    /**
     * Cálculo y devolucion del sueldo bruto
     *
     * @return
     */
    public double sueldoBruto() {
        return sueldo_base + calcularHorasExtras();
    }

    public double calculoIRPF() {

        double irpf = IRPF;

        if (iscasado) {
            irpf -= 2;
        }

        if (num_hijos > 0) {
            irpf -= num_hijos;
        }

        return sueldoBruto() * (irpf/100);
    }

    public double saldoNeto() {
        return sueldoBruto() - calculoIRPF() ;
    }

    public void println() {
        
        String casado;
        
        if (iscasado) {
            casado = "está casado";
}   else    casado =  "no está casado";
        
        System.out.println("Nif empleado: " + getNif() + ", "+casado+" tiene "+num_hijos);
    }
    
    public void printAll() {
        
        String casado;
        
        if (iscasado) {
            casado = "está casado";
}   else    casado =  "no está casado";
        
        System.out.println("Nif empleado: " + getNif() + ", "+casado+" tiene "+num_hijos+", complemento horas extras "+calcularHorasExtras()+", cobra "+sueldoBruto()+"€ sueldo bruto, "+calculoIRPF()+" irpf y "+saldoNeto()+"€.");
    }

}
