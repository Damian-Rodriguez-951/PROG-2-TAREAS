package com.company;
import java.util.Scanner;
public class   Main {

    public static void main(String[] args) {
        // write your code here
        calculo Cal1 = new calculo();
        double resultado,num1,num2;
        int opcion;
        boolean opc = true;
        while (opc) {
            Scanner se = new Scanner(System.in);
            System.out.println("------------");
            System.out.println("Menu pirncipal");
            System.out.println("1: Sumar");
            System.out.println("2: Restar");
            System.out.println("3: Multiplicar");
            System.out.println("4: Dividir");
            System.out.println("5: Salir");
            opcion = se.nextInt();
            if (opcion == 5) {
                System.out.println("Sesión finalizada");
                break;
            } else {
                switch (opcion) {
                    case 1:
                        Scanner n1 = new Scanner(System.in);
                        System.out.println("Ingrese el primer valor:");
                        num1 =n1.nextDouble();
                        Scanner n2 = new Scanner(System.in);
                        System.out.println("Ingrese el segundo valor:");
                        num2 =n2.nextDouble();
                        resultado = cal1.sumar(num1,num2);
                        System.out.println("La resta es: "+ resultado);
                        break;
                    case 2:

                }
            }
        }
    }
}
