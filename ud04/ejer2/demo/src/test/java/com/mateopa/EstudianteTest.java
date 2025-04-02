package com.mateopa;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EstudianteTest {

    private Estudiante estudiante;

    @BeforeEach
    public void setUp() {
        estudiante = new Estudiante("Juan", 20);
    }

    @Test
    public void testConstructor() {
        assertEquals("Juan", estudiante.getNombre());
        assertEquals(20, estudiante.getEdad());
        assertEquals(0.0, estudiante.getCalificacion());
    }

    @Test
    public void testSetNombre() {
        estudiante.setNombre("Ana");
        assertEquals("Ana", estudiante.getNombre());
    }

    @Test
    public void testSetEdad() {
        estudiante.setEdad(22);
        assertEquals(22, estudiante.getEdad());
    }

    @Test
    public void testSetCalificacion() {
        estudiante.setCalificacion(8.5);
        assertEquals(8.5, estudiante.getCalificacion());
    }

    @Test
    public void testAprobo() {
        estudiante.setCalificacion(6.0);
        assertTrue(estudiante.aprobo());
        estudiante.setCalificacion(4.0);
        assertFalse(estudiante.aprobo());
    }

    @Test
    public void testEdadEscolar() {
        assertEquals(1, estudiante.edadEscolar());
        estudiante.setEdad(24);
        assertEquals(2, estudiante.edadEscolar());
    }

    @Test
    public void testEsUniversitario() {
        assertTrue(estudiante.esUniversitario());
        estudiante.setEdad(17);
        assertFalse(estudiante.esUniversitario());
    }

    @Test
    public void testImprimirInformacion() {
        estudiante.setCalificacion(9.0);
        estudiante.imprimirInformacion();
        // Aquí podrías capturar la salida estándar y verificar el contenido si es necesario
    }
}
