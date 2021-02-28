package com.company;
import java.util.Scanner;
public class   Main {

    public static void main(String[] args) {
        // write your code here
        calculo Cal1 = new calculo(2,5);
        double resultado,num1,num2;
        int opcion;

            Scanner se = new Scanner(System.in);
            System.out.println("------------");
            System.out.println("Menu pirncipal");
            System.out.println("1: Sumar");
            System.out.println("2: Restar");
            System.out.println("3: Multiplicar");
            System.out.println("4: Dividir");
            System.out.println("5: Salir");
            opcion = se.nextInt();
if(opcion==5)
    System.out.println("Saliendo de la calculadora");
else
                switch (opcion) {
                    case 1:
                        resultado= Cal1.suma();
                        System.out.println("el resultado es: " + resultado);
                        break;
                    case 2:
                        resultado= Cal1.resta();
                        System.out.println("el resultado es: " + resultado);
                        break;
                    case 3:
                        resultado= Cal1.multiplicacion();
                        System.out.println("el resultado es: " + resultado);
                        break;
                    case 4:
                        resultado= Cal1.division();
                        System.out.println("el resultado es: " + resultado);
                        break;
                    default:
                        System.out.println("Numero fuera del rango de seleccion");
                }
            }
        }


