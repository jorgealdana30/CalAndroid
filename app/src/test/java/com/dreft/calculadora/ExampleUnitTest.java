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
    @Test
    public void restar_dos_numeros(){
        double a = 4,b = 6,c;
        c=-2;
        assertEquals(c,Metodos.restar(a,b),0);
    }
    @Test
    public void multi_dos_numeros(){
        double a = 4,b = 6,c;
        c=24;
        assertEquals(c,Metodos.multiplicar(a,b),0);
    }
    @Test
    public void dividir_dos_numeros(){
        double a = 4,b = 6,c;
        c=0.6;
        assertEquals(c,Metodos.dividir(a,b),1);
    }
}