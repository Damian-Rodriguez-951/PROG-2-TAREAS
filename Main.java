package com.company;

import java.util.Objects;
import java.util.Scanner;
import java.lang.String;
import java.time.LocalDate;
import java.time.LocalTime;
public class Main {
    public static void main(String[] args) {
        // Scanner key =new Scanner(System.in);
        int veces = 0, sele = 0;
        LocalDate fecha = LocalDate.now();
        LocalTime hora = LocalTime.now();
        String contra = "", usuario = "", usuarior = "", contrar = "", det1 = "", det2 = "";
        //Registro
        //Usuario
        Scanner usu = new Scanner(System.in);
        System.out.println("Establezca un usuario: ");
        usuario = usu.nextLine();
        //contraseña
        Scanner con = new Scanner(System.in);
        System.out.println("Establezca una contraseña: ");
        contra = con.nextLine();
        Usuario usuRe = new Usuario(usuario, contra);
        det1 = usuRe.registro();


        do {
            //inicio
            Scanner usur = new Scanner(System.in);
            System.out.println("Ingrese el usuario: ");
            usuarior = usur.nextLine();
            //contraseña
            Scanner conr = new Scanner(System.in);
            System.out.println("Ingrese la contraseña: ");
            contrar = conr.nextLine();
            Usuario usuIn = new Usuario(usuarior, contrar);
            det2 = usuIn.registro();

            if (det1.equals(det2)) {
                System.out.println("Aceptado");
                veces = 3;
            } else {
                System.out.println("Usuario o contraseña incorrecta");
                veces = veces + 1;

            }
        }
        while (veces < 3);
        if (veces > 3) {
            System.out.println("Llego al limite de intentos, espere un momento");
        }
        if (det1.equals(det2)) {
            System.out.println("Que desea realizar");
            Scanner se = new Scanner(System.in);
            System.out.println("""
                     Presione 1: Cambiar contraseña
                    Presione 2: Para llenar formulario\s
                    Presione 3: Para realizar un pedido\s
                    Presione 4: Salir""");
            sele = se.nextInt();
        }
        switch (sele) {
            case 1 -> {
                Scanner usun = new Scanner(System.in);
                System.out.println("Establezca un nuevo usuario: ");
                usuario = usun.nextLine();
                Scanner conn = new Scanner(System.in);
                System.out.println("Establezca una nueva contraseña: ");
                contra = conn.nextLine();
                Usuario usuNu = new Usuario(usuario, contra);
                usuNu.cambio();

            }
            case 2 -> {
                Scanner dir = new Scanner(System.in);
                System.out.println("Ingrese su direccion: ");
                String direccion = dir.nextLine();
                Scanner tel = new Scanner(System.in);
                System.out.println("ingrese su telefono: ");
                String telefono = tel.nextLine();
                String det3 =usuRe.dire(direccion);
                System.out.println(det3);

                //Scanner dni = new Scanner(System.in);
                //System.out.println("Ingrese su DNI o cedula: ");
                //String cedula = dni.nextLine();
                //Scanner nac = new Scanner(System.in);
                //System.out.println("ingrese su nacionalidad: ");
                //String nacionalidad = nac.nextLine();
            }
        }
    }
}
