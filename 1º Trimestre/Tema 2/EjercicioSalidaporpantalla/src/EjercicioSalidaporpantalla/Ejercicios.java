package EjercicioSalidaporpantalla;

/**
 *
 * @author ese_b
 */
public class Ejercicios {
    //paleta de colores 

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public void ejercicio1() {

        System.out.println("Óscar");

    }

    public void ejercicio2() {

        System.out.println("Óscar \nC/Lobo, 19 \n647837478");

    }

    public void ejercicio3() {

        System.out.println("Hello \tHola");
        System.out.println("Bye \tAdiós");
        System.out.println("Cat \tGato");
        System.out.println("Dog \tPerro");
        System.out.println("Bear \tOso");
        System.out.println("Rat \tRata");
        System.out.println("Bird \tPájaro");
        System.out.println("Snake \tSerpiente");
        System.out.println("Duck \tPato");
        System.out.println("Animals \tAnimales");
    }

    public void ejercicio4() {
        System.out.println("Horario \tLunes \tMartes \tMiercoles");
        System.out.println("4:10-5:10 \tProg" + "" + " \tProg");
        System.out.println("5:10-6:10 \tProg \tProg \tProg");
        System.out.println("6:10-7:10 \t \tProg \tProg");
        System.out.println("7:30-8:30 \t \tDaw");
        System.out.println("8:30-9:30 \t \tDaw");
    }

    public void ejercicio5() {

        System.out.println(ANSI_RED + "Horario \tLunes \tMartes \tMiercoles");
        System.out.println("4:10-5:10 " + ANSI_GREEN + "" + "\tProg \tProg");
        System.out.println(ANSI_RED + "5:10-6:10" + ANSI_GREEN + "\tProg \tProg \tProg");
        System.out.println(ANSI_RED + "6:10-7:10" + ANSI_GREEN + " \t \tProg \tProg");
        System.out.println(ANSI_RED + "7:30-8:30" + ANSI_BLUE + " \t \tDaw");
        System.out.println(ANSI_RED + "8:30-9:30" + ANSI_BLUE + " \t \tDaw");

    }

    public void ejercicio6() {

        System.out.println("    *");
        System.out.println("   ***");
        System.out.println("  *****");
        System.out.println(" *******");
        System.out.println("*********");

    }
    
      public void ejercicio7() {

        System.out.println("    *");
        System.out.println("   * *");
        System.out.println("  *   *");
        System.out.println(" *     *");
        System.out.println("*********");

    }

}
