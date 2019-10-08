/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalesifswitch;

import java.util.Scanner;

/**
 *
 * @author ese_b
 */
public class Ejercicios {

    Scanner s = new Scanner(System.in);

    public static final double GRAVEDAD = 9.81;

    public void ejercicio1() {

        String dia;

        System.out.println("A continuacion introduce un dia de la semana para saber que toca a primera hora ese dia.");

        dia = s.nextLine();

        switch (dia.toUpperCase()) {

            case "LUNES":
                System.out.println("A primera hora toca Programacion");
                break;
            case "MARTES":
                System.out.println("A primera hora toca Ingles");
                break;
            case "MIERCOLES":
                System.out.println("A primera hora toca Fol");
                break;
            case "JUEVES":
                System.out.println("A primera hora toca Sistemas");
                break;
            case "VIERNES":
                System.out.println("A primera hora toca Bases de datos");
                break;
            default:
                System.out.println("Introduce un dia entre el Lunes y el Viernes.");

        }

    }

    public void ejercicio2() {

        int hora;

        System.out.println("Introduce una hora.");
        hora = s.nextInt();

        if (hora >= 6 && hora <= 12) {

            System.out.println("Buenos días");
        }
        if (hora >= 13 && hora <= 20) {

            System.out.println("Buenos tardes");
        }
        if (hora >= 21 && hora <= 24 || hora >= 0 && hora <= 5) {

            System.out.println("Buenas noches");
        }
    }

    public void ejercicio3() {
        int num;
        System.out.println("Escribe un numero del 1 al 7");

        num = s.nextInt();

        switch (num) {

            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Introduces solo números del 1-7.");

        }
    }

    public void ejercicio4() {

        System.out.println("Introduce el numero de horas trabajas");

        int result, extra, horas = s.nextInt();

        if (horas <= 40) {

            result = horas * 12;
            System.out.println("Tu salario semanal es " + result);

        } else {

            result = 40 * 12;
            extra = (horas - 40) * 16 + result;
            System.out.println("Tu salario semanal es " + extra);
        }

    }

    public void ejercicio5() {
    }

    public void ejercicio6() {

        double tiempo, haltura;

        System.out.println("El programa calcula el tiempo que tarda un objeto en caer.");
        System.out.println("introudce la  altura: ");
        haltura = s.nextDouble();

        if (haltura <= 0) {

            System.out.println("El objeto esta en el suelo.");

        } else {

            tiempo = Math.sqrt(2 * haltura / GRAVEDAD);
            System.out.println("El tiempo que tarda en tocar el suelo es " + tiempo);
        }

    }

    public void ejercicio7() {

        double nota1, nota2, nota3, media;

        System.out.println("Introduce 3 notas para hacer la media: ");
        System.out.println("Nota 1:");
        nota1 = s.nextDouble();
        System.out.println("Nota 2:");
        nota2 = s.nextDouble();
        System.out.println("Nota 3:");
        nota3 = s.nextDouble();
        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Le media de las 3 notas es " + media);
    }

    public void ejercicio8() {

        double nota1, nota2, nota3, media;

        System.out.println("Introduce 3 notas para hacer la media: ");
        System.out.println("Nota 1:");
        nota1 = s.nextDouble();
        System.out.println("Nota 2:");
        nota2 = s.nextDouble();
        System.out.println("Nota 3:");
        nota3 = s.nextDouble();
        media = (nota1 + nota2 + nota3) / 3;
        
        if (media <5) System.out.println("Tu media es insuficiente "+media);
        else if ( media >=5 && media<6) System.out.println("Suficiente, tu media es "+media);
        else if ( media >=6 && media<7) System.out.println("Bien, tu media es "+media);
        else if ( media >=7 && media<9) System.out.println("Notable, tu media es "+media);
        else if ( media >=9 && media<=10) System.out.println("Sobresaliente, tu media es "+media);
         
    }

    public void ejercicio9() {
    }

