package com.mateopa;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.mateopa.Matematica;

public class TestMatematica {
    
    @Test
    public void fib(){
        Matematica mat = new Matematica();
        assertEquals(mat.fib(0), 0);
        assertEquals(mat.fib(1), 1);
        assertEquals(mat.fib(2), 1);
        assertEquals(mat.fib(3), 2);
        assertEquals(mat.fib(7), 13);
        assertEquals(mat.fib(8), 21);
    }
}
