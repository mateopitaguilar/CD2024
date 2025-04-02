package com.mateopa;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CirculoTest {

    private Circulo circulo;

    @BeforeEach
    public void setUp() {
        circulo = new Circulo(5, 10, 3.0);
    }

    @Test
    public void testConstructor() {
        assertEquals(5, circulo.obtenerX());
        assertEquals(10, circulo.obtenerY());
        assertEquals(3.0, circulo.obtenerRadio());
    }

    @Test
    public void testEstablecerX() {
        circulo.establecerX(7);
        assertEquals(7, circulo.obtenerX());
    }

    @Test
    public void testEstablecerY() {
        circulo.establecerY(14);
        assertEquals(14, circulo.obtenerY());
    }

    @Test
    public void testEstablecerRadio() {
        circulo.establecerRadio(4.5);
        assertEquals(4.5, circulo.obtenerRadio());
        circulo.establecerRadio(-2.0);
        assertEquals(0.0, circulo.obtenerRadio());
    }

    @Test
    public void testObtenerDiametro() {
        assertEquals(6.0, circulo.obtenerDiametro());
    }

    @Test
    public void testObtenerCircunferencia() {
        assertEquals(Math.PI * 6.0, circulo.obtenerCircunferencia());
    }

    @Test
    public void testObtenerArea() {
        assertEquals(Math.PI * 3.0 * 3.0, circulo.obtenerArea());
    }

    @Test
    public void testToString() {
        assertEquals("Centro = [5,10]; Radio = 3.0", circulo.toString());
    }
}
