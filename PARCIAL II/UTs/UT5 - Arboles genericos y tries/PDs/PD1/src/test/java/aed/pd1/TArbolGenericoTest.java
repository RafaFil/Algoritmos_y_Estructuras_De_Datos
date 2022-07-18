/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package aed.pd1;

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
public class TArbolGenericoTest {
    
    public TArbolGenericoTest() {
    }
    

    /**
     * Test of insertar method, of class TArbolGenerico.
     */
    @Test
    public void testInsertarRaiz() {
        TArbolGenerico arbol = new TArbolGenerico();
        arbol.insertar(1, 1);
        TElementoAG expected = new TElementoAG(1,1);
        assertEquals(arbol.getRaiz().getEtiqueta(),expected.getEtiqueta());
        // REVISAR EN CASO DE assertEquals con objetos
    }
    
    @Test
    public void testInsertarUnHijoRaiz(){
        TArbolGenerico arbol = new TArbolGenerico();
        arbol.insertar(1, 1);
        arbol.insertar(2, 1);
        TElementoAG expected = new TElementoAG(2,1);
        assertEquals(arbol.getRaiz().getPrimerHijo().getEtiqueta(),expected.getEtiqueta());
    }
    
    @Test
    public void testInsertarOtroHijoRaiz(){
        TArbolGenerico arbol = new TArbolGenerico();
        arbol.insertar(1, 1);
        arbol.insertar(2, 1);
        arbol.insertar(3, 1);
        String expectedPreOrder = "1 2 3 ";
        assertEquals(arbol.preOrden(),expectedPreOrder);
        
    }
    
    @Test
    public void testInsertarUnHijoaUnHijoDeRaiz(){
        TArbolGenerico arbol = new TArbolGenerico();
        arbol.insertar(1, 1);
        arbol.insertar(2, 1);
        arbol.insertar(3, 1);
        arbol.insertar(4, 2);
        String expectedPreOrder = "1 2 4 3 ";
        assertEquals(arbol.preOrden(),expectedPreOrder);
        
    }

    /**
     * Test of buscar method, of class TArbolGenerico.
     */
    @Test
    public void testBuscarNulo() {
       TArbolGenerico arbol = new TArbolGenerico();
       assertEquals(arbol.buscar(1), null);
       
    }
    @Test
    public void testBuscarRaiz(){
        TArbolGenerico arbol = new TArbolGenerico();
        arbol.insertar(1, 1);
        assertEquals(1, arbol.getRaiz().getEtiqueta());
    }
    
    @Test
    public void testBuscarUnElemento(){
        TArbolGenerico arbol = new TArbolGenerico();
        arbol.insertar(1, 1);
        arbol.insertar(2, 1);
        arbol.insertar(3, 1);
        arbol.insertar(4, 2);
        Comparable expectedEtiqueta = 4;
        assertEquals(expectedEtiqueta,arbol.buscar(4).getEtiqueta());
        
        
    }
    
    @Test
    public void testBuscarArbolElementoNoexiste(){
        TArbolGenerico arbol = new TArbolGenerico();
        arbol.insertar(1, 1);
        arbol.insertar(2, 1);
        assertEquals(arbol.buscar(777), null);
    }
    
    /**
     * Test of listarIndentado method, of class TArbolGenerico.
     */
    /*@Test
    public void testListarIndentado() {

    }*/


}
