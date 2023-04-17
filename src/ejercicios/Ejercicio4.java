/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.util.Scanner;

/**
 *
 * @author gbeni
 */
public class Ejercicio4 {
    
    public static void main(String[] args){
    
        double a ;
        Scanner s = new Scanner(System.in);
        
        System.out.println("ingrese una temperatura en grados celsius");
        
        a = s.nextDouble();
        
        System.out.println("la temperatura en Fahrenheit es : " + (32 + (9*(a/5))));
        
    }
    
}
