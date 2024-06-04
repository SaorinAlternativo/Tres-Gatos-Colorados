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
public class PreOrdenarTest {
    
    public PreOrdenarTest() {
    }

    @Test
    public void testLimpiar() {
        System.out.println("limpiar");
        PreOrdenar instance = new PreOrdenar();
        instance.limpiar();
    }

    @Test
    public void testVerificar() {
        System.out.println("verificar");
        PreOrdenar instance = new PreOrdenar();
        boolean expResult = false;
        boolean result = instance.verificar();
        assertEquals(expResult, result);
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PreOrdenar.main(args);
    }
    
}
