/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.libreria;

import javax.swing.JLabel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lilia
 */
public class AjustarImgTest {
    
    public AjustarImgTest() {
    }

    @Test
    public void testAjustarImagen() {
        System.out.println("AjustarImagen");
        JLabel etiqueta = null;
        String ruta = "";
        String nombre = "";
        AjustarImg instance = new AjustarImg();
        instance.AjustarImagen(etiqueta, ruta, nombre);
        fail("The test case is a prototype.");
    }
    
}
