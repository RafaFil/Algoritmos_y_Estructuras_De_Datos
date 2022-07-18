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
public class TClasificadorTest {

    public TClasificadorTest() {
    }

    @Test
    public void testEstaOrdenadoFalso() {
        int[] vectorPrueba = {3, 2, 5, 4, 1};
        assertEquals(false, PD1.estaOrdenado(vectorPrueba));
    }

    @Test
    public void testEstaOrdenadoVerdadero() {
        int[] vectorPrueba = {1, 10, 100, 486, 1000, 99999};
        assertEquals(true, PD1.estaOrdenado(vectorPrueba));
    }

    @Test
    public void testShellSort() {
        int[] vectorPrueba = {3, 2, 5, 4, 1};
        TClasificador clasificador = new TClasificador();
        int[] v = clasificador.clasificar(vectorPrueba, 2);
        int[] expectedArr = {1, 2, 3, 4, 5};
        assertArrayEquals(expectedArr, v);

    }

    @Test
    public void testBubbleSort() {
        int[] vectorPrueba = {3, 2, 5, 4, 1};
        TClasificador clasificador = new TClasificador();
        int[] v = clasificador.clasificar(vectorPrueba, 3);
        int[] expectedArr = {1, 2, 3, 4, 5};
        assertArrayEquals(expectedArr, v);
    }

    /**
     * Test of ordenarPorInsercion method, of class TClasificador.
     */
    @Test
    public void testOrdenarPorInsercion() {
        int[] vectorPrueba = {3, 2, 5, 4, 1};
        TClasificador clasificador = new TClasificador();
        int[] v = clasificador.clasificar(vectorPrueba, 1);
        int[] expectedArr = {1, 2, 3, 4, 5};
        assertArrayEquals(expectedArr, v);
    }

    /**
     * Test of ordenarPorQuickSort method, of class TClasificador.
     */
    @Test
    public void testOrdenarPorQuickSort() {
        int[] vectorPrueba = {3, 2, 5, 4, 1};
        TClasificador clasificador = new TClasificador();
        int[] v = clasificador.clasificar(vectorPrueba, 4);
        int[] expectedArr = {1, 2, 3, 4, 5};
        assertArrayEquals(expectedArr, v);
    }

    /**
     * Test of ordenarPorHeapSort method, of class TClasificador.
     */
    @Test
    public void testOrdenarPorHeapSort() {
        int[] vectorPrueba = {3, 2, 5, 4, 1};
        TClasificador clasificador = new TClasificador();
        int[] v = clasificador.clasificar(vectorPrueba, 5);
        int[] expectedArr = {5, 4, 3, 2, 1};
        assertArrayEquals(expectedArr, v);
    }

}