    public void ejercicio10() {

        int mes, dia;
        String horoscopo = "";
        System.out.println("Horoscopo");
        System.out.println("Introduce mes:");
        mes = s.nextInt();
        System.out.println("introduce dia:");
        dia = s.nextInt();

        switch (mes) {

            case 1:
                if (dia < 21) {
                    horoscopo = "Capricornio";
                } else {
                    horoscopo = "Acuario";
                }
                break;
            case 2:
                if (dia < 20) {
                    horoscopo = "Acuario";
                } else {
                    horoscopo = "Piscis";
                }
                break;
            case 3:
                if (dia < 21) {
                    horoscopo = "Piscis";
                } else {
                    horoscopo = "Aries";
                }
                break;
            case 4:
                if (dia < 21) {
                    horoscopo = "Aries";
                } else {
                    horoscopo = "Tauro";
                }
                break;
            case 5:
                if (dia < 20) {
                    horoscopo = "Tauro";
                } else {
                    horoscopo = "Geminis";
                }
                break;
            case 6:
                if (dia < 22) {
                    horoscopo = "Geminis";
                } else {
                    horoscopo = "Cancer";
                }
                break;
            case 7:
                if (dia < 22) {
                    horoscopo = "Cancer";
                } else {
                    horoscopo = "Leo";
                }
                break;
            case 8:
                if (dia < 24) {
                    horoscopo = "Leo";
                } else {
                    horoscopo = "virgo";
                }
                break;
            case 9:
                if (dia < 23) {
                    horoscopo = "Virgo";
                } else {
                    horoscopo = "Libra";
                }
                break;
            case 10:
                if (dia < 23) {
                    horoscopo = "Libra";
                } else {
                    horoscopo = "Escorpio";
                }
                break;
            case 11:
                if (dia < 23) {
                    horoscopo = "Escorpio";
                } else {
                    horoscopo = "Sagitario";
                }
                break;
            case 12:
                if (dia < 21) {
                    horoscopo = "Sagitario";
                } else {
                    horoscopo = "Capricornio";
                }
                break;
            default:
                System.out.println("Introduce un mes entre 1-12");
                break;
        }

        System.out.println("Tu horoscopo es " + horoscopo);

    }

    public void ejercicio11() {

        int horas, minutos, segundos_hora, segundos_minutos, total;

        System.out.println("Introduce las horas y minutos y el programa devovlera el tiempo (en segundos)"
                + "que hay hasta medianoche.");
        System.out.println("Introduce las horas;");
        horas = s.nextInt();
        System.out.println("Introduce los minutos:");
        minutos = s.nextInt();

    }

    public void ejercicio12() {
        int puntos = 0;
        String respuesta;
        System.out.println("Minicuestionario de 10 preguntas.");

        System.out.println("1.¿Que es java?\nA.Lenguaje de programacion \nB.Un animal \nC.Un movil");

        respuesta = s.nextLine();

        if (respuesta.toUpperCase().equals("A")) {
            puntos++;

        }
        System.out.println("2.¿Con que tipo de variable pondrias un texto?\nA.String \nB.int \nC.double");

        respuesta = s.nextLine();

        if (respuesta.toUpperCase().equals("A")) {
            puntos++;

        }
        System.out.println("3. ¿?");

        respuesta = s.nextLine();

        if (respuesta.toUpperCase().equals("C")) {
            puntos++;

        }
        System.out.println("4. ¿?");

        respuesta = s.nextLine();

        if (respuesta.toUpperCase().equals("B")) {
            puntos++;

        }
        System.out.println("5. ¿?");

        respuesta = s.nextLine();

        if (respuesta.toUpperCase().equals("A")) {
            puntos++;

        }
        System.out.println("6. ¿?");

        respuesta = s.nextLine();

        if (respuesta.toUpperCase().equals("B")) {
            puntos++;

        }
        System.out.println("7. ¿?");

        respuesta = s.nextLine();

        if (respuesta.toUpperCase().equals("B")) {
            puntos++;

        }
        System.out.println("8. ¿?");

        respuesta = s.nextLine();

        if (respuesta.toUpperCase().equals("C")) {
            puntos++;

        }
        System.out.println("9. ¿?");

        respuesta = s.nextLine();

        if (respuesta.toUpperCase().equals("A")) {
            puntos++;

        }
        System.out.println("10. ¿?");

        respuesta = s.nextLine();

        if (respuesta.toUpperCase().equals("B")) {
            puntos++;

        }
        System.out.println("Hsa sacado un " + puntos);

    }

