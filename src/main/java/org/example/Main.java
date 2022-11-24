package org.example;

import org.example.clases.Jugador;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entradaPorTeclado = new Scanner(System.in);

        ArrayList <Jugador> jugadores = new ArrayList<Jugador>();
        int cantidadDeJugadores = 0;



        int variableDeControl = 0;
        do {

            System.out.println("CONVOCATORIA");
            System.out.println("************");
            System.out.println("1. Agregar Jugador: ");
            System.out.println("2. Buscar Jugador: ");
            System.out.println("3. Editar Jugador: ");
            System.out.println("4. Mostrar Convocatoria: ");
            System.out.println("5. Salir: ");
            System.out.println("Digite una opcion del menu:");
            variableDeControl=entradaPorTeclado.nextInt();

            switch (variableDeControl){



                case 1:
                    System.out.println("*****ELEGISTE AGREGAR JUGADOR*****");
                    System.out.println("***********************************");

                    Jugador objetoJugador = new Jugador();

                    if (cantidadDeJugadores == 23){
                        System.out.println("No se aceptan mas jugadores");

                    }else{
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

                        jugadores.add(objetoJugador);
                        cantidadDeJugadores ++;

                    }



                    break;

                case 2:
                    System.out.println("*****ELEGISTE BUSCAR JUGADOR*****");
                    System.out.println("***********************************");

                    int buscarCamiseta;
                    System.out.print("Digite el numero de la camiseta: ");
                    buscarCamiseta = entradaPorTeclado.nextInt();
                    boolean buscarJugador = false;

                    for (Jugador jugador : jugadores){
                    if (Objects.equals(jugador.getCamiseta(), buscarCamiseta)){
                        System.out.println("El jugador es: " + jugador.getNombre());
                        buscarJugador=false;
                        break;

                    }else {
                        buscarJugador=true;
                    }
                    }

                    if (buscarJugador) {
                        System.out.println("El jugador no existe");
                    }else {
                        System.out.println("El jugador fue encontrado exitosamente");
                    }

                    break;


                case 3:
                    System.out.println("*****ELEGISTE EDITAR JUGADOR*****");
                    System.out.println("***********************************");


                    int buscarNumeroCamisa;
                    System.out.print("Digite el numero de la camiseta: ");
                    buscarNumeroCamisa = entradaPorTeclado.nextInt();
                    buscarJugador = false;

                    for (int i = 0; i < jugadores.size(); i++){
                        Jugador jugador = jugadores.get(i);
                        if (Objects.equals(jugador.getCamiseta(), buscarNumeroCamisa)){
                            System.out.println("El jugador si existe y su nombre es: " + jugador.getNombre());
                            System.out.println("Digite el nuevo nombre del jugador: ");
                            jugador.setNombre(entradaPorTeclado.next());
                            jugadores.get(i).setNombre(jugador.getNombre());
                            
                            buscarJugador=false;
                            break;

                        }else {
                            buscarJugador=true;
                        }

                    }
                    if (buscarJugador) {
                        System.out.println("El jugador no existe");
                    }else {
                        System.out.println("El jugador fue encontrado exitosamente");
                    }

                    break;

                case 4:
                    System.out.println("*****ELEGISTE MOSTRAR LA CONVOCATORIA*****");
                    System.out.println("***********************************");
                    System.out.println();
                    System.out.println("LOS CONVOCADOS FUERON:");
                    for (Jugador jugador:jugadores){
                        System.out.println(jugador.toString());}
                    break;




                case 5:
                    System.out.print("SALIENDO DEL PROGRAMA....");
                    break;

                default:



            }
        }while (variableDeControl != 0);




    }



}
