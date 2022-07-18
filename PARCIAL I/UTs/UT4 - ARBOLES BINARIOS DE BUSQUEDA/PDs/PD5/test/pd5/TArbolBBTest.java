/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pd5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rafael
 */
public class TArbolBBTest {
    
    public TArbolBBTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of elementoMenor method, of class TArbolBB.
     */
    @Test
    public void testElementoMenor() {
        TArbolBB arbol = new TArbolBB();
        String[] elementos = ManejadorArchivosGenerico.leerArchivo(".\\archivos\\clavesPrueba.txt");

        for (String elemento : elementos) {
            TElementoAB aux = new TElementoAB(Integer.valueOf(elemento), elemento);
            arbol.insertar(aux);
        }
        String expected = "1342";
        assertEquals(arbol.elementoMayor().imprimir(),expected);
        
    }
    
    /**
     * Test of elementoMayor method, of class TArbolBB.
     */
    //@Test
    /*public void testElementoMayor() {
        System.out.println("elementoMayor");
        TArbolBB instance = new TArbolBB();
        TElementoAB expResult = null;
        TElementoAB result = instance.elementoMayor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}

