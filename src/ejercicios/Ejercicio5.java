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
public class Ejercicio5 {
    
    public static void main(String[] args){
    
        double a ;
        Scanner s = new Scanner(System.in);
        
        System.out.println("ingrese un numero");
        
        a = s.nextDouble();
        
        System.out.println("el doble de ese numero es : " + 2*a);
        System.out.println("el triple de ese numero es : " + 3*a);
        System.out.println("la raiz cuadrada de su numero es " + Math.sqrt(a));
        
    }
    
}
