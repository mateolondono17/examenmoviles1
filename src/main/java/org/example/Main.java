package org.example;

import org.example.clases.Jugador;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entradaPorTeclado = new Scanner(System.in);
        Jugador objetoJugador = new Jugador();
        ArrayList <Jugador> jugadores = new ArrayList<Jugador>();


        int variableDeControl = 0;
        do {

            System.out.println("CONVOCATORIA");
            System.out.println("************");
            System.out.println("1. Agregar Jugador: ");
            System.out.println("2. Buscar Jugador: ");
            System.out.println("3. Editar Jugador: ");
            System.out.println("4. Mostrar Convocatoria: ");
            System.out.println("5. Salir: ");

            variableDeControl=entradaPorTeclado.nextInt();

            switch (variableDeControl){

                case 1:
                    System.out.println("*****ELEGISTE AGREGAR JUGADOR*****");
                    System.out.println("***********************************");

                    System.out.print("Digite el nombre del jugador: ");
                    objetoJugador.setNombre(entradaPorTeclado.next());
                    System.out.print("Digite el apellido del jugador: ");
                    objetoJugador.setApellido(entradaPorTeclado.next());
                    System.out.print("Digite la edad del jugador: ");
                    objetoJugador.setEdad(entradaPorTeclado.nextInt());
                    System.out.print("Digite la posicion del jugador: ");
                    objetoJugador.setPosicion(entradaPorTeclado.next());
                    System.out.print("Digite el numero de la camiseta del jugador: ");
                    objetoJugador.setCamiseta(entradaPorTeclado.nextInt());
                    System.out.print("Digite el equipo del jugador: ");
                    objetoJugador.setEquipo(entradaPorTeclado.next());


                    break;

                case 2:


                    break;


                case 3:



                    break;

                case 4:


                    break;

                case 5:
                    System.out.print("SALIENDO DEL PROGRAMA....");
                    break;

                default:



            }
        }while (variableDeControl != 0);




    }



}
