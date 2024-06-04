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
        
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Compras.main(args);
        
    }

    @Test
    public void testLimpiar() {
        System.out.println("limpiar");
        Compras instance = new Compras();
        instance.limpiar();
        
    }

    @Test
    public void testVerificar() {
        System.out.println("verificar");
        Compras instance = new Compras();
        instance.verificar();
    }
    
}
