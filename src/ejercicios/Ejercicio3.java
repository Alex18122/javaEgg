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
public class Ejercicio3 {

    public static void main(String[] args) {

        String name;

        System.out.println("escriba una frase ");

        Scanner s = new Scanner(System.in);

        name = s.nextLine();

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

    }

}
