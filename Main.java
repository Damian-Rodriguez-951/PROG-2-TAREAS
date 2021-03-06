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
                Scanner dni = new Scanner(System.in);
                System.out.println("Ingrese su DNI o cedula: ");
                String cedula = dni.nextLine();
                Scanner nac = new Scanner(System.in);
                System.out.println("ingrese su nacionalidad: ");
                String nacionalidad = nac.nextLine();

                String det3 = usuRe.getDire(direccion);
                String det4 = usuRe.getTele(telefono);
                String det5 = usuRe.getDni(cedula);
                String det6 = usuRe.getNaci(nacionalidad);

                System.out.println("\nRespuestas del formulario: " +
                        "\nDireccion: " + det3 +
                        "\nTelefono: " + det4 +
                        "\nDNI: " + det5 +
                        "\nNacionalidad:" + det6);
            }
            case 3 -> {
                Pedido Swtich = new Pedido(true);
                System.out.println("Ingrese si desea recibir servicios Premiun en su casa");
                Scanner pe = new Scanner(System.in);
                System.out.println("""
                         Presione 1: 1 mes de servicios
                        Presione 2: 3 meses de servicios\s
                        Presione 3: 12 meses de servicios \s
                        Presione 4: informacion sobre servicios premiun""");
                int pedido = pe.nextInt();

                switch (pedido) {
                    case 1 -> {
                        boolean c1 = true;
                        boolean det4 = Swtich.men1(c1);
                        if (det4 == true) {
                            System.out.println("Usted ha recibido un mes de servicios Premium" +
                                    "\nA partir del dia: " + fecha + " a las: " + hora);
                        }
                        break;
                    }
                    case 2 -> {
                        boolean c2 = true;
                        boolean det5 = Swtich.men3(c2);
                        if(det5==true) {
                            System.out.println("Usted ha recibido un 3 mes de servicios Premium" +
                                    "\nA partir del dia: " + fecha + "a las: " + hora);
                        }
                        break;
                    }
                    case 3 -> {
                        boolean c3 =true;
                                boolean det5 = Swtich.anual(c3);
                        if(det5==true) {
                            System.out.println("Usted ha recibido un año de servicios Premium" +
                                    "\nA partir del dia: " + fecha + " a las: " + hora);
                        }
                        break;
                    }
                    case 4 -> {
                        System.out.println("""
                                El servicio premium incluye:\s
                                Seguridad de red
                                 Nube de IoT de electrodomesticos
                                 Notificador en tiempo real de la infraestructura de la casa""");
                        break;
                    }
                        default -> throw new IllegalStateException("Numero de seleccion incorrecto");

                }
            }
            case 4-> System.out.println("Gracias por su visita, su ultimo acceso fue:" +
                    "\n El dia: " + fecha + " a las: "+ hora);
        }
    }
}
