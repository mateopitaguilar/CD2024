package com.mateopa;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {

    private Persona persona;

    @BeforeEach
    public void setUp() {
        persona = new Persona("Carlos", 30);
    }

    @Test
    public void testConstructor() {
        assertEquals("Carlos", persona.getNombre());
        assertEquals(30, persona.getEdad());
    }

    @Test
    public void testSetNombre() {
        persona.setNombre("Ana");
        assertEquals("Ana", persona.getNombre());
    }

    @Test
    public void testSetEdad() {
        persona.setEdad(25);
        assertEquals(25, persona.getEdad());
    }

    @Test
    public void testImprimirDetalles() {
        persona.imprimirDetalles();
        // Aquí podrías capturar la salida estándar y verificar el contenido si es necesario
    }
}