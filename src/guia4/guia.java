/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;
import java.util.Scanner;
/**
 *
 * @author gbeni
 */
public class guia {
    
    public static void main(String[] args){
    
        Scanner s = new Scanner(System.in);
        saludo(s.nextLine());
        
    }
    
    
    public static int suma(int a, int b){
    
        return a + b;
        
    }
    
    public static void saludo(String a){
    
        System.out.println("Hola " + a + " chupame la corneta");
    
    }
    
}
