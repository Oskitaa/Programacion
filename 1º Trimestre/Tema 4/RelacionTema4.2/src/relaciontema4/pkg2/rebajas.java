/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciontema4.pkg2;

import java.util.Scanner;

/**
 *
 * @author ese_b
 */
public class rebajas {
    
    private double precioOrignal;
    private double precioRebajado;
    
     public double descrubePorcentaje(double precioOriginal, double precioRebajado){
     
     double result = ((precioOrignal/precioRebajado)-1)*100;
     
     System.out.println("El porcentaje de rebaja es "+result+"%.");
         
         return result;
     }
    
     public void pedirDatos(){
         try {


         Scanner s = new Scanner(System.in);
         
         System.out.println("A continuacon introduce el precio original y el rebajado para saber cual es el porcentaje de descuento:");
         System.out.println("Introduce el precio original: ");
         precioOrignal = s.nextDouble();
         System.out.println("Introduce el precio rebajado: ");
         precioRebajado=s.nextDouble();
         descrubePorcentaje(precioOrignal, precioRebajado);
     }catch (Exception e) {
     System.out.println("Introduce numeros solos");
     }
     }  
     
     
}
