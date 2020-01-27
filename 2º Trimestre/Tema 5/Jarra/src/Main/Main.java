/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Jarra.Jarra;

/**
 *
 * @author ese_b
 */
public class Main {
public static void main(String[] arg)
{
Jarra jarraA = new Jarra(10 ,5);
Jarra jarraB = new Jarra(10 ,7);
jarraA.llena();
jarraB.vacia();
System.out.println("JA "+ jarraA.toString());
System.out.println("JB "+ jarraB.toString());
jarraB.llenaDesde(jarraA);
jarraA.llena();
jarraB.llenaDesde(jarraA);
jarraB.vacia();
jarraB.llenaDesde(jarraA);
jarraA.llena();
jarraB.llenaDesde(jarraA);
System.out.println("JA "+ jarraA.toString());
System.out.println("JB "+ jarraB.toString());
}
}
