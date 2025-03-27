package com.mateopa;

/**
 * Esta clase crea una persona con un nombre y una edad determinadas.
 */
public class Persona {
    /**
     * Esto es el nombre de la persona.
     */
    private String nombre;
    /**
     * Esto es la edad de la persona.
     */
    private int edad;

    /**
     * Esto crea un objeto persona con un nombre y una edad determinada por dos parametros.
     * @param nombre este parametro indica el nombre de la persona.
     * @param edad este parametro indica la edad de la persona.
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Esto devuelve el nombre.
     * @return nombre de persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Esto define el nombre de persona.
     * @param nombre nombre de persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Esto devuelve la edad.
     * @return edad de persona
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Esto define la edad de persona.
     * @param edad edad de persona.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Imprime el nombre y la edad.
     */
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
