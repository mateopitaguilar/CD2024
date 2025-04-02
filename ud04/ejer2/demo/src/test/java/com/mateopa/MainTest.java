package com.mateopa;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest {

    @Test
    public void testMain() {
        // Capturar la salida estándar
        ByteArrayOutputStream salidaCapturada = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salidaCapturada));

        // Ejecutar el método main
        Main.main(new String[]{});

        // Verificar la salida
        String salidaEsperada = "La coordenada X es 37\n" +
                                "La coordenada Y es 43\n" +
                                "El radio es 2.5\n\n" +
                                "La nueva ubicación y el radio de círculo son\n" +
                                "Centro = [35,20]; Radio = 4.2\n" +
                                "El diámetro es 8.40\n" +
                                "La circunferencia es 26.39\n" +
                                "El área es 55.42\n";
        assertEquals(salidaEsperada, salidaCapturada.toString());

        // Restaurar la salida estándar
        System.setOut(System.out);
    }
}