package com.mateopa;

import com.mateopa.Profesor;

public class TestProfesor {
    public static void main(String[] args) {
        Profesor profe = new Profesor();

        profe.setNombre("pepe");

        System.out.println(profe.getNombre());
    }
}
