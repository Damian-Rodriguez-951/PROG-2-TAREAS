package com.company;
import java.util.Objects;
import java.util.Scanner;
import java.lang.String;
public class Main {
    public static void main(String[] args) {
        // Scanner key =new Scanner(System.in);
        int veces = 0, sele = 0;

        String contra = "", usuario = "", usuarior = "", contrar = "";
        //Registro
        //Usuario
        Scanner usu = new Scanner(System.in);
        System.out.println("Establezca un usuario: ");
        usuario = usu.nextLine();
        //contraseña
        Scanner con = new Scanner(System.in);
        System.out.println("Establezca una contraseña: ");
        contra = con.nextLine();

        do {
            //usuario
            Scanner usur = new Scanner(System.in);
            System.out.println("Establezca un usuario: ");
            usuarior = usur.nextLine();
            //contraseña
            Scanner conr = new Scanner(System.in);
            System.out.println("Establezca una contraseña: ");
            contrar = conr.nextLine();
            if (Objects.equals(contrar, contra) && Objects.equals(usuarior, usuario)) {
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
        if (Objects.equals(contrar, contra) && Objects.equals(usuarior, usuario)) {
            System.out.println("Que desea realizar");
            Scanner se = new Scanner(System.in);
            System.out.println("""
                     Presione 1: Cambiar contraseña
                    Presione 2: Para llenar formulario\s
                    Presione 3: Para realizar un pedido""");
            sele = se.nextInt();

            switch (sele) {
                case 1 -> {
                    Scanner usun = new Scanner(System.in);
                    System.out.println("Establezca un usuario: ");
                    usuario = usun.nextLine();
                    Scanner conn = new Scanner(System.in);
                    System.out.println("Establezca una contraseña: ");
                    contra = conn.nextLine();
                }
                case 2 -> {
                    Scanner dir = new Scanner(System.in);
                    System.out.println("Ingrese su direccion: ");
                    String direccion = dir.nextLine();
                    Scanner tel = new Scanner(System.in);
                    System.out.println("ingrese su telefono: ");
                    String telefono = tel.nextLine();
                    Scanner dni = new Scanner(System.in);
                    System.out.println("Ingrese su DNI o cedula: ");
                    String cedula = dni.nextLine();
                    Scanner nac = new Scanner(System.in);
                    System.out.println("ingrese su nacionalidad: ");
                    String nacionalidad = nac.nextLine();
                }
                case 3 -> {
                    System.out.println("Ingrese si desea recibir servicios Premiun en su casa");
                    Scanner pe = new Scanner(System.in);
                    System.out.println("""
                             Presione 1: 1 mes de servicios
                            Presione 2: 3 meses de servicios\s
                            Presione 3: 12 meses de servicios \s
                            Presione 4: informacion sobre servicios premiun""");
                    int pedido = pe.nextInt();
                    switch (pedido) {
                        case 1 -> System.out.println("Usted ha recibido un mes de servicios Premium");
                        case 2 -> System.out.println("Usted ha recibido un 3 mes de servicios Premium");
                        case 3 -> System.out.println("Usted ha recibido un año de servicios Premium");
                        case 4 -> System.out.println("""
                                El servicio premium incluye:\s
                                Seguridad de red
                                 Nube de IoT de electrodomesticos
                                 Notificador en tiempo real de la infraestructura de la casa""");
                        default -> throw new IllegalStateException("Numero de seleccion incorrecto");

                    }
                }
            }
        }
    }
}
