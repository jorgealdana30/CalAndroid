package com.dreft.calculadora;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void sumar_dos_numeros(){
        double a = 4,b = 6,c;
        c=10;
        assertEquals(c,Metodos.sumar(a,b),0);
    }
}