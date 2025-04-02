package com.mateopa;

/**
 * Esta clase crea una persona con un nombre y una edad determinadas.
 */
public class Estudiante {

    /**
     * Esto es el nombre del estudiante.
     */
    private String nombre;
    /**
     * Esto es la edad del estudiante.
     */
    private int edad;
    /**
     * Esto es la calificacion del estudiante.
     */
    private double calificacion;

    /**
     * Esto crea un objeto Estudiante con un nombre y una edad determinadas por parametros.
     * @param nombre este parametro indica el nombre del estudiante
     * @param edad este parametro indica la edad del estudiante
     */
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = 0.0;
    }

    /**
     * Esto define la calificacion del estudiante.
     * @param calificacion calificacion de estudiante.
     */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Esto devuelve el nombre.
     * @return nombre de estudiante
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Esto define el nombre del estudiante.
     * @param nombre nombre de estudiante.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Esto devuelve la edad.
     * @return edad de estudiante.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Esto define al edad de estudiante.
     * @param edad edad de estudiante.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Esto devuelve la calificacion.
     * @return calificacion del estudiante.
     */
    public double getCalificacion() {
        return calificacion;
    }

    /**
     * Esto devuelve si el estudiante aprobó.
     * @return true si el estudiante aprobó, false en caso contrario.
     */
    public boolean aprobo() {
        return calificacion >= 5.0;
    }

    /**
     * Esto devuelve la edad escolar.
     * @return edad escolar del estudiante.
     */
    public int edadEscolar() {
        return edad / 12;
    }

    /**
     * Esto devuelve si el estudiante es universitario.
     * @return true si el estudiante es universitario, false en caso contrario.
     */
    public boolean esUniversitario() {
        return edad >= 18;
    }

    /**
     * Imprime el nombre, la edad y la calificación.
     */
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Calificación: " + calificacion);
    }
}