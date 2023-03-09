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
public class Ejercicio1Guia {
    
    
    public static void main (String[] args){
        
        
        int enteroMediano;
        long enteroLargo;
        double real;
        //float realMediano;
        byte enteroMuyCorto;
        short enteroCorto;
        boolean verdaderoOfalso;
        char caracter;
        String cadenaCaracteres;
        
        
        enteroMediano = 12 ;
        
        enteroLargo = 212;
        
        real = 12.32;
        
        enteroMuyCorto = 1;
       
        enteroCorto = 2;
       
        verdaderoOfalso = true;
       
        caracter = 'a';
       
        cadenaCaracteres = "Hola mundo";
       
        enteroMediano ++;
        
        enteroLargo--;
        
        Scanner s = new Scanner(System.in);
        
        enteroCorto = s.nextByte();
        
        System.out.println(enteroCorto);
        
    }
    
}
