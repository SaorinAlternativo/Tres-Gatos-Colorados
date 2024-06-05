/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.libreria;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lilia
 */
public class EncargarLibroTest {
    
    public EncargarLibroTest() {
    }

    @Test
    public void testLimpiar() {
        System.out.println("limpiar");
        EncargarLibro instance = new EncargarLibro();
        instance.limpiar();
        
    }

    @Test
    public void testVerificar() {
        System.out.println("verificar");
        EncargarLibro instance = new EncargarLibro();
        boolean expResult = false;
        boolean result = instance.verificar();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EncargarLibro.main(args);
        fail("The test case is a prototype.");
    }
    
}
