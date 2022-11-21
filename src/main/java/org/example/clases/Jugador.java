package org.example.clases;

public class Jugador {

    public String nombre, apellido, posicion,equipo;
    public int camiseta, edad;


    public Jugador() {
    }

    public Jugador(String nombre, String apellido, String posicion, String equipo, int camiseta, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.equipo = equipo;
        this.camiseta = camiseta;
        this.edad = edad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getCamiseta() {
        return camiseta;
    }

    public void setCamiseta(int camiseta) {
        this.camiseta = camiseta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
