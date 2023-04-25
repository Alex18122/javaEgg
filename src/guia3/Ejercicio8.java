/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author gbeni
 */
public class Ejercicio8 {

    public static void main(String[] args) {

        int a, i, j;
        Scanner s = new Scanner(System.in);

        System.out.println("ingrese el tamaño de un lado del cuadrado");

        a = s.nextInt();

        for (i = 0; i < a; i++) {

            if (i == 0 || i == a - 1) {

                for (j = 0; j < a; j++) {

                    System.out.print("* ");

                }

                System.out.println("");

            } else {

                for (j = 0; j < a; j++) {

                    if (j == 0 || j == a - 1) {

                        System.out.print("* ");

                    } else {

                        System.out.print("  ");

                    }

                }

                System.out.println("");

            }

        }

    }

}
