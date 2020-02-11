package Utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Andrés Carmona
 */

public class Utils {

    public static void clearScreen() throws AWTException {

        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);
            robot.delay(300);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_L);
        } catch (AWTException a) {
            a.printStackTrace();
        }

    }

    public static double getDouble() throws InputMismatchException {
        do {
            try {
                Scanner gd = new Scanner(System.in);
                return gd.nextDouble();
            } catch (InputMismatchException ex) {
                System.out.print("El valor introducido no es correcto\nEjemplo: 12.2 o 349.59. Vuelve a intentarlo: ");
            }
        } while (true);
    }

    public static int getInt() {
        do {
            try {
                Scanner gi = new Scanner(System.in);
                return gi.nextInt();
            } catch (InputMismatchException ex) {
                System.out.print("El valor introducido no es correcto, prueba a poner numeros enteros.\nEjemplo: 3 o 4, vuelve a intentarlo: ");
            }
        } while (true);

    }

    public static String getString() {
        do {
            try {
                Scanner gs = new Scanner(System.in);
                return gs.nextLine();
            } catch (InputMismatchException e) {
                
            }
        } while (true);
    }

    public static boolean getBoolean() {
        do {
            try {
                Scanner gb = new Scanner(System.in);
                return gb.nextBoolean();
            } catch (InputMismatchException e) {
                System.out.print("El valor introducido no corresponde con el tipo de variable Boolean, vuelve a intentarlo: ");
            }
        } while (true);

    }

    public static float getFloat() {
        do {
            try {
                Scanner gf = new Scanner(System.in);
                return gf.nextFloat();
            } catch (InputMismatchException e) {
                System.out.print("El valor introducido no corresponde con el tipo de variable Float, vuelve a intentarlo: ");
            }
        } while (true);

    }

    public static long getLong() {
        do {
            try {
                Scanner gl = new Scanner(System.in);
                return gl.nextLong();
            } catch (InputMismatchException e) {
                System.out.print("El valor introducido no corresponde con el tipo de variable Long, vuelve a intentarlo: ");
            }
        } while (true);
    }

    public short getShort() {
        do {
            try {
                Scanner gs = new Scanner(System.in);
                return gs.nextShort();
            } catch (InputMismatchException e) {
                System.out.print("El valor introducido no corresponde con el tipo de variable Short, vuelve a intentarlo: ");
            }
        } while (true);
    }

    public static byte getByte() {
        do {
            try {
                Scanner gby = new Scanner(System.in);
                return gby.nextByte();
            } catch (InputMismatchException e) {
                System.out.print("El valor introducido no corresponde con el tipo de variable Byte, vuelve a intentarlo: ");
            }
        } while (true);
    }
    
    public static String toString(String msg){
        return msg;
    }
}