/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.libreria;

import javax.swing.ImageIcon;
import javax.swing.JTable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lilia
 */
public class ConexionesTest {
    
    public ConexionesTest() {
    }

    @Test
    public void testActualizarRegistro() {
        System.out.println("ActualizarRegistro");
        Libreria lib = null;
        Conexiones instance = new Conexiones();
        instance.ActualizarRegistro(lib);
    }

    @Test
    public void testSiExiste() throws Exception {
        System.out.println("SiExiste");
        int codigo = 0;
        Conexiones instance = new Conexiones();
        boolean expResult = false;
        boolean result = instance.SiExiste(codigo);
        assertEquals(expResult, result);
    }

    @Test
    public void testObtenerImagen() throws Exception {
        System.out.println("obtenerImagen");
        String isbn = "";
        Conexiones instance = new Conexiones();
        ImageIcon expResult = null;
        ImageIcon result = instance.obtenerImagen(isbn);
        assertEquals(expResult, result);
    }

    @Test
    public void testMostrarTabla() {
        System.out.println("mostrarTabla");
        JTable tablaLibros = null;
        Conexiones instance = new Conexiones();
        JTable expResult = null;
        JTable result = instance.mostrarTabla(tablaLibros);
        assertEquals(expResult, result);
    }
    
}