    public void ejercicio13() {

        int num1, num2, num3;

        System.out.println("Introduce 3 numeros y el preograma los ordenara de mayor a menos.");

        System.out.println("1");
        num1 = s.nextInt();
        System.out.println("2");
        num2 = s.nextInt();
        System.out.println("3");
        num3 = s.nextInt();

        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                System.out.println(num1 + "" + num2 + "" + num3);
            } else {
                System.out.println(num1 + "" + num3 + "" + num2);
            }

        }
        if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                System.out.println(num2 + "" + num1 + "" + num3);
            } else {
                System.out.println(num2 + "" + num3 + "" + num1);
            }

        }
        if (num3 > num1 && num3 > num2) {
            if (num1 > num2) {
                System.out.println(num3 + "" + num1 + "" + num2);
            } else {
                System.out.println(num3 + "" + num2 + "" + num1);
            }

        }

    }

    public void ejercicio14() {

        int num;

        System.out.println("Programa que diga si un número introducido por teclado es par"
                + " y/o divisible entre 5.");

        num = s.nextInt();

        if (num % 2 == 0) {

            if (num % 5 == 0) {
                System.out.println("El numero es par y divisible entre 5");
            } else {
                System.out.println("El numero es par pero no divisible entre 5");
            }

        } else if (num % 5 == 0 && num % 2 != 0) {
            System.out.println("EL  numero es divisible entre 5 y es impar");
        }

    }

    public void ejercicio15() {

        System.out.println("El programa hara una piramide con el simbolo que usted elija.");
        int opcion;
        String a;
        System.out.println("Elija hacia que lado quiere la piramide: ");

        System.out.println("Ahora elija el simbolo:");
        a = s.nextLine();
        System.out.println("1.Arriba \n2.Abajo \n3.Derecha \n4.Izquierda");
        opcion = s.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("  " + a);
                System.out.println(" " + a + a + a);
                System.out.println(a + a + a + a + a);
                break;
            case 2:
                System.out.println(a + a + a + a + a);
                System.out.println(" " + a + a + a);
                System.out.println("  " + a);
                break;
            case 3:
                System.out.println("    " + a);
                System.out.println("  " + a + " " + a);
                System.out.println(a + " " + a + " " + a);
                System.out.println("  " + a + " " + a);
                System.out.println("    " + a);
                break;
            case 4:
                System.out.println(a);
                System.out.println(a + " " + a);
                System.out.println(a + " " + a + " " + a);
                System.out.println(a + " " + a);
                System.out.println(a);
                break;
            default:
        }

    }

    public void ejercicio16() {

        String respuesta;
        int puntos = 0;

        System.out.println("El programa que nos diga si hay probabilidad de que nuestra pareja nos está siendo infiel.");

        System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.\nSi o no: ");
        respuesta = s.nextLine();
        if (respuesta.toUpperCase().equals("SI")) {
            puntos += 3;
        }

        System.out.print("2. Ha aumentado sus gastos de vestuario.\nSi o no: ");
        respuesta = s.nextLine();
        if (respuesta.equals("v")) {
            puntos += 3;
        }

        System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti.\nSi o no:");
        respuesta = s.nextLine();
        if (respuesta.toUpperCase().equals("SI")) {
            puntos += 3;
        }

        System.out.print("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).\nSi o no: ");
        respuesta = s.nextLine();
        if (respuesta.toUpperCase().equals("SI")) {
            puntos += 3;
        }

        System.out.print("5. No te deja que mires la agenda de su teléfono móvil.\nSi o no: ");
        respuesta = s.nextLine();
        if (respuesta.toUpperCase().equals("SI")) {
            puntos += 3;
        }

        System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.\nSi o no: ");
        respuesta = s.nextLine();
        if (respuesta.toUpperCase().equals("SI")) {
            puntos += 3;
        }

        System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.\nSi o no: ");
        respuesta = s.nextLine();
        if (respuesta.toUpperCase().equals("SI")) {
            puntos += 3;
        }

        System.out.print("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.\nSi o no: ");
        respuesta = s.nextLine();
        if (respuesta.toUpperCase().equals("SI")) {
            puntos += 3;
        }

        System.out.print("9. Has notado que últimamente se perfuma más.\nSi o no: ");
        respuesta = s.nextLine();
        if (respuesta.toUpperCase().equals("SI")) {
            puntos += 3;
        }

        System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.\nSi o no: ");
        respuesta = s.nextLine();
        if (respuesta.toUpperCase().equals("SI")) {
            puntos += 3;
        }

        if (puntos <= 10) {
            System.out.print("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        }

        if ((puntos > 11) && (puntos <= 22)) {
            System.out.print("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        }

        if (puntos >= 22) {
            System.out.print("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües qué es lo que está pasando por su cabeza.");
        }
    }

    public void ejercicio17() {

        int numero;
        numero = s.nextInt();
        System.out.println("La ultima cifra es " + (numero % 10));
    }

    public void ejercicio18() {

        int numero, primer_numero = 0;

        System.out.print("Por favor, introduzca un número entero (de 5 cifras como máximo): ");
        numero = s.nextInt();

        if (numero < 10) {
            primer_numero = numero;
        }

        if ((numero >= 10) && (numero < 100)) {
            primer_numero = numero / 10;
        }

        if ((numero >= 100) && (numero < 1000)) {
            primer_numero = numero / 100;
        }

        if ((numero >= 1000) && (numero < 10000)) {
            primer_numero = numero / 1000;
        }

        if (numero >= 10000) {
            primer_numero = numero / 10000;
        }

        System.out.println("La primera cifra es " + primer_numero);

    }

    public void ejercicio19() {

        int numero, digitos = 0;

        System.out.print("Introduzca un número entero (de 5 cifras como máximo): ");
        numero = s.nextInt();

        if (numero < 10) {
            digitos = 1;
        }

        if ((numero >= 10) && (numero < 100)) {
            digitos = 2;
        }

        if ((numero >= 100) && (numero < 1000)) {
            digitos = 3;
        }

        if ((numero >= 1000) && (numero < 10000)) {
            digitos = 4;
        }

        if (numero >= 10000) {
            digitos = 5;
        }

        System.out.println("El numero tiene " + digitos + " digitos.");
    }

    public void ejercicio20() {

        int n;
        boolean capicua = false;

        System.out.print("Introduzca un numero entero (5 max): ");
        n = s.nextInt();

        if (n < 10) {
            capicua = true;
        }

        if ((n >= 10) && (n < 100)) {
            if ((n / 10) == (n % 10)) {
                capicua = true;
            }
        }

        if ((n >= 100) && (n < 1000)) {
            if ((n / 100) == (n % 10)) {
                capicua = true;
            }
        }

        if ((n >= 1000) && (n < 10000)) {
            if (((n / 1000) == (n % 10)) && (((n / 100) % 10) == ((n / 10) % 10))) {
                capicua = true;
            }
        }

        if (n >= 10000) {
            if (((n / 10000) == (n % 10)) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
                capicua = true;
            }
        }

        if (capicua) {
            System.out.println("El numero introducido es capicua.");
        } else {
            System.out.println("El numero introducido no es capicua.");
        }

    }

}
