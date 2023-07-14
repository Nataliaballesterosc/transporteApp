package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Declarando datos de entrada del problema

        String ubicacionUsuario;
        String destinoUsuario;
        String nombreUsuario;
        String telefonoUsuario;
        double costoCarrera;

        //Declarar dato especial para entrar datos por teclado
        Scanner teclado=new Scanner(System.in) ;

        //Iniciar variables
        System.out.println("\u001B[35m TransporteJuanJo  \u001B[0m");

        System.out.print("Digite su ubicacion: ");
        ubicacionUsuario = teclado.nextLine();
        System.out.print("Digite su lugar de destino: ");
        destinoUsuario=teclado.nextLine();
        System.out.print("Digite su nombre: ");
        nombreUsuario=teclado.nextLine();
        System.out.print("Digite su numero telefonico: ");
        telefonoUsuario=teclado.nextLine();

        //proceso del programa
        String distancia ="20"; // debe cambiarse el tipo de variable con parseo
        Integer distanciaEntero=Integer.parseInt(distancia);
        Integer costoPorKilometro= 6800;
        Integer cobrototal=distanciaEntero*costoPorKilometro;

        //Salidas del problema
        System.out.print("\u001B[35m Señor usuario: "+ nombreUsuario +"  \u001B[0m");
        System.out.print("\u001B[35m El costo de su viaje es: "+ cobrototal +" pesos. \u001B[0m");





        }
    }
