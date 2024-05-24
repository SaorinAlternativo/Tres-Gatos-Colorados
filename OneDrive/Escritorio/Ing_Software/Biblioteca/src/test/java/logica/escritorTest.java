/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package logica;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author reade
 */
public class escritorTest {
    
    public escritorTest() {
    }

    @org.junit.jupiter.api.Test
    public void testIsEscritoExiste() {
        System.out.println("isEscritoExiste");
        escritor instance = new escritor();
        boolean expResult = false;
        boolean result = instance.isEscritoExiste();
        assertEquals(expResult, result);
       
    }

    @org.junit.jupiter.api.Test
    public void testSetEscritoExiste() {
        System.out.println("setEscritoExiste");
        boolean escritoExiste = false;
        escritor instance = new escritor();
        instance.setEscritoExiste(escritoExiste);
       
    }

    @org.junit.jupiter.api.Test
    public void testGetCurriculum() {
        System.out.println("getCurriculum");
        escritor instance = new escritor();
        String expResult = null;
        String result = instance.getCurriculum();
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testSetCurriculum() {
        System.out.println("setCurriculum");
        String curriculum = "";
        escritor instance = new escritor();
        instance.setCurriculum(curriculum);

    }
    
}
