/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author ese_b
 */
public class JavaApplication19 {

    /**
     * @param a
     * @param args the command line arguments
     */
    
    
    public static void test (int...a){
        
        for (int c : a) {
            System.out.println(c);
        }
        
    }
    public static void main(String[] args) {
        
        
        test(1,3568,6,6,6,9,9,5,5,9,84,8,9,54,5,5);
        
    }
    
}
