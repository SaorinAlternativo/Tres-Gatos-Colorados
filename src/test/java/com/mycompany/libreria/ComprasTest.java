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
public class ComprasTest {
    
    public ComprasTest() {
    }

    @Test
    public void testLlenarTabla() {
        System.out.println("llenarTabla");
        Compras instance = new Compras();
        instance.llenarTabla();
        fail("The test case is a prototype.");
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Compras.main(args);
        fail("The test case is a prototype.");
    }
    
}
