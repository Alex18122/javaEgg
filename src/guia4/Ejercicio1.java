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
public class Ejercicio1 {

    public static void main(String[] args) {

        menu();

    }

    public static double suma(double b, double c) {

        return b + c;

    }

    public static double resta(double b, double c) {

        return b - c;

    }

    public static double multiplicacion(double b, double c) {

        return b * c;

    }

    public static double division(double b, double c) {

        return b / c;

    }

    public static void menu() {

        boolean a = true;
        Scanner s = new Scanner(System.in);
        String op;
        String conf;
        double b, c;

        do {

            System.out.println("elija que operacion quiere realizar.(Escriba la inicial)");
            System.out.println("S. Suma");
            System.out.println("R. Resta");
            System.out.println("M. Multiplicacion");
            System.out.println("D. Division");
            System.out.println("O. Para Salir");

            op = s.nextLine();

            op = op.toUpperCase();

            switch (op) {

                case "S":

                    System.out.println("Ingrese dos numeros");

                    System.out.println("Numero 1 : ");
                    b = s.nextDouble();

                    System.out.println("Numero 2 : ");
                    c = s.nextDouble();

                    System.out.println(suma(b, c));

                    break;

                case "R":

                    System.out.println("Ingrese dos numeros");

                    System.out.println("Numero 1 : ");
                    b = s.nextDouble();

                    System.out.println("Numero 2 : ");
                    c = s.nextDouble();

                    System.out.println(resta(b, c));

                    System.out.println("quiere seguir haciendo operaciones ?(S/N)");
                    conf = s.nextLine();
                    conf = conf.toUpperCase();

                    if (conf.equals("S")) {

                        break;

                    } else if (conf.equals("N")) {

                        a = false;
                        break;

                    } else {

                        break;

                    }

                case "M":

                    System.out.println("Ingrese dos numeros");

                    System.out.println("Numero 1 : ");
                    b = s.nextDouble();

                    System.out.println("Numero 2 : ");
                    c = s.nextDouble();

                    System.out.println(multiplicacion(b, c));

                    break;

                case "D":

                    System.out.println("Ingrese dos numeros");

                    System.out.println("Numero 1 : ");
                    b = s.nextDouble();

                    System.out.println("Numero 2 : ");
                    c = s.nextDouble();

                    System.out.println(division(b, c));

                    break;

                case "O":

                    a = false;
                    break;

                default:

                    System.out.println("Opcion invalida, vuelva a intentarlo");
                    break;
            }

        } while (a);

    }

}
