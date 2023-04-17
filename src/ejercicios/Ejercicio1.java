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
public class Ejercicio1 {
    
    public static void main(String[] args){
    
        int a ;
        int b ;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros");
        System.out.println("primer numero :");

        a = s.nextInt();
        
        System.out.println("segundo numero :");
        
        b = s.nextInt();
        
        System.out.println("la suma de los dos numeros es : " + (a+b));
    }
    
}
